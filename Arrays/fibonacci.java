
class fibonacci{
	public static void fibonacci(int n){
		for(int i = 0; i < n ; i++){
			System.out.print(fibo(i)+" ");
		}
	}
	public static int fibo(int i){
		if(i == 0){
			return 0;
		}
		if(i == 1){
			return 1;
		}
		return fibo(i-1) + fibo(i-2);
	}
	public static void main(String[] args) {
	fibonacci(10);	
	}
}