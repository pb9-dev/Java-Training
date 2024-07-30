import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 digit number to reverse it");
        int n=sc.nextInt();
        int revNum=0;
        while(n>0)
        {
            revNum = revNum*10 + n%10;
            n=n/10;
        }
        System.out.println("Required sum = "+revNum);  
        sc.close();
        }
}
