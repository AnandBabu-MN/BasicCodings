import java.util.Scanner;

public class PrimeNumber {
    public static void primeNumber(int n){
        int m=0,flag=0;
        m=n/2;
        if(n==0 || n==1){
            System.out.println("The given num is not prime");
        }
        else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("The given num is not prime");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("The given num is prime");
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("Enter a num");
        primeNumber(a);

    }
}
