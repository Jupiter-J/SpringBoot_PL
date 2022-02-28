package dev.aquashdw.jpa;

import dev.aquashdw.jpa.entity.BoardEntity;
import dev.aquashdw.jpa.entity.PostEntity;
import dev.aquashdw.jpa.repository.BoardRepository;
import dev.aquashdw.jpa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    public TestComponent(
            @Autowired BoardRepository boardRepository,
            @Autowired PostRepository postRepository
            ){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setName("boardTest");
        BoardEntity newBoardEntity = boardRepository.save(boardEntity);
        System.out.println(newBoardEntity.getName());

        PostEntity postEntity = new PostEntity();
        postEntity.setTitle("Hello ORM");
        postEntity.setContent("this entity is created by hibernate");
        postEntity.setWriter("haha");
        postEntity.setBoardEntity(newBoardEntity);
        PostEntity newPostEntity = postRepository.save(postEntity);

        System.out.println(postRepository.findAllByWriter("hello").size());



    }
}
