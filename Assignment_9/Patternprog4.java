public class Patternprog4 {
    public static void main(String[] args) {
        int n=15;
        for(int i=0; i<n; i++)              
        {
            for(int j=0; j<n; j++)          // for alphabet P
            {
               if(j==0 || i==0 || i==(n-1)/2 || j==n-1 && i<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.print(" ");
            for(int j=0; j<n; j++)                  // for alphabet W
            {
                if(j==0 || i>=(n-1)/2 && i+j==(n-1) || j==(n-1) || i>=(n-1)/2 && i-j==(n+1)/20)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.print("         ");
            for(int j=0; j<n; j++)                          // for alphabet S
            {
                if(i==0 || j==0 && i<(n-1)/2 || i==(n-1)/2 || i==n-1 || j==n-1 && i>(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.print(" ");
            for(int j=0; j<n; j++)                                  // for alphabet K
            {
                if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            for(int j=0; j<n; j++)                          // for alphabet I
            {
                if(i==0 || j==(n-1)/2 || i==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print( " ");
                }
            }
            System.out.print(" ");
              for(int j=0; j<n; j++)                        // for alphabet L
              {
                  if(j==0 || i==n-1)
                  {
                      System.out.print("*");
                    }
                    else
                    {
                        System.out.print( " ");
                    }
                }
                System.out.print(" ");
                for(int j=0; j<n; j++)                      // for alphabet L
                {
                    if(j==0 || i==n-1)
                    {
                          System.out.print("*");
                        }
                        else
                        {
                            System.out.print( " ");
                        }
                    }
                    System.out.print(" ");
                    for(int j=0; j<n; j++)                 // for alphabet S
                    {
                        if(i==0 || j==0 && i<(n-1)/2 || i==(n-1)/2 || i==n-1 || j==n-1 && i>(n-1)/2)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print( " ");
                        }
                    }
                     System.out.println();
                    }
                }
            }
