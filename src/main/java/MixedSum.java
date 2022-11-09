//Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.
//
//        Return your answer as a number.

import java.util.List;


//best solution
public class MixedSum {

    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }

}

//second best

//public class MixedSum {
//
//    public int sum(List<?> mixed) {
//
//        int x = 0;
//        for(Object s: mixed){
//            x+=Integer.parseInt(s.toString());
//        }
//
//        return x;
//    }
//}
