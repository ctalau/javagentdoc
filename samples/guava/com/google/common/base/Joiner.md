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

### `<init>(String separator)`

**Parameters:**
- `separator` (`java.lang.String`)

### `<init>(Joiner prototype)`

**Parameters:**
- `prototype` ([`com.google.common.base.Joiner`](./Joiner.md))

## Methods

### `on(String separator)`

**Parameters:**
- `separator` (`java.lang.String`)

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

### `on(char separator)`

**Parameters:**
- `separator` (`char`)

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

### `appendTo(A appendable, Iterable<? extends lang@Nullable Object> parts)`

**Parameters:**
- `appendable` (`A`)
- `parts` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

**Returns:** `A`

### `appendTo(A appendable, Iterator<? extends lang@Nullable Object> parts)`

**Parameters:**
- `appendable` (`A`)
- `parts` (`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

**Returns:** `A`

### `appendTo(A appendable, lang@Nullable Object[] parts)`

**Parameters:**
- `appendable` (`A`)
- `parts` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `A`

### `appendTo(A appendable, Object first, Object second, lang@Nullable Object[] rest)`

**Parameters:**
- `appendable` (`A`)
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `A`

### `appendTo(StringBuilder builder, Iterable<? extends lang@Nullable Object> parts)`

Identical to #appendTo(Appendable,
 Iterable), except that it does not throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `parts` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

**Returns:** `java.lang.StringBuilder`

### `appendTo(StringBuilder builder, Iterator<? extends lang@Nullable Object> parts)`

Identical to #appendTo(Appendable,
 Iterable), except that it does not throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `parts` (`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

**Returns:** `java.lang.StringBuilder`

### `appendTo(StringBuilder builder, lang@Nullable Object[] parts)`

Identical to #appendTo(Appendable,
 Iterable), except that it does not throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `parts` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.StringBuilder`

### `appendTo(StringBuilder builder, Object first, Object second, lang@Nullable Object[] rest)`

Identical to #appendTo(Appendable, Object, Object, Object...), except that it does not
 throw IOException.

**Parameters:**
- `builder` (`java.lang.StringBuilder`)
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.StringBuilder`

### `join(Iterable<? extends lang@Nullable Object> parts)`

**Parameters:**
- `parts` (`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

**Returns:** `java.lang.String`

### `join(Iterator<? extends lang@Nullable Object> parts)`

**Parameters:**
- `parts` (`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`)

**Returns:** `java.lang.String`

### `join(lang@Nullable Object[] parts)`

**Parameters:**
- `parts` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.String`

### `join(Object first, Object second, lang@Nullable Object[] rest)`

**Parameters:**
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.String`

### `useForNull(String nullText)`

**Parameters:**
- `nullText` (`java.lang.String`)

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

### `skipNulls()`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

### `withKeyValueSeparator(char keyValueSeparator)`

**Parameters:**
- `keyValueSeparator` (`char`)

**Returns:** `com.google.common.base.Joiner.MapJoiner`

### `withKeyValueSeparator(String keyValueSeparator)`

**Parameters:**
- `keyValueSeparator` (`java.lang.String`)

**Returns:** `com.google.common.base.Joiner.MapJoiner`

### `toString(Object part)`

**Parameters:**
- `part` (`java.lang.Object`)

**Returns:** `java.lang.CharSequence`

### `iterable(Object first, Object second, lang@Nullable Object[] rest)`

**Parameters:**
- `first` (`java.lang.Object`)
- `second` (`java.lang.Object`)
- `rest` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)

**Returns:** `java.lang.Iterable<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`

