package com.sidgs.repository;

import com.sidgs.model.CatalogModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DataRepository extends MongoRepository<CatalogModel, Integer> {
}
