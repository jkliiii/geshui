package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MaterialBackOrchestrator {
    private final d backCallbackDelegate;
    private final MaterialBackHandler backHandler;
    private final View view;

    private static class b implements d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private OnBackInvokedCallback f5879;

        private b() {
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.d
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo6962(MaterialBackHandler materialBackHandler, View view, boolean z5) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.f5879 == null && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback mo6964 = mo6964(materialBackHandler);
                this.f5879 = mo6964;
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z5 ? 1000000 : 0, mo6964);
            }
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.d
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo6963(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f5879);
            this.f5879 = null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        OnBackInvokedCallback mo6964(final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.a
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }
            };
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean m6965() {
            return this.f5879 != null;
        }
    }

    private static class c extends b {

        class a implements OnBackAnimationCallback {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ MaterialBackHandler f5880;

            a(MaterialBackHandler materialBackHandler) {
                this.f5880 = materialBackHandler;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                if (c.this.m6965()) {
                    this.f5880.cancelBackProgress();
                }
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.f5880.handleBackInvoked();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                if (c.this.m6965()) {
                    this.f5880.updateBackProgress(new androidx.activity.b(backEvent));
                }
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                if (c.this.m6965()) {
                    this.f5880.startBackProgress(new androidx.activity.b(backEvent));
                }
            }
        }

        private c() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.b
        /* renamed from: ʽ */
        OnBackInvokedCallback mo6964(MaterialBackHandler materialBackHandler) {
            return new a(materialBackHandler);
        }
    }

    private interface d {
        /* renamed from: ʻ */
        void mo6962(MaterialBackHandler materialBackHandler, View view, boolean z5);

        /* renamed from: ʼ */
        void mo6963(View view);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(T t5) {
        this(t5, t5);
    }

    private static d createBackCallbackDelegate() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            return new c();
        }
        if (i5 >= 33) {
            return new b();
        }
        return null;
    }

    public boolean shouldListenForBackCallbacks() {
        return this.backCallbackDelegate != null;
    }

    public void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        d dVar = this.backCallbackDelegate;
        if (dVar != null) {
            dVar.mo6963(this.view);
        }
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    private void startListeningForBackCallbacks(boolean z5) {
        d dVar = this.backCallbackDelegate;
        if (dVar != null) {
            dVar.mo6962(this.backHandler, this.view, z5);
        }
    }
}
