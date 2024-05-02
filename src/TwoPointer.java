import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
//        int[] arr = {1,2,9,7,4,5,3,6};
//         int len = arr.length;
//        int i=0;
//        int j = len-1;
//        int temp=0;
//
//        while(i<j){
//            //System.out.println("hello");
//            if(arr[i]%2!=0 && arr[j]%2==0){
//                 temp = arr[i];
//                 arr[i]  = arr[j];
//                 arr[j]  = temp;
//                        i++;
//                        j--;
//
//            }if(arr[i]%2==0){
//                i++;
//            }if(arr[j]%2!=0){
//                j--;
//            }
//
//        }
//        System.out.println(Arrays.toString(arr));


        int [] a={0,2,3,0,0,5,0,8,0};

        int len = a.length;
        int i =0;
        int j= len-1;

        int temp=0;

        while(i<j){
            if(a[i]==0 && a[j]!=0){
                temp = a[i];
                a[i] = a[j];
                a[j]  = temp;

            }
            if(a[i]!=0){
                i++;
            }if(a[j]==0){
                j--;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
