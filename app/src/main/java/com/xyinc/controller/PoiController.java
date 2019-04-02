package com.xyinc.controller;

import com.xyinc.entity.Poi;
import com.xyinc.service.PoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "/poi")
public class PoiController {

    @Autowired
    private PoiService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Poi>> findAll(){
        List<Poi> list = service.findAll();
        return ok(list);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Poi> save(@RequestBody Poi poi){
        return ok(service.save(poi));
    }

}
