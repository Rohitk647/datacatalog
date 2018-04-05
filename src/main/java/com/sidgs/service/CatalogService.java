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

 public String addCatalog(){

     CatalogModel catalogModel=new CatalogModel(2,"instance2","training","sidglobal","4/5/18","4/6/18","training","catalog","dev","10.0.0.0","0.0.0.0.0","pract","aws","active");

     dataRepository.save(catalogModel);
     return "success";

 }

 public List<CatalogModel> getall(){
     return dataRepository.findAll();
 }

}
