# Class: `ComparisonChain`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ComparisonChain`

## Description

A utility for performing a chained comparison statement. <b>Note:</b> Java 8+ users should
 generally prefer the methods in {@link Comparator}; see <a href="#java8">below</a>.

 <p>Example usage of {@code ComparisonChain}:

 <pre>{@code
 public int compareTo(Foo that) {
   return ComparisonChain.start()
       .compare(this.aString, that.aString)
       .compare(this.anInt, that.anInt)
       .compare(this.anEnum, that.anEnum, Ordering.natural().nullsLast())
       .result();
 }
 }</pre>

 <p>The value of this expression will have the same sign as the <i>first nonzero</i> comparison
 result in the chain, or will be zero if every comparison result was zero.

 <p><b>Note:</b> {@code ComparisonChain} instances are <b>immutable</b>. For this utility to work
 correctly, calls must be chained as illustrated above.

 <p>Performance note: Even though the {@code ComparisonChain} caller always invokes its {@code
 compare} methods unconditionally, the {@code ComparisonChain} implementation stops calling its
 inputs' {@link Comparable#compareTo compareTo} and {@link Comparator#compare compare} methods as
 soon as one of them returns a nonzero result. This optimization is typically important only in
 the presence of expensive {@code compareTo} and {@code compare} implementations.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained#comparecompareto">{@code
 ComparisonChain}</a>.

 <h4 id="java8">Java 8+ equivalents</h4>

 If you are using Java version 8 or greater, you should generally use the static methods in {@link Comparator} instead of {@code ComparisonChain}. The example above can be implemented like this:

 <pre>{@code
 import static java.util.Comparator.comparing;
 import static java.util.Comparator.nullsLast;
 import static java.util.Comparator.naturalOrder;

 ...
   private static final Comparator<Foo> COMPARATOR =
       comparing((Foo foo) -> foo.aString)
           .thenComparing(foo -> foo.anInt)
           .thenComparing(foo -> foo.anEnum, nullsLast(naturalOrder()));}

   {@code @Override}{@code
   public int compareTo(Foo that) {
     return COMPARATOR.compare(this, that);
   }
 }</pre>

 <p>With method references it is more succinct: {@code comparing(Foo::aString)} for example.

 <p>Using {@link Comparator} avoids certain types of bugs, for example when you meant to write
 {@code .compare(a.foo, b.foo)} but you actually wrote {@code .compare(a.foo, a.foo)} or {@code
 .compare(a.foo, b.bar)}. {@code ComparisonChain} also has a potential performance problem that
 {@code Comparator} doesn't: it evaluates all the parameters of all the {@code .compare} calls,
 even when the result of the comparison is already known from previous {@code .compare} calls.
 That can be expensive.
@author Mark Davis
@author Kevin Bourrillion
@since 2.0

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

Compares two comparable objects as specified by {@link Comparable#compareTo}, <i>if</i> the
 result of this comparison chain has not already been determined.

 <p>This method is declared to accept any 2 {@code Comparable} objects, even if they are not <a href="https://docs.oracle.com/javase/tutorial/collections/interfaces/order.html">mutually
 comparable</a>. If you pass objects that are not mutually comparable, this method may throw an
 exception. (The reason for this decision is lost to time, but the reason <i>might</i> be that
 we wanted to support legacy classes that implement the raw type {@code Comparable} (instead of
 implementing {@code Comparable<Foo>}) without producing warnings. If so, we would prefer today
 to produce warnings in that case, and we may change this method to do so in the future. Support
 for raw {@code Comparable} types in Guava in general is tracked as <a href="https://github.com/google/guava/issues/989">#989</a>.)
@throws ClassCastException if the parameters are not mutually comparable

### `compare([`T`](T.md) left, [`T`](T.md) right, [`java.util.Comparator<T>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two objects using a comparator, <i>if</i> the result of this comparison chain has not
 already been determined.

### `compare(`int` left, `int` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two {@code int} values as specified by {@link Ints#compare}, <i>if</i> the result of
 this comparison chain has not already been determined.

### `compare(`long` left, `long` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two {@code long} values as specified by {@link Longs#compare}, <i>if</i> the result of
 this comparison chain has not already been determined.

### `compare(`float` left, `float` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two {@code float} values as specified by {@link Float#compare}, <i>if</i> the result
 of this comparison chain has not already been determined.

### `compare(`double` left, `double` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two {@code double} values as specified by {@link Double#compare}, <i>if</i> the result
 of this comparison chain has not already been determined.

### `compare(`java.lang.Boolean` left, `java.lang.Boolean` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Discouraged synonym for {@link #compareFalseFirst}.
@deprecated Use {@link #compareFalseFirst}; or, if the parameters passed are being either
     negated or reversed, undo the negation or reversal and use {@link #compareTrueFirst}.
@since 19.0

### `compareTrueFirst(`boolean` left, `boolean` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two {@code boolean} values, considering {@code true} to be less than {@code false},
 <i>if</i> the result of this comparison chain has not already been determined.

 <p>Java 8+ users: you can get the equivalent from {@link Booleans#trueFirst()}. For example:

 <pre>
 Comparator.comparing(Foo::isBar, {@link Booleans#trueFirst()})
 </pre>
@since 12.0

### `compareFalseFirst(`boolean` left, `boolean` right)`

**Returns:** [`com.google.common.collect.ComparisonChain`](./ComparisonChain.md)

Compares two {@code boolean} values, considering {@code false} to be less than {@code true},
 <i>if</i> the result of this comparison chain has not already been determined.

 <p>Java 8+ users: you can get the equivalent from {@link Booleans#falseFirst()}. For example:

 <pre>
 Comparator.comparing(Foo::isBar, {@link Booleans#falseFirst()})
 </pre>
@since 12.0 (present as {@code compare} since 2.0)

### `result()`

**Returns:** `int`

Ends this comparison chain and returns its result: a value having the same sign as the first
 nonzero comparison result in the chain, or zero if every result was zero.

