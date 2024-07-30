import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Subject 1 Marks ");
        int m1 = sc.nextInt();
        System.out.print("Enter Subject 2 Marks ");
        int m2 = sc.nextInt();
        System.out.print("Enter Subject 3 Marks ");
        int m3 = sc.nextInt();

        int t = m1 + m2 + m3;
        double p = (t / 300.0) * 100;

        System.out.println("Total Marks= " + t);
        System.out.println("Percentage= " + p);
    }
}

