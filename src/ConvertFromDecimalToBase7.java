import java.util.Scanner;

public class ConvertFromDecimalToBase7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toString(a);
        String result = new String();
        if (a>= Math.pow(7,b.length())){
            for (int i = b.length(); i >= 0 ; i--) {
                int mask = (int) (a / (Math.pow(7, i)));
                result += Integer.toString(mask);
                a -= mask*(Math.pow(7, i));
            }
        } else {
            for (int i = b.length(); i > 0 ; i--) {
                int mask = (int) (a / (Math.pow(7, i-1)));
                result += Integer.toString(mask);
                a -= mask*(Math.pow(7, i-1));
            }
        }

        System.out.println(result);
    }

}
