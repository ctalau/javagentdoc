# Class: `Splitter`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Splitter`

## Description

Extracts non-overlapping substrings from an input string, typically by recognizing appearances of
 a <i>separator</i> sequence. This separator can be specified as a single character, fixed string, regular expression or
 `on(CharMatcher) CharMatcher` instance. Or, instead of using a separator at all, a
 splitter can extract adjacent substrings of a given fixed length.

 <p>For example, this expression:

 <pre>`Splitter.on(',').split("foo,bar,qux")
 `</pre>

 ... produces an `Iterable` containing `"foo"`, `"bar"` and `"qux"`, in
 that order.

 <p>By default, `Splitter`'s behavior is simplistic and unassuming. The following
 expression:

 <pre>`Splitter.on(',').split(" foo,,,  bar ,")
 `</pre>

 ... yields the substrings `[" foo", "", "", " bar ", ""]`. If this is not the desired
 behavior, use configuration methods to obtain a <i>new</i> splitter instance with modified
 behavior:

 <pre>`private static final Splitter MY_SPLITTER = Splitter.on(',')
     .trimResults()
     .omitEmptyStrings();
 `</pre>

 <p>Now `MY_SPLITTER.split("foo,,, bar ,")` returns just `["foo", "bar"]`. Note that
 the order in which these configuration methods are called is never significant.

 <p><b>Warning:</b> Splitter instances are immutable. Invoking a configuration method has no
 effect on the receiving instance; you must store and use the new splitter instance it returns
 instead.

 <pre>`// Do NOT do this
 Splitter splitter = Splitter.on('/');
 splitter.trimResults(); // does nothing!
 return splitter.split("wrong / wrong / wrong");
 `</pre>

 <p>For separator-based splitters that do not use `omitEmptyStrings`, an input string
 containing `n` occurrences of the separator naturally yields an iterable of size `n +
 1`. So if the separator does not occur anywhere in the input, a single substring is returned
 containing the entire input. Consequently, all splitters split the empty string to `[""]`
 (note: even fixed-length splitters).

 <p>Splitter instances are thread-safe immutable, and are therefore safe to store as `static
 final` constants.

 <p>The `Joiner` class provides the inverse operation to splitting, but note that a
 round-trip between the two should be assumed to be lossy.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/StringsExplained#splitter">`Splitter`</a>.
**Author:** Julien Silland
**Author:** Jesse Wilson
**Author:** Kevin Bourrillion
**Author:** Louis Wasserman
**Since:** 1.0

## Fields

### `trimmer`

**Type:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `omitEmptyStrings`

**Type:** `boolean`

### `strategy`

**Type:** [`com.google.common.base.Splitter.Strategy`](Splitter/Strategy.md)

### `limit`

**Type:** `int`

## Constructors

### `<init>([`com.google.common.base.Splitter.Strategy`](Splitter/Strategy.md) strategy)`

### `<init>([`com.google.common.base.Splitter.Strategy`](Splitter/Strategy.md) strategy, `boolean` omitEmptyStrings, [`com.google.common.base.CharMatcher`](./CharMatcher.md) trimmer, `int` limit)`

## Methods

### `on(`char` separator)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that uses the given single-character separator. For example, `Splitter.on(',').split("foo,,bar")` returns an iterable containing `["foo", "", "bar"]`.
@param separator the character to recognize as a separator
@return a splitter, with default settings, that recognizes that separator

### `on([`com.google.common.base.CharMatcher`](./CharMatcher.md) separatorMatcher)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that considers any single character matched by the given `CharMatcher`
 to be a separator. For example, `Splitter.on(CharMatcher.anyOf(";,")).split("foo,;bar,quux")` returns an iterable containing
 `["foo", "", "bar", "quux"]`.
@param separatorMatcher a `CharMatcher` that determines whether a character is a
     separator
@return a splitter, with default settings, that uses this matcher

### `on(`java.lang.String` separator)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that uses the given fixed string as a separator. For example, `Splitter.on(", ").split("foo, bar,baz")` returns an iterable containing `["foo",
 "bar,baz"]`.
@param separator the literal, nonempty string to recognize as a separator
@return a splitter, with default settings, that recognizes that separator

### `on(`java.util.regex.Pattern` separatorPattern)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that considers any subsequence matching `pattern` to be a separator.
 For example, `Splitter.on(Pattern.compile("\r?\n")).split(entireFile)` splits a string
 into lines whether it uses DOS-style or UNIX-style line terminators.
@param separatorPattern the pattern that determines whether a subsequence is a separator. This
     pattern may not match the empty string.
@return a splitter, with default settings, that uses this pattern
@throws IllegalArgumentException if `separatorPattern` matches the empty string

### `onPatternInternal([`com.google.common.base.CommonPattern`](./CommonPattern.md) separatorPattern)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Internal utility; see `on(Pattern)` instead.

### `onPattern(`java.lang.String` separatorPattern)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that considers any subsequence matching a given pattern (regular expression)
 to be a separator. For example, `Splitter.onPattern("\r?\n").split(entireFile)` splits a
 string into lines whether it uses DOS-style or UNIX-style line terminators. This is equivalent
 to `Splitter.on(Pattern.compile(pattern))`.
@param separatorPattern the pattern that determines whether a subsequence is a separator. This
     pattern may not match the empty string.
@return a splitter, with default settings, that uses this pattern
@throws IllegalArgumentException if `separatorPattern` matches the empty string or is a
     malformed expression

### `fixedLength(`int` length)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that divides strings into pieces of the given length. For example, `Splitter.fixedLength(2).split("abcde")` returns an iterable containing `["ab", "cd",
 "e"]`. The last piece can be smaller than `length` but will never be empty.

 <p><b>Note:</b> if `fixedLength` is used in conjunction with `limit`, the final
 split piece <i>may be longer than the specified fixed length</i>. This is because the splitter
 will <i>stop splitting when the limit is reached</i>, and just return the final piece as-is.

 <p><b>Exception:</b> for consistency with separator-based splitters, `split("")` does not
 yield an empty iterable, but an iterable containing `""`. This is the only case in which
 `Iterables.size(split(input))` does not equal `IntMath.divide(input.length(),
 length, CEILING)`. To avoid this behavior, use `omitEmptyStrings`.
@param length the desired length of pieces after splitting, a positive integer
@return a splitter, with default settings, that can split into fixed sized pieces
@throws IllegalArgumentException if `length` is zero or negative

### `omitEmptyStrings()`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to `this` splitter, but automatically omits
 empty strings from the results. For example, `Splitter.on(',').omitEmptyStrings().split(",a,,,b,c,,")` returns an iterable containing only
 `["a", "b", "c"]`.

 <p>If either `trimResults` option is also specified when creating a splitter, that
 splitter always trims results first before checking for emptiness. So, for example, `Splitter.on(':').omitEmptyStrings().trimResults().split(": : : ")` returns an empty iterable.

 <p>Note that it is ordinarily not possible for `split(CharSequence)` to return an empty
 iterable, but when using this option, it can (if the input sequence consists of nothing but
 separators).
@return a splitter with the desired configuration

### `limit(`int` maxItems)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to `this` splitter but stops splitting after
 it reaches the limit. The limit defines the maximum number of items returned by the iterator,
 or the maximum size of the list returned by `splitToList`.

 <p>For example, `Splitter.on(',').limit(3).split("a,b,c,d")` returns an iterable
 containing `["a", "b", "c,d"]`. When omitting empty strings, the omitted strings do not
 count. Hence, `Splitter.on(',').limit(3).omitEmptyStrings().split("a,,,b,,,c,d")` returns
 an iterable containing `["a", "b", "c,d"`. When trim is requested, all entries are
 trimmed, including the last. Hence `Splitter.on(',').limit(3).trimResults().split(" a , b
 , c , d ")` results in `["a", "b", "c , d"]`.
@param maxItems the maximum number of items returned
@return a splitter with the desired configuration
**Since:** 9.0

### `trimResults()`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to `this` splitter, but automatically
 removes leading and trailing whitespace from each returned
 substring; equivalent to `trimResults(CharMatcher.whitespace())`. For example, `Splitter.on(',').trimResults().split(" a, b ,c ")` returns an iterable containing `["a",
 "b", "c"]`.
@return a splitter with the desired configuration

### `trimResults([`com.google.common.base.CharMatcher`](./CharMatcher.md) trimmer)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to `this` splitter, but removes all leading
 or trailing characters matching the given `CharMatcher` from each returned substring. For
 example, `Splitter.on(',').trimResults(CharMatcher.is('_')).split("_a ,_b_ ,c__")`
 returns an iterable containing `["a ", "b_ ", "c"]`.
@param trimmer a `CharMatcher` that determines whether a character should be removed from
     the beginning/end of a subsequence
@return a splitter with the desired configuration

### `split(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.Iterable<java.lang.String>`

Splits `sequence` into string components and makes them available through an `Iterator`, which may be lazily evaluated. If you want an eagerly computed `List`, use
 `splitToList(CharSequence)`. Java 8 users may prefer `splitToStream` instead.
@param sequence the sequence of characters to split
@return an iteration over the segments split from the parameter

### `splittingIterator(`java.lang.CharSequence` sequence)`

**Returns:** `java.util.Iterator<java.lang.String>`

### `splitToList(`java.lang.CharSequence` sequence)`

**Returns:** `java.util.List<java.lang.String>`

Splits `sequence` into string components and returns them as an immutable list. If you
 want an `Iterable` which may be lazily evaluated, use `split(CharSequence)`.
@param sequence the sequence of characters to split
@return an immutable list of the segments split from the parameter
**Since:** 15.0

### `splitToStream(`java.lang.CharSequence` sequence)`

**Returns:** `java.util.stream.Stream<java.lang.String>`

Splits `sequence` into string components and makes them available through an `Stream`, which may be lazily evaluated. If you want an eagerly computed `List`, use
 `splitToList(CharSequence)`.
@param sequence the sequence of characters to split
@return a stream over the segments split from the parameter
**Since:** 28.2

### `withKeyValueSeparator(`java.lang.String` separator)`

**Returns:** [`com.google.common.base.Splitter.MapSplitter`](Splitter/MapSplitter.md)

Returns a `MapSplitter` which splits entries based on this splitter, and splits entries
 into keys and values using the specified separator.
**Since:** 10.0

### `withKeyValueSeparator(`char` separator)`

**Returns:** [`com.google.common.base.Splitter.MapSplitter`](Splitter/MapSplitter.md)

Returns a `MapSplitter` which splits entries based on this splitter, and splits entries
 into keys and values using the specified separator.
**Since:** 14.0

### `withKeyValueSeparator([`com.google.common.base.Splitter`](./Splitter.md) keyValueSplitter)`

**Returns:** [`com.google.common.base.Splitter.MapSplitter`](Splitter/MapSplitter.md)

Returns a `MapSplitter` which splits entries based on this splitter, and splits entries
 into keys and values using the specified key-value splitter.

 <p>Note: Any configuration option configured on this splitter, such as `trimResults`,
 does not change the behavior of the `keyValueSplitter`.

 <p>Example:

 <pre>`String toSplit = " x -> y, z-> a ";
 Splitter outerSplitter = Splitter.on(',').trimResults();
 MapSplitter mapSplitter = outerSplitter.withKeyValueSeparator(Splitter.on("->"));
 Map<String, String> result = mapSplitter.split(toSplit);
 assertThat(result).isEqualTo(ImmutableMap.of("x ", " y", "z", " a"));
 `</pre>
**Since:** 10.0

