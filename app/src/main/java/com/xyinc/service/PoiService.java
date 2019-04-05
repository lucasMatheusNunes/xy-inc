package com.xyinc.service;

import com.xyinc.entity.Poi;
import com.xyinc.exception.AlreadyRegisteredException;
import com.xyinc.exception.InvalidFieldException;
import com.xyinc.repository.PoiRepository;
import com.xyinc.repository.implementation.PoiImplementation;
import com.xyinc.to.PoiNextTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Service
public class PoiService {

    @Autowired
    private PoiRepository repository;

    @Autowired
    private PoiImplementation poiImplementation;

    public List<Poi> findAll(){
        return repository.findAll();
    }

    public Poi save(@Valid Poi poi) throws AlreadyRegisteredException{
        if(poi.getCoordinateX() < 0 || poi.getCoordinateY() < 0){
            throw new InvalidFieldException("Coordinate X and Coordinate Y should be a positive number");
        }
        if(repository.findFirstByCoordinateXAndCoordinateY(poi.getCoordinateX(), poi.getCoordinateY()) != null ){
            throw new AlreadyRegisteredException("Already a Point of Interest with the same coordinates.");
        }
        return repository.save(poi);
    }

    public List<Poi> findNext(int x, int y, int d){
        PoiNextTO poiNextTO = new PoiNextTO();
        poiNextTO.setX(x);
        poiNextTO.setY(y);
        poiNextTO.setD(d);

        List<PoiNextTO> list = new ArrayList<>();
        list.add(poiNextTO);

        //return list;
        return poiImplementation.findNext(poiNextTO);
    }
}
