import java.util.ArrayList;
import java.util.List;
/**
 * Account
 *
 *
 *
 */
public class Account {

    Account(String _username, String _firstName, String _lastName, String _password, String _email, String _steamAccount) {
        this.username = _username.toLowerCase();
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.password = _password;
        this.email = _email;
        this.steamAccount = _steamAccount;
    }





    /**
     * By this method the user will login
     */
    public boolean login(String username, String password)
    {

        if(username.equalsIgnoreCase(this.username)  && password.equals(this.password)) {
            return true;
        }
        else
        {
            return false;
        }

    }


    /**
      *  By this method you get the UserName from one special Account
      */
    public String getUsername() {
        return this.username;
    }

    /**
     *
     * returns the Max size in refer to the size.
     */

    public int getMaxSize()
    {
        return this.accounts.size();
    }
    /**
     * adds an account to the test data base
     */
    public void register(Account account)
    {
        accounts.add(account);
    }


    /**
     * gets accounts by email address
     * if there is no account with this email address it returns -1
     */

    public int getAccountByUserName (String user)
    {
        Account returnedAccount = null;
        int index = -1;

        for(Account account : this.accounts)
        {
            if( account != null && account.getUsername() == user)
            {
               index = accounts.indexOf(account);
                break; //
            }

        }
        return index;
    }

    /**
     * This is a test data base
     */
    private List<Account> accounts = new ArrayList<Account>();

    public String getLastName() {
        return lastName;
    }

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String steamAccount;
    private String email;

}
