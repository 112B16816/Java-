import java.util.*;
public class JPA106
{
	public static void main(String[] args)
	{	
		System.out.printf("f<-3.2> = %.4f\n",f(-3.2));//記得要f()
		System.out.printf("f<-2.1> = %.4f\n",f(-2.1));//記得要f()
		System.out.printf("f<0> = %.4f\n",f(0));	//記得要f()
		System.out.printf("f<2.1> = %.4f\n",f(2.1));	//記得要f()
	}
	
	static double f(double x)		//副程式(函數)的寫法
	{	
		return 3*Math.pow(x,3)+2*x-1;	//題給公式，回傳用return
	}
}