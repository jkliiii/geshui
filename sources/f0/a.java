package f0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final b f7637;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f7638 = Integer.MAX_VALUE;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f7639 = 0;

    /* compiled from: EmojiEditTextHelper.java */
    /* renamed from: f0.a$a, reason: collision with other inner class name */
    private static class C0105a extends b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final EditText f7640;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final g f7641;

        C0105a(EditText editText, boolean z5) {
            this.f7640 = editText;
            g gVar = new g(editText, z5);
            this.f7641 = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(f0.b.getInstance());
        }

        @Override // f0.a.b
        /* renamed from: ʻ, reason: contains not printable characters */
        KeyListener mo8480(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // f0.a.b
        /* renamed from: ʼ, reason: contains not printable characters */
        boolean mo8481() {
            return this.f7641.m8513();
        }

        @Override // f0.a.b
        /* renamed from: ʽ, reason: contains not printable characters */
        InputConnection mo8482(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f7640, inputConnection, editorInfo);
        }

        @Override // f0.a.b
        /* renamed from: ʾ, reason: contains not printable characters */
        void mo8483(boolean z5) {
            this.f7641.m8514(z5);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    static class b {
        b() {
        }

        /* renamed from: ʻ */
        KeyListener mo8480(KeyListener keyListener) {
            throw null;
        }

        /* renamed from: ʼ */
        boolean mo8481() {
            throw null;
        }

        /* renamed from: ʽ */
        InputConnection mo8482(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* renamed from: ʾ */
        void mo8483(boolean z5) {
            throw null;
        }
    }

    public a(EditText editText, boolean z5) {
        androidx.core.util.h.m2584(editText, "editText cannot be null");
        this.f7637 = new C0105a(editText, z5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public KeyListener m8476(KeyListener keyListener) {
        return this.f7637.mo8480(keyListener);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m8477() {
        return this.f7637.mo8481();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public InputConnection m8478(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f7637.mo8482(inputConnection, editorInfo);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8479(boolean z5) {
        this.f7637.mo8483(z5);
    }
}
