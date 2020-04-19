package some.ex.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import some.ex.jackson.data.SomeData;
import some.ex.jackson.data.SomeObject;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        SomeObject someObject = new SomeObject();
        SomeData someData = new SomeData();
        someData.setParam1(100);
        someData.setParam2(true);
        someData.setParam3("JsonTestJackson");
        someData.setArray(new int[]{1, 2, 3, 5, 123, 453, 23423, 2341, 23341, 533});
        someObject.setParam123("This is first param");
        someObject.setParam321("This is second param");

        someData.setSomeObject(someObject);

        String result = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(someData);
        System.out.println(result);

        SomeData newData = objectMapper.readValue(result, SomeData.class);
        System.out.println(newData);

    }


}
