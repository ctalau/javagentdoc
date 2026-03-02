# Class: `Optional`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Optional`

**Implements:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Each instance of
 this type either contains a non-null reference, or contains nothing (in which case we say that
 the reference is "absent"); it is never said to "contain null".

 
A non-null Optional<T> reference can be used as a replacement for a nullable T
 reference. It allows you to represent "a T that must be present" and a "a T that
 might be absent" as two distinct types in your program, which can aid clarity.

 
Some uses of this class include

 

   - As a method return type, as an alternative to returning null to indicate that no
       value was available
   - To distinguish between "unknown" (for example, not present in a map) and "known to have no
       value" (present in the map, with value Optional.absent())
   - To wrap nullable references for storage in a collection that does not support null
       (though there are [several other
       approaches to this](https://github.com/google/guava/wiki/LivingWithNullHostileCollections) that should be considered first)
 


 
A common alternative to using this class is to find or create a suitable [null object](http://en.wikipedia.org/wiki/Null_Object_pattern) for the type in question.

 
This class is not intended as a direct analogue of any existing "option" or "maybe" construct
 from other programming environments, though it may bear some similarities.

 
An instance of this class is serializable if its reference is absent or is a serializable
 object.

 
**Comparison to java.util.Optional (JDK 8 and higher):** A new Optional
 class was added for Java 8. The two classes are extremely similar, but incompatible (they cannot
 share a common supertype). *All* known differences are listed either here or with the
 relevant methods below.

 

   - This class is serializable; java.util.Optional is not.
   - java.util.Optional has the additional methods ifPresent, filter,
       flatMap, and orElseThrow.
   - java.util offers the primitive-specialized versions OptionalInt, 
       OptionalLong and OptionalDouble, the use of which is recommended; Guava does not
       have these.
 


 
**There are no plans to deprecate this class in the foreseeable future.** However, we do
 gently recommend that you prefer the new, standard Java class whenever possible.

 
See the Guava User Guide article on [using 
 Optional](https://github.com/google/guava/wiki/UsingAndAvoidingNullExplained#optional).

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `absent()`

**Comparison to java.util.Optional:** this method is equivalent to Java 8's
 Optional.empty.

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `of(T reference)`

To have 
 null treated as #absent, use #fromNullable instead.

 
**Comparison to java.util.Optional:** no differences.

**Parameters:**
- `reference` (`T`)

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `fromNullable(T nullableReference)`

**Comparison to java.util.Optional:** this method is equivalent to Java 8's
 Optional.ofNullable.

**Parameters:**
- `nullableReference` (`T`)

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `fromJavaUtil(Optional<T> javaUtilOptional)`

**Parameters:**
- `javaUtilOptional` (`java.util.Optional<T>`)

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `toJavaUtil(Optional<T> googleOptional)`

If googleOptional is known to be non-null, use googleOptional.toJavaUtil()
 instead.

 
Unfortunately, the method reference Optional::toJavaUtil will not work, because it
 could refer to either the static or instance version of this method. Write out the lambda
 expression o -> Optional.toJavaUtil(o) instead.

**Parameters:**
- `googleOptional` ([`com.google.common.base.Optional<T>`](./Optional.md))

**Returns:** `java.util.Optional<T>`

### `toJavaUtil()`

Unfortunately, the method reference Optional::toJavaUtil will not work, because it
 could refer to either the static or instance version of this method. Write out the lambda
 expression o -> o.toJavaUtil() instead.

**Returns:** `java.util.Optional<T>`

### `isPresent()`

**Comparison to java.util.Optional:** no differences.

**Returns:** `boolean`

### `get()`

If the instance might be absent, use
 #or(Object) or #orNull instead.

 
**Comparison to java.util.Optional:** when the value is absent, this method
 throws IllegalStateException, whereas the Java 8 counterpart throws NoSuchElementException.

**Returns:** `T`

### `or(T defaultValue)`

If no default
 value should be required because the instance is known to be present, use #get()
 instead. For a default value of null, use #orNull.

 
Note about generics: The signature public T or(T defaultValue) is overly
 restrictive. However, the ideal signature, public <S super T> S or(S), is not legal
 Java. As a result, some sensible operations involving subtypes are compile errors:

 

```

 Optional<Integer> optionalInt = getSomeOptionalInt();
 Number value = optionalInt.or(0.5); // error

 FluentIterable<? extends Number> numbers = getSomeNumbers();
 Optional<? extends Number> first = numbers.first();
 Number value = first.or(0.5); // error
 
```


 
As a workaround, it is always safe to cast an Optional<? extends T> to 
 Optional<T>. Casting either of the above example Optional instances to 
 Optional<Number> (where Number is the desired output type) solves the problem:

 

```

 Optional<Number> optionalInt = (Optional) getSomeOptionalInt();
 Number value = optionalInt.or(0.5); // fine

 FluentIterable<? extends Number> numbers = getSomeNumbers();
 Optional<Number> first = (Optional) numbers.first();
 Number value = first.or(0.5); // fine
 
```


 
**Comparison to java.util.Optional:** this method is similar to Java 8's 
 Optional.orElse, but will not accept null as a defaultValue (#orNull
 must be used instead). As a result, the value returned by this method is guaranteed non-null,
 which is not the case for the java.util equivalent.

**Parameters:**
- `defaultValue` (`T`)

**Returns:** `T`

### `or(Optional<? extends T> secondChoice)`

**Comparison to java.util.Optional:** this method has no equivalent in Java 8's
 Optional class; write thisOptional.isPresent() ? thisOptional : secondChoice
 instead.

**Parameters:**
- `secondChoice` ([`com.google.common.base.Optional<? extends T>`](./Optional.md))

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `or(Supplier<? extends T> supplier)`

**Comparison to java.util.Optional:** this method is similar to Java 8's 
 Optional.orElseGet, except when supplier returns null. In this case this
 method throws an exception, whereas the Java 8 method returns the null to the caller.

**Parameters:**
- `supplier` ([`com.google.common.base.Supplier<? extends T>`](./Supplier.md))

**Returns:** `T`

### `orNull()`

If the instance is
 known to be present, use #get() instead.

 
**Comparison to java.util.Optional:** this method is equivalent to Java 8's
 Optional.orElse(null).

**Returns:** `T`

### `asSet()`

**Comparison to java.util.Optional:** this method has no equivalent in Java 8's
 Optional class. However, this common usage:

 

```

 for (Foo foo : possibleFoo.asSet()) {
   doSomethingWith(foo);
 }
 
```


 ... can be replaced with:

 

```

 possibleFoo.ifPresent(foo -> doSomethingWith(foo));
 
```


 
**Java 9 users:** some use cases can be written with calls to optional.stream().

**Returns:** `java.util.Set<T>`

### `transform(Function<? super T,V> function)`

**Comparison to java.util.Optional:** this method is similar to Java 8's 
 Optional.map, except when function returns null. In this case this method
 throws an exception, whereas the Java 8 method returns Optional.absent().

**Parameters:**
- `function` ([`com.google.common.base.Function<? super T,V>`](./Function.md))

**Returns:** [`com.google.common.base.Optional<V>`](./Optional.md)

### `equals(Object object)`

Note that Optional instances of differing parameterized types can be equal.

 
**Comparison to java.util.Optional:** no differences.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Comparison to java.util.Optional:** this class leaves the specific choice of
 hash code unspecified, unlike the Java 8 equivalent.

**Returns:** `int`

### `toString()`

**Comparison to java.util.Optional:** this class leaves the specific string
 representation unspecified, unlike the Java 8 equivalent.

**Returns:** `java.lang.String`

### `presentInstances(Iterable<? extends Optional<? extends T>> optionals)`

Iterators are unmodifiable and are
 evaluated lazily.

 
**Comparison to java.util.Optional:** this method has no equivalent in Java 8's
 Optional class; use 
 optionals.stream().filter(Optional::isPresent).map(Optional::get) instead.

 
**Java 9 users:** use optionals.stream().flatMap(Optional::stream) instead.

**Parameters:**
- `optionals` (`java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>>`)

**Returns:** `java.lang.Iterable<T>`

