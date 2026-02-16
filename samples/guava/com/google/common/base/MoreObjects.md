# Class: `MoreObjects`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.MoreObjects`

## Description

Helper functions that operate on any `Object`, and are not already provided in `java.util.Objects`.

 <p>See the Guava User Guide on <a href="https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained">writing `Object`
 methods with `MoreObjects`</a>.
**Author:** Laurence Gonsalves
**Since:** 18.0 (since 2.0 as `Objects`)

## Constructors

### `<init>()`

## Methods

### `firstNonNull(`T` first, `T` second)`

**Returns:** `T`

Returns the first of two given parameters that is not `null`, if either is, or otherwise
 throws a `NullPointerException`.

 <p>To find the first non-null element in an iterable, use `Iterables.find(iterable,
 Predicates.notNull())`. For varargs, use `Iterables.find(Arrays.asList(a, b, c, ...),
 Predicates.notNull())`, static importing as necessary.

 <p><b>Note:</b> if `first` is represented as an `Optional`, this can be
 accomplished with `Optional.or(Object) first.or(second)`. That approach also allows for
 lazy evaluation of the fallback instance, using `Optional.or(Supplier) first.or(supplier)`.

 <p><b>Java 9 users:</b> use `java.util.Objects.requireNonNullElse(first, second)`
 instead.
@return `first` if it is non-null; otherwise `second` if it is non-null
@throws NullPointerException if both `first` and `second` are null
**Since:** 18.0 (since 3.0 as `Objects.firstNonNull()`).

### `toStringHelper(`java.lang.Object` self)`

**Returns:** [`com.google.common.base.MoreObjects.ToStringHelper`](MoreObjects/ToStringHelper.md)

Creates an instance of `ToStringHelper`.

 <p>This is helpful for implementing `Object.toString()`. Specification by example:

 <pre>`// Returns "ClassName{`"
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
@param self the object to generate the string for (typically `this`), used only for its
     class name
**Since:** 18.0 (since 2.0 as `Objects.toStringHelper()`).

### `toStringHelper(`java.lang.Class<?>` clazz)`

**Returns:** [`com.google.common.base.MoreObjects.ToStringHelper`](MoreObjects/ToStringHelper.md)

Creates an instance of `ToStringHelper` in the same manner as `toStringHelper(Object)`, but using the simple name of `clazz` instead of using an
 instance's `Object.getClass()`.

 <p>Note that in GWT, class names are often obfuscated.
@param clazz the `Class` of the instance
**Since:** 18.0 (since 7.0 as `Objects.toStringHelper()`).

### `toStringHelper(`java.lang.String` className)`

**Returns:** [`com.google.common.base.MoreObjects.ToStringHelper`](MoreObjects/ToStringHelper.md)

Creates an instance of `ToStringHelper` in the same manner as `toStringHelper(Object)`, but using `className` instead of using an instance's `Object.getClass()`.
@param className the name of the instance type
**Since:** 18.0 (since 7.0 as `Objects.toStringHelper()`).

