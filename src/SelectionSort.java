
public class SelectionSort {
	
	public static void selectionSort(int[] lista) {
		
		int n = lista.length;
		
		for (int j = 0; j < n-1; j++) {
			
			int min_index = j;
			
			for (int i = j; i < n; i++) {
				
				if (lista[i] < lista[min_index]) {
					min_index = i;
				}
				
				if (lista[j] > lista[min_index]) {
					
					int aux = lista[j];
					lista[j] = lista[min_index];
					lista[min_index] = aux;
					
				}
				
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		int[] lista = {7, 5, 1, 8, 3};
		
		selectionSort(lista);
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " ");
		}
		
	}

}
