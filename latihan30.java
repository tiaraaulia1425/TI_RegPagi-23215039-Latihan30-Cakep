package pertemuan5new;

/**
 * Nama : Tiara Aulia Maharani
 * NIM  : 23215039
 * TEKNIK INFORMATIKA
 */

 import java.util.Scanner;

public class latihan30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
        String jawab = scanner.nextLine();
        
        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println("Cakep Bener. Good Job");
        } else if (jawab.equalsIgnoreCase("Enggak")) {
            System.out.println("Tetep cakep sih.");
            System.out.println("Sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
        } else {
            System.out.println("Jawaban tidak valid. Harus Yoi atau Enggak.");
        }

        scanner.close();
    }
}


    

