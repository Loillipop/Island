package com.company.model.classes;

import com.company.configs.LivenessConfig;
import com.company.model.Fauna;
import com.company.model.enums.AnimalType;

import static com.company.model.enums.AnimalType.BUFFALO;

public class Buffalo extends Fauna {
    public Buffalo(LivenessConfig livenessConfig) {
        super(livenessConfig);
    }

    @Override
    public AnimalType getAnimalType() {
        return BUFFALO;
    }
}
