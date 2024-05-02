import java.util.Arrays;


public class TargetMulti {
    public static void main(String[] args) {
        int [] array = {1,12,15,24,13,10};
        int target = 25;

             int [] result    =  sum(array,target);
        System.out.println(Arrays.toString(result));

    }
    public static  int[] sum(int[] number, int tar){
        int len = number.length;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(number[i]+number[j]==tar){
                    int temp = number[i + 1];
                    number[i + 1] = number[j];
                    number[j] = temp;
                    return number;
                   // return new int[]{number[i], number[j]};
                }
            }
        }
       // return  new int[]{0, 0};
        return number;
    }
}
