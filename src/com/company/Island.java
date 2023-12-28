package com.company;

import com.company.configs.WorldConfig;
import com.company.controllers.ConfigReadController;

import java.io.IOException;

public class Island {
    WorldConfig worldConfig = ConfigReadController.getConfig().getWorldConfig();

    public Island() throws IOException {
    }

    public void start()  {
        worldConfig.

    }
}
