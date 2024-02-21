import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenin tanımlanması
        int tarih, mod, select, durum = 0;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıya istediği kadar sorgulama yapılmasına imkan sağlanması için while yapısı kullanılmıştır.
        while (durum == 0) {

            //Kullanıcıdan tercih bilgisi alınması
            System.out.println("1-Bul\n2-Kapat");
            select = input.nextInt();

            if (select == 1) {
                //Kullanıcıdan tarih bilgisinin alınması
                System.out.print("Doğum Yılını Giriniz : ");
                tarih = input.nextInt();

                mod = tarih % 12;

                //Switch-case yapısı ile çin zodyağının belirlenmesi
                switch (mod) {
                    case 0:
                        System.out.println("Maymun");
                        break;
                    case 1:
                        System.out.println("Horoz");
                        break;
                    case 2:
                        System.out.println("Köpek");
                        break;
                    case 3:
                        System.out.println("Domuz");
                        break;
                    case 4:
                        System.out.println("Fare");
                        break;
                    case 5:
                        System.out.println("Öküz");
                        break;
                    case 6:
                        System.out.println("Kaplan");
                        break;
                    case 7:
                        System.out.println("Tavşan");
                        break;
                    case 8:
                        System.out.println("Ejderha");
                        break;
                    case 9:
                        System.out.println("Yılan");
                        break;
                    case 10:
                        System.out.println("At");
                        break;
                    case 11:
                        System.out.println("Koyun");
                        break;
                    default:
                        System.out.println("Hatalı bir değer girildi.");
                        break;
                }
            }else{
                durum = 1;
            }
        }

    }
}