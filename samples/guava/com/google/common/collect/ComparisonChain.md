# Class: `ComparisonChain`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ComparisonChain`

## Description

**Note:** Java 8+ users should
 generally prefer the methods in Comparator; see [below](#java8).

 
Example usage of ComparisonChain:

 

```

 public int compareTo(Foo that) {
   return ComparisonChain.start()
       .compare(this.aString, that.aString)
       .compare(this.anInt, that.anInt)
       .compare(this.anEnum, that.anEnum, Ordering.natural().nullsLast())
       .result();
 }
 
```


 
The value of this expression will have the same sign as the *first nonzero* comparison
 result in the chain, or will be zero if every comparison result was zero.

 
**Note:** ComparisonChain instances are **immutable**. For this utility to work
 correctly, calls must be chained as illustrated above.

 
Performance note: Even though the ComparisonChain caller always invokes its 
 compare methods unconditionally, the ComparisonChain implementation stops calling its
 inputs' compareTo and compare methods as
 soon as one of them returns a nonzero result. This optimization is typically important only in
 the presence of expensive compareTo and compare implementations.

 
See the Guava User Guide article on [
 ComparisonChain](https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained#comparecompareto).

 Java 8+ equivalents

 If you are using Java version 8 or greater, you should generally use the static methods in Comparator instead of ComparisonChain. The example above can be implemented like this:

 

```

 import static java.util.Comparator.comparing;
 import static java.util.Comparator.nullsLast;
 import static java.util.Comparator.naturalOrder;

 ...
   private static final Comparator<Foo> COMPARATOR =
       comparing((Foo foo) -> foo.aString)
           .thenComparing(foo -> foo.anInt)
           .thenComparing(foo -> foo.anEnum, nullsLast(naturalOrder()));

   @Override
   public int compareTo(Foo that) {
     return COMPARATOR.compare(this, that);
   }
 
```


 
With method references it is more succinct: comparing(Foo::aString) for example.

 
Using Comparator avoids certain types of bugs, for example when you meant to write
 .compare(a.foo, b.foo) but you actually wrote .compare(a.foo, a.foo) or 
 .compare(a.foo, b.bar). ComparisonChain also has a potential performance problem that
 Comparator doesn't: it evaluates all the parameters of all the .compare calls,
 even when the result of the comparison is already known from previous .compare calls.
 That can be expensive.

## Fields

### `ACTIVE`

**Type:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `LESS`

**Type:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `GREATER`

**Type:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

## Constructors

### `<init>()`

## Methods

### `start()`

See example in the class documentation.

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(Comparable<?> left, Comparable<?> right)`

This method is declared to accept any 2 Comparable objects, even if they are not [mutually
 comparable](https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html). If you pass objects that are not mutually comparable, this method may throw an
 exception. (The reason for this decision is lost to time, but the reason *might* be that
 we wanted to support legacy classes that implement the raw type Comparable (instead of
 implementing Comparable<Foo>) without producing warnings. If so, we would prefer today
 to produce warnings in that case, and we may change this method to do so in the future. Support
 for raw Comparable types in Guava in general is tracked as [#989](https://github.com/google/guava/issues/989).)

**Parameters:**
- `left` (`java.lang.Comparable<?>`)
- `right` (`java.lang.Comparable<?>`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(T left, T right, Comparator<T> comparator)`

**Parameters:**
- `left` (`T`)
- `right` (`T`)
- `comparator` (`java.util.Comparator<T>`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(int left, int right)`

**Parameters:**
- `left` (`int`)
- `right` (`int`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(long left, long right)`

**Parameters:**
- `left` (`long`)
- `right` (`long`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(float left, float right)`

**Parameters:**
- `left` (`float`)
- `right` (`float`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(double left, double right)`

**Parameters:**
- `left` (`double`)
- `right` (`double`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compare(Boolean left, Boolean right)`

**Parameters:**
- `left` (`java.lang.Boolean`)
- `right` (`java.lang.Boolean`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compareTrueFirst(boolean left, boolean right)`

Java 8+ users: you can get the equivalent from Booleans#trueFirst(). For example:

 

```

 Comparator.comparing(Foo::isBar, Booleans#trueFirst())
 
```

**Parameters:**
- `left` (`boolean`)
- `right` (`boolean`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `compareFalseFirst(boolean left, boolean right)`

Java 8+ users: you can get the equivalent from Booleans#falseFirst(). For example:

 

```

 Comparator.comparing(Foo::isBar, Booleans#falseFirst())
 
```

**Parameters:**
- `left` (`boolean`)
- `right` (`boolean`)

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

### `result()`

**Returns:** `int`

