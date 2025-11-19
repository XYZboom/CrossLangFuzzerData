// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: MueUF.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface MueUF {
}

// FILE: B9qT5En.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface B9qT5En<T6 extends @Nullable MueUF, T8 extends T6> {
}

// FILE: Dyar.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface Dyar extends MueUF {
}

// FILE: ILR.kt
public class ILR {
    open fun t2DGm81(zVvbf: B9qT5En<Dyar, Dyar?>): Any {
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
