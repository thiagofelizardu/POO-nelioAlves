package herança.polimorfismo.Sobreposicao.entities;

import herança.polimorfismo.tudo.sobre.heranca.AulaUpcastingDonwcasting.entities.Account;

public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }


    public void updateBalance() {
        balance += balance * interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
