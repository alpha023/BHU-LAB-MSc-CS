public class ReverseNumber {
    public static int reverseNum(int num) {
        int temp = num;
        int rev = 0, d;
        while (temp > 0) {
            d = temp % 10;

            rev = rev * 10 + d;
            temp /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(345));
        String temp = "JavaAndC";
        temp = temp + "\0";
        StringBuilder str[] = new StringBuilder[5];
        // str[0] = (StringBuilder) temp;

        // for (char ch : str) {

        // }

    }

    public static int LengthString(String st) {
        st += "\0";
        int l = 0;

        return l;
    }
}
