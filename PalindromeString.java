public class PalindromeString {
    public static void main(String[] args) {
        String s= "madam";
        String p = "";
        for(int i = s.length()-1;i>=0;i--){
            p = p + s.charAt(i);
        }
        if(s.equals(p)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
    }
}
