package com.example.mission2_basic.board;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boards")
public class BoardRestController {
    private static final Logger logger = LoggerFactory.getLogger(BoardRestController.class);
    private final BoardService boardService;

    public BoardRestController(
            @Autowired BoardService boardService
    ){
        this.boardService = boardService;
    }


    //8080:/boards
    @PostMapping()
    public void createBoard(@RequestBody BoardDto boardDto){
        logger.info(boardDto.toString());
        this.boardService.createBoard(boardDto);

    }

    @GetMapping()
    public List<BoardDto> readBoardAll(){
        logger.info("in read board all");
        return this.boardService.readBoardAll();
    }

   @GetMapping("/test")
    public JSONArray readAll(){
        return this.boardService.readAll();
   }

    @GetMapping("{id}")
    public BoardDto readBoard(@PathVariable("id") int id){
        logger.info("in read board");
        return this.boardService.readBoard(id);
    }

    @PutMapping("{id}")
    public void updateBoard(@PathVariable("id") int id,
                            @RequestBody BoardDto boardDto){
        logger.info("target: "+ id);
        logger.info("update content:" + boardDto);
        this.boardService.updateBoard(id, boardDto);
    }

    @DeleteMapping("{id}")
    public void deleteBoard(@PathVariable("id") int id){
        this.boardService.deleteBoard(id);
    }




    //******************//

    //post
    @PostMapping("/posts")
    public void createPost(@RequestBody PostDto postDto){
        logger.info(postDto.toString());
        this.boardService.createPost(postDto);
    }

    @GetMapping("/posts")
    public List<PostDto> readPostAll(){
        logger.info("in read post all");
        return this.boardService.readPostAll();
    }

    @GetMapping("/posts/{id}")
    public PostDto readPost(@PathVariable("id") int id){
        logger.info("in read post");
        return this.boardService.readPost(id);
    }

    @PutMapping("/posts/{id}")
    public void updatePost(@PathVariable("id") int id,
                           @RequestBody PostDto postDto){
        this.boardService.updatePost(id, postDto);

    }

    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable("id") int id,
                           @PathVariable("password") String password){
        this.boardService.deletePost(id);
    }



}
