package Core.JSONandXMLparsers.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void gsonParse(String url) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        JsonReader reader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        CurrencyRate[] currencyRates = gson.fromJson(reader, CurrencyRate[].class);

        for (CurrencyRate rate : currencyRates) {
            System.out.println(rate);
        }
        String gsonString = gson.toJson(currencyRates);
        Files.write(Paths.get("D:\\Java\\domains\\JavaCore\\src\\main\\resources\\currency.json"), gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}

class RunGsonParse {
    public static void main(String[] args) throws IOException {
        String path = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
        GsonParser.gsonParse(path);

    }
}