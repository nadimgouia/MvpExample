package ndroid.com.mvpexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ndroid.com.mvpexample.R;
import ndroid.com.mvpexample.presenter.LoginPresenter;
import ndroid.com.mvpexample.presenter.LoginPresenterImp;
import ndroid.com.mvpexample.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {


    @BindView(R.id.btnSubmit)
    Button btnSubmit;
    @BindView(R.id.editEmail)
    EditText editEmail;
    @BindView(R.id.editPswd)
    EditText editPswd;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        loginPresenter = new LoginPresenterImp(this);

    }

    @OnClick(R.id.btnSubmit)
    public void btnSubmitClick(View v) {
        loginPresenter.performLogin(editEmail.getText().toString(), editPswd.getText().toString());

    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
    }
}
