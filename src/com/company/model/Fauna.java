package com.company.model;

import com.company.configs.LivenessConfig;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Fauna extends NatureObject {

    Integer speed;
    BigDecimal saturation;

    public Fauna(LivenessConfig livenessConfig) {
        super(livenessConfig);
        this.speed = livenessConfig.getSpeed();
        this.saturation = livenessConfig.getSaturation();
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public BigDecimal getSaturation() {
        return saturation;
    }

    public void setSaturation(BigDecimal saturation) {
        this.saturation = saturation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fauna fauna)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(speed, fauna.speed) && Objects.equals(saturation, fauna.saturation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, saturation);
    }

    @Override
    public String toString() {
        return "Fauna{" +
                "speed=" + speed +
                ", saturation=" + saturation +
                "} " + super.toString();
    }
}
