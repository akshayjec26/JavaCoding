import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums ={ 1,2,3,4,5,6,9,89,78,56};
        System.out.println("here is your reverse array" + Arrays.toString(reverse(nums)));

    }

    public static int[] reverse(int [] arraynum ){
        int len = arraynum.length;
        int []p=new int[len];
       int j=0;
        for(int i=len-1;i>=0;i--){
            p[j]=arraynum[i];
            j++;
        }
  return p;


    }
}
