package Core.JSONandXMLparsers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

public class CustomJackson {
    public static void main(String[] args) throws JsonProcessingException {
        var json = "{\n" +
                "  \"name\": \"Victor\",\n" +
                "  \"surname\":\"Kabal\",\n" +
                "  \"email\": \"kanekabal@gmail.com\"\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();

        var user = mapper.readValue(json, User.class);
        System.out.println(user);
    }

    @Data
    static class User {
        private String name;
        private String surname;
        private String email;
    }
}
