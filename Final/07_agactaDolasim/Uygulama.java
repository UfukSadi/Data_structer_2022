public class Uygulama 
 {
    public static void main(String[] args) 
    {
        dolasim yeni_agac= new dolasim();// agaç yapısını oluşturduk
        
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root, 10); // agacımıza ilk değer 10 olarak ekledik
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root, 15); // agacımıza 2. değer olarak 15 eklendi
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root, 8); // agacımıza 3. değer olarak 8 eklendi
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root, 5);
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root,12);
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root, 20);
        yeni_agac.root=yeni_agac.ekle(yeni_agac.root, 9);
        
        System.out.print("Preorder:");
        yeni_agac.preOrder(yeni_agac.root); 

        System.out.println(" ");

        System.out.print("Inorder:");
        yeni_agac.inOrder(yeni_agac.root);

        System.out.println(" ");

        System.out.print("Postorder:");
        yeni_agac.postOrder(yeni_agac.root);

        
    }

  
    
}