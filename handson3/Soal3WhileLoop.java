package handson3;

public class Soal3WhileLoop {
    public static void main(String[] args) {
        // inisialisasi variabel counter
        int counter = 1;

        //loop dengan while
        while (counter<=20){
            //berhenti jika angka lebih dari 15
            if ( counter > 15 ){
                break;
            }
            //lewati angka yang habis dibagi 3
            if ( counter % 3 !=0 ){
                //cetak angka
                System.out.println(counter + " ");
            }
            //increment counter
            counter++;
        }
    }
}
