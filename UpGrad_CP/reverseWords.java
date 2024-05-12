package UpGrad_CP;

public class reverseWords {
    private static String reverse(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "Abhijit is a very good boy.";
        String answer = reverse(str);
        System.out.println(answer);
    }
}
