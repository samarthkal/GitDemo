public class Test extends Test2 {



    public static void main(String[] args) {
        Test sk= new Test ();
        Test2 kk =new Test2();

        System.out.println("Hello world!");

         sk.test();
         sk.Myinfo();

    }
    public void test(){


        System.out.println("child class");
        System.out.println("method overriding:child class ");


    }

    @Override
    public void Myinfo() {
       super.Myinfo();
    }
}