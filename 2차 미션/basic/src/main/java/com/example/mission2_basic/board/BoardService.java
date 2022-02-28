package com.example.mission2_basic.board;

import org.json.simple.JSONArray;

import java.util.List;

public interface BoardService {
//    void createBoard(BoardDto dto);
    List<BoardDto> readBoardAll();
    JSONArray readAll();
    BoardDto readBoard(int id);
    void updateBoard(int id, BoardDto dto);
    void deleteBoard(int id);

//    void createPost(BoardDto dto);
    void createPost(PostDto dtop);
    List<PostDto> readPostAll();
    PostDto readPost(int id);
    void updatePost(int id, PostDto dto);
    void deletePost(int id);

    void createBoard(int id, BoardDto boardDto);
}
