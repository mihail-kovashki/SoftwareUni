
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String get = sc.next();
        String n = sc.next();
        String oddoreven = sc.next();
        int counter = 0;
        if (oddoreven.equals("odd")) {
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) % 2 != 0) {
                    System.out.print(arr[i] + " ");
                    counter++;
                }
                if (counter >= Integer.parseInt(n)) {
                    break;
                }
            }
        } else if (oddoreven.equals("even")) {
            for (int i = 0; i < arr.length; i++) {
                if (Integer.parseInt(arr[i]) % 2 == 0) {
                    System.out.print(arr[i] + " ");
                    counter++;
                }
                if (counter >= Integer.parseInt(n)) {
                    break;
                }
            }
        }
    }
}
