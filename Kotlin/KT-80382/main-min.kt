// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: BFyTghr.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface BFyTghr</*@NotNull*/ T0 extends @Nullable Object> {
    public abstract @NotNull Object tPRgvW(@NotNull T0 aTQFW6);
}

// FILE: YEMgtn.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class YEMgtn</*@NotNull*/ T4 extends @Nullable Object> implements BFyTghr<T4> {
    @Override
    public /*@NotNull*/ Object tPRgvW(@NotNull T4 aTQFW6) {
        throw new RuntimeException();
    }
}

// FILE: LRM3VxJ8.kt
public abstract class LRM3VxJ8 : YEMgtn<Any?>() {
    // stub
    /*
    override open fun tPRgvW(aTQFW6: Any?): Any {
        throw RuntimeException()
    }
    */
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
}
// FILE: main.kt

fun box(): String {
	return "OK"
}
fun main(args: Array<String>) {
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
