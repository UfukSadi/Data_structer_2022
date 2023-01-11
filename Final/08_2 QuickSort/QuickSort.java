public class QuickSort
{
	
    public static void main(String args[])
    {   	
    	
        int[] dizi = {10,6,8,1,33,4}; 
        
        qSort(dizi, 0, dizi.length - 1);
        
        for(int i : dizi)
        {
            System.out.print(i + " ");
        }
    }

	private static void qSort(int[] dizi, int bas, int son) 
    {
		
		if(son <= bas) 
           return; 
		
		int pivot = partition(dizi, bas, son);
		qSort(dizi, bas, pivot - 1);
		qSort(dizi, pivot + 1, son);		
	}
	private static int partition(int[] dizi, int bas, int son) 
    {
		
		int pivot = dizi[son];
		int i = bas - 1;
		
		for(int j = bas; j <= son; j++) 
        {
			if(dizi[j] < pivot)
            {
				i++;
				int temp = dizi[i];
				dizi[i] = dizi[j];
				dizi[j] = temp;
			}
		}
		i++;
		int temp = dizi[i];
		dizi[i] = dizi[son];
		dizi[son] = temp;
		
		return i;
	}
}

