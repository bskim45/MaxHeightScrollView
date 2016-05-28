package com.bskim.maxheightscrollview.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;

import com.bskim.maxheightscrollview.R;
import com.bskim.maxheightscrollview.UIUtils;

public class MaxHeightNestedScrollView extends NestedScrollView {

    private int maxHeight;
    private final int defaultHeight = 200;

    public MaxHeightNestedScrollView(Context context) {
        this(context, null);
    }

    public MaxHeightNestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        init(context, attrs);
    }

    public MaxHeightNestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MaxHeightScrollView);

        try {
            setMaxHeight(a.getDimensionPixelSize(R.styleable.MaxHeightScrollView_maxHeight, defaultHeight));
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(maxHeight, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setMaxHeightDp(int maxHeightDp) {
        this.maxHeight = UIUtils.dpToPixels(getContext(), maxHeightDp);
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMaxHeightDp() {
        return UIUtils.pixelsToDp(getContext(), maxHeight);
    }
}
