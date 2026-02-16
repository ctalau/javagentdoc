# Class: `Optional`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Optional`

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

An immutable object that may contain a non-null reference to another object. Each instance of
 this type either contains a non-null reference, or contains nothing (in which case we say that
 the reference is "absent"); it is never said to "contain `null`".

 <p>A non-null `Optional<T>` reference can be used as a replacement for a nullable `T`
 reference. It allows you to represent "a `T` that must be present" and a "a `T` that
 might be absent" as two distinct types in your program, which can aid clarity.

 <p>Some uses of this class include

 <ul>
   <li>As a method return type, as an alternative to returning `null` to indicate that no
       value was available
   <li>To distinguish between "unknown" (for example, not present in a map) and "known to have no
       value" (present in the map, with value `Optional.absent()`)
   <li>To wrap nullable references for storage in a collection that does not support `null`
       (though there are <a href="https://github.com/google/guava/wiki/LivingWithNullHostileCollections">several other
       approaches to this</a> that should be considered first)
 </ul>

 <p>A common alternative to using this class is to find or create a suitable <a href="http://en.wikipedia.org/wiki/Null_Object_pattern">null object</a> for the type in question.

 <p>This class is not intended as a direct analogue of any existing "option" or "maybe" construct
 from other programming environments, though it may bear some similarities.

 <p>An instance of this class is serializable if its reference is absent or is a serializable
 object.

 <p><b>Comparison to `java.util.Optional` (JDK 8 and higher):</b> A new `Optional`
 class was added for Java 8. The two classes are extremely similar, but incompatible (they cannot
 share a common supertype). <i>All</i> known differences are listed either here or with the
 relevant methods below.

 <ul>
   <li>This class is serializable; `java.util.Optional` is not.
   <li>`java.util.Optional` has the additional methods `ifPresent`, `filter`,
       `flatMap`, and `orElseThrow`.
   <li>`java.util` offers the primitive-specialized versions `OptionalInt`, `OptionalLong` and `OptionalDouble`, the use of which is recommended; Guava does not
       have these.
 </ul>

 <p><b>There are no plans to deprecate this class in the foreseeable future.</b> However, we do
 gently recommend that you prefer the new, standard Java class whenever possible.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/UsingAndAvoidingNullExplained#optional">using `Optional`</a>.
@param <T> the type of instance that can be contained. `Optional` is naturally covariant on
     this type, so it is safe to cast an `Optional<T>` to `Optional<S>` for any
     supertype `S` of `T`.
**Author:** Kurt Alfred Kluever
**Author:** Kevin Bourrillion
**Since:** 10.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `absent()`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

Returns an `Optional` instance with no contained reference.

 <p><b>Comparison to `java.util.Optional`:</b> this method is equivalent to Java 8's
 `Optional.empty`.

### `of(`T` reference)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

Returns an `Optional` instance containing the given non-null reference. To have `null` treated as `absent`, use `fromNullable` instead.

 <p><b>Comparison to `java.util.Optional`:</b> no differences.
@throws NullPointerException if `reference` is null

### `fromNullable(`T` nullableReference)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

If `nullableReference` is non-null, returns an `Optional` instance containing that
 reference; otherwise returns `Optional.absent`.

 <p><b>Comparison to `java.util.Optional`:</b> this method is equivalent to Java 8's
 `Optional.ofNullable`.

### `fromJavaUtil(`java.util.Optional<T>` javaUtilOptional)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

Returns the equivalent `com.google.common.base.Optional` value to the given `java.util.Optional`, or `null` if the argument is null.
**Since:** 21.0

### `toJavaUtil([`com.google.common.base.Optional<T>`](./Optional.md) googleOptional)`

**Returns:** `java.util.Optional<T>`

Returns the equivalent `java.util.Optional` value to the given `com.google.common.base.Optional`, or `null` if the argument is null.

 <p>If `googleOptional` is known to be non-null, use `googleOptional.toJavaUtil()`
 instead.

 <p>Unfortunately, the method reference `Optional::toJavaUtil` will not work, because it
 could refer to either the static or instance version of this method. Write out the lambda
 expression `o -> Optional.toJavaUtil(o)` instead.
**Since:** 21.0

### `toJavaUtil()`

**Returns:** `java.util.Optional<T>`

Returns the equivalent `java.util.Optional` value to this optional.

 <p>Unfortunately, the method reference `Optional::toJavaUtil` will not work, because it
 could refer to either the static or instance version of this method. Write out the lambda
 expression `o -> o.toJavaUtil()` instead.
**Since:** 21.0

### `isPresent()`

**Returns:** `boolean`

Returns `true` if this holder contains a (non-null) instance.

 <p><b>Comparison to `java.util.Optional`:</b> no differences.

### `get()`

**Returns:** `T`

Returns the contained instance, which must be present. If the instance might be absent, use
 `or(Object)` or `orNull` instead.

 <p><b>Comparison to `java.util.Optional`:</b> when the value is absent, this method
 throws `IllegalStateException`, whereas the Java 8 counterpart throws `java.util.NoSuchElementException`.
@throws IllegalStateException if the instance is absent (`isPresent` returns `false`); depending on this <i>specific</i> exception type (over the more general `RuntimeException`) is discouraged

### `or(`T` defaultValue)`

**Returns:** `T`

Returns the contained instance if it is present; `defaultValue` otherwise. If no default
 value should be required because the instance is known to be present, use `get()`
 instead. For a default value of `null`, use `orNull`.

 <p>Note about generics: The signature `public T or(T defaultValue)` is overly
 restrictive. However, the ideal signature, `public <S super T> S or(S)`, is not legal
 Java. As a result, some sensible operations involving subtypes are compile errors:

 <pre>`Optional<Integer> optionalInt = getSomeOptionalInt();
 Number value = optionalInt.or(0.5); // error

 FluentIterable<? extends Number> numbers = getSomeNumbers();
 Optional<? extends Number> first = numbers.first();
 Number value = first.or(0.5); // error
 `</pre>

 <p>As a workaround, it is always safe to cast an `Optional<? extends T>` to `Optional<T>`. Casting either of the above example `Optional` instances to `Optional<Number>` (where `Number` is the desired output type) solves the problem:

 <pre>`Optional<Number> optionalInt = (Optional) getSomeOptionalInt();
 Number value = optionalInt.or(0.5); // fine

 FluentIterable<? extends Number> numbers = getSomeNumbers();
 Optional<Number> first = (Optional) numbers.first();
 Number value = first.or(0.5); // fine
 `</pre>

 <p><b>Comparison to `java.util.Optional`:</b> this method is similar to Java 8's `Optional.orElse`, but will not accept `null` as a `defaultValue` (`orNull`
 must be used instead). As a result, the value returned by this method is guaranteed non-null,
 which is not the case for the `java.util` equivalent.

### `or([`com.google.common.base.Optional<? extends T>`](./Optional.md) secondChoice)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

Returns this `Optional` if it has a value present; `secondChoice` otherwise.

 <p><b>Comparison to `java.util.Optional`:</b> this method has no equivalent in Java 8's
 `Optional` class; write `thisOptional.isPresent() ? thisOptional : secondChoice`
 instead.

### `or([`com.google.common.base.Supplier<? extends T>`](./Supplier.md) supplier)`

**Returns:** `T`

Returns the contained instance if it is present; `supplier.get()` otherwise.

 <p><b>Comparison to `java.util.Optional`:</b> this method is similar to Java 8's `Optional.orElseGet`, except when `supplier` returns `null`. In this case this
 method throws an exception, whereas the Java 8 method returns the `null` to the caller.
@throws NullPointerException if this optional's value is absent and the supplier returns `null`

### `orNull()`

**Returns:** `T`

Returns the contained instance if it is present; `null` otherwise. If the instance is
 known to be present, use `get()` instead.

 <p><b>Comparison to `java.util.Optional`:</b> this method is equivalent to Java 8's
 `Optional.orElse(null)`.

### `asSet()`

**Returns:** `java.util.Set<T>`

Returns an immutable singleton `Set` whose only element is the contained instance if it
 is present; an empty immutable `Set` otherwise.

 <p><b>Comparison to `java.util.Optional`:</b> this method has no equivalent in Java 8's
 `Optional` class. However, this common usage:

 <pre>`for (Foo foo : possibleFoo.asSet()) {
   doSomethingWith(foo);
 `
 }</pre>

 ... can be replaced with:

 <pre>`possibleFoo.ifPresent(foo -> doSomethingWith(foo));
 `</pre>

 <p><b>Java 9 users:</b> some use cases can be written with calls to `optional.stream()`.
**Since:** 11.0

### `transform([`com.google.common.base.Function<? super T,V>`](./Function.md) function)`

**Returns:** [`com.google.common.base.Optional<V>`](./Optional.md)

If the instance is present, it is transformed with the given `Function`; otherwise,
 `Optional.absent` is returned.

 <p><b>Comparison to `java.util.Optional`:</b> this method is similar to Java 8's `Optional.map`, except when `function` returns `null`. In this case this method
 throws an exception, whereas the Java 8 method returns `Optional.absent()`.
@throws NullPointerException if the function returns `null`
**Since:** 12.0

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Returns `true` if `object` is an `Optional` instance, and either the
 contained references are equal to each other or both are absent.
 Note that `Optional` instances of differing parameterized types can be equal.

 <p><b>Comparison to `java.util.Optional`:</b> no differences.

### `hashCode()`

**Returns:** `int`

Returns a hash code for this instance.

 <p><b>Comparison to `java.util.Optional`:</b> this class leaves the specific choice of
 hash code unspecified, unlike the Java 8 equivalent.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation for this instance.

 <p><b>Comparison to `java.util.Optional`:</b> this class leaves the specific string
 representation unspecified, unlike the Java 8 equivalent.

### `presentInstances(`java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>>` optionals)`

**Returns:** `java.lang.Iterable<T>`

Returns the value of each present instance from the supplied `optionals`, in order,
 skipping over occurrences of `Optional.absent`. Iterators are unmodifiable and are
 evaluated lazily.

 <p><b>Comparison to `java.util.Optional`:</b> this method has no equivalent in Java 8's
 `Optional` class; use `optionals.stream().filter(Optional::isPresent).map(Optional::get)` instead.

 <p><b>Java 9 users:</b> use `optionals.stream().flatMap(Optional::stream)` instead.
**Since:** 11.0 (generics widened in 13.0)

