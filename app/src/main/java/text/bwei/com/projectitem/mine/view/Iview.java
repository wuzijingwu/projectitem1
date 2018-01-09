package text.bwei.com.projectitem.mine.view;


import text.bwei.com.projectitem.mine.bean.MessageBean;

/**
 * Created by dell on 2018/1/8.
 */



public interface Iview {
    void onSuccess(Object o);
    void onFailed(Exception e);

    void delSuccess(MessageBean listMessageBean);
}