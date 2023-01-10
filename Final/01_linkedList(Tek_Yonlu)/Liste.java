

public class Liste //Liste adında bir sınıf oluşturduk
{

    Node head = null; // head ve tail başlangıçta boş olarak tanımladık
    Node tail = null;

    void ekle (int x)// ekle fonksiyonu ile listemize eleman eklemesini sağladık
    {
        
        Node eleman = new Node (); // eleman adında yeni bir node oluşturduk
        eleman.data = x; 
        eleman.next = null;

        if (head == null) // eleman eklendikten sonra eğer listede hiç bir değer yoksa head ve tail elemana eşitledik
        {
            head = eleman;
            tail = eleman;
        }
        else // eğer eleman var ise listenin sonuna eklemek için tail next eleman eşitledik artık son eklenen eleman tail oldu
        {
            tail.next = eleman;
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
    void yazdir()// yazdir fonksiyonu ile de eklenen sayıları ekrana yazdırmasını sağladık
    {

        if (head == null)
        {
            System.out.println("Liste Boş");
        }
        else
        {
            Node temp = head; // temp adında geçici bir değişken ile önce head değerini aldık ve headten sonra değer var ise listeyi tek tek dolaşıp yazdırır
            while (temp != null)
            {
                System.out.println(temp.data);
                temp= temp.next;
            }

        }
    }

}