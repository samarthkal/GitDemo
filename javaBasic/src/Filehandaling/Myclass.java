package Filehandaling;

import java.io.*;

public class Myclass {
    public static void main(String[] args) {


        File file=new File("myFile.txt");
       if(!file.exists());{
            try {
                file.createNewFile();              //             new file creating
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            FileWriter fw=new FileWriter(file);             //      file writing
            fw.write("practise makes man perfect");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr=new FileReader(file);        //        file  reading
            int i;
            while ((i=fr.read())!=-1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileOutputStream os=new FileOutputStream(file);          //      file writing
            String s="my string from file output stream class";
            os.write(s.getBytes());
            os.flush();
            os.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream in=new FileInputStream(file);       // file reading
            int i;
            while ((i=in.read())!=-1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
