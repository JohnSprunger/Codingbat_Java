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
    public String frontBack(String str) {
        if(str.length() > 1){
            String frontChar = str.substring(0 , 1);
            String backChar = str.substring((str.length() - 1));
            String midString = str.substring(1 , (str.length() - 1));
            return backChar + midString + frontChar;
        }
        else
            return str;
    }

    // https://codingbat.com/prob/p136351
    public String front3(String str) {
        if(str.length() >= 3){
            String threeString = str.substring(0 , 3);
            return threeString + threeString + threeString;
        }
        else if(str.length() >= 1)
            return str + str + str;
        else
            return str;
    }

    // https://codingbat.com/prob/p161642
    public String backAround(String str) {
        String newString = str.substring(str.length() - 1) + str;
        newString += str.substring(str.length() - 1);

        return newString;
    }

    // https://codingbat.com/prob/p112564
    public boolean or35(int n) {
        return(n % 3 == 0) || (n % 5 == 0);
    }

    // https://codingbat.com/prob/p183592
    public String front22(String str) {
        if(str.length() == 1)
            return (str.substring(0,1) + str + str.substring(0,1));
        else if(str.length() == 0)
            return str;
        else
            return (str.substring(0,2) + str + str.substring(0,2));
    }

    // https://codingbat.com/prob/p191022
    public boolean startHi(String str) {
        if (str.length() < 2)
            return false;

        return str.substring(0, 2).equals("hi");
    }

    // https://codingbat.com/prob/p192082
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 >100);
    }
}
