# Class: `ComparisonChain`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ComparisonChain`

## Description

A utility for performing a chained comparison statement. <b>Note:</b> Java 8+ users should
 generally prefer the methods in `Comparator`; see <a href="#java8">below</a>.

 <p>Example usage of `ComparisonChain`:

 <pre>`public int compareTo(Foo that) {
   return ComparisonChain.start()
       .compare(this.aString, that.aString)
       .compare(this.anInt, that.anInt)
       .compare(this.anEnum, that.anEnum, Ordering.natural().nullsLast())
       .result();
 `
 }</pre>

 <p>The value of this expression will have the same sign as the <i>first nonzero</i> comparison
 result in the chain, or will be zero if every comparison result was zero.

 <p><b>Note:</b> `ComparisonChain` instances are <b>immutable</b>. For this utility to work
 correctly, calls must be chained as illustrated above.

 <p>Performance note: Even though the `ComparisonChain` caller always invokes its `compare` methods unconditionally, the `ComparisonChain` implementation stops calling its
 inputs' `Comparable.compareTo compareTo` and `Comparator.compare compare` methods as
 soon as one of them returns a nonzero result. This optimization is typically important only in
 the presence of expensive `compareTo` and `compare` implementations.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained#comparecompareto">`ComparisonChain`</a>.

 <h4 id="java8">Java 8+ equivalents</h4>

 If you are using Java version 8 or greater, you should generally use the static methods in `Comparator` instead of `ComparisonChain`. The example above can be implemented like this:

 <pre>`import static java.util.Comparator.comparing;
 import static java.util.Comparator.nullsLast;
 import static java.util.Comparator.naturalOrder;

 ...
   private static final Comparator<Foo> COMPARATOR =
       comparing((Foo foo) -> foo.aString)
           .thenComparing(foo -> foo.anInt)
           .thenComparing(foo -> foo.anEnum, nullsLast(naturalOrder()));`

   `@Override``public int compareTo(Foo that) {
     return COMPARATOR.compare(this, that);
   `
 }</pre>

 <p>With method references it is more succinct: `comparing(Foo::aString)` for example.

 <p>Using `Comparator` avoids certain types of bugs, for example when you meant to write
 `.compare(a.foo, b.foo)` but you actually wrote `.compare(a.foo, a.foo)` or `.compare(a.foo, b.bar)`. `ComparisonChain` also has a potential performance problem that
 `Comparator` doesn't: it evaluates all the parameters of all the `.compare` calls,
 even when the result of the comparison is already known from previous `.compare` calls.
 That can be expensive.
**Author:** Mark Davis
**Author:** Kevin Bourrillion
**Since:** 2.0

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

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Begins a new chained comparison statement. See example in the class documentation.

### `compare(`java.lang.Comparable<?>` left, `java.lang.Comparable<?>` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two comparable objects as specified by `Comparable.compareTo`, <i>if</i> the
 result of this comparison chain has not already been determined.

 <p>This method is declared to accept any 2 `Comparable` objects, even if they are not <a href="https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html">mutually
 comparable</a>. If you pass objects that are not mutually comparable, this method may throw an
 exception. (The reason for this decision is lost to time, but the reason <i>might</i> be that
 we wanted to support legacy classes that implement the raw type `Comparable` (instead of
 implementing `Comparable<Foo>`) without producing warnings. If so, we would prefer today
 to produce warnings in that case, and we may change this method to do so in the future. Support
 for raw `Comparable` types in Guava in general is tracked as <a href="https://github.com/google/guava/issues/989">#989</a>.)
@throws ClassCastException if the parameters are not mutually comparable

### `compare(`T` left, `T` right, `java.util.Comparator<T>` comparator)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two objects using a comparator, <i>if</i> the result of this comparison chain has not
 already been determined.

### `compare(`int` left, `int` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two `int` values as specified by `Ints.compare`, <i>if</i> the result of
 this comparison chain has not already been determined.

### `compare(`long` left, `long` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two `long` values as specified by `Longs.compare`, <i>if</i> the result of
 this comparison chain has not already been determined.

### `compare(`float` left, `float` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two `float` values as specified by `Float.compare`, <i>if</i> the result
 of this comparison chain has not already been determined.

### `compare(`double` left, `double` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two `double` values as specified by `Double.compare`, <i>if</i> the result
 of this comparison chain has not already been determined.

### `compare(`java.lang.Boolean` left, `java.lang.Boolean` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Discouraged synonym for `compareFalseFirst`.
**Deprecated:**Use `compareFalseFirst`; or, if the parameters passed are being either
     negated or reversed, undo the negation or reversal and use `compareTrueFirst`.
**Since:** 19.0

### `compareTrueFirst(`boolean` left, `boolean` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two `boolean` values, considering `true` to be less than `false`,
 <i>if</i> the result of this comparison chain has not already been determined.

 <p>Java 8+ users: you can get the equivalent from `Booleans.trueFirst()`. For example:

 <pre>
 Comparator.comparing(Foo::isBar, `Booleans.trueFirst()`)
 </pre>
**Since:** 12.0

### `compareFalseFirst(`boolean` left, `boolean` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two `boolean` values, considering `false` to be less than `true`,
 <i>if</i> the result of this comparison chain has not already been determined.

 <p>Java 8+ users: you can get the equivalent from `Booleans.falseFirst()`. For example:

 <pre>
 Comparator.comparing(Foo::isBar, `Booleans.falseFirst()`)
 </pre>
**Since:** 12.0 (present as `compare` since 2.0)

### `result()`

**Returns:** `int`

Ends this comparison chain and returns its result: a value having the same sign as the first
 nonzero comparison result in the chain, or zero if every result was zero.

