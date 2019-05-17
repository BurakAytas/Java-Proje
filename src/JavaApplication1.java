
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Burak AYTAS
 */
public class JavaApplication1 {

    public static void main(String[] args) throws FileNotFoundException {

        BilgiSistemi bilsis = new BilgiSistemi();

        while (true) {//Menü kısmı kullanıcıdan yapmak istediği işlemi alıyor.
            System.out.println("---------Menü---------");
            System.out.println("1 : Kayıt Yap");
            System.out.println("2 : Kayıtları Listele");
            System.out.println("3 : Dosyaya Kayıt Yap");
            System.out.println("4 : Çıkış");
            System.out.println("----------------------");
            Scanner al = new Scanner(System.in);
            int secim = al.nextInt();
            switch (secim) {
                case 1:
                    bilsis.setPozisyon(bilsis);
                    continue;
                case 2:

                    if (bilsis.pozisyon1 == bilsis.pozisyon[0]) {
                        bilsis.a.getBilgi(bilsis.a);
                    } else if (bilsis.pozisyon1 == bilsis.pozisyon[1]) {
                        bilsis.o.getBilgi(bilsis.o);
                    } else if (bilsis.pozisyon1 == bilsis.pozisyon[2]) {
                        bilsis.p.getBilgi(bilsis.p);
                    }

                    continue;
                case 3:
                    if (bilsis.pozisyon1 == bilsis.pozisyon[0]) {
                        bilsis.a.printBilgi(bilsis.a);
                    } else if (bilsis.pozisyon1 == bilsis.pozisyon[1]) {
                        bilsis.o.printBilgi(bilsis.o);
                    } else if (bilsis.pozisyon1 == bilsis.pozisyon[2]) {
                        bilsis.p.printBilgi(bilsis.p);
                    }
                    continue;
                case 4:
                    System.out.println("İyi Günler.");
                    break;
            }
            break;
        }

    }
}
