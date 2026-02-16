# Class: `Preconditions`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Preconditions`

## Description

Static convenience methods that help a method or constructor check whether it was invoked
 correctly (that is, whether its <i>preconditions</i> were met).

 <p>If the precondition is not met, the `Preconditions` method throws an unchecked exception
 of a specified type, which helps the method in which the exception was thrown communicate that
 its caller has made a mistake. This allows constructs such as

 <pre>`public static double sqrt(double value) {
   if (value < 0) {
     throw new IllegalArgumentException("input is negative: " + value);
   `
   // calculate square root
 }
 }</pre>

 <p>to be replaced with the more compact

 <pre>`public static double sqrt(double value) {
   checkArgument(value >= 0, "input is negative: %s", value);
   // calculate square root
 `
 }</pre>

 <p>so that a hypothetical bad caller of this method, such as:

 <pre>`void exampleBadCaller() {
   double d = sqrt(-1.0);
 `
 }</pre>

 <p>would be flagged as having called `sqrt()` with an illegal argument.

 <h3>Performance</h3>

 <p>Avoid passing message arguments that are expensive to compute; your code will always compute
 them, even though they usually won't be needed. If you have such arguments, use the conventional
 if/throw idiom instead.

 <p>Depending on your message arguments, memory may be allocated for boxing and varargs array
 creation. However, the methods of this class have a large number of overloads that prevent such
 allocations in many common cases.

 <p>The message string is not formatted unless the exception will be thrown, so the cost of the
 string formatting itself should not be a concern.

 <p>As with any performance concerns, you should consider profiling your code (in a production
 environment if possible) before spending a lot of effort on tweaking a particular element.

 <h3>Other types of preconditions</h3>

 <p>Not every type of precondition failure is supported by these methods. Continue to throw
 standard JDK exceptions such as `java.util.NoSuchElementException` or `UnsupportedOperationException` in the situations they are intended for.

 <h3>Non-preconditions</h3>

 <p>It is of course possible to use the methods of this class to check for invalid conditions
 which are <i>not the caller's fault</i>. Doing so is <b>not recommended</b> because it is
 misleading to future readers of the code and of stack traces. See <a href="https://github.com/google/guava/wiki/ConditionalFailuresExplained">Conditional failures
 explained</a> in the Guava User Guide for more advice. Notably, `Verify` offers assertions
 similar to those in this class for non-precondition checks.

 <h3>`java.util.Objects.requireNonNull()`</h3>

 <p>Projects which use `com.google.common` should generally avoid the use of `java.util.Objects.requireNonNull(Object)`. Instead, use whichever of `checkNotNull(Object)` or `Verify.verifyNotNull(Object)` is appropriate to the situation.
 (The same goes for the message-accepting overloads.)

 <h3>Only `%s` is supported</h3>

 <p>`Preconditions` uses `Strings.lenientFormat` to format error message template
 strings. This only supports the `"%s"` specifier, not the full range of `java.util.Formatter` specifiers. However, note that if the number of arguments does not match the
 number of occurrences of `"%s"` in the format string, `Preconditions` will still
 behave as expected, and will still include all argument values in the error message; the message
 will simply not be formatted exactly as intended.

 <h3>More information</h3>

 <p>See the Guava User Guide on <a href="https://github.com/google/guava/wiki/PreconditionsExplained">using `Preconditions`</a>.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `checkArgument(`boolean` expression)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.
@param expression a boolean expression
@throws IllegalArgumentException if `expression` is false

### `checkArgument(`boolean` expression, `java.lang.Object` errorMessage)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.
@param expression a boolean expression
@param errorMessage the exception message to use if the check fails; will be converted to a
     string using `String.valueOf(Object)`
@throws IllegalArgumentException if `expression` is false

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` errorMessageArgs)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.
@param expression a boolean expression
@param errorMessageTemplate a template for the exception message should the check fail. The
     message is formed by replacing each `%s` placeholder in the template with an
     argument. These are matched by position - the first `%s` gets `errorMessageArgs[0]`, etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
@param errorMessageArgs the arguments to be substituted into the message template. Arguments
     are converted to strings using `String.valueOf(Object)`.
@throws IllegalArgumentException if `expression` is false

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkArgument(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3, `java.lang.Object` p4)`

**Returns:** `void`

Ensures the truth of an expression involving one or more parameters to the calling method.

 <p>See `checkArgument(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.
@param expression a boolean expression
@throws IllegalStateException if `expression` is false
**See:** Verify#verify Verify.verify()

### `checkState(`boolean` expression, `java.lang.Object` errorMessage)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.
@param expression a boolean expression
@param errorMessage the exception message to use if the check fails; will be converted to a
     string using `String.valueOf(Object)`
@throws IllegalStateException if `expression` is false
**See:** Verify#verify Verify.verify()

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` errorMessageArgs)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.
@param expression a boolean expression
@param errorMessageTemplate a template for the exception message should the check fail. The
     message is formed by replacing each `%s` placeholder in the template with an
     argument. These are matched by position - the first `%s` gets `errorMessageArgs[0]`, etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
@param errorMessageArgs the arguments to be substituted into the message template. Arguments
     are converted to strings using `String.valueOf(Object)`.
@throws IllegalStateException if `expression` is false
**See:** Verify#verify Verify.verify()

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `char` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `int` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `long` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkState(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3, `java.lang.Object` p4)`

**Returns:** `void`

Ensures the truth of an expression involving the state of the calling instance, but not
 involving any parameters to the calling method.

 <p>See `checkState(boolean, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.
@param reference an object reference
@return the non-null reference that was validated
@throws NullPointerException if `reference` is null
**See:** Verify#verifyNotNull Verify.verifyNotNull()

### `checkNotNull(`T` reference, `java.lang.Object` errorMessage)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.
@param reference an object reference
@param errorMessage the exception message to use if the check fails; will be converted to a
     string using `String.valueOf(Object)`
@return the non-null reference that was validated
@throws NullPointerException if `reference` is null
**See:** Verify#verifyNotNull Verify.verifyNotNull()

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` errorMessageArgs)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.
@param reference an object reference
@param errorMessageTemplate a template for the exception message should the check fail. The
     message is formed by replacing each `%s` placeholder in the template with an
     argument. These are matched by position - the first `%s` gets `errorMessageArgs[0]`, etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
@param errorMessageArgs the arguments to be substituted into the message template. Arguments
     are converted to strings using `String.valueOf(Object)`.
@return the non-null reference that was validated
@throws NullPointerException if `reference` is null
**See:** Verify#verifyNotNull Verify.verifyNotNull()

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `char` p1)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `int` p1)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `long` p1)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `char` p1, `char` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `char` p1, `int` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `char` p1, `long` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `char` p1, `java.lang.Object` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `int` p1, `char` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `int` p1, `int` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `int` p1, `long` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `int` p1, `java.lang.Object` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `long` p1, `char` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `long` p1, `int` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `long` p1, `long` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `long` p1, `java.lang.Object` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `char` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `int` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `long` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3, `java.lang.Object` p4)`

**Returns:** `T`

Ensures that an object reference passed as a parameter to the calling method is not null.

 <p>See `checkNotNull(Object, String, Object...)` for details.
**Since:** 20.0 (varargs overload since 2.0)

### `checkElementIndex(`int` index, `int` size)`

**Returns:** `int`

Ensures that `index` specifies a valid <i>element</i> in an array, list or string of size
 `size`. An element index may range from zero, inclusive, to `size`, exclusive.
@param index a user-supplied index identifying an element of an array, list or string
@param size the size of that array, list or string
@return the value of `index`
@throws IndexOutOfBoundsException if `index` is negative or is not less than `size`
@throws IllegalArgumentException if `size` is negative

### `checkElementIndex(`int` index, `int` size, `java.lang.String` desc)`

**Returns:** `int`

Ensures that `index` specifies a valid <i>element</i> in an array, list or string of size
 `size`. An element index may range from zero, inclusive, to `size`, exclusive.
@param index a user-supplied index identifying an element of an array, list or string
@param size the size of that array, list or string
@param desc the text to use to describe this index in an error message
@return the value of `index`
@throws IndexOutOfBoundsException if `index` is negative or is not less than `size`
@throws IllegalArgumentException if `size` is negative

### `badElementIndex(`int` index, `int` size, `java.lang.String` desc)`

**Returns:** `java.lang.String`

### `checkPositionIndex(`int` index, `int` size)`

**Returns:** `int`

Ensures that `index` specifies a valid <i>position</i> in an array, list or string of
 size `size`. A position index may range from zero to `size`, inclusive.
@param index a user-supplied index identifying a position in an array, list or string
@param size the size of that array, list or string
@return the value of `index`
@throws IndexOutOfBoundsException if `index` is negative or is greater than `size`
@throws IllegalArgumentException if `size` is negative

### `checkPositionIndex(`int` index, `int` size, `java.lang.String` desc)`

**Returns:** `int`

Ensures that `index` specifies a valid <i>position</i> in an array, list or string of
 size `size`. A position index may range from zero to `size`, inclusive.
@param index a user-supplied index identifying a position in an array, list or string
@param size the size of that array, list or string
@param desc the text to use to describe this index in an error message
@return the value of `index`
@throws IndexOutOfBoundsException if `index` is negative or is greater than `size`
@throws IllegalArgumentException if `size` is negative

### `badPositionIndex(`int` index, `int` size, `java.lang.String` desc)`

**Returns:** `java.lang.String`

### `checkPositionIndexes(`int` start, `int` end, `int` size)`

**Returns:** `void`

Ensures that `start` and `end` specify valid <i>positions</i> in an array, list or
 string of size `size`, and are in order. A position index may range from zero to `size`, inclusive.
@param start a user-supplied index identifying a starting position in an array, list or string
@param end a user-supplied index identifying an ending position in an array, list or string
@param size the size of that array, list or string
@throws IndexOutOfBoundsException if either index is negative or is greater than `size`,
     or if `end` is less than `start`
@throws IllegalArgumentException if `size` is negative

### `badPositionIndexes(`int` start, `int` end, `int` size)`

**Returns:** `java.lang.String`

