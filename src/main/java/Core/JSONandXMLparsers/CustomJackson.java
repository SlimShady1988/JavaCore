package Core.JSONandXMLparsers;

import lombok.Data;

public class CustomJackson {
    public static void main(String[] args) {
        var json = "{\n" +
                "  \"name\": \"Victor\",\n" +
                "  \"surname\":\"Kabal\",\n" +
                "  \"email\": \"kanekabal@gmail.com\"\n" +
                "}";

        var user = jsonToObj(json, User.class);
        System.out.println(user);
    }

    private static <T> T jsonToObj(String json, Class<T> userClass) {
        return null;
    }

    @Data
    static class User {
        private String name;
        private String surname;
        private String email;
    }
}
