package text.bwei.com.projectitem.utils;

import android.widget.ScrollView;



public interface  ScrollViewListener {
    /**
     * 滑动监听
     *
     * @param scrollView ScrollView控件
     * @param x          x轴坐标
     * @param y          y轴坐标
     * @param oldx       上一个x轴坐标
     * @param oldy       上一个y轴坐标
     */
    void onScrollChanged(ScrollView scrollView, int x, int y, int oldx, int oldy);
}
