package week2.multiplication_tables_bonus;

public class MultiplicationTables {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%-4d", table[i][j]);
            }
            System.out.println();
        }
    }
}
