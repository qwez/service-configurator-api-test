package io.swagger.client.api;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class Helper {
    static JSONObject getJsonFromFile(String resourceName) throws IOException {
        URL fileURL = Helper.class.getClassLoader().getResource(resourceName);
        String filePath = new File(fileURL.getPath()).getPath();
        return new JSONObject(new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8));
    }
}
