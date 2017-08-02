package prob02;

import java.util.Scanner;

public class GoodsApp 
{
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		
		
		for(int i=0; i<COUNT_GOODS; i++)
		{
			goods[i] = new Goods();
			
			goods[i].setName(scanner.next());
			goods[i].setPrice(scanner.nextInt());
			goods[i].setCount(scanner.nextInt());
		}
		
		for(int i=0; i<COUNT_GOODS; i++)
		{
			System.out.println( goods[i].getName() + "(가격:" + goods[i].getPrice() + "원)이 " 
								+ goods[i].getCount() + "개 입고 되었습니다."	);
		}

	}
}
