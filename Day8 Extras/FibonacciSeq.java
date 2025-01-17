import java.util.Scanner;

public class FibonacciSeq {

    public static void fibonacciSeq(int num){
        int a=0, b=1, c;
        System.out.print(a + " " + b);
        for(int i=2; i<num; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int num = sc.nextInt();
        fibonacciSeq(num);
    }
}
