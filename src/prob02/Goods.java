package prob02;

public class Goods 
{
	private String name;
	private int price;
	private int count;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0) price = 0;
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if(count < 0) count = 0;
		this.count = count;
	}
	
	
	
}
