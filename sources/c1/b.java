package c1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 c1.b, still in use, count: 1, list:
  (r0v0 c1.b) from 0x001a: SPUT (r0v0 c1.b) (LINE:27) c1.b.ˆ c1.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: DecodeFormat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {
    PREFER_ARGB_8888,
    PREFER_RGB_565;


    /* renamed from: ˆ, reason: contains not printable characters */
    public static final b f4971 = new b();

    static {
    }

    private b() {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4972.clone();
    }
}
