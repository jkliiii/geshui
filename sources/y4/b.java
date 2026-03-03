package y4;

/* compiled from: ErrorCode.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);


    /* renamed from: ʾ, reason: contains not printable characters */
    public final int f12497;

    b(int i5) {
        this.f12497 = i5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static b m12939(int i5) {
        for (b bVar : values()) {
            if (bVar.f12497 == i5) {
                return bVar;
            }
        }
        return null;
    }
}
