
public class Warmup2 {

    // https://codingbat.com/prob/p142270
    public String stringTimes(String str, int n) {

        String newString = "";
        int i;

        for(i = 1; i <= n; i++){
            newString += str;
        }
        return newString;
    }

    // https://codingbat.com/prob/p101475
    public String frontTimes(String str, int n) {
        int len = str.length();
        String temp = "";

        if (len < 4) {
            for (int i = 0; i < n; i++) {
                temp += str;
            }
        } else {
            for (int j = 0; j < n; j++) {
                temp += str.substring(0,3);
            }
        }

        return temp;
    }

    // https://codingbat.com/prob/p194667
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    // https://codingbat.com/prob/p186759
    boolean doubleX(String str) {
        int i = str.indexOf("x");

        if (i == -1) return false;
        if (i+1 >= str.length()) return false;

        return str.substring(i+1, i+2).equals("x");
    }

}
