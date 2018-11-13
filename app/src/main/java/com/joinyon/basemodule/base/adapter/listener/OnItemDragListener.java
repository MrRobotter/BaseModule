package com.joinyon.basemodule.base.adapter.listener;

import android.support.v7.widget.RecyclerView;

/**
 * 条目拖拽监听
 */
public interface OnItemDragListener {
    /**
     * 开始拖拽
     *
     * @param viewHolder
     * @param pos
     */
    void onItemDragStart(RecyclerView.ViewHolder viewHolder, int pos);

    /**
     * 拖拽移动中
     *
     * @param source
     * @param from
     * @param target
     * @param to
     */
    void onItemDragMoving(RecyclerView.ViewHolder source, int from, RecyclerView.ViewHolder target, int to);

    /**
     * 拖拽结束
     *
     * @param viewHolder
     * @param pos
     */
    void onItemDragEnd(RecyclerView.ViewHolder viewHolder, int pos);

}
