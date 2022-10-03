public class VowelsInAString {
    public static void main(String[] args) {
        String str = "anandbabu";
        String s = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                s = s + str.charAt(i);
                count++;
            }
        }
        System.out.println("Number of Vowels in a String : " + count);

    }
}
