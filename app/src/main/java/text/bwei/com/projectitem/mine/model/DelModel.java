package text.bwei.com.projectitem.mine.model;

/**
 * Created by dell on 2018/1/8.
 */

import io.reactivex.Flowable;
import text.bwei.com.projectitem.mine.bean.MessageBean;
import text.bwei.com.projectitem.mine.presenter.DelPresenter;
import text.bwei.com.projectitem.utils.RetrofitUtils;


public class DelModel implements IModel {
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }
    @Override
    public void getData(String uid,String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}