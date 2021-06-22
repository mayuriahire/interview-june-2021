import java.io.*;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int[] binarynum = new int[32];
    int i=0;
    if(n>0)
     {
       binarynum[i]=n%2;
       n=n/2;
       i++
         for(int j=i-1;j>=0;j--)
           system.out.print(binarynum[j];
     }
    else
     {
      throw new ArithmeticException("not valid no");
     }
    
   }                         
   public static void main(String[] args)
    {
        int n = 35;
        toBinary(n);
    }
}
 

