import proxy.Account;
import proxy.BankService;
import proxy.BankServiceService;

import java.util.List;

public class Main {


    public static void main(String[] args) {


        BankService proxy = new BankServiceService().getBankServicePort();

        System.out.println(proxy.convertEuroToDihms(12));

        List<Account> accountList = proxy.getListAccount();

        for(Account a: accountList)
        System.out.println(a.getAmount());
    }
}
