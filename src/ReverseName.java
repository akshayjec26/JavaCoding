import java.util.Arrays;

public class ReverseName {

    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();

        if (str1.length() == str2.length()) {
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result = Arrays.equals(ch1, ch2);
            if (result)
                System.out.println("String anagram");
            else
                System.out.println("String NOT anagram");
        }
    }
}