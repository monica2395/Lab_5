package lab3;

public class Accountsub extends Account{
	private double minbal;
	private double bal=super.getBalance();
	
	public Accountsub(long accNum, double balance, Person accHolder, double minbal) {
		super(accNum, balance, accHolder);
		this.minbal = minbal;
	}		
	public double getMinbal() {
		return minbal;
	}

	public void setMinbal(double minbal) {
		this.minbal = minbal;
	}

	public void withdraw(double wamount) {
		double x=0.0;
		if((bal -wamount)>minbal) {
			x=bal-wamount;
		}
		else {
			System.out.println("Not sufficient amount");
			x=bal;
		}
		super.setBalance(x);
	}

}
