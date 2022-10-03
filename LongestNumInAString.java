public class LongestNumInAString {
    public static void main(String[] args) {
        String s = "ram24shyam123xyz98";
        int max=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int j=s.charAt(i)-'0';
                //System.out.println(j);
                sum=(sum*10)+j;
                if(i+1 == s.length()) {
                    if(max<sum)
                        max=sum;
                }
            }
            else {
                //System.out.println(sum);
                if(max<sum) {
                    max = sum;
                }
                sum=0;
            }

        }
        System.out.println(max);
    }
}
