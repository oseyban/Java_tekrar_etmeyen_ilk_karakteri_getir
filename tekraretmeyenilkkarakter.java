package org.example;

public class Quiz {

    public static char bul(String str) {
        char a = '\0';
        for (char w :str.toCharArray()) {
            if (str.indexOf(w) == str.lastIndexOf(w)) {
                a = w;
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        String metin = "Java güzel J";
        char sonuc = bul(metin);

        if (sonuc != '\0') {
            System.out.println("İlk tekrar etmeyen karakter: " + sonuc);
        } else {
            System.out.println("Tekrar etmeyen karakter bulunamadı.");
        }
    }
}
