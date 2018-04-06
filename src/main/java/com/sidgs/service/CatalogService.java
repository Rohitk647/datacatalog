package com.sidgs.service;

import com.sidgs.model.CatalogModel;
import com.sidgs.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {

    @Autowired
    DataRepository dataRepository;

 public String addCatalog(CatalogModel catalogModel){

     dataRepository.save(catalogModel);
     return "success";

 }

 public Iterable<CatalogModel> getall(){
      return dataRepository.findAll();
 }

}
