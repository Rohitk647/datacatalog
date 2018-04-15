package com.sidgs.service;

import com.sidgs.model.CatalogModel;
import com.sidgs.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * catalog service class
 */
@Service
public class CatalogService {

    @Autowired
    DataRepository dataRepository;

 public void addCatalog(CatalogModel catalogModel){

     dataRepository.save(catalogModel);

 }

 public Iterable<CatalogModel> getAll(){
      return dataRepository.findAll();
 }

 public int getInstance(String instance_id){
    return dataRepository.findByInstanceId(instance_id);
 }

}
