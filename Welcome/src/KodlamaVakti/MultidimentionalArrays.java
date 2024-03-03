package KodlamaVakti;

public class MultidimentionalArrays {

    public static void main(String[] args) {
        int[][] tablo = new int[][] {

                { 1, 5, 3 },
                { 23, 25, 2 },
                { 2, 2, 2 },
                { 45, 5, 23 },
                { 25, 23, 3 }
        };

        int[][] tablo2 = new int[5][3];
        tablo2[0][0] = 1;
        tablo2[0][1] = 12;
        tablo2[0][2] = 21;

        for (int i = 0; i < tablo2[i].length; i++) {
            for (int j = 0; j < tablo2[j].length; j++) {
                System.out.println(tablo2[i][j]);
            }
            System.out.println("\n");
        }

        for (int[] sutun : tablo) {
            for (int value : sutun) {
                System.out.print(value + " ");
            }
            System.out.println("\n");
        }

    }

}
