package BasicJava;

public class BasicJavaPrg {

    public static void main(String[] args) {

        String s="samarth kale";
        StringBuffer sb =new StringBuffer(s);
        StringBuffer rev = sb.reverse();
        System.out.println(rev);

      String sk= "samarth kale from solapur ";
        int lg = sk.length();
        for (int i =1; i<=lg;i++){

         char  ch =sk.charAt(lg-i);
            System.out.print(ch);
        }
        BasicJavaPrg m= new BasicJavaPrg();
        m.Method();


    }
    public void Method(){

        int a []={ 2,34,5,6,67,78,67,78,33};
        for(int tt:a){
            System.out.println(tt);
        }
    }
}
