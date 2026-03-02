# Class: `Joiner`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Joiner`

## Description

It either appends the results to an Appendable or returns
 them as a String. Example:

 

```

 Joiner joiner = Joiner.on("; ").skipNulls();
  . . .
 return joiner.join("Harry", null, "Ron", "Hermione");
 
```


 
This returns the string "Harry; Ron; Hermione". Note that all input elements are
 converted to strings using Object#toString() before being appended.

 
If neither #skipNulls() nor #useForNull(String) is specified, the joining
 methods will throw NullPointerException if any given element is null.

 
**Warning: joiner instances are always immutable**; a configuration method such as 
 useForNull has no effect on the instance it is invoked on! You must store and use the new joiner
 instance returned by the method. This makes joiners thread-safe, and safe to store as 
 static final constants.

 

```

 // Bad! Do not do this!
 Joiner joiner = Joiner.on(',');
 joiner.skipNulls(); // does nothing!
 return joiner.join("wrong", null, "wrong");
 
```


 
See the Guava User Guide article on [Joiner](https://github.com/google/guava/wiki/StringsExplained#joiner).

## Fields

### `separator`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String separator)`

**Parameters:**
- `separator` (`java.lang.String`)

### `<init>(com.google.common.base.Joiner prototype)`

**Parameters:**
- `prototype` ([`com.google.common.base.Joiner`](./Joiner.md))

## Methods

### `on(java.lang.String separator)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

**Parameters:**
- `separator` (`java.lang.String`)

### `on(char separator)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

**Parameters:**
- `separator` (`char`)

### `appendTo(A appendable, java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> parts)`

**Returns:** `A`

**Parameters:**
- `appendable` (`A`)
- `parts` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

### `appendTo(A appendable, java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> parts)`

**Returns:** `A`

**Parameters:**
- `appendable` (`A`)
- `parts` (`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

### `appendTo(A appendable, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] parts)`

**Returns:** `A`

**Parameters:**
- `appendable` (`A`)
- `parts` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `appendTo(A appendable, java.lang.Object first, java.lang.Object second, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] rest)`

**Returns:** `A`

**Parameters:**
- `appendable` (`A`)
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `appendTo(java.lang.StringBuilder builder, java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> parts)`

**Returns:** `java.lang.StringBuilder`

Identical to #appendTo(Appendable,
 Iterable), except that it does not throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `parts` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

### `appendTo(java.lang.StringBuilder builder, java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> parts)`

**Returns:** `java.lang.StringBuilder`

Identical to #appendTo(Appendable,
 Iterable), except that it does not throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `parts` (`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

### `appendTo(java.lang.StringBuilder builder, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] parts)`

**Returns:** `java.lang.StringBuilder`

Identical to #appendTo(Appendable,
 Iterable), except that it does not throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `parts` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `appendTo(java.lang.StringBuilder builder, java.lang.Object first, java.lang.Object second, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] rest)`

**Returns:** `java.lang.StringBuilder`

Identical to #appendTo(Appendable, Object, Object, Object...), except that it does not
 throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `join(java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> parts)`

**Returns:** `java.lang.String`

**Parameters:**
- `parts` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

### `join(java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object> parts)`

**Returns:** `java.lang.String`

**Parameters:**
- `parts` (`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

### `join(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] parts)`

**Returns:** `java.lang.String`

**Parameters:**
- `parts` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `join(java.lang.Object first, java.lang.Object second, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] rest)`

**Returns:** `java.lang.String`

**Parameters:**
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

### `useForNull(java.lang.String nullText)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

**Parameters:**
- `nullText` (`java.lang.String`)

### `skipNulls()`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

### `withKeyValueSeparator(char keyValueSeparator)`

**Returns:** `com.google.common.base.Joiner.MapJoiner`

**Parameters:**
- `keyValueSeparator` (`char`)

### `withKeyValueSeparator(java.lang.String keyValueSeparator)`

**Returns:** `com.google.common.base.Joiner.MapJoiner`

**Parameters:**
- `keyValueSeparator` (`java.lang.String`)

### `toString(java.lang.Object part)`

**Returns:** `java.lang.CharSequence`

**Parameters:**
- `part` (`java.lang.Object`)

### `iterable(java.lang.Object first, java.lang.Object second, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] rest)`

**Returns:** `java.lang.Iterable<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`

**Parameters:**
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

