package com.example.basic2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class InMemoryRepository implements Repository{
   private static final Logger logger = LoggerFactory.getLogger(InMemoryRepository.class);
   private final List<BoardDto> boardList;



   public InMemoryRepository(){
       this.boardList = new ArrayList<>();
   }



   //Board
    @Override
    public boolean saveBoard(BoardDto dto) {
        return this.boardList.add(dto);
    }

    @Override
    public List<BoardDto> findAllBoard() {
        return this.boardList;
    }

    @Override
    public BoardDto findByIdBoard(int id) {
        return this.boardList.get(id);
    }

    @Override
    public boolean deleteBoard(int id) {
        this.boardList.remove(id);
        return true;
    }

    @Override
    public boolean updateBoard(int id, BoardDto dto) {
        BoardDto targetBoard = this.boardList.get(dto.getBoardId());
        if(dto.getBoardName() != null)
            targetBoard.setBoardName(dto.getBoardName());

        this.boardList.add(id, targetBoard);
        return true;
    }



    //Post
    @Override
    public boolean savePost(int boardId, PostDto postDto) {
      return this.boardList.add(boardId, postDto);
    }

    @Override
    public List<BoardDto> findAllBoard(int boardId, int postId) {
        return null;
    }

    @Override
    public PostDto findByIdPost(int boardId, int postId) {
        return null;
    }

    @Override
    public boolean deletePost(int boardId, int postId) {
        return false;
    }

    @Override
    public boolean updatePost(int boardId, int postId, PostDto postDto) {
        return false;
    }





}
