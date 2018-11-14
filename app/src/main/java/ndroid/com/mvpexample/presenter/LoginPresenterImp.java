package ndroid.com.mvpexample.presenter;

import ndroid.com.mvpexample.model.User;
import ndroid.com.mvpexample.view.MainView;

public class LoginPresenterImp implements LoginPresenter {


    private  MainView mainView;
    private User user;

    public LoginPresenterImp(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void performLogin(String email, String pswd) {
        user = new User();
        int result = user.isValidData(email, pswd);

        if(result == 1){
            mainView.loginSuccess();
        }
        else
            mainView.loginError();

    }


}
