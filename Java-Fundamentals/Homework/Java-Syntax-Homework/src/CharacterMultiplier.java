import java.util.Scanner;

public class CharacterMultiplier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int sum = 0;
        for (int i = 0; i < Math.min(str1.length(),str2.length()) ; i++) {
            sum += str1.charAt(i)*str2.charAt(i);
        }
        if (str1.length()>str2.length()){
            for (int i = str2.length(); i < str1.length() ; i++) {
                sum += str1.charAt(i);
            }
        } else if (str2.length()>str1.length()){
            for (int i = str1.length(); i < str2.length() ; i++) {
                sum += str2.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
