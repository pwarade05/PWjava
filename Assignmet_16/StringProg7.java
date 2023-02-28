public class StringProg7 {
    public static void main(String[] args) {
        String str= "MAHARERA";
        System.out.println("The unique character is: ");
        for(int i=0; i<str.length(); i++)
        {
            int count=0;
            for(int j=0; j<str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j) && i!=j )
                {
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(str.charAt(i));
            }
        }                                                 //The output is-  The unique character is: 
    }                                                     //                M
}                                                         //                H
                                                          //                E
                                                     
                                                              
