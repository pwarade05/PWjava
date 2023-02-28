import java.util.Arrays;

public class StringProg5 {
    public static void main(String[] args) {
        String str1="tove";
        String str2="vote";

        if(str1.length()==str2.length())
        {
            char[] st1=str1.toCharArray();
            char[] st2=str2.toCharArray();
            
            Arrays.sort(st1);
            Arrays.sort(st2);
            
            boolean output=Arrays.equals(st1, st2);
            
            if(output)
            {
                System.out.println("It is an Anagram");
            }
            else
            {
                System.out.println("It is not an Anagram");
            }
        }                                                           // The output is- It is an Anagram
    }
}

