package ps.demo.quicktest;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonComparing {

    public static void main(String[] args) {

        String string1 = "{\"fullName\": \"Emily Jenkins\", \"age\": 27, \"consumption_info\": {\"fav_product\": \"Coke\", \"last_buy\": \"2012-04-23\"}}";
        String string2 = "{\"age\": 27, \"consumption_info\": {\"last_buy\": \"2012-04-23\", \"fav_product\": \"Coke\"}, \"fullName\": \"Emily Jenkins\"}";


        JsonElement json1 = JsonParser.parseString(string1);
        JsonElement json2 = JsonParser.parseString(string2);

        System.out.println(String.format("json1.equals json2 = %s", json1.equals(json2)));

    }

}
