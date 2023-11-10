package Strings;

public class extractWord {
    public static void main(String[] args) {
        String sentence = "the sky is blue";
        extractWords(sentence); // blue is sky the
    }

    public static void extract(String sent) {
        String word = "";
        int i = 0;
        while (i < sent.length()){
            if (sent.charAt(i) == ' '){
                System.out.println(word);
                word = "";
                i++;
            };
            word += String.valueOf(sent.charAt(i));
            i++;
        }
    }

    public static void extractWords(String sent) {
        while (true) {
            int i = sent.lastIndexOf(" ");
            String word = sent.substring(i + 1);
            System.out.println(word);
            if (i == -1){
                break;
            }
            sent = sent.substring(0, i);
        }
    }
}
