package Programm;

public class SplittingString {

    public static void main(String[] args) {

        String s="Good mornning ";
        String[] obje = s.split(" ");
        for(String str:obje){
            if(str.equalsIgnoreCase("good")){

                System.out.println(str);
            }

        }
    }
}
