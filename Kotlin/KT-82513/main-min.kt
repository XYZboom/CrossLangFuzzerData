// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: L5ODKl.kt
public abstract class L5ODKl {
}

// FILE: S2dTDrL.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface S2dTDrL<T2 extends @Nullable Object> {
    public abstract T2 me5584I(T2 kEw);
}

// FILE: A6Y.kt
public class A6Y : S2dTDrL<L5ODKl> {
    override fun me5584I(kEw: L5ODKl?): L5ODKl {
        throw RuntimeException()
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
