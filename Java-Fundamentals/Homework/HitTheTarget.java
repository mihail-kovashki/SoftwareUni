import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < 20 ; i++) {
            for (int j = 0; j < 20; j++) {
                if (arr[i]+ arr[j] == input) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + input );
                } else if (arr[i] - arr[j] == input) {
                    System.out.println(arr[i] + " - " + arr[j] + " = " + input );
                }
            }
        }
    }
}
