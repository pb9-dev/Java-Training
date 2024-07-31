import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 digits to find average");
        int arr[]=new int[10];
        double sum = 0; double avg = 0;
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            sum += arr[i];
            avg = sum/arr.length;
        }
        System.out.println("Average ="+avg);
    }
}
