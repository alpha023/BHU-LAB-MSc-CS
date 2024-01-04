package ReverseNumber;

public class ReverseNumber {
    public static int reverseNum(int num) {
        int temp = num;
        int rev = 0, d;
        while (temp > 0) {
            d = temp % 10;

            rev = rev * 10 + d;
        }
        return rev;
    }

    static public void main(String args[]) {
        System.out.println(reverseNum(123));
    }
}
