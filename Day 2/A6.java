import java.util.*;
public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        String input;
        System.out.println("Enter integers or press 'q' if you want to stop");
        double sum=0;
        double product=1;
        while(true){
            System.out.print("Enter a number or press 'q' if you want to stop");
            input = sc.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            n=Integer.parseInt(input);
            sum += n;
            product *= n;
        }
        System.out.println("Sum = "+sum+" Product = "+product);
        sc.close();
    }
}
