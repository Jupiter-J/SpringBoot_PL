package com.example.mission2_basic.board;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardInMemoryRepository implements BoardRepository{
    private static final Logger logger = LoggerFactory.getLogger(BoardInMemoryRepository.class);
    private final List<BoardDto> boardList;
    private final List<PostDto> postList;
    private List<BoardDto> postLists;
//    private JSONArray bothArray;



    public BoardInMemoryRepository(){
        this.boardList = new ArrayList<>();
        boardList.add((BoardDto) postLists);
        this.postList = new ArrayList<>();
//        this.bothArray = new JSONArray();
//        bothArray.add(boardList);
//        bothArray.add(postList);
    }

    @Override
    public boolean save(BoardDto dto) {
        return this.boardList.add(dto);
    }

    @Override
    public List<BoardDto> findAll() {
        return this.boardList;
    }

    @Override
    public BoardDto findById(int id) {
        return this.boardList.get(id);
    }

    @Override
    public boolean delete(int id) {
        this.boardList.remove(id);
        return true;
    }

    @Override
    public boolean update(int id, BoardDto dto) {
        this.boardList.set(id, dto);
        return false;
    }




                        //******************//



    //post
    @Override
    public boolean savep(PostDto dtop) {
        return postList.add(dtop);
    }

    @Override
    public List<PostDto> findAllp() {
        return postList;
    }

    @Override
    public PostDto findByIdp(int id) {
        return postList.get(id);
    }

    @Override
    public boolean deletep(int id) {
        this.postList.remove(id);
        return true;
    }

    @Override
    public boolean updatep(int id, PostDto dtop) {
        this.postList.set(id, dtop);
        return false;
    }



}
