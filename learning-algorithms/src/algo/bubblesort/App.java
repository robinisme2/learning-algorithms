package algo.bubblesort;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = bubbleSort(new int[] {9,8,3,13,87,12,99});
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
	
	private static int[] bubbleSort(int a[]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if(a[j+1]<a[j]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				} 
			}
		}
		return a;
	}

}
