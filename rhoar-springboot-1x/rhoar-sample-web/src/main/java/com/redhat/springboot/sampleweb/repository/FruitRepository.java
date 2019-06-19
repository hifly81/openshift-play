package com.redhat.springboot.sampleweb.repository;

import com.redhat.springboot.sampleweb.domain.Fruit;
import org.springframework.data.repository.CrudRepository;

public interface FruitRepository extends CrudRepository<Fruit, Integer> {
}