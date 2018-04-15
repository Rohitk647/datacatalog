package com.sidgs.controller;

import com.sidgs.model.CatalogModel;
import com.sidgs.repository.DataRepository;
import com.sidgs.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class CatalogController {

    @Autowired
    CatalogService catalogService;

    /**
     * Controller to add an instance
     * @param catalogModel
     */
    @RequestMapping(value= "catalog",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    void addCatalog(@RequestBody CatalogModel catalogModel) {
        catalogService.addCatalog(catalogModel);

    }

    /**
     * Controller to return all instances
     * @return
     */
    @RequestMapping(value= "/catalogs",method = RequestMethod.GET)
    @ResponseBody
    Iterable<CatalogModel> getAll(){
        return catalogService.getAll();
    }


    /**
     *Controller to modify the tags of existing instance
     * @param catalogModel
     * @return
     */
    @RequestMapping(value= "/catalog",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    Iterable<CatalogModel> getData(@RequestBody CatalogModel catalogModel){
        System.out.println(catalogService.getInstance(catalogModel.getInstance_id()));
        return catalogService.getInstance(catalogModel.getInstance_id());
    }

}
