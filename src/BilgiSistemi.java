
import java.util.Scanner;

public class BilgiSistemi {
    /*Normal de KayıtBilgi classı yoktu ondaki kısımlar da BilgiSistemde bu 
    kısımdaydı ancak akademisyen a = new akademisyen() kısmına gelince kalıtım 
    yapan akedemisyen klasına gidince döngüye giriyor ve hata 
    veriyordu (StackOverflowError) bu yüzden böyle yapmak zorunda kaldım .
    */

    String[] pozisyon = new String[]{"Akademisyen", "Öğrenci", "Personel"};
    protected String pozisyon1;
    akademisyen a = new akademisyen();
    ogrenci o = new ogrenci();
    personel p = new personel();

    public BilgiSistemi() {

    }

    public void setPozisyon(BilgiSistemi x) {//Kayıt yapılcakak kişi 
        //akademisyen mi personel mi öğrenci mi tercihi yapılıyor.
        Scanner al1 = new Scanner(System.in);
        int tercih;
        System.out.println("Pozisyon Seçin ;");
        System.out.println("1 = Akademisyen ");
        System.out.println("2 = Öğrenci     ");
        System.out.println("3 = Personel    ");
        tercih = al1.nextInt();
        switch (tercih) {//Terih e göre setBilgi kısımlarına gidiyor.
            case 1:
                x.pozisyon1 = pozisyon[0];
                a.setBilgi(a);
                break;
            case 2:
                x.pozisyon1 = pozisyon[1];
                o.setBilgi(o);
                break;
            case 3:
                x.pozisyon1 = pozisyon[2];
                p.setBilgi(p);
                break;

        }
    }
}
