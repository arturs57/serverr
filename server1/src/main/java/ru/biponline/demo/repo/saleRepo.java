package ru.biponline.demo.repo;

import org.springframework.data.repository.CrudRepository;
import ru.biponline.demo.entity.saleEntity;

public interface saleRepo extends CrudRepository<saleEntity, Long> {
}
