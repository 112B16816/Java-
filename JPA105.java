import java.util.*;
public class JPA105
{
	public static void main(String[] args)
	{
		Scanner key=new Scanner(System.in);
		
		System.out.print("請輸入您的姓名:");
		String name=key.nextLine();
		System.out.printf("Hi,%s,請輸入您的銅板的個數:\n",name);

		System.out.print("請輸入1元的數量:");
		int a=key.nextInt();
		System.out.print("請輸入5元的數量:");
		int b=key.nextInt();
		System.out.print("請輸入10元的數量:");
		int c=key.nextInt();
		System.out.print("請輸入50元的數量:");
		int d=key.nextInt();
		
		int total=a*1+b*5+c*10+d*50;
		
		int e=total/1000;
		total%=1000;
		int f=total/100;
		total%=100;
		int g=total/10;
		total%=10;
		
		System.out.printf("您的錢總共有:%d 千 %d 百 %d 十 %d 元",e,f,g,total);	
	}
}