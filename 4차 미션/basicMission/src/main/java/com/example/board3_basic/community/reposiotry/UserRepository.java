package com.example.board3_basic.community.reposiotry;

import com.example.board3_basic.community.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);


}
