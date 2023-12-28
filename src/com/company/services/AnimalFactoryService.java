package com.company.services;

import com.company.configs.LivenessConfig;
import com.company.model.NatureObject;
import com.company.model.enums.AnimalType;
import com.company.model.classes.*;

import java.util.Map;
import java.util.function.Function;

import static com.company.model.enums.AnimalType.*;

public class AnimalFactoryService {

    Map<AnimalType, Function<LivenessConfig, NatureObject>> worldMap =Map.ofEntries(
            Map.entry(PLANT, Plant::new),
            Map.entry(BEAR, Bear::new),
            Map.entry(BOAR, Boar::new),
            Map.entry(BUFFALO, Buffalo::new),
            Map.entry(CATERPILLAR, CatterPillar::new),
            Map.entry(DEER, Deer::new),
            Map.entry(DUCK, Duck::new),
            Map.entry(EAGLE, Eagle::new),
            Map.entry(FOX, Fox::new),
            Map.entry(GOAT, Goat::new),
            Map.entry(HORSE, Horse::new),
            Map.entry(MOUSE, Mouse::new),
            Map.entry(RABBIT, Rabbit::new),
            Map.entry(SHEEP, Sheep::new),
            Map.entry(SNAKE, Snake::new),
            Map.entry(WOLF, Wolf::new)

    );
    public NatureObject getInstance(AnimalType animalType, LivenessConfig livenessConfig) {
        Function<LivenessConfig, NatureObject> function = worldMap.get(animalType);
        return function.apply(livenessConfig);
    }
}
