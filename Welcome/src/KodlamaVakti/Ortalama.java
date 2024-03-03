package KodlamaVakti;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {

        int[] notlar = new int[7];
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hoşgeldiniz ! Lütfen notlarınızı sırayla giriniz.");
        System.out.print("Matematik 1: ");
        notlar[0] = scan.nextInt();
        System.out.print("Türkçe: ");
        notlar[1] = scan.nextInt();
        System.out.print("Fizik: ");
        notlar[2] = scan.nextInt();
        System.out.print("Tarih: ");
        notlar[3] = scan.nextInt();
        System.out.print("Kimya: ");
        notlar[4] = scan.nextInt();
        System.out.print("Beden: ");
        notlar[5] = scan.nextInt();
        System.out.print("Müzik: ");
        notlar[6] = scan.nextInt();

        for (int not : notlar) {
            toplam += not;
        }
        int ortalama = toplam / 7;
        System.out.println("Ortalama Notunuz: " + ortalama);

    }
}
