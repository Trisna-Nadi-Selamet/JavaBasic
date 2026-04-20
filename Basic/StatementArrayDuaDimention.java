public class StatementArrayDuaDimention {

    public static void main(String[] args) {

        int[][] arry = new int[3][3];
        int continues = 1;

        System.out.println("Cara Ke Pertama :: ");

        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {

                // tanpa menambahkan data
                System.out.println(i + " | " + j);
            }
            System.out.println("");

        }

        System.out.println("Cara Ke Dua :: ");

        for (int x = 0; x < arry.length; x++) {
            for (int y = 0; y < arry[x].length; y++) {

                // menambahkan data dari array
                arry[x][y] = continues++;
                System.out.println(x + " | " + y);
            }

            System.out.println("");
        }

    }
}
