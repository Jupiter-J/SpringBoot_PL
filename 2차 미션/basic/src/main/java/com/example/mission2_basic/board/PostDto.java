package com.example.mission2_basic.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PostDto {

    private String title;
    private String content;
    private String userName;
    private String password;

    @Override
    public String toString() {
        return "PostDto{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
