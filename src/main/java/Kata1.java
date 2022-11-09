public class Kata1{

    public static int grow(int[] x){

        int total = 1;
        for(int a : x){
            total *=a;
        }
        return total;

    }

}