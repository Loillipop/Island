package com.company.controllers;
import com.company.configs.AnimalsConfig;
import com.company.configs.WorldConfig;
import com.company.services.ConfigReaderService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.io.IOException;

import static com.company.model.constants.ConstantsPath.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfigReadController {
    static ConfigReadController configReadController;
    AnimalsConfig animalsConfig;
    WorldConfig worldConfig;

    public static ConfigReadController getConfigReaderService() {
        return configReadController;
    }

    public static void setConfigReaderService(ConfigReadController configReadController) {
        ConfigReadController.configReadController = configReadController;
    }

    public AnimalsConfig getAnimalsConfig() {
        return animalsConfig;
    }

    public void setAnimalsConfig(AnimalsConfig animalsConfig) {
        this.animalsConfig = animalsConfig;
    }

    public WorldConfig getWorldConfig() {
        return worldConfig;
    }

    public void setWorldConfig(WorldConfig worldConfig) {
        this.worldConfig = worldConfig;
    }

    public ConfigReadController(AnimalsConfig animalsConfig, WorldConfig worldConfig) {
        this.animalsConfig = animalsConfig;
        this.worldConfig = worldConfig;
    }

    public static ConfigReadController getConfig() throws IOException {
        configReadController = new ConfigReadController(ConfigReaderService.readConfig(ANIMAL_PROP_PATH, AnimalsConfig.class),
                ConfigReaderService.readConfig(MAP_PROP_PATH,WorldConfig.class)
        );
        return configReadController;
    }
}
