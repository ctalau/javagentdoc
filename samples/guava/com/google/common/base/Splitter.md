# Class: `Splitter`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Splitter`

## Description

Extracts non-overlapping substrings from an input string, typically by recognizing appearances of
 a <i>separator</i> sequence. This separator can be specified as a single {@linkplain #on(char) character}, fixed {@linkplain #on(String) string}, {@linkplain #onPattern regular expression} or
 {@link #on(CharMatcher) CharMatcher} instance. Or, instead of using a separator at all, a
 splitter can extract adjacent substrings of a given {@linkplain #fixedLength fixed length}.

 <p>For example, this expression:

 <pre>{@code
 Splitter.on(',').split("foo,bar,qux")
 }</pre>

 ... produces an {@code Iterable} containing {@code "foo"}, {@code "bar"} and {@code "qux"}, in
 that order.

 <p>By default, {@code Splitter}'s behavior is simplistic and unassuming. The following
 expression:

 <pre>{@code
 Splitter.on(',').split(" foo,,,  bar ,")
 }</pre>

 ... yields the substrings {@code [" foo", "", "", " bar ", ""]}. If this is not the desired
 behavior, use configuration methods to obtain a <i>new</i> splitter instance with modified
 behavior:

 <pre>{@code
 private static final Splitter MY_SPLITTER = Splitter.on(',')
     .trimResults()
     .omitEmptyStrings();
 }</pre>

 <p>Now {@code MY_SPLITTER.split("foo,,, bar ,")} returns just {@code ["foo", "bar"]}. Note that
 the order in which these configuration methods are called is never significant.

 <p><b>Warning:</b> Splitter instances are immutable. Invoking a configuration method has no
 effect on the receiving instance; you must store and use the new splitter instance it returns
 instead.

 <pre>{@code
 // Do NOT do this
 Splitter splitter = Splitter.on('/');
 splitter.trimResults(); // does nothing!
 return splitter.split("wrong / wrong / wrong");
 }</pre>

 <p>For separator-based splitters that do not use {@code omitEmptyStrings}, an input string
 containing {@code n} occurrences of the separator naturally yields an iterable of size {@code n +
 1}. So if the separator does not occur anywhere in the input, a single substring is returned
 containing the entire input. Consequently, all splitters split the empty string to {@code [""]}
 (note: even fixed-length splitters).

 <p>Splitter instances are thread-safe immutable, and are therefore safe to store as {@code static
 final} constants.

 <p>The {@link Joiner} class provides the inverse operation to splitting, but note that a
 round-trip between the two should be assumed to be lossy.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/StringsExplained#splitter">{@code Splitter}</a>.
@author Julien Silland
@author Jesse Wilson
@author Kevin Bourrillion
@author Louis Wasserman
@since 1.0

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

Returns a splitter that uses the given single-character separator. For example, {@code
 Splitter.on(',').split("foo,,bar")} returns an iterable containing {@code ["foo", "", "bar"]}.
@param separator the character to recognize as a separator
@return a splitter, with default settings, that recognizes that separator

### `on([`com.google.common.base.CharMatcher`](./CharMatcher.md) separatorMatcher)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that considers any single character matched by the given {@code CharMatcher}
 to be a separator. For example, {@code
 Splitter.on(CharMatcher.anyOf(";,")).split("foo,;bar,quux")} returns an iterable containing
 {@code ["foo", "", "bar", "quux"]}.
@param separatorMatcher a {@link CharMatcher} that determines whether a character is a
     separator
@return a splitter, with default settings, that uses this matcher

### `on(`java.lang.String` separator)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that uses the given fixed string as a separator. For example, {@code
 Splitter.on(", ").split("foo, bar,baz")} returns an iterable containing {@code ["foo",
 "bar,baz"]}.
@param separator the literal, nonempty string to recognize as a separator
@return a splitter, with default settings, that recognizes that separator

### `on([`java.util.regex.Pattern`](../../../../java/util/regex/Pattern.md) separatorPattern)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that considers any subsequence matching {@code pattern} to be a separator.
 For example, {@code Splitter.on(Pattern.compile("\r?\n")).split(entireFile)} splits a string
 into lines whether it uses DOS-style or UNIX-style line terminators.
@param separatorPattern the pattern that determines whether a subsequence is a separator. This
     pattern may not match the empty string.
@return a splitter, with default settings, that uses this pattern
@throws IllegalArgumentException if {@code separatorPattern} matches the empty string

### `onPatternInternal([`com.google.common.base.CommonPattern`](./CommonPattern.md) separatorPattern)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Internal utility; see {@link #on(Pattern)} instead.

### `onPattern(`java.lang.String` separatorPattern)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that considers any subsequence matching a given pattern (regular expression)
 to be a separator. For example, {@code Splitter.onPattern("\r?\n").split(entireFile)} splits a
 string into lines whether it uses DOS-style or UNIX-style line terminators. This is equivalent
 to {@code Splitter.on(Pattern.compile(pattern))}.
@param separatorPattern the pattern that determines whether a subsequence is a separator. This
     pattern may not match the empty string.
@return a splitter, with default settings, that uses this pattern
@throws IllegalArgumentException if {@code separatorPattern} matches the empty string or is a
     malformed expression

### `fixedLength(`int` length)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that divides strings into pieces of the given length. For example, {@code
 Splitter.fixedLength(2).split("abcde")} returns an iterable containing {@code ["ab", "cd",
 "e"]}. The last piece can be smaller than {@code length} but will never be empty.

 <p><b>Note:</b> if {@link #fixedLength} is used in conjunction with {@link #limit}, the final
 split piece <i>may be longer than the specified fixed length</i>. This is because the splitter
 will <i>stop splitting when the limit is reached</i>, and just return the final piece as-is.

 <p><b>Exception:</b> for consistency with separator-based splitters, {@code split("")} does not
 yield an empty iterable, but an iterable containing {@code ""}. This is the only case in which
 {@code Iterables.size(split(input))} does not equal {@code IntMath.divide(input.length(),
 length, CEILING)}. To avoid this behavior, use {@code omitEmptyStrings}.
@param length the desired length of pieces after splitting, a positive integer
@return a splitter, with default settings, that can split into fixed sized pieces
@throws IllegalArgumentException if {@code length} is zero or negative

### `omitEmptyStrings()`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to {@code this} splitter, but automatically omits
 empty strings from the results. For example, {@code
 Splitter.on(',').omitEmptyStrings().split(",a,,,b,c,,")} returns an iterable containing only
 {@code ["a", "b", "c"]}.

 <p>If either {@code trimResults} option is also specified when creating a splitter, that
 splitter always trims results first before checking for emptiness. So, for example, {@code
 Splitter.on(':').omitEmptyStrings().trimResults().split(": : : ")} returns an empty iterable.

 <p>Note that it is ordinarily not possible for {@link #split(CharSequence)} to return an empty
 iterable, but when using this option, it can (if the input sequence consists of nothing but
 separators).
@return a splitter with the desired configuration

### `limit(`int` maxItems)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to {@code this} splitter but stops splitting after
 it reaches the limit. The limit defines the maximum number of items returned by the iterator,
 or the maximum size of the list returned by {@link #splitToList}.

 <p>For example, {@code Splitter.on(',').limit(3).split("a,b,c,d")} returns an iterable
 containing {@code ["a", "b", "c,d"]}. When omitting empty strings, the omitted strings do not
 count. Hence, {@code Splitter.on(',').limit(3).omitEmptyStrings().split("a,,,b,,,c,d")} returns
 an iterable containing {@code ["a", "b", "c,d"}. When trim is requested, all entries are
 trimmed, including the last. Hence {@code Splitter.on(',').limit(3).trimResults().split(" a , b
 , c , d ")} results in {@code ["a", "b", "c , d"]}.
@param maxItems the maximum number of items returned
@return a splitter with the desired configuration
@since 9.0

### `trimResults()`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to {@code this} splitter, but automatically
 removes leading and trailing {@linkplain CharMatcher#whitespace whitespace} from each returned
 substring; equivalent to {@code trimResults(CharMatcher.whitespace())}. For example, {@code
 Splitter.on(',').trimResults().split(" a, b ,c ")} returns an iterable containing {@code ["a",
 "b", "c"]}.
@return a splitter with the desired configuration

### `trimResults([`com.google.common.base.CharMatcher`](./CharMatcher.md) trimmer)`

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

Returns a splitter that behaves equivalently to {@code this} splitter, but removes all leading
 or trailing characters matching the given {@code CharMatcher} from each returned substring. For
 example, {@code Splitter.on(',').trimResults(CharMatcher.is('_')).split("_a ,_b_ ,c__")}
 returns an iterable containing {@code ["a ", "b_ ", "c"]}.
@param trimmer a {@link CharMatcher} that determines whether a character should be removed from
     the beginning/end of a subsequence
@return a splitter with the desired configuration

### `split(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.Iterable<java.lang.String>`

Splits {@code sequence} into string components and makes them available through an {@link Iterator}, which may be lazily evaluated. If you want an eagerly computed {@link List}, use
 {@link #splitToList(CharSequence)}. Java 8 users may prefer {@link #splitToStream} instead.
@param sequence the sequence of characters to split
@return an iteration over the segments split from the parameter

### `splittingIterator(`java.lang.CharSequence` sequence)`

**Returns:** [`java.util.Iterator<java.lang.String>`](../../../../java/util/Iterator.md)

### `splitToList(`java.lang.CharSequence` sequence)`

**Returns:** [`java.util.List<java.lang.String>`](../../../../java/util/List.md)

Splits {@code sequence} into string components and returns them as an immutable list. If you
 want an {@link Iterable} which may be lazily evaluated, use {@link #split(CharSequence)}.
@param sequence the sequence of characters to split
@return an immutable list of the segments split from the parameter
@since 15.0

### `splitToStream(`java.lang.CharSequence` sequence)`

**Returns:** [`java.util.stream.Stream<java.lang.String>`](../../../../java/util/stream/Stream.md)

Splits {@code sequence} into string components and makes them available through an {@link Stream}, which may be lazily evaluated. If you want an eagerly computed {@link List}, use
 {@link #splitToList(CharSequence)}.
@param sequence the sequence of characters to split
@return a stream over the segments split from the parameter
@since 28.2

### `withKeyValueSeparator(`java.lang.String` separator)`

**Returns:** [`com.google.common.base.Splitter.MapSplitter`](Splitter/MapSplitter.md)

Returns a {@code MapSplitter} which splits entries based on this splitter, and splits entries
 into keys and values using the specified separator.
@since 10.0

### `withKeyValueSeparator(`char` separator)`

**Returns:** [`com.google.common.base.Splitter.MapSplitter`](Splitter/MapSplitter.md)

Returns a {@code MapSplitter} which splits entries based on this splitter, and splits entries
 into keys and values using the specified separator.
@since 14.0

### `withKeyValueSeparator([`com.google.common.base.Splitter`](./Splitter.md) keyValueSplitter)`

**Returns:** [`com.google.common.base.Splitter.MapSplitter`](Splitter/MapSplitter.md)

Returns a {@code MapSplitter} which splits entries based on this splitter, and splits entries
 into keys and values using the specified key-value splitter.

 <p>Note: Any configuration option configured on this splitter, such as {@link #trimResults},
 does not change the behavior of the {@code keyValueSplitter}.

 <p>Example:

 <pre>{@code
 String toSplit = " x -> y, z-> a ";
 Splitter outerSplitter = Splitter.on(',').trimResults();
 MapSplitter mapSplitter = outerSplitter.withKeyValueSeparator(Splitter.on("->"));
 Map<String, String> result = mapSplitter.split(toSplit);
 assertThat(result).isEqualTo(ImmutableMap.of("x ", " y", "z", " a"));
 }</pre>
@since 10.0

