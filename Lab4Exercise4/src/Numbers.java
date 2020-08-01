
public class Numbers {
	final int MAX_VALUE = 2147483647;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19};
		int n = numbers.length;
		nextLargest(numbers, n);
		
		
	}
	
	public static int nextLargest(int numbers[], int n) {
		int next, i, j; 
		for (i = 0; i < n; i++)
		{
			next = 1;
			for (j = i + 1; j < n; j++)
				if (numbers[i] < numbers[j]) {
					next = numbers[j];
					//break;
				}
			System.out.println(numbers[i] + ":" + next);	
		}
		return n;
				
				
				
	}
			
	
	
}
