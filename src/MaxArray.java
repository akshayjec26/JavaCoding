public class MaxArray {
    public static void main(String[] args) {

        int[] arr = {3,8,27,0,5,9,-1};
        int len = arr.length;
        int max= arr[0];
        int min =arr[0];
        for(int i=0;i<len;i++){
            if(max<arr[i]){
                max   = arr[i];
            }
        }
        System.out.println(max+": max number in array");

        for(int j=0;j<len;j++){
            if(min>arr[j]){
                min   = arr[j];
            }
        }
        System.out.println(min+": min number in array");
    }
    }





