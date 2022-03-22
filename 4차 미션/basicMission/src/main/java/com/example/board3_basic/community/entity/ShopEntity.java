package com.example.board3_basic.community.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
public class ShopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //shop - 유저 (1:1)
    @OneToOne(
            targetEntity = UserEntity.class,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "owner_id")
    private UserEntity owner;

    //shop >- 지역
    @ManyToOne(
            targetEntity = AreaEntity.class,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "located_at")
    private AreaEntity location;

    //shop >- 카테고리  ***왜 카테고리의 OnetoMany는 안 사용하는 거지
    @ManyToOne(
            targetEntity = CategoryEntity.class,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "category")
    private CategoryEntity categoryEntity;

    // shop -< shop리뷰
    @OneToMany(
            targetEntity = ShopPostEntity.class,
            fetch = FetchType.LAZY
    )
    private List<ShopPostEntity> shopPostEntityList;

    public List<ShopPostEntity> getShopPostEntityList(){
        return this.shopPostEntityList;
    }

    public ShopEntity() {
    }

    public ShopEntity(Long id, String name, UserEntity owner, AreaEntity location, CategoryEntity categoryEntity) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.location = location;
        this.categoryEntity = categoryEntity;
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

    public UserEntity getOwner() {
        return owner;
    }

    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }

    public AreaEntity getLocation() {
        return location;
    }

    public void setLocation(AreaEntity location) {
        this.location = location;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }
}
