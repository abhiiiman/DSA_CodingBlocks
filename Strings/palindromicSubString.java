package Strings;

public class palindromicSubString {
    public static void main(String[] args) {
        String str = "nittin";
        solve(str);
    }

    public static void solve(String str) {
        for (int axis = 0; axis < str.length(); axis++){
            grow(str, axis, axis);
            grow(str, axis, axis+1);
        }
    }

    public static void grow(String word, int l, int r) {
        while (l >= 0 && r < word.length()){
            if (word.charAt(l) == word.charAt(r)){
//                l -> r palindrome
                System.out.println(word.substring(l, r+1));
                l--;r++;
            }
            else{
                break;
            }
        }
    }
}
