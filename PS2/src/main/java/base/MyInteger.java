package base;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;		
	}
	
	
	public int getiValue() {
		return this.iValue;
	}
	
	
	public boolean isEven(){
		return isEven(this.getiValue());		
	}
	
	
	public boolean isOdd(){
		return isOdd(this.iValue);
	}
	
	
	public boolean isPrime(){
		return isPrime(this.iValue);
	}
	
	
	public static boolean isEven(int spec_value){
		return (spec_value % 2 ==0);
	}

	
	public static boolean isOdd(int spec_value){
		return ((spec_value % 2) == 1);
	}
	
	
	public static boolean isPrime(int spec_value){
		if(spec_value <= 1){
			return false;
		}
		if(spec_value <= 3){
			return true;
		}
		if(spec_value % 2 == 0 || spec_value % 3 == 0){
			return false;
		}
		int i = 5;
		while(i * i < spec_value){
			if(spec_value % i == 0 || spec_value % (i + 2) == 0){
				return false;
			}
			i += 6;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger spec_value){
		return spec_value.isEven();	
	}

	
	public static boolean isOdd(MyInteger spec_value){
		return spec_value.isOdd();	
	}

	
	public static boolean isPrime(MyInteger spec_value){
		return spec_value.isPrime();
	}

	
	public boolean equals(int spec_value){
		return (spec_value == this.iValue);
	
	}

	
	public boolean equals(MyInteger spec_value){
		return equals(spec_value.getiValue());
	}
}
