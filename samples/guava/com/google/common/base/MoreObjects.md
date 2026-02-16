# Class: `MoreObjects`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.MoreObjects`

## Description

Helper functions that operate on any {@code Object}, and are not already provided in {@link java.util.Objects}.

 <p>See the Guava User Guide on <a href="https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained">writing {@code Object}
 methods with {@code MoreObjects}</a>.
@author Laurence Gonsalves
@since 18.0 (since 2.0 as {@code Objects})

## Constructors

### `<init>()`

## Methods

### `firstNonNull([`T`](T.md) first, [`T`](T.md) second)`

**Returns:** [`T`](T.md)

Returns the first of two given parameters that is not {@code null}, if either is, or otherwise
 throws a {@link NullPointerException}.

 <p>To find the first non-null element in an iterable, use {@code Iterables.find(iterable,
 Predicates.notNull())}. For varargs, use {@code Iterables.find(Arrays.asList(a, b, c, ...),
 Predicates.notNull())}, static importing as necessary.

 <p><b>Note:</b> if {@code first} is represented as an {@link Optional}, this can be
 accomplished with {@link Optional#or(Object) first.or(second)}. That approach also allows for
 lazy evaluation of the fallback instance, using {@link Optional#or(Supplier) first.or(supplier)}.

 <p><b>Java 9 users:</b> use {@code java.util.Objects.requireNonNullElse(first, second)}
 instead.
@return {@code first} if it is non-null; otherwise {@code second} if it is non-null
@throws NullPointerException if both {@code first} and {@code second} are null
@since 18.0 (since 3.0 as {@code Objects.firstNonNull()}).

### `toStringHelper(`java.lang.Object` self)`

**Returns:** [`com.google.common.base.MoreObjects.ToStringHelper`](MoreObjects/ToStringHelper.md)

Creates an instance of {@link ToStringHelper}.

 <p>This is helpful for implementing {@link Object#toString()}. Specification by example:

 <pre>{@code
 // Returns "ClassName{}"
 MoreObjects.toStringHelper(this)
     .toString();

 // Returns "ClassName{x=1}"
 MoreObjects.toStringHelper(this)
     .add("x", 1)
     .toString();

 // Returns "MyObject{x=1}"
 MoreObjects.toStringHelper("MyObject")
     .add("x", 1)
     .toString();

 // Returns "ClassName{x=1, y=foo}"
 MoreObjects.toStringHelper(this)
     .add("x", 1)
     .add("y", "foo")
     .toString();

 // Returns "ClassName{x=1}"
 MoreObjects.toStringHelper(this)
     .omitNullValues()
     .add("x", 1)
     .add("y", null)
     .toString();
 }</pre>

 <p>Note that in GWT, class names are often obfuscated.
@param self the object to generate the string for (typically {@code this}), used only for its
     class name
@since 18.0 (since 2.0 as {@code Objects.toStringHelper()}).

### `toStringHelper(`java.lang.Class<?>` clazz)`

**Returns:** [`com.google.common.base.MoreObjects.ToStringHelper`](MoreObjects/ToStringHelper.md)

Creates an instance of {@link ToStringHelper} in the same manner as {@link #toStringHelper(Object)}, but using the simple name of {@code clazz} instead of using an
 instance's {@link Object#getClass()}.

 <p>Note that in GWT, class names are often obfuscated.
@param clazz the {@link Class} of the instance
@since 18.0 (since 7.0 as {@code Objects.toStringHelper()}).

### `toStringHelper(`java.lang.String` className)`

**Returns:** [`com.google.common.base.MoreObjects.ToStringHelper`](MoreObjects/ToStringHelper.md)

Creates an instance of {@link ToStringHelper} in the same manner as {@link #toStringHelper(Object)}, but using {@code className} instead of using an instance's {@link Object#getClass()}.
@param className the name of the instance type
@since 18.0 (since 7.0 as {@code Objects.toStringHelper()}).

