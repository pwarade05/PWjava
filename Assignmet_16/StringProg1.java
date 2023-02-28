public class StringProg1{ 
    public static void main(String[] args) {
        String str1="CCPP";
        String str2="";
        for(int i=0; i<str1.length(); i++)
        {
            if(str1.charAt(i%str1.length()) != str1.charAt((i+1)%str1.length()))
            {
                str2 += str1.charAt(i);
            }
        }
        System.out.println(str2);
    }                               //output is CP
}
