import java.util.Random;

public class Task3 {

    private static int[] diff(int[]a, int[] b){
        if (a == null || b == null || a.length != b.length){
            return null;
        } 
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] - b[i];
        }
        return result;
    }
    

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Random().nextInt(100)+1;
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Random().nextInt(100)+1;
        }

        if (diff(array1, array2) != null){
            System.out.println("успешно");
        }
        else{
            System.out.println("массивы разной размерности");
        }
    }
}
