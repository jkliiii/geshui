package f0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: EmojiKeyListener.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class e implements KeyListener {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final KeyListener f7651;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final a f7652;

    /* compiled from: EmojiKeyListener.java */
    public static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean m8490(Editable editable, int i5, KeyEvent keyEvent) {
            return androidx.emoji2.text.e.m3783(editable, i5, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i5) {
        this.f7651.clearMetaKeyState(view, editable, i5);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f7651.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i5, KeyEvent keyEvent) {
        return this.f7652.m8490(editable, i5, keyEvent) || this.f7651.onKeyDown(view, editable, i5, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f7651.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i5, KeyEvent keyEvent) {
        return this.f7651.onKeyUp(view, editable, i5, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f7651 = keyListener;
        this.f7652 = aVar;
    }
}
