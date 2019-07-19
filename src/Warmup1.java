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

}
