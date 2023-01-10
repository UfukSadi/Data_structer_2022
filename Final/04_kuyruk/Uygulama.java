

public class Uygulama {
    public static void main(String[] args) {

        
        kuyruk yeni_kuyruk = new kuyruk(5);// yeni_kuyruk adıda yeni bir kuyruk yapısı oluşturduk ve girilebilecek eleman sayısını 5 olarak ayarladık

        //kuyruk yapısına 4 adet değer ekledik
        yeni_kuyruk.ekle(10);
        yeni_kuyruk.ekle(20);
        yeni_kuyruk.ekle(30);
        yeni_kuyruk.ekle(40);
      
        yeni_kuyruk.yazdir();

        yeni_kuyruk.silme();
      
        yeni_kuyruk.yazdir();
        
        


    


      
         
        


        
       

    }
}