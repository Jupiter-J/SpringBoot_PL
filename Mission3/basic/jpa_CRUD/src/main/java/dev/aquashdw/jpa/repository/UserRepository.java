package dev.aquashdw.jpa.repository;

import dev.aquashdw.jpa.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
