package com.sidgs.repository;

import com.sidgs.model.CatalogModel;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public interface DataRepository extends MongoRepository<CatalogModel, Integer> {


}
