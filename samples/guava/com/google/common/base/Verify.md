# Class: `Verify`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Verify`

## Description

Static convenience methods that serve the same purpose as Java language <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/language/assert.html">assertions</a>,
 except that they are always enabled. These methods should be used instead of Java assertions
 whenever there is a chance the check may fail "in real life". Example:

 <pre>`Bill bill = remoteService.getLastUnpaidBill();

 // In case bug 12345 happens again we'd rather just die
 Verify.verify(bill.status() == Status.UNPAID,
     "Unexpected bill status: %s", bill.status());
 `</pre>

 <h3>Comparison to alternatives</h3>

 <p><b>Note:</b> In some cases the differences explained below can be subtle. When it's unclear
 which approach to use, <b>don't worry</b> too much about it; just pick something that seems
 reasonable and it will be fine.

 <ul>
   <li>If checking whether the <i>caller</i> has violated your method or constructor's contract
       (such as by passing an invalid argument), use the utilities of the `Preconditions`
       class instead.
   <li>If checking an <i>impossible</i> condition (which <i>cannot</i> happen unless your own
       class or its <i>trusted</i> dependencies is badly broken), this is what ordinary Java
       assertions are for. Note that assertions are not enabled by default; they are essentially
       considered "compiled comments."
   <li>An explicit `if/throw` (as illustrated below) is always acceptable; we still
       recommend using our `VerifyException` exception type. Throwing a plain `RuntimeException` is frowned upon.
   <li>Use of `java.util.Objects.requireNonNull(Object)` is generally discouraged, since
       `verifyNotNull(Object)` and `Preconditions.checkNotNull(Object)` perform the
       same function with more clarity.
 </ul>

 <h3>Warning about performance</h3>

 <p>Remember that parameter values for message construction must all be computed eagerly, and
 autoboxing and varargs array creation may happen as well, even when the verification succeeds and
 the message ends up unneeded. Performance-sensitive verification checks should continue to use
 usual form:

 <pre>`Bill bill = remoteService.getLastUnpaidBill();
 if (bill.status() != Status.UNPAID) {
   throw new VerifyException("Unexpected bill status: " + bill.status());
 `
 }</pre>

 <h3>Only `%s` is supported</h3>

 <p>As with `Preconditions`, `Verify` uses `Strings.lenientFormat` to format
 error message template strings. This only supports the `"%s"` specifier, not the full range
 of `java.util.Formatter` specifiers. However, note that if the number of arguments does not
 match the number of occurrences of `"%s"` in the format string, `Verify` will still
 behave as expected, and will still include all argument values in the error message; the message
 will simply not be formatted exactly as intended.

 <h3>More information</h3>

 See <a href="https://github.com/google/guava/wiki/ConditionalFailuresExplained">Conditional
 failures explained</a> in the Guava User Guide for advice on when this class should be used.
**Since:** 17.0

## Constructors

### `<init>()`

## Methods

### `verify(`boolean` expression)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with no
 message otherwise.
@throws VerifyException if `expression` is `false`
**See:** Preconditions#checkState Preconditions.checkState()

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` errorMessageArgs)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.
@param expression a boolean expression
@param errorMessageTemplate a template for the exception message should the check fail. The
     message is formed by replacing each `%s` placeholder in the template with an
     argument. These are matched by position - the first `%s` gets `errorMessageArgs[0]`, etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
@param errorMessageArgs the arguments to be substituted into the message template. Arguments
     are converted to strings using `String.valueOf(Object)`.
@throws VerifyException if `expression` is `false`
**See:** Preconditions#checkState Preconditions.checkState()

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `char` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `char` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `char` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `char` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `int` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `int` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `int` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `int` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `long` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `long` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `long` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `long` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `char` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `int` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `long` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verify(`boolean` expression, `java.lang.String` errorMessageTemplate, `java.lang.Object` p1, `java.lang.Object` p2, `java.lang.Object` p3, `java.lang.Object` p4)`

**Returns:** `void`

Ensures that `expression` is `true`, throwing a `VerifyException` with a
 custom message otherwise.

 <p>See `verify(boolean, String, Object...)` for details.
**Since:** 23.1 (varargs overload since 17.0)

### `verifyNotNull(`T` reference)`

**Returns:** `T`

Ensures that `reference` is non-null, throwing a `VerifyException` with a default
 message otherwise.
@return `reference`, guaranteed to be non-null, for convenience
@throws VerifyException if `reference` is `null`
**See:** Preconditions#checkNotNull Preconditions.checkNotNull()

### `verifyNotNull(`T` reference, `java.lang.String` errorMessageTemplate, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` errorMessageArgs)`

**Returns:** `T`

Ensures that `reference` is non-null, throwing a `VerifyException` with a custom
 message otherwise.
@param errorMessageTemplate a template for the exception message should the check fail. The
     message is formed by replacing each `%s` placeholder in the template with an
     argument. These are matched by position - the first `%s` gets `errorMessageArgs[0]`, etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
@param errorMessageArgs the arguments to be substituted into the message template. Arguments
     are converted to strings using `String.valueOf(Object)`.
@return `reference`, guaranteed to be non-null, for convenience
@throws VerifyException if `reference` is `null`
**See:** Preconditions#checkNotNull Preconditions.checkNotNull()

