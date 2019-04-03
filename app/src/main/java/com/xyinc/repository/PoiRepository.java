package com.xyinc.repository;

import com.xyinc.entity.Poi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PoiRepository extends JpaRepository<Poi, Long> {
    Poi findFirstByCoordinateXAndCoordinateY(int coordinateX, int coordinateY);
}
