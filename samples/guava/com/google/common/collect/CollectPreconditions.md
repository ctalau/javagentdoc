# Class: `CollectPreconditions`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CollectPreconditions`

## Description

Precondition checks useful in collection implementations.

## Constructors

### `<init>()`

## Methods

### `checkEntryNotNull(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `void`

### `checkNonnegative(`int` value, `java.lang.String` name)`

**Returns:** `int`

### `checkNonnegative(`long` value, `java.lang.String` name)`

**Returns:** `long`

### `checkPositive(`int` value, `java.lang.String` name)`

**Returns:** `void`

### `checkRemove(`boolean` canRemove)`

**Returns:** `void`

Precondition tester for {@code Iterator.remove()} that throws an exception with a consistent
 error message.

