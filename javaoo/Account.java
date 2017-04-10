public class Account {
	private String owner;
	private long balance;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account money = new Account(); 
		money.setbalance(50000);
		money.deposit(20000); 
		money.withdraw(35000); 
		
	}
	
	public Account(){		
	}
	public Account(String owner){
		this.owner = owner;
	}
	public Account(long balance){
		this.balance = balance;
	}
	public Account(String owner, long balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getowner(){		
		return owner;
	}
	public void setowner(String owner){
		this.owner = owner;
	}
	public long getbalance(){		
		return balance;
	}
	public void setbalance(long balance){		
		this.balance = balance;
	}
	public long deposit(long amount){ 
		long bal = this.balance + amount;
		this.balance = bal;
		System.out.println(amount + "원 입금 \n" + "현재 잔고 : " + bal );
		return bal;
	}
	public long withdraw(long amount){ 
		long bal = this.balance - amount;
		this.balance = bal;
		System.out.println(amount + "원 출금 \n" + "현재 잔고 : " + bal );
		return bal;
	}

}
