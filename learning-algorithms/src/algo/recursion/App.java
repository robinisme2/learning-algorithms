package algo.recursion;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reduceByOne(10);
		System.out.println(recursiveLineaerSearch(new int[] {4,48,4,28,34,76,9,3}, 0, 28));
	}
	
	public static void reduceByOne(int n) {
		if(n != 0)
			reduceByOne(n-1);
		System.out.println(n);
	}
	
	public static int recursiveLineaerSearch(int []a, int i, int x) {
		if(i >= a.length) 
			return -1;
		else if(a[i] == x)
			return i;
		else
			System.out.println("index at: " + i);
			return recursiveLineaerSearch(a, i+1, x);
	}
	
	public static int recursiveBinarySearch(int []a, int p, int r, int x) {
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
