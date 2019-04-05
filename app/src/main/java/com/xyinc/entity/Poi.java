package com.xyinc.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity(name = "point_of_interest")
public class Poi {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, length = 60)
    @NotEmpty(message = "Name is required")
    private String name;
    private int coordinateX;
    private int coordinateY;

    public  Poi(){
    }

    public Poi(String name, @Min(value = 0, message = "Coordinate X must be a positive number") int coordinateX, @Min(value = 0, message = "Coordinate Y must be a positive number") int coordinateY) {
        this.name = name;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
