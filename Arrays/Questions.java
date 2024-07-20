import java.util.Scanner;
class Questions{
	// print nth fibonacci number
	public static int fibo(int i){
		if(i == 0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		return fibo(i-1)+ fibo(i-2);
	}
	public static void checkPrime(int n){
		int i=2;
		while(i <= n / 2){
			if(n % i == 0){
				System.out.println("No this is not prime");
				return;
			}
			i++;
		}
		System.out.println("Yes, this is prime");
	}

	// factorail of the number
	public static long factorial(int num){
		if(num == 0) return 1;

		return num * factorial(num-1);
	}

	// calculate the decimal of binary
	
	public static int calDecimal(int num){
			int result = 0;
			int index = 0;
			while(num != 0){
				int rem = num % 10;
				if(rem == 1){
					result += Math.pow(2,index);
				}
				index++;
				num/=10;
			}
			return result;
	} 

	// CALCUALATE THE BINARY
	public static int calBinary(int num){
		int result = 0,i=0;
		while(num != 0){
			int rem = num % 2;
			double c =  Math.pow(10,i);
			result += rem * c;
			num/=2;
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		int prev = 0;
		int curr = 1;
		// int i = 0;
		// while(i <= 10){
		// 	System.out.print(prev+" ");
		// 	int temp = prev;
		// 	prev = curr;
		// 	curr = temp + curr;
		// 	i++;
		// }
		// System.out.println("Enter the number and press -1 to exit");
		// Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// while(n!=-1){
		// 	checkPrime(n);
		// 	System.out.println("Enter the number and press -1 to exit");
		// 	n = sc.nextInt();

		// }

// reverse a string in java
		// String str = "hello";
		// StringBuilder result = new StringBuilder();
		// for(int i = str.length() - 1 ; i >= 0 ; i--){
		// 		result.append(str.charAt(i)); 
		// }
		// System.out.println(result);
// System.out.println(factorial(26));


     // check if vowel is present in string
	// 	String s = "magaM";
	// 	s = s.toLowerCase();
	// 	for(int i = 0 ; i < s.length() ; i++){
	// 			if(s.charAt(i) != s.charAt(s.length() - i - 1)){
	// 				System.out.println("Not a palindrome string");
	// 				break;
	// 			}
	// 		}

		// CALCULATE TEH DECIMAL
		// System.out.println(calDecimal(10000000));

		// CALCULATE THE BINARY
		// System.out.println(calBinary(127));
		
	}
}