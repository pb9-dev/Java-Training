import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number ");
        int n2 = sc.nextInt();
        int min=Math.min(n1,n2);
        for(int i=min;i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.print("Gcd = "+i);
                return;
            }
        }
        sc.close();
    }
}
