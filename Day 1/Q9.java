import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number to calc. its digit's sum");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            sum +=n%10;
            n=n/10;
        }
        System.out.println("Required sum = "+sum);  
        }
}
