// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: Gz1.kt
public class Gz1<T0 : Any, T1 : Any> {
    open fun <T2: Any>wekJV(): T1? {
        throw RuntimeException()
    }
    open fun <T3: T0, T4: T0?>riZYLC0(): T1? {
        throw RuntimeException()
    }
    open fun pMrJBVOr(pG9HbOFb: Gz1<T1, T0>, w3Ts: T1, i9iWrsrz: Gz1<T0, T1>?): Gz1<Any, T1>? {
        throw RuntimeException()
    }
}

// FILE: MueUF.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface MueUF {
    public abstract <T5 extends @Nullable Object>@Nullable Gz1<@NotNull Object, @NotNull Object> pFZa4Oj();
}

// FILE: B9qT5En.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface B9qT5En<T6 extends @Nullable MueUF, T7 extends @NotNull MueUF, T8 extends T6> extends MueUF {
    public abstract <T9 extends @Nullable T6>@NotNull Gz1<@NotNull T7, @NotNull Object> bkFL9(@NotNull MueUF cPRbWNzm, @Nullable B9qT5En<@NotNull MueUF, @NotNull MueUF, @Nullable MueUF> eIG, MueUF qujk);
    @Override
    public default <T5 extends @Nullable Object>@Nullable Gz1<@NotNull Object, @NotNull Object> pFZa4Oj() {
        throw new RuntimeException();
    }
}

// FILE: Ipc.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface Ipc {
    public abstract @NotNull MueUF haWvRxUY();
    public abstract @Nullable Gz1<@NotNull Ipc, @NotNull Object> tbnqr2a(Gz1<@NotNull Object, @NotNull Ipc> pzuAv, @Nullable Ipc bSxW);
    public abstract @Nullable B9qT5En<@Nullable MueUF, @NotNull MueUF, @Nullable MueUF> taO();
}

// FILE: FshrV0dq.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class FshrV0dq<T10 extends @NotNull Object, T11 extends @NotNull MueUF> implements MueUF, Ipc {
    public final @NotNull T11 uIdXI0IE(@NotNull Object uDcr, @Nullable MueUF eu0OiuqJ, @Nullable T10 oqy08l) {
        throw new RuntimeException();
    }
    public final void fm2p3zzM() {
        throw new RuntimeException();
    }
    @Override
    public final <T5 extends @Nullable Object>@Nullable Gz1<@NotNull Object, @NotNull Object> pFZa4Oj() {
        throw new RuntimeException();
    }
    @Override
    public final @NotNull MueUF haWvRxUY() {
        throw new RuntimeException();
    }
    @Override
    public final @Nullable Gz1<@NotNull Ipc, @NotNull Object> tbnqr2a(Gz1<@NotNull Object, @NotNull Ipc> pzuAv, @Nullable Ipc bSxW) {
        throw new RuntimeException();
    }
    @Override
    public final @Nullable B9qT5En<@Nullable MueUF, @NotNull MueUF, @Nullable MueUF> taO() {
        throw new RuntimeException();
    }
}

// FILE: Dyar.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface Dyar extends MueUF, Ipc {
    public abstract @NotNull Ipc x11IO(@NotNull MueUF bTJvFxKt, @Nullable Dyar byy);
    public abstract @Nullable MueUF qnuuL(@NotNull MueUF z23E, @Nullable Ipc cPE2, @Nullable Ipc etbAS);
    public abstract @Nullable MueUF zq2WcL(MueUF oRpnT, @Nullable FshrV0dq<@NotNull Object, @NotNull Dyar> y3vDQq3u, @Nullable MueUF vhJ1);
    @Override
    public default <T5 extends @Nullable Object>@Nullable Gz1<@NotNull Object, @NotNull Object> pFZa4Oj() {
        throw new RuntimeException();
    }
    @Override
    public default @NotNull MueUF haWvRxUY() {
        throw new RuntimeException();
    }
    @Override
    public default @Nullable Gz1<@NotNull Ipc, @NotNull Object> tbnqr2a(Gz1<@NotNull Object, @NotNull Ipc> pzuAv, @Nullable Ipc bSxW) {
        throw new RuntimeException();
    }
    @Override
    public default @Nullable B9qT5En<@Nullable MueUF, @NotNull MueUF, @Nullable MueUF> taO() {
        throw new RuntimeException();
    }
}

// FILE: Lbq.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface Lbq {
    public abstract @NotNull Dyar lVi9Ql5(Ipc k2CV);
    public abstract @NotNull FshrV0dq<@NotNull Dyar, @NotNull Dyar> t2DGm81(@NotNull B9qT5En<@NotNull Dyar, @NotNull MueUF, @Nullable Dyar> zVvbf, @NotNull MueUF hmImdZb, @Nullable MueUF l2SpbI);
}

// FILE: GVz.kt
public abstract class GVz : FshrV0dq<Dyar, Dyar>() {
    open fun fyG09fhE(): Unit {
        throw RuntimeException()
    }
    // stub
    /*
    override fun uIdXI0IE(uDcr: Any, eu0OiuqJ: MueUF?, oqy08l: Dyar?): Dyar {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun fm2p3zzM(): Unit {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun <T5: Any?>pFZa4Oj(): Gz1<Any, Any>? {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun haWvRxUY(): MueUF {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun tbnqr2a(pzuAv: Gz1<Any, Ipc>, bSxW: Ipc?): Gz1<Ipc, Any>? {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun taO(): B9qT5En<MueUF?, MueUF, MueUF?>? {
        throw RuntimeException()
    }
    */
}

// FILE: X3qlFYm.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class X3qlFYm extends FshrV0dq<@NotNull Object, @NotNull Dyar>  {
    public final <T12 extends @Nullable Object>@Nullable X3qlFYm cW4DIVH(Gz1<@NotNull X3qlFYm, @NotNull Object> jRJ, @NotNull Ipc yaFbW, Gz1<@NotNull X3qlFYm, @NotNull Dyar> jjLq) {
        throw new RuntimeException();
    }
    // stub
    /*
    @Override
    public final @NotNull Dyar uIdXI0IE(@NotNull Object uDcr, @Nullable MueUF eu0OiuqJ, @Nullable Object oqy08l) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    @Override
    public final void fm2p3zzM() {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    @Override
    public final <T5 extends @Nullable Object>@Nullable Gz1<@NotNull Object, @NotNull Object> pFZa4Oj() {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    @Override
    public final @NotNull MueUF haWvRxUY() {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    @Override
    public final @Nullable Gz1<@NotNull Ipc, @NotNull Object> tbnqr2a(Gz1<@NotNull Object, @NotNull Ipc> pzuAv, @Nullable Ipc bSxW) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    @Override
    public final @Nullable B9qT5En<@Nullable MueUF, @NotNull MueUF, @Nullable MueUF> taO() {
        throw new RuntimeException();
    }
    */
}

// FILE: ILR.kt
public class ILR : X3qlFYm(), Ipc, Lbq {
    fun urjNhJYB(xfyx: Dyar): B9qT5En<MueUF?, Dyar, MueUF?>? {
        throw RuntimeException()
    }
    open fun <T13: MueUF>zux2jqhh(hVdal2QJ: GVz, tiK9qngo: T13): B9qT5En<T13, T13, T13?>? {
        throw RuntimeException()
    }
    override open fun lVi9Ql5(k2CV: Ipc): Dyar {
        throw RuntimeException()
    }
    override open fun t2DGm81(zVvbf: B9qT5En<Dyar, MueUF, Dyar?>, hmImdZb: MueUF, l2SpbI: MueUF?): FshrV0dq<Dyar, Dyar> {
        throw RuntimeException()
    }
    // stub
    /*
    override fun haWvRxUY(): MueUF {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun tbnqr2a(pzuAv: Gz1<Any, Ipc>, bSxW: Ipc?): Gz1<Ipc, Any>? {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun taO(): B9qT5En<MueUF?, MueUF, MueUF?>? {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun <T12: Any?>cW4DIVH(jRJ: Gz1<X3qlFYm, Any>, yaFbW: Ipc, jjLq: Gz1<X3qlFYm, Dyar>): X3qlFYm? {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun uIdXI0IE(uDcr: Any, eu0OiuqJ: MueUF?, oqy08l: Any?): Dyar {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun fm2p3zzM(): Unit {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun <T5: Any?>pFZa4Oj(): Gz1<Any, Any>? {
        throw RuntimeException()
    }
    */
}

// FILE: ZRc24m.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class ZRc24m implements Lbq, MueUF, Ipc {
    public <T14 extends @NotNull MueUF>@Nullable Dyar np4q1gcD() {
        throw new RuntimeException();
    }
    public final @Nullable B9qT5En<@Nullable MueUF, @NotNull ZRc24m, @Nullable MueUF> v6OQ(@NotNull MueUF x9e0KZ, @Nullable Dyar raQml) {
        throw new RuntimeException();
    }
    public final @Nullable ILR blgPWIC(@NotNull B9qT5En<@Nullable Dyar, @NotNull ZRc24m, @Nullable Dyar> ei7Fn9Su, B9qT5En<@Nullable MueUF, @NotNull ZRc24m, @Nullable MueUF> lZ0) {
        throw new RuntimeException();
    }
    @Override
    public final @NotNull Dyar lVi9Ql5(Ipc k2CV) {
        throw new RuntimeException();
    }
    @Override
    public @NotNull FshrV0dq<@NotNull Dyar, @NotNull Dyar> t2DGm81(@NotNull B9qT5En<@NotNull Dyar, @NotNull MueUF, @Nullable Dyar> zVvbf, @NotNull MueUF hmImdZb, @Nullable MueUF l2SpbI) {
        throw new RuntimeException();
    }
    @Override
    public <T5 extends @Nullable Object>@Nullable Gz1<@NotNull Object, @NotNull Object> pFZa4Oj() {
        throw new RuntimeException();
    }
    @Override
    public @NotNull MueUF haWvRxUY() {
        throw new RuntimeException();
    }
    @Override
    public @Nullable Gz1<@NotNull Ipc, @NotNull Object> tbnqr2a(Gz1<@NotNull Object, @NotNull Ipc> pzuAv, @Nullable Ipc bSxW) {
        throw new RuntimeException();
    }
    @Override
    public final @Nullable B9qT5En<@Nullable MueUF, @NotNull MueUF, @Nullable MueUF> taO() {
        throw new RuntimeException();
    }
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
}
// FILE: org/jetbrains/annotations/NotNull.java
package org.jetbrains.annotations;

import java.lang.annotation.*;

// org.jetbrains.annotations used in the compiler is version 13, whose @NotNull does not support the TYPE_USE target (version 15 does).
// We're using our own @org.jetbrains.annotations.NotNull for testing purposes.
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
public @interface NotNull {
}
// FILE: org/jetbrains/annotations/Nullable.java
package org.jetbrains.annotations;

import java.lang.annotation.*;

// org.jetbrains.annotations used in the compiler is version 13, whose @Nullable does not support the TYPE_USE target (version 15 does).
// We're using our own @org.jetbrains.annotations.Nullable for testing purposes.
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
public @interface Nullable {
}
// FILE: main.kt

fun box(): String {
	return "OK"
}
fun main(args: Array<String>) {
}
