package algo.binarysearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(BinarySearch(new int[] {1,2,3,4,7,9,12,18}, 0));
		System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18}, 0, 7, 99));
	}
	
	public static int BinarySearch(int []a, int x) {
		int p = 0, r = a.length - 1;
		while(p <= r) {
			int q = (p+r)/2;
			if(a[q] == x) {
				return q;
			}else if(a[q] < x) {
				p = q + 1;
			}else {
				r = q - 1;
			}
		}
		
		return -1;
	}
	
	public static int recursiveBinarySearch(int []a, int p, int r, int x) {
		System.out.println("[ "+p+"..."+r+" ]");
		if(p > r)
			return -1;
		else {
			int q = (p+r)/2;
			if(a[q] == x)
				return q;
			else if(a[q] > x)
				return recursiveBinarySearch(a, p, q-1, x);
			else
				return recursiveBinarySearch(a, q+1, r, x);
			
		}
	}

}
