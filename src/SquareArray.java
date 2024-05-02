import java.util.Arrays;

public class SquareArray {
    public static void main(String[] args) {

        int[] arr ={8,-4,-1,0,3,10,0};

        int len= arr.length;
        int i =0;
        int j =len-1;

        int[] result = new int[len];
        int k=0;

       while(i<j){
           if(Math.abs(arr[i])>Math.abs(arr[j])){
                           arr[i] = arr[i]*arr[i];
               result[k++]=arr[i];
               i++;
           }else{
               arr[j] = arr[j]*arr[j];
               result[k++]=arr[j];
               j--;
           }
       }
        System.out.println(Arrays.toString(result));
    }
}
