# Class: `Joiner`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Joiner`

## Description

An object which joins pieces of text (specified as an array, `Iterable`, varargs or even a
 `Map`) with a separator. It either appends the results to an `Appendable` or returns
 them as a `String`. Example:

 <pre>`Joiner joiner = Joiner.on("; ").skipNulls();
  . . .
 return joiner.join("Harry", null, "Ron", "Hermione");
 `</pre>

 <p>This returns the string `"Harry; Ron; Hermione"`. Note that all input elements are
 converted to strings using `Object.toString()` before being appended.

 <p>If neither `skipNulls()` nor `useForNull(String)` is specified, the joining
 methods will throw `NullPointerException` if any given element is null.

 <p><b>Warning: joiner instances are always immutable</b>; a configuration method such as `useForNull` has no effect on the instance it is invoked on! You must store and use the new joiner
 instance returned by the method. This makes joiners thread-safe, and safe to store as `static final` constants.

 <pre>`// Bad! Do not do this!
 Joiner joiner = Joiner.on(',');
 joiner.skipNulls(); // does nothing!
 return joiner.join("wrong", null, "wrong");
 `</pre>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/StringsExplained#joiner">`Joiner`</a>.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Fields

### `separator`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` separator)`

### `<init>([`com.google.common.base.Joiner`](./Joiner.md) prototype)`

## Methods

### `on(`java.lang.String` separator)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner which automatically places `separator` between consecutive elements.

### `on(`char` separator)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner which automatically places `separator` between consecutive elements.

### `appendTo(`A` appendable, `java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `A`

Appends the string representation of each of `parts`, using the previously configured
 separator between each, to `appendable`.

### `appendTo(`A` appendable, `java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `A`

Appends the string representation of each of `parts`, using the previously configured
 separator between each, to `appendable`.
**Since:** 11.0

### `appendTo(`A` appendable, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` parts)`

**Returns:** `A`

Appends the string representation of each of `parts`, using the previously configured
 separator between each, to `appendable`.

### `appendTo(`A` appendable, `java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `A`

Appends to `appendable` the string representation of each of the remaining arguments.

### `appendTo(`java.lang.StringBuilder` builder, `java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `java.lang.StringBuilder`

Appends the string representation of each of `parts`, using the previously configured
 separator between each, to `builder`. Identical to `appendTo(Appendable,
 Iterable)`, except that it does not throw `IOException`.

### `appendTo(`java.lang.StringBuilder` builder, `java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `java.lang.StringBuilder`

Appends the string representation of each of `parts`, using the previously configured
 separator between each, to `builder`. Identical to `appendTo(Appendable,
 Iterable)`, except that it does not throw `IOException`.
**Since:** 11.0

### `appendTo(`java.lang.StringBuilder` builder, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` parts)`

**Returns:** `java.lang.StringBuilder`

Appends the string representation of each of `parts`, using the previously configured
 separator between each, to `builder`. Identical to `appendTo(Appendable,
 Iterable)`, except that it does not throw `IOException`.

### `appendTo(`java.lang.StringBuilder` builder, `java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `java.lang.StringBuilder`

Appends to `builder` the string representation of each of the remaining arguments.
 Identical to `appendTo(Appendable, Object, Object, Object...)`, except that it does not
 throw `IOException`.

### `join(`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each of `parts`, using the
 previously configured separator between each.

### `join(`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each of `parts`, using the
 previously configured separator between each.
**Since:** 11.0

### `join(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` parts)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each of `parts`, using the
 previously configured separator between each.

### `join(`java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each argument, using the previously
 configured separator between each.

### `useForNull(`java.lang.String` nullText)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner with the same behavior as this one, except automatically substituting `nullText` for any provided null elements.

### `skipNulls()`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner with the same behavior as this joiner, except automatically skipping over any
 provided null elements.

### `withKeyValueSeparator(`char` keyValueSeparator)`

**Returns:** [`com.google.common.base.Joiner.MapJoiner`](Joiner/MapJoiner.md)

Returns a `MapJoiner` using the given key-value separator, and the same configuration as
 this `Joiner` otherwise.
**Since:** 20.0

### `withKeyValueSeparator(`java.lang.String` keyValueSeparator)`

**Returns:** [`com.google.common.base.Joiner.MapJoiner`](Joiner/MapJoiner.md)

Returns a `MapJoiner` using the given key-value separator, and the same configuration as
 this `Joiner` otherwise.

### `toString(`java.lang.Object` part)`

**Returns:** `java.lang.CharSequence`

### `iterable(`java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `java.lang.Iterable<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`

