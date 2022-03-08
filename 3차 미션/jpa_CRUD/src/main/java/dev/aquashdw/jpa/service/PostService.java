package dev.aquashdw.jpa.service;

import dev.aquashdw.jpa.dao.PostDao;
import dev.aquashdw.jpa.dto.PostDto;
import dev.aquashdw.jpa.entity.PostEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    private static final Logger logger = LoggerFactory.getLogger(PostService.class);
    private final PostDao postDao;


    public PostService(@Autowired PostDao postDao){

        this.postDao = postDao;
    }

    public void createPost(PostDto postDto){

        this.postDao.createPost(postDto);
    }

    public PostDto readPost(int id){
        PostEntity postEntity = this.postDao.readPost(id);
                //dao에서는 entity를 사용할 수 있지만
                //service에서 Entity를 사용하면 앞의 보호막이 의미없어짐
        PostDto postDto = new PostDto(
                postEntity.getId(),
                postEntity.getTitle(),
                postEntity.getContent(),
                postEntity.getWriter(),
                postEntity.getPassword(),
                postEntity.getBoardEntity().getId(),
                postEntity.getUserEntityList().get(1).getUserId()
        );
        return postDto;
    }

    public List<PostDto> readPostAll(){
        Iterator<PostEntity> iterator = this.postDao.readPostAll();
        List<PostDto> postDtoList = new ArrayList<>();

        while(iterator.hasNext()){
            PostEntity postEntity = iterator.next();
            postDtoList.add(new PostDto(
                    postEntity.getId(),
                    postEntity.getTitle(),
                    postEntity.getContent(),
                    postEntity.getWriter(),
                    postEntity.getPassword(),
                    postEntity.getBoardEntity().getId(),
                    postEntity.getUserEntityList().get(1).getUserId()
            ));
        }
        return postDtoList;
    }

    public void updatePost(int id, PostDto postDto){
        this.postDao.updatePost(id, postDto);
    }

    public void deletePost(int id, String password){

        this.postDao.deletePost(id, password);
    }


}
