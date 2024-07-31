
public class A8 {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            int n=i; int sum=0;
            while(n>0){
                int digit=n%10;
                sum += digit*digit*digit;
                n=n/10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
