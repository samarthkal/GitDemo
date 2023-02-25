package Programm;

public class OddandEven {
    public static void main(String[] args) {

        int s[] = {2, 5, 3, 4, 8, 35, 40, 20, 6, 8};
        int length = s.length;
        for (int a : s) {

            if (a % 2 == 0) {
                System.out.println("Even numbers:" + a);
            } else {
                //  System.out.println("odd numbers:"+a);
            }
        }
        OddandEven ad = new OddandEven();
        ad.odd();

    }

    public void odd() {

        int i[] = {3, 7, 9, 1, 4, 5, 6, 8, 9, 24, 35, 66, 27};
        int length = i.length;
        for (int j : i) {
            if (j % 2 == 1) {
                System.out.println("Odd numbers :" + j);
            }
        }
    }
}
