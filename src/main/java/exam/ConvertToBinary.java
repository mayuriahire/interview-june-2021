package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int binary[] = new int[40];
    int i = 0;
    while(n>0)
    {
      binary[i++]=n%2;
      n=n/2;
    }
    for(int j=i-1;j>=0;j--)
    {
      system.out.println(binary[j]);
    } 
    if(n<0)
    {
      throw new exception("not valid no");
    }
    
    return "tobinary(35)";
  }
}
