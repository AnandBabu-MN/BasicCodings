import java.util.Scanner;

public class SwapNumberWithoutThirdVariable {

    public void swapTwoNumbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after Swapping "+a + " " +b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = scanner.nextInt();
        System.out.println("Enter first num");
        int b = scanner.nextInt();
        System.out.println("Before Swapping "+a + " " +b);
        SwapNumberWithoutThirdVariable swap = new SwapNumberWithoutThirdVariable();
        swap.swapTwoNumbers(a,b);


    }
}
