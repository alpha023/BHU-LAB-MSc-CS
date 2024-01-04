public class Question1 {
    public static void main(String[] args) {
        String s = "HelloHowareYou";
        char chArray[] = s.toCharArray();
        int frequency[] = new int[256];
        int maxCount = 0, minCount = 999999;
        char minChar = '\0', maxChar = '\0';
        for (char ch : chArray) {
            frequency[ch]++;

        }
        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                if (frequency[i] > maxCount) {
                    maxCount = frequency[i];
                    maxChar = (char) i;
                }
                if (frequency[i] < minCount) {
                    minCount = frequency[i];
                    minChar = (char) i;
                }
            }

        }
        System.out.println("Maximum Chracter = " + maxChar + " , " + maxCount + " Times Occured");
        System.out.println("Minimum Chracter = " + minChar + " , " + minCount + " Times Occured");

    }

}
