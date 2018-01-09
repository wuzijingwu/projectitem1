package text.bwei.com.projectitem.mine.presenter;

import java.util.List;

import text.bwei.com.projectitem.mine.bean.Goods;
import text.bwei.com.projectitem.mine.view.IgoodView;


/**
 * Created by dell on 2018/1/3.
 */

public class presenterGoods {
    IgoodView igoodView;
    Imodel imodel;

    public presenterGoods(IgoodView igoodView) {
        this.igoodView = igoodView;
        imodel = new model();
    }
    public void detach(){
        igoodView=null;
    }



    public void getOkGood(String url, int pscid, int page, int sort) {
        imodel.RequestGoodsSuccess(url, pscid, page, sort, new OnselectGoods() {
            @Override
            public void dataGoods(List<Goods.DataBean> list) {
                igoodView.showgoods(list);
            }
        });


    }

}
