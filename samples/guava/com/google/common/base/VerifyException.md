# Class: `VerifyException`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.VerifyException`

**Extends:** `java.lang.RuntimeException`

## Description

Exception thrown upon the failure of a <a href="https://github.com/google/guava/wiki/ConditionalFailuresExplained">verification check</a>,
 including those performed by the convenience methods of the `Verify` class.
**Since:** 17.0

## Constructors

### `<init>()`

Constructs a `VerifyException` with no message.

### `<init>(`java.lang.String` message)`

Constructs a `VerifyException` with the message `message`.

### `<init>(`java.lang.Throwable` cause)`

Constructs a `VerifyException` with the cause `cause` and a message that is `null` if `cause` is null, and `cause.toString()` otherwise.
**Since:** 19.0

### `<init>(`java.lang.String` message, `java.lang.Throwable` cause)`

Constructs a `VerifyException` with the message `message` and the cause `cause`.
**Since:** 19.0

