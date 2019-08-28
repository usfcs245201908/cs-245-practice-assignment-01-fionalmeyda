public class Practice01MathRecursive implements Practice01Math {
	public int fib(int n) throws Exception{
		if(n<0){
			throw new Exception("invalid");
		}
		if(n==0 || n==1){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	public int fact(int n)throws Exception{
		if(n<0){
			throw new Exception("invalid");
		}
		int x= 0;
		if(n<=0){
			x =  1;
        }
        else{
            x =(n*fact(n-1));
        }
        return x;
	}
	
}
