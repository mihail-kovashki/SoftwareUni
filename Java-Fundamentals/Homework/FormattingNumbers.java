import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.printf("|%-10X|%10s|%10.2f|%-10.3f|" , a,   String.format("%10s" ,Integer.toBinaryString(a)).replace(' ','0'), b,c);
    }
}
