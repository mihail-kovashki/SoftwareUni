import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] p1 = sc.nextLine().split(" ");
        String[] p2 = sc.nextLine().split(" ");
        String[] p3 = sc.nextLine().split(" ");
        int x1 = Integer.parseInt(p1[0]);
        int y1 = Integer.parseInt(p1[1]);
        int x2 = Integer.parseInt(p2[0]);
        int y2 = Integer.parseInt(p2[1]);
        int x3 = Integer.parseInt(p3[0]);
        int y3 = Integer.parseInt(p3[1]);

        int area = Math.abs((x1*(y2-y3)+x2*(y3-y1)+ x3*(y1-y2))/2);

        System.out.println(area);

    }
}
