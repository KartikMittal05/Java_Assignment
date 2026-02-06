import java.util.*;

public class FlipMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        char ch = sc.next().charAt(0);

        if (ch == 'H') {
            for (int i = r - 1; i >= 0; i--) {
                for (int j = 0; j < c; j++)
                    System.out.print(mat[i][j] + " ");
                System.out.println();
            }
        } else if (ch == 'V') {
            for (int i = 0; i < r; i++) {
                for (int j = c - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
                System.out.println();
            }
        }
    }
}
