import java.util.HashSet;
import java.util.Set;

public class DistinctCharInString {
    public static void main(String[] args) {
        String str = "aabbbccc";
        Set<String> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            set.add(String.valueOf(str.charAt(i)));
        }
        System.out.println(set);
        System.out.println("Count of Distinct : "+set.size());
        //Another Way
        String  a="";
        int count = 0;
        for(int i=1;i<str.length();i++){
            String temp="";
            temp = temp +str.charAt(i);
            if(a.contains(temp)){
                continue;
            }else{
                a=a+str.charAt(i);
                count++;
            }
        }
        System.out.println(count);




    }
}
