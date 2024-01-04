public class VowelPresent {
    public static void main(String[] args) {
        String st = new String("Hll Hw  Y");
        char ch[] = st.toCharArray();
        boolean f = false;
        for (char c : ch) {
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'o' || c == 'U' || c == 'u') {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("Yes, Vowel is Present Here...");
        } else {
            System.out.println("No, Vowel is Not Present Here...");
        }

        if (checkPalindrome("abbabba")) {
            System.out.println("Yes Palindrome");
        } else {
            System.out.println("Not Palindrome...");
        }
    }

    public static boolean checkPalindrome(String st) {
        int size = st.length();
        boolean isPalindrome = true;
        int start = 0, end = size - 1;
        while (start <= end) {
            if (!(st.charAt(start) == st.charAt(end))) {
                isPalindrome = false;

            }
            start++;
            end--;
        }
        return isPalindrome;

    }
    public static void palindrome(String st){
        String rev="";
        int size=st.length();
        for(int i=size-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }

    }

    // public static int StringLength(String st){
    // String newst=st+'\0';

    // return 0;
    // }

}
