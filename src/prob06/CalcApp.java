package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String expression = "";
		int result = 0;
		
		//while( true )
		while( !"quit".equals(expression) ) 
		{	
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );
			//String expression = scanner.nextLine();
			expression = scanner.nextLine();
			
//			if( "quit".equals( expression ) ) {
//				break;
//			}
			
			String[] tokens = expression.split( " " );
			int a = Integer.parseInt( tokens[0] );
			String operator = tokens[1];
			int b = Integer.parseInt( tokens[2] );
			result = 0;
			
			switch( operator ) 
			{
				case "+" :	Add add = new Add();
							add.setValue( a, b );
							result = add.calculate();
							break;
				case "-" :	Sub sub = new Sub();
							sub.setValue( a, b );
							result = sub.calculate();
							break;
				case "*" :	Mul mul = new Mul();
							mul.setValue( a, b );
							result = mul.calculate();
							break;
				case "/" :	Div div = new Div();
							div.setValue( a, b );
							result = div.calculate();
							break;
			}
			
			System.out.println( ">> " + result);
		}
		
		scanner.close();

	}

}

