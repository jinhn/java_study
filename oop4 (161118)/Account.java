public class Account {
	// �̸�, ���¹�ȣ, ��й�ȣ, �ܾ�
	// �Ӽ� ����
	String name;
	String accountNumber;
	int password;
	int balance;

	// �⺻ ������ ����
	public Account() {}

	// getter/setter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}