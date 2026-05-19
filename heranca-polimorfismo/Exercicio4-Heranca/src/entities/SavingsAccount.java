package entities;

public class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        this.balance += this.balance * interestRate;
    }

    @Override
    public final void withdraw(double amount) { // 'final' Não me permite criar mais metódos sobrepostos para este.
        balance -= amount;                      // Boa prática não criar "ramificações" de outros ramificações.
    }

}

