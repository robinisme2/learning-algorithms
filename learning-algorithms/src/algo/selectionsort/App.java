package algo.selectionsort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = selectionSort(new int[] {9,8,3,13,87,12,99});
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
	
	
	private static int[] selectionSort(int a[]) {
		for(int i = 0; i < a.length; i++) {
			int min = a[i], index = i;
			for(int j = i+1; j<a.length; j++) {
				if(a[j]<min) {
					index = j;
					min = a[j];
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
		
		return a;
	}

}
