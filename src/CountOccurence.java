import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

    public static void main(String[] args) {

        String name = "hello akshay";
        char[] result = name.toCharArray();

        int len = result.length;

        Map<Character,Integer> map = new HashMap<>();
        int count=0;
        for(int i= 0; i<len;i++){

            count=0;
            for(int j=0;j<len;j++){
                 if(result[i]==result[j]){
                     count++;
                 }
            }
            map.put(result[i],count);

        }
        System.out.println(map);
    }
}
