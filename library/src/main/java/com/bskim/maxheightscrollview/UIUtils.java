package com.bskim.maxheightscrollview;

import android.content.Context;

public class UIUtils {
    public static int dpToPixels(Context c, int dp) {
        return (int)(c.getResources().getDisplayMetrics().density * dp);
    }

    public static int pixelsToDp(Context c, int pixel) {
        return (int)((float)pixel / c.getResources().getDisplayMetrics().density);
    }
}
