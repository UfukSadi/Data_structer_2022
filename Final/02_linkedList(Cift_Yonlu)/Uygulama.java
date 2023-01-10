public class Uygulama {
    public static void main(String[] args) {

        //nodel_list adında yeni bir liste yapısı oluşturduk
        Liste node_list = new Liste();

        //listemize 4 adet değer ekledik
        node_list.basaEkle(10);
        node_list.sonaEkle(20);
        node_list.basaEkle(30);
        node_list.sonaEkle(40);

        //eklediğimiz değerleri ekrana yazdırdık
        node_list.yazdir();
        
        System.out.println(" ");
        
        node_list.bastanSil();
        node_list.sondanSil();

        node_list.yazdir();

    
         
        


        
       

    }
}