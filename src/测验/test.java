package 测验;

import java.util.Scanner;

public class test {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
           Scanner scan=new Scanner(System.in);
		   int month;
           System.out.println("请输入所要月份数");
           int i=1;
           while(i<=12)
           {
        	   i++;
        	   month=scan.nextInt();
        	   switch(month)
        	   {
        	   case 12:System.out.println("December");break;
        	   case 11:System.out.println("November");break;
        	   case 10:System.out.println("October");break;
        	   case 9:System.out.println("September");break;
        	   case 8:System.out.println("August");break;
        	   case 7:System.out.println("July");break;
        	   case 6:System.out.println("June");break;
        	   case 5:System.out.println("May");break;
        	   case 4:System.out.println("April");break;
        	   case 3:System.out.println("March");break;
        	   case 2:System.out.println("February");break;
        	   case 1:System.out.println("January");break;
        	   default:System.out.println("输入数据错误，请重新输入；");break;
        	   }
        	   
           }
	}

}
