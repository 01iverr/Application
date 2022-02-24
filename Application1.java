import java.util.* ;
import java.lang.Math.* ;

public class Application1 {
	public static boolean isPrime(int number){ 
			for (int i = 2; i <  ((int) Math.sqrt(number) + 1); i++) {
			if (number % i == 0) { 
				return false;} 
			} return true; 
		}
	public static int factorial (int n) {
		if (n == 0)
			return 1;
        return n*factorial(n-1);
}
	public static int combinations (int n, int k){
		int w = factorial(n)/(factorial(k)* factorial (n-k));
		return w;}
	public static int digitsOfInteger (int n){
		String l =Integer.toString(n);
        return l.length();
}
	public static void quadraticEquation (double a, double b,double c){
		double d=(b*b)-(4*a*c);
		
		if (d>0){
			
			double solve1= (double)Math.round(((-b+Math.sqrt(d))/(2*a))*100)/100;
			double solve2=(double) Math.round(((-b-Math.sqrt(d))/(2*a))*100)/100;
			System.out.println ( "The first solution is: " + solve1 );
			System.out.println ( "The second solution is: "+ solve2);
		}else if (d==0){
			double solve= Math.round((-b/(2*a)*100)/100);
			System.out.println ( "The double solution is:  : " + solve);
		}else {
			System.out.println("No roots were found");
		}
		
	}
	public static double findArea(double a, double b, double c){
		double d = (a+b+c)/2;
		double area = d*(d-a)*(d-b)*(d-c);
		if (area >=0)
			return  (double)Math.round((Math.sqrt(area))*100)/100;	
		return -1;
	}
	public  static void reverseDigits (int n){
		String m =Integer.toString(n);
		for (int i=m.length()-1 ;i>=0 ;i--)
		System.out.print(  m.charAt(i) ) ;
	}
	public  static int minDigit(int n) {
    int minn=10;
	while(n != 0) 
    {
        int d = n % 10;
        minn =Math.min(d,minn);
		n = n / 10;
    }
	return minn ;}
	public static void main(String args[]){
		Scanner an = new Scanner(System.in);
		System.out.println("Q1 - Prime Number (n)");
		System.out.print("n(>1)= ");
		int in = an.nextInt();
		if (isPrime(in) ){
			System.out.print(  in + " is a Prime Number");
		}else {
			System.out.print( in + " is NOT a Prime Number");
		}	
		System.out.println("\n\nQ2 - Factorial (n)");
		System.out.print("n= ");
		int on = an.nextInt();
		System.out.print( "Factorial("+on+")= " + factorial(on));
		System.out.println("\n\nQ3 - Combinations (n, k)");
		System.out.print("n= ");
		int n = an.nextInt();
		System.out.print("k= ");
		int k = an.nextInt();
		System.out.print("Combinations ("+n+","+k+") =" +combinations (n,k) );
		System.out.println("\n\nQ4 - Number of digits");
		System.out.println("Enter a positive integer:");
		System.out.print("n=");
		int q = an.nextInt();
		System.out.print("Number of digits ="+ digitsOfInteger(q));
		System.out.println("\n\nQ5 - Quadratic equation...");
	    System.out.print("Enter a (<>0):");
		Scanner en = new Scanner(System.in);
		double w = en.nextDouble();
		System.out.print("Enter b: ");
		double e = en.nextDouble();
		System.out.print("Enter c: ");
		double f= en.nextDouble();
		quadraticEquation(w,e,f);
		System.out.println("\n\nQ6 - Area of a triangle ");
		System.out.println ("Enter the length of the three sides.");
		System.out.print ("Enter a:");
		double p = en.nextDouble();
		System.out.print ("Enter b:");
		double o = en.nextDouble();
		System.out.print ("Enter c:");
		double j = en.nextDouble();
		System.out.println ("The area of a triangle is: "+findArea (p,o,j) );
		System.out.println("\n\nQ7 - Reverse digits ");
		System.out.println("Enter a positive integer: ");
		System.out.print("n= ");
		int x = an.nextInt();
		System.out.print("The reversed number is = " ) ;
		reverseDigits(x);
		System.out.println("\n\nQ8 - Min Digit");
		System.out.print("Enter a positive integer: ");
		System.out.println("n= ");
		int r = an.nextInt();
		System.out.println("Min Digit = " +minDigit(r) );
	}	
}
