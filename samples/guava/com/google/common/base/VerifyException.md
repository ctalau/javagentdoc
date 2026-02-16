# Class: `VerifyException`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.VerifyException`

**Extends:** `java.lang.RuntimeException`

## Description

Exception thrown upon the failure of a <a href="https://github.com/google/guava/wiki/ConditionalFailuresExplained">verification check</a>,
 including those performed by the convenience methods of the {@link Verify} class.
@since 17.0

## Constructors

### `<init>()`

Constructs a {@code VerifyException} with no message.

### `<init>(`java.lang.String` message)`

Constructs a {@code VerifyException} with the message {@code message}.

### `<init>(`java.lang.Throwable` cause)`

Constructs a {@code VerifyException} with the cause {@code cause} and a message that is {@code
 null} if {@code cause} is null, and {@code cause.toString()} otherwise.
@since 19.0

### `<init>(`java.lang.String` message, `java.lang.Throwable` cause)`

Constructs a {@code VerifyException} with the message {@code message} and the cause {@code
 cause}.
@since 19.0

