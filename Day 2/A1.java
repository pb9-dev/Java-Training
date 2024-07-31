import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter Breadth of rectangle");
        int b=sc.nextInt();
        if(l==b)
        System.out.println("This is a square");
        else
        System.out.println("It's not a square");
        sc.close();
    }
}
