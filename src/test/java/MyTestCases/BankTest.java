package MyTestCases;

import HarshaProject.Bank;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest {

    @Test
    public void testDeposit(){
        Bank bank = new Bank();
        bank.DepositAmt(100);
        Assert.assertEquals(bank.getAmt(), 100);
    }


    @Test
    public void m1(){
        String  a = "10";
        Integer.parseInt(a);

//        json -> java objects : serialization
//            java -> json: de-serialization
    }

}
