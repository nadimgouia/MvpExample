package ndroid.com.mvpexample.model;

public class User implements IUserModel {


    private String email;
    private String pswd;


    public User() {
    }

    public User(String email, String pswd) {
        this.email = email;

        this.pswd = pswd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public int isValidData(String email, String pswd) {


        if (email.equals("nadim") && pswd.equals("123")) {
            return 1;
        } else
            return 2;


    }

}
