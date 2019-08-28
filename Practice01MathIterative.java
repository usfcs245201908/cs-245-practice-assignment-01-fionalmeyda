public class Practice01MathIterative implements Practice01Math {
	public int fib (int n) throws Exception{
		if (n<0){
			throw new ArithmeticException("invalid");  
		}
		if( n<=1){
			return n;
		}
		int f1=1;
		int f0=1;
		for( int i=2;i<n;i++){
			int temp = f1;
			f1+=f0;
			f0=temp;
		}
		return f1;
	}

	
	public int fact(int n) throws Exception {
		if (n < 0)
			throw new Exception("invalid");
		int f =1;
		for(int i =1 ;i<=n ; i++){
			f*=i;
		}
		return f;
	}


}
