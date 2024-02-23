import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int k, toplam=0,bölünen=0,sonuc;
        Scanner input = new Scanner(System.in);
        //Kullanıcı Girişi
        System.out.println("Sayı Giriniz: ");
        k = input.nextInt();
        //Döngü ve koşul ile yapılan girişin işlenişi
        for (int i=0; i<=k;i++){
            if (i % 3 ==0 && i % 4 ==00){
                toplam +=i;
                bölünen++;
            }

        }
        //Sonuç kısmı
        sonuc=toplam/bölünen;
        System.out.println("3'e ve 4'e Bölünen Sayıların Ortalaması:" +sonuc);
    }
}