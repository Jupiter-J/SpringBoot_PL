package dev.aquashdw.jpa.controller;

import dev.aquashdw.jpa.dto.PostDto;
import dev.aquashdw.jpa.entity.PostEntity;
import dev.aquashdw.jpa.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("board/{boardId}/post")
public class PostController {
    private static final Logger logger = LoggerFactory.getLogger(PostController.class);
    private final PostService postService;


    public PostController(
            @Autowired PostService postService
    ){
        this.postService = postService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void createPost(
            @PathVariable("boardId") Long boardId,
            @RequestBody PostDto dto){
        dto.setBoardId(boardId);
        this.postService.createPost(dto);
    }

    @GetMapping("{id}")
    public PostDto readPost(@PathVariable("id") int id){

        return this.postService.readPost(id);
    }

    @GetMapping("")
    public List<PostDto> readPostAll(){

        return this.postService.readPostAll();
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updatePost(@PathVariable("id") int id,
                        @RequestBody PostDto dto){
        this.postService.updatePost(id, dto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletePost(@PathVariable("id") int id ,
                            @RequestParam("password") String password){
        this.postService.deletePost(id, password);
    }


}
