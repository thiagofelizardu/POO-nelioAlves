package br.estudos.com.herancaEpolimorfismo.heranca.AulaUpcastingDonwcasting;


import br.estudos.com.herancaEpolimorfismo.heranca.AulaUpcastingDonwcasting.entities.Account;
import br.estudos.com.herancaEpolimorfismo.heranca.AulaUpcastingDonwcasting.entities.BusinessAccount;
import br.estudos.com.herancaEpolimorfismo.heranca.AulaUpcastingDonwcasting.entities.SavingsAccount;


public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002,"Maria",0.0,500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob", 0.0,200.0);
        Account acc3 = new SavingsAccount(1004,"Ana", 0.0,0.01);

        // DOWNCASTING

        //BusinessAccount acc4 = acc2; nao tem como converter de Account para BusinessAccount
        //mas forcando o casting tem
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3; nao tem como pois (SavingsAccount cannot be cast to class BusinessAccount )
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(2000);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE");
        }

    }
}
