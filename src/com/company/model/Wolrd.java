package com.company.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Wolrd {
    List<List<Cell>> cells = new ArrayList<>();

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    @Override
    public String toString() {
        return "Wolrd{" +
                "cells=" + cells +
                '}';
    }

}
