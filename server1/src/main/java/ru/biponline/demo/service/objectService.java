package ru.biponline.demo.service;

import ru.biponline.demo.entity.objectEntity;
import ru.biponline.demo.repo.objectRepo;

public class objectService {
    private final objectRepo repo;
    public objectService(objectRepo repo) {
        this.repo = repo;
    }
    public void save(objectEntity object) {repo.save(object);}
    public void delete(Long id){repo.deleteById(id);}
    public Iterable<objectEntity> getAll(){return repo.findAll();}
    public Iterable<objectEntity> getName(String name){
        return repo.findByobject_name(name); }
}
