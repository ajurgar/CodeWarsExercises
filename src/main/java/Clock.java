import java.time.Duration;
import java.util.concurrent.TimeUnit;

//Clock shows h hours, m minutes and s seconds after midnight.
//
//        Your task is to write a function which returns the time since midnight in milliseconds.
//
//        Example:
//        h = 0
//        m = 1
//        s = 1
//
//        result = 61000
//        Input constraints:
//
//        0 <= h <= 23
//        0 <= m <= 59
//        0 <= s <= 59
//
//My Solution:
public class Clock
{
    public static int Past(int h, int m, int s)  {

        double hToMil = TimeUnit.HOURS.toMillis(h);
        double mToMil = TimeUnit.MINUTES.toMillis(m);
        double sToMil = TimeUnit.SECONDS.toMillis(s);

        int hours = (int) hToMil;
        int minutes = (int) mToMil;
        int seconds = (int) sToMil;

        int resultInMilliseconds = hours + minutes + seconds;

        if(hours <= 23 && hours >= 0 && minutes >= 0 && minutes <= 59 && seconds >= 0 &&  minutes <= 59){
        }
        return resultInMilliseconds;
    }

    //Best solution
//    public class Clock
//    {
//        public static int Past(int h, int m, int s)
//        {
//            return h * 3600000 + m * 60000 + s * 1000;
//        }
//    }

    //Another Solution using Methods

//    import java.time.Duration;
//
//    public class Clock {
//        public static int Past(int h, int m, int s) {
//            return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
//        }
//    }
}
