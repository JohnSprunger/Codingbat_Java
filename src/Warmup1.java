// https://codingbat.com/java/Warmup-1
public class Warmup1 {
    // https://codingbat.com/prob/p187868
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return(vacation || !weekday);
    }

    // https://codingbat.com/prob/p181646
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }

    // https://codingbat.com/prob/p154485
    public int sumDouble(int a, int b) {
        if(a == b)
            return (a + b) * 2;
        else
            return (a + b);
    }

    // https://codingbat.com/prob/p116624
    public int diff21(int n) {
        if((n - 21) > 0)
            return Math.abs(n - 21) * 2;
        else
            return Math.abs(n - 21);
    }

    // https://codingbat.com/prob/p140449
    public boolean parrotTrouble(boolean talking, int hour) {
        return ((hour < 7 || hour > 20) && talking);
    }

    // https://codingbat.com/prob/p182873
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || (a + b) == 10);
    }

    // https://codingbat.com/prob/p184004
    public boolean nearHundred(int n) {
        int diff100 = 100 - n;
        int diff200 = 200 - n;
        return (Math.abs(diff100) <= 10 || Math.abs(diff200) <= 10);
    }

    // https://codingbat.com/prob/p159227
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative && a < 0 && b < 0)
            return true;

        return (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0)));
    }

    // https://codingbat.com/prob/p191914
    public String notString(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("not"))
            return str;

        return "not " + str;
    }

    // https://codingbat.com/prob/p190570
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    // https://codingbat.com/prob/p123384
    
}
