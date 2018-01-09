package text.bwei.com.projectitem.mine.view;


import text.bwei.com.projectitem.mine.bean.LoginBean;

public interface LoginConstract {

    interface ILoginView {
        void showLogin(LoginBean.DataBean db);
        void showerroe(String e);
    }

    interface ILoginModel {
        void RequestData(String url, String mobile, String password, OnRequestListener onRequestListener);
    }

    interface OnRequestListener{
        void OnSuccess(LoginBean.DataBean db);
        void OnError(String e);
    }

    interface ILoginPresenter {
        void onSignUp(String url, String mobile, String password);
    }

}
