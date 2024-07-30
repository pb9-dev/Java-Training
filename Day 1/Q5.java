public class Q5 {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a and b with third variable a = "+a+" b = "+b);
        a=6;
        b=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a and b without third variable a= "+a+" b = "+b);
    }
}
