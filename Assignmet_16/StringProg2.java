public class StringProg2 {
    public static void main(String[] args) {
        String str="movement";
        int character;
        char String[] = str.toCharArray();
        System.out.println("print duplicate character:-");

        for(int i=0; i<str.length(); i++)
        {
            character=1;
            for(int j=i+1; j<str.length(); j++)
            {
                if(String[i]==String[j]&&String[i]!=' ')
                {
                    character++;
                    String[j]='0';
                }
            }
            if(character>1 && String[i]!='0')
            {
                System.out.println(String[i]);
            }
        }                               //output is:
                                                //print duplicate character:-  m, e
    }
}
