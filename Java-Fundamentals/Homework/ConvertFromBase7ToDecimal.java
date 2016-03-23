import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = Integer.toString(a);
        String[] arr = b.split("");
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
            result += Integer.parseInt(arr[i])*Math.pow(7,arr.length - i -1);
        }

        System.out.println(result);
    }
}

