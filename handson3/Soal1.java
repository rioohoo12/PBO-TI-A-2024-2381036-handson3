package handson3;

public class Soal1 {
    public static void main(String[] args) {
        // loop dari 1 hingga 20
        for (int i = 1 ; i <= 20; i++ ) {
            //berhenti jika angka melebihi 15
            if (i > 15) {
                break;
            }
            //cek jika angka tidak habis dibagi 3
            if (i % 3 != 0){
                //cetak angka
                System.out.println(i + " ");
            }
        }
    }
}
