package base;

public class MyInteger {
private int iValue;
MyInteger(int newIvalue){
	iValue = newIvalue;
}
public int  getIvalue(){
return iValue; 
}
public boolean isEven(){
	return (iValue % 2 == 0);
}
public boolean isOdd(){
	return (iValue % 2 != 0);
}
public boolean isPrime(){
	if (iValue%2==0) return false;
	for(int i=3;i*i<=iValue;i+=2) {
		if(iValue%i==0)
			return false;
	}
	return true;
}
public static boolean isEven(int iValue){
	return (iValue % 2 == 0);
}

public static boolean isOdd(int iValue){
	return (iValue % 2 != 0);
}
public static boolean isPrime(int iValue){
	if (iValue%2==0) return false;
	for(int i=3;i*i<=iValue;i+=2) {
		if(iValue%i==0)
			return false;
	}
	return true;
}

public static boolean isEven(MyInteger myint){
	return (myint.iValue % 2 == 0);
}

public static boolean isOdd(MyInteger myint){
	return (myint.iValue % 2 != 0);
}
public static boolean isPrime(MyInteger myint){
	if (myint.iValue%2==0) return false;
	for(int i=3;i*i<=myint.iValue;i+=2) {
		if(myint.iValue%i==0)
			return false;
	}
	return true;
}


}
