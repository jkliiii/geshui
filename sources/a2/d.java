package a2;

import d2.f;
import e2.g;
import e2.h;
import e2.i;
import e2.j;
import e2.k;
import e2.l;
import e2.m;
import e2.n;
import e2.o;

/* compiled from: SpriteFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* compiled from: SpriteFactory.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f96;

        static {
            int[] iArr = new int[e.values().length];
            f96 = iArr;
            try {
                iArr[e.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96[e.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96[e.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96[e.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96[e.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96[e.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f96[e.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f96[e.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f96[e.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f96[e.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f96[e.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f96[e.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f96[e.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f96[e.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f96[e.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static f m180(e eVar) {
        switch (a.f96[eVar.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new e2.d();
            case 3:
                return new o();
            case 4:
                return new n();
            case 5:
                return new i();
            case 6:
                return new e2.a();
            case 7:
                return new m();
            case 8:
                return new e2.b();
            case 9:
                return new e2.c();
            case 10:
                return new e2.e();
            case 11:
                return new e2.f();
            case 12:
                return new k();
            case 13:
                return new g();
            case 14:
                return new j();
            case 15:
                return new h();
            default:
                return null;
        }
    }
}
