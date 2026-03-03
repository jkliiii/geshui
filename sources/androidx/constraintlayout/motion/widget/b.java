package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: DesignTool.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b {

    /* renamed from: ˆ, reason: contains not printable characters */
    static final HashMap<Pair<Integer, Integer>, String> f1602;

    /* renamed from: ˈ, reason: contains not printable characters */
    static final HashMap<String, String> f1603;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final j f1604;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f1605 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private String f1606 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f1607 = -1;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f1608 = -1;

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = new HashMap<>();
        f1602 = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        f1603 = hashMap2;
        hashMap.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap2.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap2.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap2.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap2.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap2.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap2.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap2.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap2.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap2.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap2.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap2.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap2.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public b(j jVar) {
        this.f1604 = jVar;
    }
}
