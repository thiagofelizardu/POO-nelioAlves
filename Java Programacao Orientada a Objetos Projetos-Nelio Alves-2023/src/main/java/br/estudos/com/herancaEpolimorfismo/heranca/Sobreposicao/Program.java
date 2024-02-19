package br.estudos.com.herancaEpolimorfismo.heranca.Sobreposicao;

import br.estudos.com.herancaEpolimorfismo.heranca.Sobreposicao.entities.Account;
import br.estudos.com.herancaEpolimorfismo.heranca.Sobreposicao.entities.BusinessAccount;
import br.estudos.com.herancaEpolimorfismo.heranca.Sobreposicao.entities.SavingsAccount;


public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1000,"Alex",1000.00);

        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1004,"Ana", 1000.00,0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1000,"Alex",1000.00,500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
