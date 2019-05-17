
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class personel extends KayıtBilgi {

    private String alanı;
    private int maas;

    public personel() {
        super();
    }

    public void setBilgi(personel a) {
        Scanner al = new Scanner(System.in);

        System.out.println("İsim               :");
        a.ad = al.nextLine();
        System.out.println("Soyisim            :");
        a.soyad = al.nextLine();
        System.out.println("Telefon Numarası   :");
        a.telefonNo = al.nextLine();
        System.out.println("İkametgah          :");
        a.adres = al.nextLine();
        System.out.println("Mail Adresi        :");
        a.mail = al.nextLine();
        System.out.println("Tc Kimlik Numarası :");
        a.tcNo = al.nextLine();
        System.out.println("Çalıştığı Alan     :");
        a.alanı = al.nextLine();
        System.out.println("Aldığı maaş        :");
        a.maas = al.nextInt();
    }

    public void getBilgi(personel a) {
        System.out.println("İsim               :" + a.ad);
        System.out.println("Soyisim            :" + a.soyad);
        System.out.println("Telefon Numarası   :" + a.telefonNo);
        System.out.println("İkametgah          :" + a.adres);
        System.out.println("Mail Adresi        :" + a.mail);
        System.out.println("Tc Kimlik Numarası :" + a.tcNo);
        System.out.println("Çalıştığı Alan     :" + a.alanı);
        System.out.println("Aldığı maaş        :" + a.maas);
    }

    public void printBilgi(personel a) throws FileNotFoundException {
        File file = new File("liste.txt");
        PrintWriter yazdir = new PrintWriter(file);
        yazdir.println("İsim               :" + a.ad);
        yazdir.println("Soyisim            :" + a.soyad);
        yazdir.println("Telefon Numarası   :" + a.telefonNo);
        yazdir.println("İkametgah          :" + a.adres);
        yazdir.println("Mail Adresi        :" + a.mail);
        yazdir.println("Tc Kimlik Numarası :" + a.tcNo);
        yazdir.println("Çalıştığı Alan     :" + a.alanı);
        yazdir.println("Aldığı maaş        :" + a.maas);
        yazdir.close();
    }

}
