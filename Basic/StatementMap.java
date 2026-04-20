import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javafx.beans.binding.IntegerExpression;

public class StatementMap {

    public static void main(String[] args) {
        Map<String, String> inUmur = new HashMap<>();

        inUmur.put("Syarif", "19");
        inUmur.put("Budi", "20");
        inUmur.put("Andi", "26");

        // Lopping mengunakan 'FOR' getKey n getValue:
        for (Map.Entry<String, String> entry : inUmur.entrySet()) {
            if (Integer.parseInt(entry.getValue()) > 20) {
                System.out.println("Usia Ini Cukup matang");

            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Looping menggunakan 'For' hanya getValue
        for (String value : inUmur.values()) {
            System.out.println("Data :: " + value);
        }

        // forEach java 1.8
        inUmur.forEach((key, value) -> {
            if (Integer.parseInt(value) < 21) {
                System.out.println("Masih Muda harus banyak belajar");
            }
            System.out.println("Data dengan FOREACH :: " + key + " " + value);
        });

        // Pengunaan 'ITERATOR' [Kalau mau hapus data saat loopin]
        Iterator<Map.Entry<String, String>> data = inUmur.entrySet().iterator();
        while ((data.hasNext())) {
            Map.Entry<String, String> setEntry = data.next();
            if (Integer.parseInt(setEntry.getValue()) < 20) {
                data.remove(); // Sangat Aman
            }
        }
        System.out.print("Hasil Setelah Remove " + inUmur);

    }

}
