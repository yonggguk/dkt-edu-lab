package dkt.edu.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {
    public static void main(String[] args){
        String path = "/Users/yonguk/Documents/TestDir/";
        File isDir = new File(path);
        if(!isDir.exists()){
            isDir.mkdirs();
        }
        try(FileWriter fw = new FileWriter(path+"input.txt"); PrintWriter pw = new PrintWriter(fw)){
            pw.write("test");
            System.out.println("실행됨");
        }catch(FileNotFoundException fnfe){

        }catch(IOException ioe){

        }
    }
}
