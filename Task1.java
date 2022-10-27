/**
 * Main
 */
public class Task1 { 

    private static int division(int x, int y){
        return x/y;
    }

    public static int casting(Object x){
        return (Integer)(x);
    }

    public static int length(int[] arr){
        return arr.length;
    }

    public static void main(String[] args) {
        System.out.println(division(10, 0));
        System.out.println(casting("45dfv"));
        System.out.println(length(null));
    }
}