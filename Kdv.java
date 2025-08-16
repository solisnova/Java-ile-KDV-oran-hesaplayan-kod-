import java.util.Scanner;


/*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */

public class Kdv {
    public static void main(String[] args) {
    Scanner mesaj = new Scanner(System.in);
    System.out.println("Lütfen satın aldığınız ürünün fiyatını giriniz :");
    double fiyat = mesaj.nextDouble();
    mesaj.close();


    double sonuc = (fiyat < 1000 && fiyat > 0) ? ((fiyat*18)/100) : ((fiyat*8)/100);
    System.out.println("satın aldığınız ürünün fiyatı : " + fiyat);
    System.out.println("KDV tutarınız :" + sonuc);
    System.out.println("Ürünün KDV eklenmiş fiyatı: " + (fiyat+sonuc));


    






   

  }
}
