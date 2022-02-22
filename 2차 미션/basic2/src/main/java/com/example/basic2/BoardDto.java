package com.example.basic2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoardDto {

    private String BoardName;
    private int boardId;


    @Override
    public String toString() {
        return "BoardDto{" +
                "BoardName='" + BoardName + '\'' +
                ", boardId=" + boardId +
                '}';
    }
}
