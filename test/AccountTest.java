import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;



/**
 * Account
 */
public class AccountTest {


    /**
     * test data for the user data base
     */
    private static final String USERNAME_01 = "Max";
    private static final String FIRSTNAME_01 = "Maximilian";
    private static final String LASTNAME_01 = "Mustermann";
    private static final String PASSWORD_01 = "u1234B";
    private static final String EMAIL_01 = "m.mustermann@mail.de";
    private static final String STEAMACCOUNT_01 = "Max12345";

    private static final String USERNAME_02 = "AnMa";
    private static final String FIRSTNAME_02 = "Anna-Maria";
    private static final String LASTNAME_02 = "MusterFrau";
    private static final String PASSWORD_02 = "be234lD";
    private static final String EMAIL_02 = "a.musterfau@mail.de";
    private static final String STEAMACCOUNT_02 = "Anna1287";


    /**
     * test if the databaseSize changed by adding
     */

    @Test
    public void testRegister()
    {
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account(USERNAME_01,FIRSTNAME_01,LASTNAME_01,PASSWORD_01,EMAIL_01,STEAMACCOUNT_01);
        Account account2 = new Account(USERNAME_02,FIRSTNAME_02,LASTNAME_02,PASSWORD_02,EMAIL_02,STEAMACCOUNT_02);

        accounts.add(account1);

        assertEquals("After adding an account to a new Userdatabase, " +
                "its current size shoult be 1", 1 ,accounts.size());

        accounts.add(account2);

        assertEquals("After the second adding an account to a new Userdatabase, " +
                "its current size shoult be 2", 2,accounts.size());



    }


    @Test
    public void testLogin()  {
        Account account = new Account("Max","Maximilian","Mustermann","b12345","m@mustermann.de","blbls");
        assertEquals("Max has problems",true, account.login("Max","b12345") );
        assertEquals("max has problems",true, account.login("max","b12345") );
        assertEquals("MAX has problems",true, account.login("MAX","b12345") );

        assertEquals("password is not case sensitiv",false, account.login("MAX","B12345") );

    }

    /**
     *
     */
    @Test
   public void getAccountByUserName (){
        List<Account> accounts = new ArrayList<>();
        Account account1 = new Account(USERNAME_01,FIRSTNAME_01,LASTNAME_01,PASSWORD_01,EMAIL_01,STEAMACCOUNT_01);
        Account account2 = new Account(USERNAME_02,FIRSTNAME_02,LASTNAME_02,PASSWORD_02,EMAIL_02,STEAMACCOUNT_02);
        accounts.add(account1);
        accounts.add(account2);

        assertEquals("Lastname is not the same like the added",account1.getLastName(),accounts.get(0).getLastName());

    }


}