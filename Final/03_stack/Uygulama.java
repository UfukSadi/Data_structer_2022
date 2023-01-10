public class Uygulama {
    public static void main(String[] args) {

        
        stack yigin = new stack(5);// yigin adıda yeni bir stack yapısı oluşturduk ve girilebilecek eleman sayısını 5 olarak ayarladık

        //stack yapısına 4 adet değer ekledik
        yigin.push(10);
        yigin.push(20);
        yigin.push(30);
        yigin.push(40);
        yigin.push(50);
        yigin.push(60);


        System.out.println("çıkan: "+yigin.pop());// son giren eleman çıkarmak için pop fonksiyonununu kullandık


      
         
        


        
       

    }
}