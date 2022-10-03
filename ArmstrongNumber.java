public class ArmstrongNumber {
    public static void main(String[] args) {
    int num=407;
    int sum=0,r;
    int temp=num;
    while(num>0){
        r=num%10;
        sum=sum+(r*r*r);
        num=num/10;
    }
    if(temp==sum) System.out.println("It is Armstrong");
    else System.out.println("Not an Armstrong");
        System.out.println();
    }
}
