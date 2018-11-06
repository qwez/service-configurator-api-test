package io.swagger.client.api;

import org.json.JSONArray;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataProvider {

    @DataProvider(name = "UserChoiceConfigurationControllerApiTest")
    public static Object[][] userChoiceConfigurationController() {
        try {
            JSONArray data = Helper
                    .getJsonFromFile("UserChoiceConfigurationControllerApiTest.json")
                    .getJSONArray("test");
            List<Object> testList = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                testList.add(new Object[]{
                        data.getJSONObject(i).getInt("storeCode"),
                        data.getJSONObject(i).getJSONArray("quantity").toList(),
                        data.getJSONObject(i).getJSONArray("serviceId").toList(),
                        data.getJSONObject(i).getBigDecimal("expectedSum")
                });
            }

            return testList.toArray(new Object[data.length()][]);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        return null;
    }
}
