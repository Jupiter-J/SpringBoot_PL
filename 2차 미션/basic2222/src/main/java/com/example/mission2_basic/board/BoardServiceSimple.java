package com.example.mission2_basic.board;


import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceSimple implements BoardService {
    private static final Logger logger = LoggerFactory.getLogger(BoardServiceSimple.class);
    private final BoardRepository boardRepository;

    public BoardServiceSimple(
            @Autowired BoardRepository boardRepository
    ) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void createBoard(BoardDto dto) {
        if (!this.boardRepository.save(dto)) {
            throw new RuntimeException("save failed");
        }

    }

    @Override
    public List<BoardDto> readBoardAll() {
        return this.boardRepository.findAll();
    }


    //JSON
    @Override
    public JSONArray readAll() {
        return (JSONArray) this.boardRepository.findAll();
    }

    @Override
    public BoardDto readBoard(int id) {
        return this.boardRepository.findById(id);
    }

    @Override
    public void updateBoard(int id, BoardDto dto) {
        this.boardRepository.update(id, dto);
    }

    @Override
    public void deleteBoard(int id) {
        this.boardRepository.delete(id);
    }

    @Override
    public void createBoard(PostDto postDto) {
        if (!this.boardRepository.savep(postDto)) {
            throw new RuntimeException("save failed");
        }
    }
}

//    @Override
//    public void createPost(BoardDto dto) {
//        if(!this.boardRepository.save(dto)){
//            throw new RuntimeException("save failed");
//        }
//    }


    //******************//



//    //post
//    @Override
//    public void createPost(PostDto dtop) {
//        if(!this.boardRepository.save(dtop)){
//            throw new RuntimeException("save failed");
//        }
//
//    }
//
//
//
//    @Override
//    public List<PostDto> readPostAll() {
//        return this.boardRepository.findAll();
//    }
//
//    @Override
//    public BoardDto readPost(int id) {
//        return this.boardRepository.findByIdp(id);
//    }
//
//    @Override
//    public void updatePost(int id, BoardDto dtop) {
//        this.boardRepository.updatep(id,dto);
//    }
//
//    @Override
//    public void deletePost(int id) {
//        this.boardRepository.deletep(id);
//    }
//}
