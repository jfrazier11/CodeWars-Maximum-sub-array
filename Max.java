
public class Max {
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
