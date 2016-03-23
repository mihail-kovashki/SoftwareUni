import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        if (arr.length%2!= 0) {
            System.out.println("Invalid lenght");
        } else {
            for (int i = 0; i < arr.length; i += 2) {
                if (Integer.parseInt(arr[i]) % 2 == 0 && Integer.parseInt(arr[i + 1]) % 2 == 0) {
                    System.out.println(arr[i] + ", " + arr[i + 1] + " -> both are even");
                }
                if (Integer.parseInt(arr[i]) % 2 != 0 && Integer.parseInt(arr[i + 1]) % 2 != 0) {
                    System.out.println(arr[i] + ", " + arr[i + 1] + " -> both are odd");
                }
                if (Integer.parseInt(arr[i]) % 2 == 0 ^ Integer.parseInt(arr[i + 1]) % 2 == 0) {
                    System.out.println(arr[i] + ", " + arr[i + 1] + " -> different");
                }
            }
        }
    }
}
