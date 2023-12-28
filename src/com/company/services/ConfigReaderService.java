package com.company.services;

import com.company.model.NatureObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;


public class ConfigReaderService {

    public static <T> T readConfig(String path, Class<T> tClass) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        return objectMapper.readValue(new File(path), tClass);
    }
}
