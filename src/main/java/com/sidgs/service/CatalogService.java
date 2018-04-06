package com.sidgs.service;

import com.sidgs.model.CatalogModel;
import com.sidgs.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    DataRepository dataRepository;

 public String addCatalog(CatalogModel catalogModel){

     dataRepository.save(catalogModel);
     return "success";

 }

 public List<CatalogModel> getall(){
     return dataRepository.findAll();
 }

}
