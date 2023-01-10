import java.util.Iterator;
import java.util.Scanner;

public class Uygulama 
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);// kullanıcıdan veri almak için scanner fonksiyonunu kullanıyoruz.
        
       int n;
       System.out.print("Kaç Adet Sayı Girmek İstiyorsunuz:"); n= scanner.nextInt();
       int dizi [] = new int[n];

    for (int i=0; i<n; i++)
    {
        System.out.print("Sayı: ");
        dizi[i] = scanner.nextInt();
    }
    


    bubbleSort (dizi, n);

    System.out.println("booblesort ile sıralama işlemi yapıldı");

    for (int i=0; i<n; i++)
    {
        System.out.print (dizi[i]+"-");

    }


}

private static void bubbleSort(int[] dizi, int n) 
 {
    for (int i=0; i<n-1; i++)
    {
        for( int j=0; j<n-i-1; j++)
        {
            if(dizi[j] > dizi[j+1])
            {
                int gecici =dizi[i];
                dizi[j]= dizi[j+1];
                dizi[j+1] = gecici;
            }
        }
    }
    
 }

}
