
public class BinarySearch
{
	public static final int NOT_FOUND = -1;

/**
*@returnposiçãoonde o item foi encontrado, ou não.
*/
	public static int binarySearch(int a[], int x)
	{
		int low = 0;
		int high = a.length-1;
		int mid;

		while(low <= high)
		{
			mid=(low + high) / 2;

			if(a[mid] > x)
				high = mid - 1;
			else if(a[mid] < x)
				low = mid + 1;
			else
				return mid;
		}

		return NOT_FOUND; //NOT_FOUND = -1
	}

//Testando o programa
	public static void main(String[]args)
	{
		int SIZE = 8;
		int []a = new int[SIZE];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
			
		System.out.println(binarySearch(a, 0));
		
	}
}