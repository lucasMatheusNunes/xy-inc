package com.xyinc.repository.implementation;

import com.xyinc.entity.Poi;
import com.xyinc.to.PoiNextTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PoiImplementation {
    @PersistenceContext
    EntityManager entityManager;

    public List<Poi> findNext(PoiNextTO poiNextTO){
        String jpql = "SELECT p FROM point_of_interest p" +
                        " WHERE p.coordinateX BETWEEN :minX AND :maxX" +
                        " AND p.coordinateY BETWEEN :minY AND :maxY";

        TypedQuery<Poi> query = entityManager.createQuery(jpql, Poi.class);
        query.setParameter("minX", poiNextTO.getMinDistanceX());
        query.setParameter("maxX", poiNextTO.getMaxDistanceX());
        query.setParameter("minY", poiNextTO.getMinDistanceY());
        query.setParameter("maxY", poiNextTO.getMaxDistanceY());
        return query.getResultList();
    }
}
