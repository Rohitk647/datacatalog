package com.sidgs.controller;

import com.sidgs.model.CatalogModel;
import com.sidgs.repository.DataRepository;
import com.sidgs.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    CatalogService catalogService;

    @RequestMapping(value= "/addcatalog",method = RequestMethod.POST)

    void addCatalog() {
        catalogService.addCatalog();
    }

    @RequestMapping(value= "/getall",method = RequestMethod.GET)
    @ResponseBody
    List<CatalogModel> getall(){
        return catalogService.getall();
    }

}
