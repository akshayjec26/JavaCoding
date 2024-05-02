public class Practice {
    public static void main(String[] args) {
        String name = "tomorrow";
        char[] num = name.toCharArray();
        String result = "";
        int count =1;
        for (char c : num) {
            if (c == 'o') {
                for (int j = 0; j < count; j++) {
                    result = result + "$";
                }
                count++;
            } else {
                result = result + String.valueOf(c);
            }
        }
        System.out.println(result);
    }
}
