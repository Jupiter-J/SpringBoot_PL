package com.example.basic2;

import java.util.List;

public interface Repository {

    boolean saveBoard(BoardDto dto);
    List<BoardDto> findAllBoard();
    BoardDto findByIdBoard(int boardId);
    boolean deleteBoard(int boardId);
    boolean updateBoard(int boardId, BoardDto dto);



    //post
    boolean savePost (int boardId,PostDto postDto);
    List<BoardDto> findAllBoard(int boardId, int postId);
    PostDto findByIdPost(int boardId, int postId);
    boolean deletePost(int boardId, int postId);
    boolean updatePost(int boardId, int postId, PostDto postDto);



}
