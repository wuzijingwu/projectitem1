package text.bwei.com.projectitem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import text.bwei.com.projectitem.adapter.MyGoodsAdpater;
import text.bwei.com.projectitem.api.Apis;
import text.bwei.com.projectitem.mine.bean.Goods;
import text.bwei.com.projectitem.mine.presenter.presenterGoods;
import text.bwei.com.projectitem.mine.view.IgoodView;


public class GoodsActivity extends AppCompatActivity implements IgoodView {


    @BindView(R.id.recycler_goods)
    RecyclerView recycler_goods;


    private int pscid;
    private int page = 1;
    private LinearLayoutManager linearLayoutManager;
    private text.bwei.com.projectitem.mine.presenter.presenterGoods presenterGoods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods);
        ButterKnife.bind(this);
//        EventBus.getDefault().register(this);
        presenterGoods = new presenterGoods(this);
        presenterGoods.getOkGood(Apis.GOOSDURL, 1, page, 0);
    }

//    @Subscribe(threadMode = ThreadMode.MAIN_ORDERED, sticky = true)
//    public void getgoods(Messagechilde messagechilde) {
//        pscid = messagechilde.getPscid();
//
//    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        EventBus.getDefault().unregister(this);
//        presenterGoods.detach();//防内存溢出
//    }

    @Override
    public void showgoods(final List<Goods.DataBean> list) {
        linearLayoutManager = new LinearLayoutManager(this);
        recycler_goods.setLayoutManager(linearLayoutManager);
        recycler_goods.setAdapter(new MyGoodsAdpater(list, this));

//        swiperefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                page++;
//                presenterGoods.getOkGood(Apis.GOOSDURL, 1, page, 0);
//                swiperefreshLayout.setRefreshing(false);
//            }
//        });


    }
}

