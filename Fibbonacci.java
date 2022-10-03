import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        int a=0,b=1,num,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a count for fibbonacci: ");
        num=s.nextInt();
        System.out.println(a+" "+b);
        for(int i=2;i<num;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
