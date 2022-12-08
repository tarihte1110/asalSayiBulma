import java.util.Scanner;
public class asalSayiBulma {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        int sayi= input.nextInt();

        if(sayi==0){
            System.out.print("SONUÇ: "+sayi+" asal sayı değildir.");
        }
        else if(sayi==1){
            System.out.print("SONUÇ: "+sayi+" asal sayı değildir.");
        }
        else if(sayi==2){
            System.out.print("SONUÇ: "+sayi+" asal sayıdır.");
        }
        else if(sayi<0){
            System.out.print("Hatalı giriş yaptınız:^Negatif sayılar asal olamaz.^");
        }
        else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    System.out.print("SONUÇ: " + sayi + " asal sayı değildir.");
                    System.exit(1110);
                }
                else {

                }
             }
            System.out.print("SONUÇ: " + sayi + " asal sayıdır.");
        }
    }
}
