
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ogrenci extends KayıtBilgi {

    private String no;

    private String bolumu;

    private String kayitYili;

    private Double agno;

    public ogrenci() {
        super();
    }


    public void setBilgi(ogrenci a) {
        Scanner al = new Scanner(System.in);

        System.out.println("İsim               :");
        a.ad = al.nextLine();
        System.out.println("Soyisim            :");
        a.soyad = al.nextLine();
        System.out.println("Öğrenci Numarası   :");
        a.no = al.nextLine();
        System.out.println("Telefon Numarası   :");
        a.telefonNo = al.nextLine();
        System.out.println("Okuduğu Bölüm      :");
        a.bolumu = al.nextLine();
        System.out.println("İkametgah          :");
        a.adres = al.nextLine();
        System.out.println("Mail Adresi        :");
        a.mail = al.nextLine();
        System.out.println("Tc Kimlik Numarası :");
        a.tcNo = al.nextLine();
        System.out.println("Agno               :");
        a.agno = al.nextDouble();
        System.out.println("Kayit olduğu yıl   :");
        a.kayitYili = al.nextLine();
    }

    public void getBilgi(ogrenci a) {
        System.out.println("İsim               :" + a.ad);
        System.out.println("Soyisim            :" + a.soyad);
        System.out.println("Öğrenci Numarası   :" + a.no);
        System.out.println("Telefon Numarası   :" + a.telefonNo);
        System.out.println("Okuduğu Bölüm      :" + a.bolumu);
        System.out.println("İkametgah          :" + a.adres);
        System.out.println("Mail Adresi        :" + a.mail);
        System.out.println("Tc Kimlik Numarası :" + a.tcNo);
        System.out.println("Agno               :" + a.agno);
        System.out.println("Kayit olduğu yıl   :" + a.kayitYili);

    }

    public void printBilgi(ogrenci a) throws FileNotFoundException {
        File file = new File("liste.txt");
        PrintWriter yazdir = new PrintWriter(file);
        yazdir.println("İsim               :" + a.ad);
        yazdir.println("Soyisim            :" + a.soyad);
        yazdir.println("Öğrenci Numarası   :" + a.no);
        yazdir.println("Telefon Numarası   :" + a.telefonNo);
        yazdir.println("Okuduğu Bölüm      :" + a.bolumu);
        yazdir.println("İkametgah          :" + a.adres);
        yazdir.println("Mail Adresi        :" + a.mail);
        yazdir.println("Tc Kimlik Numarası :" + a.tcNo);
        yazdir.println("Agno               :" + a.agno);
        yazdir.println("Kayit olduğu yıl   :" + a.kayitYili);
        yazdir.close();
    }
}
