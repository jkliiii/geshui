package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.d3;
import com.google.android.material.R;

/* loaded from: E:\78999\cookie_5123796.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d3 m1180 = d3.m1180(context, attributeSet, R.styleable.TabItem);
        this.text = m1180.m1197(R.styleable.TabItem_android_text);
        this.icon = m1180.m1188(R.styleable.TabItem_android_icon);
        this.customLayout = m1180.m1195(R.styleable.TabItem_android_layout, 0);
        m1180.m1201();
    }
}
