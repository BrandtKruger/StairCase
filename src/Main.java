import java.util.ArrayList;
import java.util.List;

public class Main {

    static void staircase(int n) {

        if (n < 1 || n > 100)
            return;

        int x = n - 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j < x) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }

            System.out.println();
            x = x - 1;
        }
    }

    public static void main(String[] args) {
        staircase(3);
    }
}
