package com.company.model.classes;


import com.company.configs.LivenessConfig;
import com.company.model.Flora;
import com.company.model.enums.AnimalType;

import static com.company.model.enums.AnimalType.PLANT;

public class Plant extends Flora {

    public Plant(LivenessConfig livenessConfig) {
        super(livenessConfig);
    }

    @Override
    public AnimalType getAnimalType() {
        return PLANT;
    }
}
