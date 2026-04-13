public class StatementContinue {
    public static void main(String[] args) {
        int a = 4;

        for (int x = 0; x < a; x++) {
            if (x == 2) {
                continue; // Tidak menampilkan dalam kondisi tetapi maanjutkan ke berikutnya.
            }
            System.out.println(x);
        }
    }

}
