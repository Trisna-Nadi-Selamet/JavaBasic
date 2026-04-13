import java.util.ArrayList;
import java.util.List;

public class AlgorithmSort {

    public static void main(String[] args) {

        // This Algorithm Selection Sort, Insert Sort & Buble Sort
        int a[] = { 2, 5, 3, 9, 0, 1, 7, 6, 8 };
        List<String> data = new ArrayList<>();

        System.out.println("Algorithm Selection Sort ::");
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int j = i;

            while ((j > 0) && (min < a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = min;
        }

        // // Cetak Hasil dan masukan kedalam ArrayList
        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x] + ",");
            // The data add to ArrayList
            data.add(String.valueOf(a[x]));
        }
        System.out.println();
        System.out.print("The data add to ArrayList ::" + data);

        System.out.println();
        System.out.print("Algorith Insert Sort :: ");

        int b = 0;
        while (b < a.length - 1) {
            int tmp = b;
            for (int c = b + 1; c < a.length; c++) {
                if (a[c] < a[tmp])
                    tmp = c;
            }
            int hlp = a[b];
            a[b] = a[tmp];
            a[tmp] = hlp;
            b++;
        }
        // Cetak Hasil dan masukan kedalam ArrayList
        for (int g = 0; g < a.length; g++) {
            System.out.println(a[g] + ",");
            data.add(String.valueOf(a[g]));
        }

        System.out.println();
        System.out.print("The data add to ArrayList ::" + data);

        System.out.println();
        System.out.print("Algorith Buble Sort :: ");

        for (int d = 1; d < a.length; d++) {
            for (int e = 0; e < a.length - 1; e++) {
                if (a[e + 1] < a[e]) {
                    int temp = a[e + 1];
                    a[e + 1] = a[e];
                    a[e] = temp;
                }

            }
        }
        // add and print
        for (int f = 0; f < a.length; f++) {
            System.out.println(a[f] + ",");
            data.add(String.valueOf(a[f]));
        }

        System.out.println();
        System.out.print("The data add to ArrayList ::" + data);

    }

}
