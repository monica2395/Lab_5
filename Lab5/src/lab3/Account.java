package lab3;

public abstract class Account {
	protected long accNum;
	protected double balance;
	protected Person accHolder;
	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public abstract void withdraw(double wamount);
	public String toString() {
		return accHolder.getName()+"\t"+accHolder.getAge()+"\t"+accNum+"\t"+balance;
	}
	
}
