import java.util.Scanner;
public class JPA104{
 public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  int x1,x2,y1,y2;
  System.out.print("請輸入第1組的x和y座標:");
  x1 = sc.nextInt();
  y1 = sc.nextInt();
  System.out.print("請輸入第2組的x和y座標:");
  x2 = sc.nextInt();
  y2 = sc.nextInt();
  System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f",x1*1.0, y1*1.0, x2*1.0, y2*1.0,(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))));
 }
}