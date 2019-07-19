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

}
