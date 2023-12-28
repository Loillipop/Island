package com.company.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cell {
    List<NatureObject> listOfEntity = new ArrayList<>();
    Integer x;
    Integer y;

    public Cell (Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public List<NatureObject> getListOfEntity() {
        return listOfEntity;
    }

    public void setListOfEntity(List<NatureObject> listOfEntity) {
        this.listOfEntity = listOfEntity;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return Objects.equals(listOfEntity, cell.listOfEntity) && Objects.equals(x, cell.x) && Objects.equals(y, cell.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfEntity, x, y);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "listOfEntity=" + listOfEntity +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
