package Strings;

public class basicStrings {
    public static void main(String[] args) {
        String str = "hello i am abhijit";
        System.out.println(str.length());
        System.out.println(str.startsWith("abhi"));
        System.out.println(str.endsWith("abhi"));
        System.out.println(str.indexOf("abhi"));
        System.out.println(str.lastIndexOf("abhi")); // last occurrence index of first character
        System.out.println(str.equals("abhi")); // content checking instead of address checking by == (shallow copy using ==) and (deep copy using equals())
        // total substrings = n -> n(n+1)/2 sum of n natural nums
        System.out.println(str.substring(1,2));
    }
}
