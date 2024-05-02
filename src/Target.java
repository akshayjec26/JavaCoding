import java.util.Arrays;

public class Target {

    public static void main(String[] args) {
        int[] a = {2,5,7,6,9,4};

        int sum=10;

        int[] number = target(a,sum);
        System.out.println(Arrays.toString(number));


    }



    public static int[] target(int[] b, int target){
        int i=0;
        int len = b.length;
        int j= len-1;

        while(i<j){
            if(b[i]+b[j]==target){
                return new int[] {i+1,j+1};

            }else{
                j--;
            }
        }
        return new int[]{0,0};
    }
}
