package Test1;
public class Calculate {
	public static double add(double a,double b) {
		return a+b;
	}
	public static double subtract(double a,double b) {
		return a-b;
	}
	public static double multiply(double a,double b) {
		return a*b;
	}
	public static double divide(double a,double b) throws Exception {
		if(b==0)
			throw new Exception("除数不能为0！");
		return a/b;
	}
	public static double square(double a) {
		return a*a;
	}
	public static double squareroot(double a) throws Exception {
		if(a<0)
			throw new Exception("根号下的数不能小于0！");
		return (double) Math.sqrt(a);
	}
}
