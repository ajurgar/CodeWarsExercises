//Grade book
//        Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.
//
//        Numerical Score	Letter Grade
//        90 <= score <= 100	'A'
//        80 <= score < 90	'B'
//        70 <= score < 80	'C'
//        60 <= score < 70	'D'
//        0 <= score < 60	'F'
//        Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.
//
//        FUNDAMENTALS
//        Suggest kata description edits

public class GradeBook {
    java.time.Instant instant ;
    public static char getGrade(int s1, int s2, int s3) {
        s1=(s1+s2+s3)/3;
        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }
}