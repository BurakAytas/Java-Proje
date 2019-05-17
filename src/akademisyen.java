
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class akademisyen extends KayıtBilgi {

    private String unvani;

    private String bolumu;

    public akademisyen() {

    }

    public void setBilgi(akademisyen a) {
        Scanner al = new Scanner(System.in);

        System.out.println("İsim               :");
        a.ad = al.nextLine();
        System.out.println("Soyisim            :");
        a.soyad = al.nextLine();
        System.out.println("Ünvanı             :");
        a.unvani = al.nextLine();
        System.out.println("Bölümü             :");
        a.bolumu = al.nextLine();
        System.out.println("Telefon Numarası   :");
        a.telefonNo = al.nextLine();
        System.out.println("İkametgah          :");
        a.adres = al.nextLine();
        System.out.println("Mail Adresi        :");
        a.mail = al.nextLine();
        System.out.println("Tc Kimlik Numarası :");
        a.tcNo = al.nextLine();
    }

    public void getBilgi(akademisyen a) {
        System.out.println("İsim               :" + a.ad);
        System.out.println("Soyisim            :" + a.soyad);
        System.out.println("Ünvanı             :" + a.unvani);
        System.out.println("Bölümü             :" + a.bolumu);
        System.out.println("Telefon Numarası   :" + a.telefonNo);
        System.out.println("İkametgah          :" + a.adres);
        System.out.println("Mail Adresi        :" + a.mail);
        System.out.println("Tc Kimlik Numarası :" + a.tcNo);
    }

    public void printBilgi(akademisyen a) throws FileNotFoundException {
        File file = new File("liste.txt");
        PrintWriter yazdir = new PrintWriter(file);
        yazdir.println("İsim               :" + a.ad);
        yazdir.println("Soyisim            :" + a.soyad);
        yazdir.println("Ünvanı             :" + a.unvani);
        yazdir.println("Bölümü             :" + a.bolumu);
        yazdir.println("Telefon Numarası   :" + a.telefonNo);
        yazdir.println("İkametgah          :" + a.adres);
        yazdir.println("Mail Adresi        :" + a.mail);
        yazdir.println("Tc Kimlik Numarası :" + a.tcNo);

        yazdir.close();
    }

}
