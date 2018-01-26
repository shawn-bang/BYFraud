package com.byit.fraud.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by shawn on 2018/01/24.
 */
public class JsonUtil {
    private static JsonUtil jsonUtil = null;
    private ObjectMapper mapper = null;

    public static JsonUtil getInstance() {
        if (jsonUtil == null) {
            synchronized (JsonUtil.class) {
                if (jsonUtil == null) {
                    jsonUtil = new JsonUtil();
                    jsonUtil.mapper = new ObjectMapper();
                    jsonUtil.mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
                }
            }
        }
        return jsonUtil;
    }

    public String writeJson(Object object) {
        String result = null;
        try {
            result = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public <T> T readJson(String jsonString, Class<T> clazz) throws IOException {
        return mapper.readValue(jsonString, clazz);
    }

    public <T> T readJson(byte[] jsonByes, Class<T> clazz) throws IOException {
        return mapper.readValue(jsonByes, clazz);
    }

    public <T> T readJson(String jsonString, TypeReference<T> typeReference) throws IOException {
        return mapper.readValue(jsonString, typeReference);
    }

    public <T> T readJson(byte[] jsonByes, TypeReference<T> typeReference) throws IOException {
        return mapper.readValue(jsonByes, typeReference);
    }

    public JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}
