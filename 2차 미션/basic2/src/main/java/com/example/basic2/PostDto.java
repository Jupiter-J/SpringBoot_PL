package com.example.basic2;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class PostDto extends BoardDto {

    private int postId;
    private int boardId;
    private String title;
    private String content;
    private String userName;
    private String password;

    public PostDto(String BoardName, int boardId) {
        super(BoardName, boardId);
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "postId=" + postId +
                ", boardId=" + boardId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
