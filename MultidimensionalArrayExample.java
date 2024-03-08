public class MultidimensionalArrayExample {

    public static void main(String[] args) {

        int grades[][] = {
                {80, 90, 75, 85, 76},
                {67, 87, 94, 83, 85},
                {67, 79, 92, 95, 93}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(grades[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
