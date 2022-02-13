package Core.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleBufferedReader {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = bufferedReader.readLine();
            int i = Integer.parseInt(str);
            System.out.println(str);;
            System.out.println(i);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

