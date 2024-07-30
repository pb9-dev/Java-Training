import java.util.Scanner;
import java.io.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 digit number");
        int n=sc.nextInt();
        String str = String.valueOf(n);
        if(str.length()!=5){
            System.out.println("Incorrect Input");
            return;
        }
        System.out.println("Required result = "+ (Integer.parseInt(String.valueOf(str.charAt(0)))+Integer.parseInt(String.valueOf(str.charAt(3)))));
        
    }
}
