package hw1;

public class HomeWork {
	public static void main(String[]args) {
		
//	1請設計一隻Java程式，計算12，6這兩個數值的和與積
		int x=12,y=6;
		int sum=x+y;
		int product=x*y;
		System.out.println("(1)");
		System.out.println("總和為"+sum+"，乘積為"+product);
		System.out.println();
//	2請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int dozen=200/12;
		int rest=200%12;
		System.out.println("(2)");
		System.out.println("200顆蛋共是"+dozen+"打"+rest+"顆");
		System.out.println();
//	3請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day=24*60*60;//一天幾秒
		int day1=256559/day;//秒數換算天數
		int day2=256559%day;//天數，所剩餘秒數
		
		int hour=60*60;//一小時幾秒
		int hour1=day2/hour;//天數剩餘秒數，換算時數
		int hour2=day2%hour;//時數，所剩餘秒數
		
		int min=60;//一分鐘幾秒
		int min1=hour2/min;//時數剩餘秒數，換算分鐘數
		int min2=hour2%min;//剩餘秒數
		System.out.println("(3)");
		System.out.println("256559為"+day1+"天"+hour1+"小時"
		                               +min1+"分"+min2+"秒");
		System.out.println();
//	4請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double x1=3.1415;
		int r=5;
		double area=x1*r*r;
		double length=2*x1*r;
		System.out.println("(4)");
		System.out.printf("圓面積=%.4f%n",area);
		System.out.printf("圓周長=%.4f%n",length);
		System.out.println();
//	5某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年
//		後，本金加利息共有多少錢 (用複利計算，公式請自行google)
		//複利計算公式：本利和 = 本金 × (1 + 年利率)^期間
		double money=1_500_000;
		double money1=money*Math.pow(1+0.02, 10);
		System.out.println("(5)");
		System.out.printf("本金加利息共有=%.2f%n",money1);
		System.out.println();
//	6請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//	5 + 5
//	 5 + ‘5’
//	 5 + “5”
//	並請用註解各別說明答案的產生原因
		System.out.println("(6)");
		System.out.println("5+5為"+(5+5));//10，純數字運算
		System.out.println("5+'5'為"+(5+'5'));//58，字元可以運算，5的ASCII值為53
		System.out.println("5+\"5\"為"+5+"5");//55，字串可以跟數字串接
		
//		請建立一個TestNineNine.java程式，可輸出九九乘法表
//		• 一：使用for迴圈+ while迴圈
//		• 二：使用for迴圈+ do while迴圈
//		• 三：使用while迴圈+ do while迴圈	
		
		
	}
}
