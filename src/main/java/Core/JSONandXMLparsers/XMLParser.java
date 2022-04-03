package Core.JSONandXMLparsers;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class XMLParser {
    private String xml;
    public XMLParser(String path) {
        byte[] buf = null;
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile(path, "r");
            buf = new byte[(int) file.length()];
            file.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
               if (file != null) {
                   try {
                       file.close();
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }
        }
        xml = new String(buf, StandardCharsets.US_ASCII);
    }

    public String get(String path) {
        String[] parts = path.split("/");
        String s_xml = xml;
        for (String s : parts) {
            String toFind = "<" + s + ">";
            int start = s_xml.indexOf(toFind);
            if (start < 0) {
                return null;
            } else {
                start += toFind.length();
            }
            int end = s_xml.lastIndexOf("</" + s + ">");
            if (end < 0) {
                return null;
            }
            s_xml = s_xml.substring(start, end);
        }
        return s_xml;
    }
}
class Main {
    public static void main(String[] args) {
        XMLParser xmlParser = new XMLParser("D:\\Java\\domains\\JavaCore\\src\\main\\java\\Core\\parsers\\parsed.xml");
        String value = xmlParser.get("catalog/book/genre");
        System.out.println(value);
    }
}
