package com.company.configs;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class LivenessConfig {
    BigDecimal weight;
    //    Integer neighborhoods;
    Integer speed;
    BigDecimal saturation;
    Integer count;
//
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public void setSaturation(BigDecimal saturation) {
        this.saturation = saturation;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public Integer getSpeed() {
        return speed;
    }

    public BigDecimal getSaturation() {
        return saturation;
    }

    public Integer getCount() {
        return count;
    }

}
