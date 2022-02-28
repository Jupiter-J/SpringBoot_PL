package dev.aquashdw.jpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="board")
public class BoardEntity extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name="board_name")
    private String name;

    //하나의 보드가 여러개의 포스트를 가지고 있다.
    @OneToMany(
            targetEntity = PostEntity.class,
            fetch = FetchType.LAZY,
                //board post가 각각 1:n, n:1로 지정했는데 서로 같다는걸 알려주기 위함
            mappedBy = "boardEntity"
    )
    private List<PostEntity> postEntityList = new ArrayList<>();


    public BoardEntity() {
    }

    public BoardEntity(Long id, String name, List<PostEntity> postEntityList) {
        this.id = id;
        this.name = name;
        this.postEntityList = postEntityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "BoardEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postEntityList=" + postEntityList +
                '}';
    }
}
