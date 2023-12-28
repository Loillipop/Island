package com.company.model.classes;

import com.company.configs.LivenessConfig;
import com.company.model.Fauna;
import com.company.model.enums.AnimalType;

import static com.company.model.enums.AnimalType.MOUSE;

public class Mouse extends Fauna {
    public Mouse(LivenessConfig livenessConfig) {
        super(livenessConfig);
    }

    @Override
    public AnimalType getAnimalType() {
        return MOUSE;
    }
}
