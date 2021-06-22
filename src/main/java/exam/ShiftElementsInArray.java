package exam;
import java.util.*;
public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int[] arr = [1,2,3,4,5]
    system.out.println("origanal array"+arr);
    int x=arr[0];
    arr[0] = arr[arr.length-1];
    arr[arr.length-1]=x;
    system.out.println("new array"+arr);

  }

}
