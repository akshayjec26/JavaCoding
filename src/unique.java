import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class unique {

    public static void main(String[] args) {
        String name = "abcdaebfg";  //


        char[] str = name.toCharArray();

        int len = str.length;

        Set<Character> al = new HashSet<>();

        List<Character> p = new ArrayList<>();

        for (char c : str) {
            al.add(c);
        }
         System.out.println(al);

    }
}