package entities;
// public final class SavingsAccount extends Account {
// se estiver assim dá erro - se estiver assim da erro com a palavra final da savingsaccount
public class SavingsAccountPlus extends SavingsAccount {

	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}

}
