public class Node {
    int data; // bir değişken atadık
    Node left; // sol için bir değişken atadık
    Node right; // sağ için bir değişken atadık

    public Node (int data)// kullanıcıdan data değişkeni olarak bir int sayı alması için fonksiyon oluşturduk
    {
        this.data = data;
        left = null;
        right = null;

    }
}