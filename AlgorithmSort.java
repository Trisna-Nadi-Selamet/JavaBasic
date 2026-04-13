import java.util.ArrayList;
import java.util.List;

public class AlgorithmSort {

    public static void main(String[] args) {

        // This Algorithm Sort
        int a[] = { 2, 5, 3, 9, 0, 1, 7, 6, 8 };
        List<String> data = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int j = i;

            while ((j > 0) && (min < a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = min;
        }

        // Cetak Hasil dan masukan kedalam ArrayList
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x] + ",");
            // The data add to ArrayList
            data.add(String.valueOf(a[x]));
        }
        System.out.println();
        System.out.print("The data add to ArrayList ::" + data);
    }
}
