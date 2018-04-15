package com.sidgs.repository;

import com.sidgs.model.CatalogModel;
import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.security.PermitAll;

@Component
public interface DataRepository extends CrudRepository<CatalogModel,Integer> {

    /**
     *
     * To return instance by instance ID
     * @param instance_id
     * @return
     */

    @Query(value = "SELECT * FROM catalog_model where instance_id = :instance_id",nativeQuery = true)

    Iterable<CatalogModel> findByInstanceId(@Param("instance_id") String instance_id);

}
