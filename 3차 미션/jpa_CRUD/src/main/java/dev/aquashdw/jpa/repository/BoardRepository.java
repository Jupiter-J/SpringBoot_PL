package dev.aquashdw.jpa.repository;

import dev.aquashdw.jpa.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;
                                                        //table 어떤 entity를 위한것이냐 //어떤 타입이냐
public interface BoardRepository extends CrudRepository<BoardEntity, Long> {

}
