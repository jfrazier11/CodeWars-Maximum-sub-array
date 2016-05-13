  /**
   *  finding the maximum sum of a contiguous subsequence in an array or list of integers:
   *  Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}); // should be 6: {4, -1, 2, 1}
   *  @author Jeremi R Frazier
   *  @version 1.0
   */
public class Max {
   /**
    * This method takes an integer array and finds the some of a contiguous subsencence.
    * @param arry - integer array to evaluate
    * @return max value found in array.
    */
  public static int sequence(int[] arr) {
      if(arr == null || arr.length == 0){
      return 0;
      }
      
      boolean aPositive = false;
      for(int i=0; i< arr.length;i++){
      if(arr[i] > 0){ aPositive = true; break;}
      } 
      if(aPositive == false){return 0; }
      
      int max = 0;
      int currentMax = 0;
      for(int i=0; i< arr.length;i++){
        currentMax += arr[i];
        if(currentMax < 0) {currentMax =0;}
        if(max < currentMax){ max = currentMax;}
        
      }
        return max;
      }
}
