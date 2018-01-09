package text.bwei.com.projectitem.mine.presenter;

/**
 * Created by dell on 2018/1/8.
 */


import text.bwei.com.projectitem.mine.bean.DetailsBean;
import text.bwei.com.projectitem.mine.model.*;
import text.bwei.com.projectitem.mine.model.model;
import text.bwei.com.projectitem.mine.view.Idetailsview;

/**
 * Created by dell on 2018/1/4.
 */

public class presenterDetails {
    Idetailsview idetailsview;
    Idetailsmodel idetailsmodel;

    public presenterDetails(Idetailsview idetailsview) {
        this.idetailsview = idetailsview;
        idetailsmodel=new model();
    }

    public void getOkDetails(String url, int pid) {
        idetailsmodel.RequestDetails(url, pid, new OnselectDetails() {
            @Override
            public void dataDetailsSuccess(DetailsBean.DataBean list) {
                idetailsview.shouDetails(list);
            }
        });

    }


}
