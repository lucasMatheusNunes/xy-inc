package com.xyinc.service;

import com.xyinc.entity.Poi;
import com.xyinc.repository.PoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class PoiService {

    @Autowired
    private PoiRepository repository;

    public List<Poi> findAll(){
        return repository.findAll();
    }

    public Poi save(@Valid Poi poi){
        return repository.save(poi);
    }

}
