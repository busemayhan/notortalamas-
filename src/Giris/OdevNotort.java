package Giris;
import java.util.Scanner;
public class OdevNotort {
    public static void main(String[] args) {
        //değişkenleri atayalım
        int mat , fizik , kimya , muzik , turkce , tarih ;
        Scanner input= new Scanner(System.in);
        System.out.print("mat notunu gir:");
        mat=input.nextInt();

        System.out.print("fizik notunu gir:");
        fizik=input.nextInt();

        System.out.print("kimya notunu gir:");
        kimya=input.nextInt();

        System.out.print("muzik notunu gir:");
        muzik=input.nextInt();

        System.out.print("turkce notunu gir:");
        turkce=input.nextInt();

        System.out.print("tarih notunu gir:");
        tarih=input.nextInt();

        double ort;
        ort= (mat+fizik+kimya+muzik+turkce+tarih) / 6.0 ;

        System.out.println("ortalaman : "+ort );

        boolean kosul = ort<60;

        String str= kosul? "Sınıfta Kaldı":"Sınıfı Gecti";
        System.out.println(str );



    }
}
