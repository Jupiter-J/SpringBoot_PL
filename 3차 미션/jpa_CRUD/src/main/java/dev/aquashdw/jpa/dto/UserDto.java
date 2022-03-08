package dev.aquashdw.jpa.dto;

public class UserDto {

    private Long userId;
    private String userName;
    private Long postId;

    public UserDto() {
    }

    public UserDto(Long userId, String userName, Long postId) {
        this.userId = userId;
        this.userName = userName;
        this.postId = postId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", postId=" + postId +
                '}';
    }
}
