package handson3;

public class Soal2ForEach {
    public static void main(String[] args) {
        //Membuat array angka dari 1 hingga 20
        int[] angka = new int[20];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1;
        }

        // Menggunakan for-each loop untuk mencetak angka
        for (int num : angka) {
            // berhenti jika angka melebihi 15
            if (num > 15) {
                break;
            }
            //lewati angka yang habis dibagi 3
            if (num % 3 == 0) {
                continue;
            }
            //cetak angka
            System.out.println(num + "");
        }
    }
}
