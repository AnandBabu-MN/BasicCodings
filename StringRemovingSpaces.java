public class StringRemovingSpaces {
    public static void main(String[] args) {
        String str = "Anand              Babu";
        char[] chars = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0;i<chars.length;i++){
            if((chars[i]!=' ') && (chars[i]!='\t')){
                buffer.append(chars[i]);
            }
        }
        System.out.println(buffer);
    }
}
