package com.joinyon.basemodule.widght.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * 不会滚动的listview
 */

public class NoScrollListView extends ListView {
    public NoScrollListView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public NoScrollListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}