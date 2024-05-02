import java.util.Arrays;

public class SquareSortedArray {

    public static void main(String[] args) {
        int[] arr = {8,5,-3,4,-2,6,-4};

        int len = arr.length;
        int i=0;
        int j=len-1;

        int k = len-1;

        int [] result = new int[len];

         while(0<=k){
              int leftnum = arr[i]*arr[i];
              int rigtnum= arr[j]*arr[j];

              if(leftnum<rigtnum){
                         result[k--] =rigtnum;
                         j--;
              }else{
                           result[k--]   =  leftnum;
                           i++;
              }
         }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}
