package algo.linearsearch;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int linearSearch(int []a, int x) {
		int answer = -1;
		for(int i = 0; i < a.length; i++) {
			if(x == a[i]) {
				answer = i;
			}
		}
		
		return answer;
	}
}
