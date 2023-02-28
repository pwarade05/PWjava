public class StringProg6{
    public static void main(String[] args) {
        boolean flag=false;
        String str="FIX PROBLEM QUICKLY WITH GALVANIZED JETS";
        str=str.replace(" ", "");
        char []ch=str.toCharArray();

        int st[]=new int[26];

        for(int i=0; i<ch.length; i++)
        {
            st[ch[i]-65]++;
        }
        for(int i=0; i<st.length; i++)
        {
            if(st[i]==0)
            {
                System.out.println("it is not an Pangram");
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("it is an Pangram");
        }                                                 //Output is- it is an Pangram
    }
}