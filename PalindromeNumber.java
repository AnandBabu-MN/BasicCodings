public class PalindromeNumber {
    public static void main(String[] args) {

    int n = 151,sum=0,r;
    int temp=n;
    while(n>0){
        r=n%10;
        sum = (sum*10)+r;
        n=n/10;
    }
    if(temp==sum){
        System.out.println("It is a Palindrome Number");
    }else{
        System.out.println("It is not a Palindrome Number");
    }

    }
}
