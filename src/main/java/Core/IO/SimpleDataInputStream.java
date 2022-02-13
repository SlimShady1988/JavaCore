package Core.IO;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try (
                DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
                DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dataOut.txt")))
        ) {
            out.writeShort(1000);
            out.writeInt(777777777);
            out.writeLong(11111111111L);
            out.writeUTF("Hello UTF World");
            out.flush();
            
            System.out.println(in.readShort());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
