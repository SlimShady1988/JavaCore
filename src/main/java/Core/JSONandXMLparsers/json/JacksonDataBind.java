package Core.JSONandXMLparsers.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {
    public static void parseJson(String path) {
        ObjectMapper mapper = new ObjectMapper();
        Person person = null;
        try {
            person = mapper.readValue(new File(path), Person.class);
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class RunParse {
    public static void main(String[] args) {
        String path = "D:\\Java\\domains\\JavaCore\\src\\main\\resources\\person.json";
        JacksonDataBind.parseJson(path);

    }
}