package org.example.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JSONUtil {
    private static ObjectMapper M = new ObjectMapper();
    public static String serialize(Object o) throws JsonProcessingException {
        return M.writeValueAsString(o);
    }

    public static <T> T deserialize(InputStream is, Class<T> c) throws IOException {
        return M.readValue(is,c);
    }
}
