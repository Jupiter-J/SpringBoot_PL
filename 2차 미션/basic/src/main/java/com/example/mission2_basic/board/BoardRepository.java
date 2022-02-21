package com.example.mission2_basic.board;

import java.util.List;

public interface BoardRepository {
    boolean save(BoardDto dto);
    List<BoardDto> findAll();
    BoardDto findById(int id);
    boolean delete(int id);
    boolean update(int id, BoardDto dto);



    //post
    boolean savep (PostDto dtop);
    List<PostDto> findAllp();
    PostDto findByIdp(int id);
    boolean deletep(int id);
    boolean updatep(int id, PostDto dtop);



}
