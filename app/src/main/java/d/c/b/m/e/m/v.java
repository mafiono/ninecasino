/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.auto.value.AutoValue
 *  com.google.auto.value.AutoValue$Builder
 *  d.c.b.m.e.m.b
 *  d.c.b.m.e.m.b$b
 *  d.c.b.m.e.m.f
 *  d.c.b.m.e.m.f$b
 *  d.c.b.m.e.m.u
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package d.c.b.m.e.m;

import com.google.auto.value.AutoValue;
import d.c.b.m.e.m.b;
import d.c.b.m.e.m.f;
import d.c.b.m.e.m.u;
import d.c.b.m.e.m.w;
import java.nio.charset.Charset;

@AutoValue
public abstract class v {
    public static final Charset a = Charset.forName("UTF-8");

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract c e();

    public abstract int f();

    public abstract String g();

    public abstract d h();

    public abstract a i();

    public v j(long l2, boolean bl, String string) {
        a a2 = this.i();
        d d3 = ((d.c.b.m.e.m.b)this).h;
        if (d3 != null) {
            d d4;
            d.b b2 = d3.l();
            Long l3 = l2;
            f.b b3 = (f.b)b2;
            b3.d = l3;
            b3.e = bl;
            if (string != null) {
                b3.g = new u(string, null);
                b3.a();
            }
            ((b.b)a2).g = d4 = b2.a();
        }
        return a2.a();
    }

    @AutoValue.Builder
    public static abstract class a {
        public abstract v a();
    }

    @AutoValue
    public static abstract class b {
        public abstract String a();

        public abstract String b();
    }

    @AutoValue
    public static abstract class c {
        public abstract w<a> a();

        public abstract String b();

        @AutoValue
        public static abstract class a {
            public abstract byte[] a();

            public abstract String b();
        }

    }

    @AutoValue
    public static abstract class d.c.b.m.e.m.v$d {
        public abstract a a();

        public abstract c b();

        public abstract Long c();

        public abstract w<d> d();

        public abstract String e();

        public abstract int f();

        public abstract String g();

        public abstract e h();

        public abstract long i();

        public abstract f j();

        public abstract boolean k();

        public abstract b l();

        @AutoValue
        public static abstract class d.c.b.m.e.m.v$d$a {
            public abstract String a();

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract a f();

            public abstract String g();

            @AutoValue
            public static abstract class a {
                public abstract String a();
            }

        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract d.c.b.m.e.m.v$d a();
        }

        @AutoValue
        public static abstract class c {
            public abstract int a();

            public abstract int b();

            public abstract long c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract long g();

            public abstract int h();

            public abstract boolean i();

            @AutoValue.Builder
            public static abstract class a {
            }

        }

        @AutoValue
        public static abstract class d {
            public abstract a a();

            public abstract b b();

            public abstract c c();

            public abstract long d();

            public abstract String e();

            @AutoValue
            public static abstract class d.c.b.m.e.m.v$d$d$a {
                public abstract Boolean a();

                public abstract w<d.c.b.m.e.m.v$b> b();

                public abstract b c();

                public abstract int d();

                @AutoValue.Builder
                public static abstract class a {
                }

                @AutoValue
                public static abstract class d.c.b.m.e.m.v$d$d$a$b {
                    public abstract w<a> a();

                    public abstract b b();

                    public abstract c c();

                    public abstract w<d> d();

                    @AutoValue
                    public static abstract class a {
                        public abstract long a();

                        public abstract String b();

                        public abstract long c();

                        public abstract String d();
                    }

                    @AutoValue
                    public static abstract class b {
                        public abstract b a();

                        public abstract w<d.a> b();

                        public abstract int c();

                        public abstract String d();

                        public abstract String e();
                    }

                    @AutoValue
                    public static abstract class c {
                        public abstract long a();

                        public abstract String b();

                        public abstract String c();
                    }

                    @AutoValue
                    public static abstract class d {
                        public abstract w<a> a();

                        public abstract int b();

                        public abstract String c();

                        @AutoValue
                        public static abstract class d.c.b.m.e.m.v$d$d$a$b$d$a {
                            public abstract String a();

                            public abstract int b();

                            public abstract long c();

                            public abstract long d();

                            public abstract String e();

                            @AutoValue.Builder
                            public static abstract class a {
                            }

                        }

                    }

                }

            }

            @AutoValue
            public static abstract class b {
                public abstract Double a();

                public abstract int b();

                public abstract long c();

                public abstract int d();

                public abstract long e();

                public abstract boolean f();

                @AutoValue.Builder
                public static abstract class a {
                }

            }

            @AutoValue
            public static abstract class c {
                public abstract String a();
            }

        }

        @AutoValue
        public static abstract class e {
            public abstract String a();

            public abstract int b();

            public abstract String c();

            public abstract boolean d();
        }

        @AutoValue
        public static abstract class f {
            public abstract String a();
        }

    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e e;
        public static final /* enum */ e f;
        public static final /* enum */ e g;
        public static final /* synthetic */ e[] h;

        public static {
            e e2;
            e e3;
            e e4;
            e = e3 = new e();
            f = e4 = new e();
            g = e2 = new e();
            h = new e[]{e3, e4, e2};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return h.clone();
        }
    }

}

