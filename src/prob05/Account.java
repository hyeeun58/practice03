package prob05;

public class Account 
{
	private String accountNo;	// 계좌번호
	private int balance;		// 잔고
	
	
	// 생성자
	public Account(String account)
	{
		accountNo = account;
		System.out.println(accountNo + " 계좌가 개설되었습니다.");
		
		//getBalance();
	}
	
	// getter/setter
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		//System.out.println(accountNo + " 계좌의 잔고는 " + balance + "만원입니다.");
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 입금
	public void save(int pay)
	{
		balance += pay;
		System.out.println(accountNo + " 계좌에 " + pay + "만원이 입금되었습니다.");
		
		//getBalance();
	}
	
	// 출금
	public void deposit(int pay)
	{
		if(pay> balance)
			System.out.println("잔고가 부족합니다.");
		else 
		{ 
			balance -= pay;
			System.out.println(accountNo + " 계좌에 " + pay + "만원이 출금되었습니다.");
		}
		
		//getBalance();
	}
}
