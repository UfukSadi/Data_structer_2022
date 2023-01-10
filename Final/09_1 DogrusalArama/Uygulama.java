public class Uygulama 
{
    public static void main(String args[]){   
    	
    
    	
    	int[] dizi = {9, 1, 8, 2, 7, 3, 6, 4, 5};
    	
    	int index = linearSearch(dizi, 4);
    	
    	if(index != -1) 
		{
    		System.out.println("Elemanın Bulunduğu Dizinin İndex Sayısı: " + index);
    	}
    	else 
		{
    		System.out.println("Eleman Bulunamadı");
    	}
    		
    }

	private static int linearSearch(int[] dizi, int value) 
	{
		
		for(int i = 0; i < dizi.length; i++) {
			if(dizi[i] == value) 
			{
				return i;
			}
		}
		
		return -1;
	}
}