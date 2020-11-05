package lab3;

public class AccountMain {

	public static void main(String[] args) {
		Person obj=new Person("Kaith",28);
	
		Accountsub acc=new Accountsub(9837829L,3000,obj,500);
		System.out.println("Intitially:");
		System.out.println(acc);
		System.out.println("Updated:");
		acc.withdraw(2000);
		System.out.println(acc);
		
	}

}
