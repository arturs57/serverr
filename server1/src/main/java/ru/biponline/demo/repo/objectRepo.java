package ru.biponline.demo.repo;

import org.springframework.data.repository.CrudRepository;
import ru.biponline.demo.entity.objectEntity;

public interface objectRepo extends CrudRepository<objectEntity, Long> {
    Iterable<objectEntity> findByobject_name(String name);
}
