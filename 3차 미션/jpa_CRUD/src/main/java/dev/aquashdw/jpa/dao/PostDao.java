package dev.aquashdw.jpa.dao;

import dev.aquashdw.jpa.dto.PostDto;
import dev.aquashdw.jpa.entity.PostEntity;
import dev.aquashdw.jpa.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;

@Repository
public class PostDao {
    private static final Logger logger = LoggerFactory.getLogger(PostDao.class);
    //엮어준다
    private final PostRepository postRepository;

    public PostDao(
            @Autowired PostRepository postRepository
     ){
        this.postRepository = postRepository;
    }
                            //매개변수 전달받는 값
    public void createPost(PostDto dto){
                    //객체화 하는 이유 : 메서드 안에 새로운 인스턴스를 만들어서 메서드 안에서만 역할을 함
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(dto.getTitle());
        postEntity.setContent(dto.getContent());
        postEntity.setWriter(dto.getWriter());
        postEntity.setBoardEntity(null);
        this.postRepository.save(postEntity);
    }

    public PostEntity readPost(int id){
        Optional<PostEntity> postEntity = this.postRepository.findById((long) id);
        if(postEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return postEntity.get();
    }


    public Iterator<PostEntity> readPostAll(){

        return this.postRepository.findAll().iterator();
    }


    public void updatePost(int id, PostDto dto){
        //NPE을 방지하기 위함
        Optional<PostEntity> targetEntity = this.postRepository.findById(Long.valueOf(id));
        if(targetEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        PostEntity postEntity = targetEntity.get();
        postEntity.setTitle(
                dto.getTitle() == null ? postEntity.getTitle(): dto.getTitle());
        postEntity.setContent(
                dto.getContent() == null ? postEntity.getContent() : dto.getContent());
        this.postRepository.save(postEntity);
    }

    public void deletePost(int id, String password){
        Optional<PostEntity> targetEntity = this.postRepository.findById((long) id);
        if(targetEntity.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                                                      //저장된 pw     //사용자가 보낸 pw
        }else if( !Objects.equals(targetEntity.get().getPassword(), password)){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
        }
        this.postRepository.delete(targetEntity.get());
    }


}
