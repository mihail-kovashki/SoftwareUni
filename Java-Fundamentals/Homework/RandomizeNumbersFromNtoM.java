import java.util.Random;
import java.util.Scanner;


public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[Math.max(n,m) - Math.min(n,m)+ 1];
        int j = 0;
        for (int i = Math.min(n,m); i <=Math.max(n,m) ; i++) {
            arr[j] = i;
            j++;
        }
        Random rng = new Random();
        int index, tmp;
        for (int i = arr.length - 1; i >0  ; i--) {
            index = rng.nextInt(i + 1);
            tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
        for (int number: arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
