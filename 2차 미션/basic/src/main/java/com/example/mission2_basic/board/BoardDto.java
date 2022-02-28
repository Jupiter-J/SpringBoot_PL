package com.example.mission2_basic.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDto {

    private String boardName;
    private int boardId;
    private List<PostDto> postLists;

    public BoardDto(PostDto title, PostDto content, PostDto userName, PostDto password) {
        this.postLists = new ArrayList<>();
        postLists.add(title);
        postLists.add(content);
        postLists.add(userName);
        postLists.add(password);
    }

    public BoardDto(String boardName) {
        this.boardName = boardName;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }


    @Override
    public String toString() {
        return "BoardDto{" +
                "boardName='" + boardName + '\'' +
                '}';
    }
}
