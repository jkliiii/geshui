package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.f1;

/* compiled from: ViewOffsetHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class n {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final View f5271;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f5272;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f5273;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f5274;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5275;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f5276 = true;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f5277 = true;

    public n(View view) {
        this.f5271 = view;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m6191() {
        View view = this.f5271;
        f1.m2815(view, this.f5274 - (view.getTop() - this.f5272));
        View view2 = this.f5271;
        f1.m2814(view2, this.f5275 - (view2.getLeft() - this.f5273));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m6192() {
        return this.f5272;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m6193() {
        return this.f5275;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m6194() {
        return this.f5274;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m6195() {
        return this.f5277;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m6196() {
        return this.f5276;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m6197() {
        this.f5272 = this.f5271.getTop();
        this.f5273 = this.f5271.getLeft();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m6198(boolean z5) {
        this.f5277 = z5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m6199(int i5) {
        if (!this.f5277 || this.f5275 == i5) {
            return false;
        }
        this.f5275 = i5;
        m6191();
        return true;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m6200(int i5) {
        if (!this.f5276 || this.f5274 == i5) {
            return false;
        }
        this.f5274 = i5;
        m6191();
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m6201(boolean z5) {
        this.f5276 = z5;
    }
}
