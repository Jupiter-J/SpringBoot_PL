package dev.aquashdw.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="user")
public class UserEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    private String name;


    //N:M 여러개의 포스트는 여러명의 유저로 생성된다
    @ManyToMany
    @JoinTable(name = "Users_post", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<PostEntity> postEntityList = new ArrayList<>();


    public UserEntity() {
    }

    public UserEntity(Long userId, String name, List<PostEntity> postEntityList) {
        this.userId = userId;
        this.name = name;
        this.postEntityList = postEntityList;
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PostEntity> getPostEntityList() {
        return postEntityList;
    }

    public void setPostEntityList(List<PostEntity> postEntityList) {
        this.postEntityList = postEntityList;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", postEntityList=" + postEntityList +
                '}';
    }
}
