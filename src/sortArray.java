import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {5,8,29,4,1,0,3,6};
        System.out.println("Array before sorted :"+ Arrays.toString(arr));

        int len = arr.length;

        int temp =0;

        for (int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]>arr[j]){
                    temp   =  arr[i];
                    arr[i]   = arr[j];
                    arr[j]  = temp;
                }
            }

        }
        System.out.println("Array after sorted :"+ Arrays.toString(arr));

    }

}
