package com.example.mission2_basic.board;



public class PostDto extends BoardDto {

    private String title;
    private String content;
    private String userName;
    private String password;

    public PostDto(PostDto title, PostDto content, PostDto userName, PostDto password) {
        super(title, content, userName, password);
    }

    public PostDto(String boardName) {
        super(boardName);
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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
