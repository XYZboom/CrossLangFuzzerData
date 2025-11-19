// JVM_DEFAULT_MODE: enable
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: FLnUM.kt
public abstract class FLnUM<T0 : Any> {
    abstract open fun <T3: Any, T4: T0>weF(): T3
}

// FILE: EHPcFDu.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class EHPcFDu</*@NotNull*/ T5 extends @Nullable Object> extends FLnUM<T5>  {
    public <T3 extends @NotNull Object, T4 extends @NotNull T5>@NotNull T3 weF() {
        throw new RuntimeException();
    }
}

// FILE: Iu16e8WD.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class Iu16e8WD extends EHPcFDu<Iu16e8WD>  {
    // stub
    /*
    public <T3 extends @NotNull Object, T4 extends @NotNull Iu16e8WD>@NotNull T3 weF() {
        throw new RuntimeException();
    }
    */
}

// FILE: Koepu6.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class Koepu6 {
}

// FILE: T4Nn8.kt
public abstract class T4Nn8 : Iu16e8WD() {
    override open fun <T3: Any, T4: Iu16e8WD>weF(): T3 {
        throw RuntimeException()
    }
}

// FILE: I5i.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class I5i extends Iu16e8WD  {
    public <T3 extends /*@NotNull*/ Object, T4 extends /*@NotNull*/ Iu16e8WD>@NotNull T3 weF() {
        throw new RuntimeException();
    }
}

// FILE: RmR6Y.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class RmR6Y {
}

// FILE: Kxr8qr.kt
public abstract class Kxr8qr : EHPcFDu<I5i>() {
    // stub
    /*
    override open fun <T3: Any, T4: I5i>weF(): T3 {
        throw RuntimeException()
    }
    */
}

// FILE: Shj.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class Shj {
}

// FILE: EkKLD.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class EkKLD extends RmR6Y  {
}

// FILE: Gj3.kt
public interface Gj3 {
}

// FILE: C73POJ.kt
public abstract class C73POJ : I5i(), Gj3 {
    // stub
    /*
    override open fun <T3: Any, T4: Iu16e8WD>weF(): T3 {
        throw RuntimeException()
    }
    */
}

// FILE: ML4Ck534.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class ML4Ck534</*@NotNull*/ T12 extends @NotNull Kxr8qr> extends RmR6Y implements Gj3 {
}

// FILE: IDbo.kt
public interface IDbo : Gj3 {
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
