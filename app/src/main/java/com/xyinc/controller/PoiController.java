package com.xyinc.controller;

import com.xyinc.entity.Poi;
import com.xyinc.exception.CustomException;
import com.xyinc.service.PoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<Poi> save(@Valid @RequestBody Poi poi) throws CustomException {
        return ok(service.save(poi));
    }

    @RequestMapping(method = RequestMethod.GET, path = "/next")
    public ResponseEntity<List<Poi>> findNext(@RequestParam("x") int x, @RequestParam("y") int y, @RequestParam("d") int d){
        return ok(service.findNext(x, y, d));
    }

}
