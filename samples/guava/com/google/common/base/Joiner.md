# Class: `Joiner`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Joiner`

## Description

An object which joins pieces of text (specified as an array, {@link Iterable}, varargs or even a
 {@link Map}) with a separator. It either appends the results to an {@link Appendable} or returns
 them as a {@link String}. Example:

 <pre>{@code
 Joiner joiner = Joiner.on("; ").skipNulls();
  . . .
 return joiner.join("Harry", null, "Ron", "Hermione");
 }</pre>

 <p>This returns the string {@code "Harry; Ron; Hermione"}. Note that all input elements are
 converted to strings using {@link Object#toString()} before being appended.

 <p>If neither {@link #skipNulls()} nor {@link #useForNull(String)} is specified, the joining
 methods will throw {@link NullPointerException} if any given element is null.

 <p><b>Warning: joiner instances are always immutable</b>; a configuration method such as {@code
 useForNull} has no effect on the instance it is invoked on! You must store and use the new joiner
 instance returned by the method. This makes joiners thread-safe, and safe to store as {@code
 static final} constants.

 <pre>{@code
 // Bad! Do not do this!
 Joiner joiner = Joiner.on(',');
 joiner.skipNulls(); // does nothing!
 return joiner.join("wrong", null, "wrong");
 }</pre>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/StringsExplained#joiner">{@code Joiner}</a>.
@author Kevin Bourrillion
@since 2.0

## Fields

### `separator`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` separator)`

### `<init>([`com.google.common.base.Joiner`](./Joiner.md) prototype)`

## Methods

### `on(`java.lang.String` separator)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner which automatically places {@code separator} between consecutive elements.

### `on(`char` separator)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner which automatically places {@code separator} between consecutive elements.

### `appendTo([`A`](A.md) appendable, `java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** [`A`](A.md)

Appends the string representation of each of {@code parts}, using the previously configured
 separator between each, to {@code appendable}.

### `appendTo([`A`](A.md) appendable, [`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](../../../../java/util/Iterator.md) parts)`

**Returns:** [`A`](A.md)

Appends the string representation of each of {@code parts}, using the previously configured
 separator between each, to {@code appendable}.
@since 11.0

### `appendTo([`A`](A.md) appendable, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` parts)`

**Returns:** [`A`](A.md)

Appends the string representation of each of {@code parts}, using the previously configured
 separator between each, to {@code appendable}.

### `appendTo([`A`](A.md) appendable, `java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** [`A`](A.md)

Appends to {@code appendable} the string representation of each of the remaining arguments.

### `appendTo(`java.lang.StringBuilder` builder, `java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `java.lang.StringBuilder`

Appends the string representation of each of {@code parts}, using the previously configured
 separator between each, to {@code builder}. Identical to {@link #appendTo(Appendable,
 Iterable)}, except that it does not throw {@link IOException}.

### `appendTo(`java.lang.StringBuilder` builder, [`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](../../../../java/util/Iterator.md) parts)`

**Returns:** `java.lang.StringBuilder`

Appends the string representation of each of {@code parts}, using the previously configured
 separator between each, to {@code builder}. Identical to {@link #appendTo(Appendable,
 Iterable)}, except that it does not throw {@link IOException}.
@since 11.0

### `appendTo(`java.lang.StringBuilder` builder, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` parts)`

**Returns:** `java.lang.StringBuilder`

Appends the string representation of each of {@code parts}, using the previously configured
 separator between each, to {@code builder}. Identical to {@link #appendTo(Appendable,
 Iterable)}, except that it does not throw {@link IOException}.

### `appendTo(`java.lang.StringBuilder` builder, `java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `java.lang.StringBuilder`

Appends to {@code builder} the string representation of each of the remaining arguments.
 Identical to {@link #appendTo(Appendable, Object, Object, Object...)}, except that it does not
 throw {@link IOException}.

### `join(`java.lang.Iterable<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>` parts)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each of {@code parts}, using the
 previously configured separator between each.

### `join([`java.util.Iterator<? extends java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](../../../../java/util/Iterator.md) parts)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each of {@code parts}, using the
 previously configured separator between each.
@since 11.0

### `join(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` parts)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each of {@code parts}, using the
 previously configured separator between each.

### `join(`java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `java.lang.String`

Returns a string containing the string representation of each argument, using the previously
 configured separator between each.

### `useForNull(`java.lang.String` nullText)`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner with the same behavior as this one, except automatically substituting {@code
 nullText} for any provided null elements.

### `skipNulls()`

**Returns:** [`com.google.common.base.Joiner`](./Joiner.md)

Returns a joiner with the same behavior as this joiner, except automatically skipping over any
 provided null elements.

### `withKeyValueSeparator(`char` keyValueSeparator)`

**Returns:** [`com.google.common.base.Joiner.MapJoiner`](Joiner/MapJoiner.md)

Returns a {@code MapJoiner} using the given key-value separator, and the same configuration as
 this {@code Joiner} otherwise.
@since 20.0

### `withKeyValueSeparator(`java.lang.String` keyValueSeparator)`

**Returns:** [`com.google.common.base.Joiner.MapJoiner`](Joiner/MapJoiner.md)

Returns a {@code MapJoiner} using the given key-value separator, and the same configuration as
 this {@code Joiner} otherwise.

### `toString(`java.lang.Object` part)`

**Returns:** `java.lang.CharSequence`

### `iterable(`java.lang.Object` first, `java.lang.Object` second, `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` rest)`

**Returns:** `java.lang.Iterable<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`

