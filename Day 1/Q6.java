import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit ");
        double f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Temperature in celsius = " + c);
    }
}
