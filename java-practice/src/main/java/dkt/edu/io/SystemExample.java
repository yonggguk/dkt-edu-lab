package dkt.edu.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        while(true){
            int data = isr.read();
            if(data == -1){
                break;
            }
            System.out.println(data);
        }
    }
}
