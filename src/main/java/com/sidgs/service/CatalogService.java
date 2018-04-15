package com.sidgs.service;

import com.sidgs.model.CatalogModel;
import com.sidgs.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * catalog service class to perform CRUD operations
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

 private int getInstance(String instance_id){
    return dataRepository.findByInstanceId(instance_id);
 }

 public void modifyInstance(CatalogModel catalogModel){
     CatalogModel catalogModelUpdate= dataRepository.findById(getInstance(catalogModel.getInstance_id()));
     catalogModelUpdate.setTerminationDate(catalogModel.getTerminationDate());
     catalogModelUpdate.setInstance_owner(catalogModel.getInstance_owner());
     catalogModelUpdate.setExpirationDate(catalogModel.getExpirationDate());
     catalogModelUpdate.setPurpose(catalogModel.getPurpose());
     catalogModelUpdate.setProject(catalogModel.getProject());
     catalogModelUpdate.setEnvironment(catalogModel.getEnvironment());
     dataRepository.save(catalogModelUpdate);
 }

 public void modifyStatus(String id,String status){
     CatalogModel modifyStatus =dataRepository.findById(getInstance(id));
     modifyStatus.setStatus(status);
     dataRepository.save(modifyStatus);
 }
}
