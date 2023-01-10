import java.util.Arrays;
public class Uygulama 
{
public static void main(String[] args)
{
		
    int dizi[] = {10,5,1,22,13};
    System.out.println("Sıralama Olmadan önce Dizideki Eleman Sıralaması:" + Arrays.toString(dizi));
    System.out.print("Sıralama Sonrası:");
    iSort(dizi);
    
    for(int i : dizi) 
    {
        System.out.print(i + "-");
    }
}

private static void iSort(int[] dizi) // sıralama için fonksiyonumuzu oluşturduk
{
    
    for(int i = 1; i < dizi.length; i++) // dizimizin uzunluğu kadar döngümüzü oluşturduk
        {
            int temp = dizi[i];
            int j = i - 1;
        
            while(j >= 0 && dizi[j] > temp) 
            {
               dizi[j + 1] = dizi[j];
               j--;
            }
            dizi[j + 1] = temp;
        }
}
}