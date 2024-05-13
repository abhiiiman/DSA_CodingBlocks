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

    private static String revWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder rev = new StringBuilder();
        for (String word : words) {
            StringBuilder revWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord.append(word.charAt(i)); // add from the last to get reversed.
            }
            rev.append(revWord).append(" ");
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = "Abhijit is a very good boy.";
        String answer = reverse(str);
        System.out.println(answer);
        System.out.println(revWords(str));
    }
}
