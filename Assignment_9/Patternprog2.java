public class Patternprog2{
    public static void main(String[] args) {
        int n=30;
        for (int i=0; i<n; i++)
        {
             for(int j=0; j<n; j++)
             {
                   if(i+j==(n-1)/2 || j-i==(n-1)/2 ||i==(n+1)/2)
                    {
                         System.out.print("*");
                        }
                        else
                         {
                              System.out.print(" ");
                             }
                            }
                            System.out.print("    ");         // This is tried by me so consider as a extra 
                            for(int j=0; j<n; j++)
                            {
                                if(i+j==(n-1)/2 || j-i==(n-1)/2 ||i==(n+1)/2 || i==0 || j==0 && i<=(n-1)/2 || j==n-1 && i<=(n-1)/2 || i+j<=(n-1)/2||j-i>=(n-1)/2)
                                {
                                    System.out.print("*");
                                }
                                else
                                {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                    }
                }
        
