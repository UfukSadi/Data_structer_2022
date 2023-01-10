public class stack {
    int dizi[]; // boş bir stack dizisi oluşturduk
    int size; // dizinin boyutunu kullanıcıdan almak için size adında değişken tanımladık
    int indis; // dizinin indisini tutan bir değişken tanımladık

    public stack(int size) // kullanıcıdan dizinin boyutunu almak için fonksiyon oluşturduk
    {
        this.size=size;
        dizi=new int[size]; // yeni oluşacak dizinin boyutu size kaç girilirse o olacak
        indis = -1; // indis -1 dedik ilk girilen elemandan sonra 0 olarak yani ilk elemanın olduğu yeri tutacak

    }
   
    void push(int data) // stack yapısına eleman ekleme fonksiyon oluşturduk
    {
        if (dolumu())
        {
            System.out.println("Stack Yapısı Dolu");
        }
        else
        {
        indis ++; // indis 1 arttırdık 
        dizi[indis] = data; // girilen data değerini stack yapısına ekledik
        System.out.println("eklenen:"+dizi[indis]);
        }
    }

    int pop() // stack yapısından en son giren değeri çıkarma fonksiyonu oluşturduk
    {
        return dizi[indis--];// çıkan eleman sonrasında dizideki kalan eleman sayısını döndürdük
    }

    boolean dolumu() // stack yapısının dolu olup olmadığını kontrol etmek için fonksiyon oluşturkduk
    {
        return (indis == size -1);
    }

    boolean bosmu() // stack yapısının boş olup olmadığını kontrol etmek için fonksiyon oluşturkduk
    {
        return (indis == -1);
    }


}