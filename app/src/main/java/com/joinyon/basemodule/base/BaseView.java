package com.joinyon.basemodule.base;


public interface BaseView {
    /**
     * 显示加载
     *
     * @param title 提醒内容
     */
    void showLoading(String title);

    /**
     * 停止加载
     */
    void stopLoading();

    /**
     * 错误提示
     *
     * @param msg 错误内容
     */
    void showErrorTip(String msg);
}
