package com.sidgs.repository;

import com.sidgs.model.CatalogModel;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import sun.awt.SunHints;

import java.util.Optional;

@Component
public interface DataRepository extends CrudRepository<CatalogModel,Integer> {

    /**
     *
     * To return instance by instance ID
     * @param instance_id
     * @return
     */

    @Query(value = "SELECT id FROM catalog_model where instance_id = :instance_id",nativeQuery = true)

    int findByInstanceId(@Param("instance_id") String instance_id);

    @Query(value = "SELECT * FROM catalog_model WHERE id =:id",nativeQuery = true)
    CatalogModel findById(@Param("id") int id);


}
