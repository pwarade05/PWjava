public class StringProg8 {
    public static void main(String[] args) {
        String str="Belive is Prestigious";
        int[] range=new int[str.length()];
        char maxch=str.charAt(0);
        int i,j;
        char string[]=str.toCharArray();

        for( i=0; i<string.length; i++)
        {
            range[i]=1;

        for(j=i+1; j<string.length; j++)
        {
            if(string[i]==string[j] && string[i] !=' ' && string[i] != '0')
            {
                range[i]++;
                string[j]='0';
            }
        }
    }
    int max;
    max=(char) range[0];
    for( i=0; i<range.length; i++)
{
    if(max<range[i])
    {
        max=(char) range[i];
        maxch=string[i];
    }
}
    System.out.println("Maximum ocurring character is:- "+maxch);
}
}                                                                           //output is Maximum ocurring character is:- i
