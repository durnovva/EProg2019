import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {
        System.out.print("n = ");
        int n = new Scanner(System.in).nextInt();
        
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++)
            array[i][i] = 1;
        
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(array[i]));
    }
}
