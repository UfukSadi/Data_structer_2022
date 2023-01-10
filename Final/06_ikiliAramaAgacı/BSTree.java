public class BSTree // ikili agaç yapımızı oluşturduk
{
    Node root;// root adındaki kökümüzü oluşturduk
    
    public void ikiliArama()
    {
        root=null;// kökümüz ilk başta boş olarak tanımladık
    }

    Node yeni_Node (int data) // yeni_node fonksiyonu ile root oluştursun ve yeni girilen değeri root a aktardık
    {
        root=new Node(data); 
        System.out.println(data +" sayisi agaca eklendi");
        return root;
    }
    Node ekle(Node root, int data)
    {
        if(root !=null)
        {
            if(data < root.data) // eğer girilen data root tan küçük ise root soluna ekleme yapacak
               root.left = ekle(root.left, data);
            else // eğer girilen değer root tan büyük ise root sağına ekleme yapacak
               root.right = ekle(root.right, data);
        }
        else
            root= yeni_Node(data); // eğer root boş ise ilk eleman root olarak ekleyecek
            return root;
    }
    void preOrder(Node root) // preorder fonksiyonu ile kökü başa yazıp sonra sol değerleri ve sonra sağ değerleri sırasıyla yazmasını sağladık
    {
        if( root != null)
        {
            System.out.print(root.data + "-");
            preOrder(root.left);
            preOrder(root.right);
        }
    }   
}   