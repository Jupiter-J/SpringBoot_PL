package com.example.board3_basic.community.reposiotry;

import com.example.board3_basic.community.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Long> {
}
