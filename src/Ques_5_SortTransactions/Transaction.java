package Ques_5;
public class Transaction {
	int id ;
	double amount ;
	public Transaction(int id, double amount) {
		this.amount=amount;
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		
		return " ";
	}
	
	
//	amount (high to low)
//	 If equal, sort by id (ascending)
}
