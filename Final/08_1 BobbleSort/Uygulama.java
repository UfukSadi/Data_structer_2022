import java.util.Scanner;
public class Uygulama 
{
    
    public static void main(String[] args) 
    {
       try (Scanner scanner = new Scanner(System.in)) {
        int n;
           System.out.print("Kaç Adet Sayı Girmek İstiyorsunuz:"); n = scanner.nextInt();
           int dizi [] = new int[n]; // klavyeden girilen sayı kadar eleman girmemize izin verir

        for (int i=0; i<n; i++)
        {
            System.out.print("Sayı: ");
            dizi[i] = scanner.nextInt(); // başta kaç sayı seçtiysek onun kadar sayı girmemiz için for döngüsü oluşturduk.
        }
        


        bubbleSort (dizi, n); 
        System.out.println("booblesort ile sıralama işlemi yapıldı");

        for (int i=0; i<n; i++) 
        {
            System.out.print (dizi[i]+"-");

        }
    }
    }




private static void bubbleSort(int[] dizi, int n) //sıralama fonksiyonumuzu oluşturduk
 
 {
    for (int i=0; i<n-1; i++) // iç içe 2 döngü oluşturduk yan yana olan iki dizi arasında karşılaştırma yapacaz.
    {
        for( int j=0; j<n-i-1; j++)
        {
            if(dizi[j] > dizi[j+1])
            {
                int temp =dizi[i];
                dizi[j]= dizi[j+1];
                dizi[j+1] = temp;
            }
        }
    }
    
 }

}
