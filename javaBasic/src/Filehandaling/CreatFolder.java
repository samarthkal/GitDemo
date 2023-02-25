package Filehandaling;

import java.io.*;

public class CreatFolder {

    public static void main(String[] args) {

        String path="Folder"+ File.separator+"samarth";
         File dir =new File(path );
         if(!dir.exists()){
             dir.mkdirs();
         }

        File fr=new File(path +File.separator+"myFile.txt");
        if (!fr.exists()){
            try {
                fr.createNewFile();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(fr.getName());
        System.out.println(fr.getAbsolutePath());
        System.out.println(fr.canWrite());

        try {
            FileOutputStream os=new FileOutputStream(fr);
            String str="im an Engineer";
            os.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream in=new FileInputStream(fr);
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
