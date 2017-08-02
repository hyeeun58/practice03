package prob03;

public class CurrencyConverter 
{
	private static double rate;
	

	// 한국 원화를 달러로 변환
	public static double  toDollar(double won) 
	{
		if(won <= 0) return 0;
		
		return won / rate;
	} 
	
	//달러를 한국 원화로 변환
	public static double  toKRW(double dollar) 
	{
		if(dollar <= 0) return 0;
		
		return dollar * rate;
	}
	
	//환율 설정(KRW/$1)
	public static void setRate(double r) 
	{
		rate = r;
	}

}
