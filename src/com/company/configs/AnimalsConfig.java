package com.company.configs;

import com.company.model.enums.AnimalType;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalsConfig {
    Map<AnimalType, LivenessConfig> config;

    public Map<AnimalType, LivenessConfig> getConfig() {
        return config;
    }

    public void setConfig(Map<AnimalType, LivenessConfig> config) {
        this.config = config;
    }

}
