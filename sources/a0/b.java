package a0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {

    /* compiled from: FocusStrategy.java */
    public interface a<T> {
        /* renamed from: ʻ */
        void mo44(T t5, Rect rect);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: a0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0004b<T, V> {
        /* renamed from: ʻ */
        V mo46(T t5, int i5);

        /* renamed from: ʼ */
        int mo47(T t5);
    }

    /* compiled from: FocusStrategy.java */
    private static class c<T> implements Comparator<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Rect f22 = new Rect();

        /* renamed from: ʼ, reason: contains not printable characters */
        private final Rect f23 = new Rect();

        /* renamed from: ʽ, reason: contains not printable characters */
        private final boolean f24;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final a<T> f25;

        c(boolean z5, a<T> aVar) {
            this.f24 = z5;
            this.f25 = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t5, T t6) {
            Rect rect = this.f22;
            Rect rect2 = this.f23;
            this.f25.mo44(t5, rect);
            this.f25.mo44(t6, rect2);
            int i5 = rect.top;
            int i6 = rect2.top;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.left;
            int i8 = rect2.left;
            if (i7 < i8) {
                return this.f24 ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f24 ? -1 : 1;
            }
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            if (i9 < i10) {
                return -1;
            }
            if (i9 > i10) {
                return 1;
            }
            int i11 = rect.right;
            int i12 = rect2.right;
            if (i11 < i12) {
                return this.f24 ? 1 : -1;
            }
            if (i11 > i12) {
                return this.f24 ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m53(int i5, Rect rect, Rect rect2, Rect rect3) {
        boolean m54 = m54(i5, rect, rect2);
        if (m54(i5, rect, rect3) || !m54) {
            return false;
        }
        return !m62(i5, rect, rect3) || i5 == 17 || i5 == 66 || m63(i5, rect, rect2) < m65(i5, rect, rect3);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m54(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static <L, T> T m55(L l5, InterfaceC0004b<L, T> interfaceC0004b, a<T> aVar, T t5, Rect rect, int i5) {
        Rect rect2 = new Rect(rect);
        if (i5 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i5 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i5 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int mo47 = interfaceC0004b.mo47(l5);
        Rect rect3 = new Rect();
        T t6 = null;
        for (int i6 = 0; i6 < mo47; i6++) {
            T mo46 = interfaceC0004b.mo46(l5, i6);
            if (mo46 != t5) {
                aVar.mo44(mo46, rect3);
                if (m60(i5, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t6 = mo46;
                }
            }
        }
        return t6;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static <L, T> T m56(L l5, InterfaceC0004b<L, T> interfaceC0004b, a<T> aVar, T t5, int i5, boolean z5, boolean z6) {
        int mo47 = interfaceC0004b.mo47(l5);
        ArrayList arrayList = new ArrayList(mo47);
        for (int i6 = 0; i6 < mo47; i6++) {
            arrayList.add(interfaceC0004b.mo46(l5, i6));
        }
        Collections.sort(arrayList, new c(z5, aVar));
        if (i5 == 1) {
            return (T) m58(t5, arrayList, z6);
        }
        if (i5 == 2) {
            return (T) m57(t5, arrayList, z6);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static <T> T m57(T t5, ArrayList<T> arrayList, boolean z5) {
        int size = arrayList.size();
        int lastIndexOf = (t5 == null ? -1 : arrayList.lastIndexOf(t5)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z5 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static <T> T m58(T t5, ArrayList<T> arrayList, boolean z5) {
        int size = arrayList.size();
        int indexOf = (t5 == null ? size : arrayList.indexOf(t5)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z5 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static int m59(int i5, int i6) {
        return (i5 * 13 * i5) + (i6 * i6);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m60(int i5, Rect rect, Rect rect2, Rect rect3) {
        if (!m61(rect, rect2, i5)) {
            return false;
        }
        if (m61(rect, rect3, i5) && !m53(i5, rect, rect2, rect3)) {
            return !m53(i5, rect, rect3, rect2) && m59(m63(i5, rect, rect2), m67(i5, rect, rect2)) < m59(m63(i5, rect, rect3), m67(i5, rect, rect3));
        }
        return true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m61(Rect rect, Rect rect2, int i5) {
        if (i5 == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            return (i6 > i7 || rect.left >= i7) && rect.left > rect2.left;
        }
        if (i5 == 33) {
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            return (i8 > i9 || rect.top >= i9) && rect.top > rect2.top;
        }
        if (i5 == 66) {
            int i10 = rect.left;
            int i11 = rect2.left;
            return (i10 < i11 || rect.right <= i11) && rect.right < rect2.right;
        }
        if (i5 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i12 = rect.top;
        int i13 = rect2.top;
        return (i12 < i13 || rect.bottom <= i13) && rect.bottom < rect2.bottom;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static boolean m62(int i5, Rect rect, Rect rect2) {
        if (i5 == 17) {
            return rect.left >= rect2.right;
        }
        if (i5 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i5 == 66) {
            return rect.right <= rect2.left;
        }
        if (i5 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static int m63(int i5, Rect rect, Rect rect2) {
        return Math.max(0, m64(i5, rect, rect2));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static int m64(int i5, Rect rect, Rect rect2) {
        int i6;
        int i7;
        if (i5 == 17) {
            i6 = rect.left;
            i7 = rect2.right;
        } else if (i5 == 33) {
            i6 = rect.top;
            i7 = rect2.bottom;
        } else if (i5 == 66) {
            i6 = rect2.left;
            i7 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i6 = rect2.top;
            i7 = rect.bottom;
        }
        return i6 - i7;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static int m65(int i5, Rect rect, Rect rect2) {
        return Math.max(1, m66(i5, rect, rect2));
    }

    /* renamed from: י, reason: contains not printable characters */
    private static int m66(int i5, Rect rect, Rect rect2) {
        int i6;
        int i7;
        if (i5 == 17) {
            i6 = rect.left;
            i7 = rect2.left;
        } else if (i5 == 33) {
            i6 = rect.top;
            i7 = rect2.top;
        } else if (i5 == 66) {
            i6 = rect2.right;
            i7 = rect.right;
        } else {
            if (i5 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i6 = rect2.bottom;
            i7 = rect.bottom;
        }
        return i6 - i7;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static int m67(int i5, Rect rect, Rect rect2) {
        if (i5 != 17) {
            if (i5 != 33) {
                if (i5 != 66) {
                    if (i5 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
