public class kuyruk {
    int dizi[]; // boş bir kuyruk dizisi oluşturduk
    int size; // dizinin boyutunu kullanıcıdan almak için size adında değişken tanımladık
    int front; // dizinin baştaki elemanını tutan bir değişken tanımladık
    int rear;  // dizinin sondaki elemanını tutan bir değişken tanımladık
    int sayi; // kuyruğa ekleyeceğimiz sayi değişkeni tanımladık

    public kuyruk(int size) // kullanıcıdan dizinin boyutunu almak için fonksiyon oluşturduk
    {
        this.size=size;
        dizi=new int[size]; // yeni oluşacak dizinin boyutu size kaç girilirse o olacak
        front = 0; // ilk eleman 
        rear = -1; // son eleman

    }
   
    void ekle(int data) // kuyruk yapısına eleman ekleme fonksiyon oluşturduk
    {
        rear ++; // kuyruğa sondan eleman eklendiği için sondaki elemanı 1 arttıkdık
        dizi[rear] = data; 
        System.out.println(dizi[rear]+" sayısı kuyruğa eklendi");
    }

    void silme() // kuyruk yapısından en son giren değeri çıkarma fonksiyonu oluşturduk
    {
        sayi = dizi [front]; // sayi değişkenine dizinin ilk elemanını atadık
        for(int i=1; i<=rear; i++) // for döngüsü ile ilk elemanı çıkarınca sırasıyla en arkadan en öne doğru elemanları bir öne kaydırdık
        {
            dizi[i-1] = dizi[i];
        }
        rear --;// son eleman sayısını 1 azalttık
        System.out.println(sayi +" sayısı kuyruktan çıkartıldı");
    }
    void yazdir() 
    {   
        System.out.print("Kuyruğun Son Durumu:");
        for(int i=0; i<=rear; i++) 
        {
           System.out.print(dizi[i]+"<--");
        } 
        System.out.println("");


    }

}