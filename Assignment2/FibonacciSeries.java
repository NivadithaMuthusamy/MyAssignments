package Assignment2;

public class FibonacciSeries {
		public static void main(String[] args) {
			int a=0;
			int b=1;
			int sum=0;
			System.out.print(" "+a);
			
			
			for(int i=1;i<=11;i++) {
				sum=a+b;
				a=b;
				b=sum;
				System.out.print(" "+sum);
			}
		}
		}


