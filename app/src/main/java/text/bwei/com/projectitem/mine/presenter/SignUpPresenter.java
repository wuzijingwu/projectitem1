package text.bwei.com.projectitem.mine.presenter;


import text.bwei.com.projectitem.mine.view.SignUpConstract;
import text.bwei.com.projectitem.mine.model.SignUpModel;

public class SignUpPresenter implements SignUpConstract.ISignUpPresenter {
    SignUpConstract.ISignUpView iSignUpView;
    SignUpConstract.ISignUpModel iSignUpModel;

    public SignUpPresenter(SignUpConstract.ISignUpView iSignUpView) {
        this.iSignUpView = iSignUpView;
        iSignUpModel = new SignUpModel();
    }

    @Override
    public void onSignUp(String url, String username, String password, String password_confirm) {
        iSignUpModel.RequestData(url, username, password, password_confirm, new SignUpConstract.OnRequestListener() {
            @Override
            public void OnSuccess() {
                iSignUpView.ShowSign();
            }

            @Override
            public void OnError(String e) {
                iSignUpView.ShowError(e);
            }
        });
    }
}
