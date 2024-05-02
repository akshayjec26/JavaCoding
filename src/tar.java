import java.util.Arrays;

public class tar {

    public static void main(String[] args) {
        int[] array = {1, 12, 15, 24, 13, 10};
        int target = 25;
        // {1,24,12,13,15,10}


//            int len = array.length;
//            for(int i = 0;i<len;i++){
//                for(int j =i+1;j<len;j++){
//                    if(array[i]+array[j]==target){
//                        System.out.println(array[i]+","+array[j]);
//                    }
//                }
//            }


                   int[] result  = arr(array,target);
        System.out.println(Arrays.toString(result));



    }



        public static int[] arr (int[] array, int target){
            int len = array.length;
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j < len; j++) {
                    if (array[i] + array[j] == target) {
                        //System.out.println(array[i] + "," + array[j]);

                        return  new int[] {array[i],array[j]};
                    }
                }
            }

            return  new int[] {0,0};

        }
    }


