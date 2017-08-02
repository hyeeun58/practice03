package prob06;

abstract class Calc 
{
	private int a;
	private int b;
	
	// getter
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	// a, b값 셋팅
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	// 추상클래스
	public abstract int calculate();
}
