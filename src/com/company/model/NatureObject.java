package com.company.model;

import com.company.configs.LivenessConfig;
import com.company.model.enums.AnimalType;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class NatureObject {
    BigDecimal weight;

    public NatureObject(BigDecimal weight) {
        this.weight = weight;
    }

    public NatureObject(LivenessConfig livenessConfig) {
        this(livenessConfig.getWeight());
    }

    public abstract AnimalType getAnimalType();

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NatureObject that = (NatureObject) o;
        return Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "NatureObject{" +
                "weight=" + weight +
                '}';
    }

}
