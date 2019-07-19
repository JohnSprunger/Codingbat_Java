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

    // https://codingbat.com/prob/p144535
    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    // https://codingbat.com/prob/p178986
    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    // https://codingbat.com/prob/p165701
    public boolean loneTeen(int a, int b) {
        if((a < 13 || a > 19) && (b >= 13 && b <= 19))
            return true;

        return (b < 13 || b > 19) && (a >= 13 && a <= 19);
    }

    // https://codingbat.com/prob/p100905
    public String delDel(String str) {
        if(str.length() > 3){
            if(str.substring(1,4).equals("del"))
                return (str.substring(0, 1) + str.substring(4));
            else
                return str;
        } else return str;
    }

    // https://codingbat.com/prob/p151713
    public boolean mixStart(String str) {
        if(str.length() >= 3)
            return str.substring(1,3).equals("ix");

        return false;
    }

    // https://codingbat.com/prob/p199720
    public String startOz(String str) {
        String s = "";

        if (str.length() > 1) {
            if (str.charAt(0) == 'o')
                s += str.substring(0, 1);
            if (str.charAt(1) == 'z')
                s += str.substring(1, 2);

            return s;
        } else if (str.length() == 1 && str.charAt(0) == 'o') {
            return "o";
        } else {
            return s;
        }
    }

    // https://codingbat.com/prob/p101887
    public int intMax(int a, int b, int c) {
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else
            return c;
    }

    // https://codingbat.com/prob/p172021
    public int close10(int a, int b) {
        int absA = Math.abs(a - 10);
        int absB = Math.abs(b - 10);

        if(absA < absB)
            return a;
        else if(absB < absA)
            return b;
        else
            return 0;
    }

    // https://codingbat.com/prob/p132134
    public boolean in3050(int a, int b) {
        if((a >= 30 && a <= 40) && (b >= 30 && b <= 40))
            return true;

        return (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
    }

    // https://codingbat.com/prob/p177372
    public int max1020(int a, int b) {
        if (((a >= 10) & (a <= 20)) & !((b >= 10) & (b <= 20)))
            return a;
        else if (!((a >= 10) & (a <= 20)) & ((b >= 10) & (b <= 20)))
            return b;
        else if (((a >= 10) & (a <= 20)) & ((b >= 10) & (b <= 20))) {
            if (a > b) return a;
            else return b;
        } else return 0;
    }

    // https://codingbat.com/prob/p173784
    public boolean stringE(String str) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                cnt += 1;
        }

        return (cnt > 0 & cnt < 4);
    }

    // https://codingbat.com/prob/p125339
    public boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }

    // https://codingbat.com/prob/p125268
    public String endUp(String str) {
        if (str.length() > 3) {
            return (str.substring(0, str.length() - 3) +
                    (str.substring((str.length() - 3))).toUpperCase());
        } else {
            return str.toUpperCase();
        }
    }

    // https://codingbat.com/prob/p196441
    public String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length();) {
            s += str.charAt(i);
            i += n;
        }
        return s;
    }
}
