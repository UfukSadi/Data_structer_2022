public class Liste {

    Node head = null;
    Node tail = null;

   public void basaEkle(int x)
    {
        
        Node eleman = new Node ();
        eleman.data = x; 
        eleman.next = null;


        if (head == null)
        {
            head = eleman;
            tail = eleman;
        }
        else
        {
            eleman.next= head;
            head.prev = null;
            head = eleman;

        }
    } 
    
   public void sonaEkle(int y)
    {
        
        Node eleman = new Node ();
        eleman.data = y; 
        eleman.next = null;

        if (head == null)
        {
            head = eleman;
            tail = eleman;
        }
        else
        {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;

        }
    }
    void bastanSil()
    {
        if(head == null) 
        {
            System.out.println("Liste Boş Silinecek Eleman Yok");
        }
        else if(head.next == null) // eğer listede tek eleman var ise head ve tail null yaptık ve listeyi boşalttık
        {
            head=null;
            tail=null;
            System.out.println("Listedeki Son Eleman Silindi Şuan Liste Boş");
        }
        else 
        {
            head = head.next; // baştaki elemanı ondan sonra gelen eleman olarak seçtiğimizde baştaki eleman otomatik silinir
            System.out.println("Baştaki Eleman Silindi");
        }
    }
    void sondanSil()
    {
        if(head == null) 
        {
            System.out.println("Liste Boş Silinecek Eleman Yok");
        }
        else if(head.next == null) // eğer listede tek eleman var ise head ve tail null yaptık ve listeyi boşalttık
        {
            head=null;
            tail=null;
            System.out.println("Listedeki Son Eleman Silindi Şuan Liste Boş");
        }
        else // 2 tane geçici değişken tanımladık ve bunları değeri head eşitledik 
        {
           Node temp = head;
           Node temp2 = head;
           while (temp.next != null) // eğer temp next boş oluncaya kadar döngüyü tekrarla
           {
              temp2 = temp; // döngü sonucunda temp2 sondan bir önceki düğümü tutuyor
              temp = temp.next; // temp ise son düğümü tutuyor
           }
           temp2.next = null; // sondaki elemanı siliyor 
           tail = temp2; // sondaki eleman temp2 oluyor böylece sondan silme gerçekleşiyor.

      System.out.println("Sondaki Eleman Silindi");
        }
    
    }   
    public void yazdir()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
       
    }




    

}