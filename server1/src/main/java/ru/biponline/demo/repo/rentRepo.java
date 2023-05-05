package ru.biponline.demo.repo;

import org.springframework.data.repository.CrudRepository;
import ru.biponline.demo.entity.rentEntity;

public interface rentRepo extends CrudRepository<rentEntity, Long> {

}
