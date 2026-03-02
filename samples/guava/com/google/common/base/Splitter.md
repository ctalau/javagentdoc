# Class: `Splitter`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Splitter`

## Description

This separator can be specified as a single character, fixed string, regular expression or
 CharMatcher instance. Or, instead of using a separator at all, a
 splitter can extract adjacent substrings of a given fixed length.

 
For example, this expression:

 

```

 Splitter.on(',').split("foo,bar,qux")
 
```


 ... produces an Iterable containing "foo", "bar" and "qux", in
 that order.

 
By default, Splitter's behavior is simplistic and unassuming. The following
 expression:

 

```

 Splitter.on(',').split(" foo,,,  bar ,")
 
```


 ... yields the substrings [" foo", "", "", " bar ", ""]. If this is not the desired
 behavior, use configuration methods to obtain a *new* splitter instance with modified
 behavior:

 

```

 private static final Splitter MY_SPLITTER = Splitter.on(',')
     .trimResults()
     .omitEmptyStrings();
 
```


 
Now MY_SPLITTER.split("foo,,, bar ,") returns just ["foo", "bar"]. Note that
 the order in which these configuration methods are called is never significant.

 
**Warning:** Splitter instances are immutable. Invoking a configuration method has no
 effect on the receiving instance; you must store and use the new splitter instance it returns
 instead.

 

```

 // Do NOT do this
 Splitter splitter = Splitter.on('/');
 splitter.trimResults(); // does nothing!
 return splitter.split("wrong / wrong / wrong");
 
```


 
For separator-based splitters that do not use omitEmptyStrings, an input string
 containing n occurrences of the separator naturally yields an iterable of size n +
 1. So if the separator does not occur anywhere in the input, a single substring is returned
 containing the entire input. Consequently, all splitters split the empty string to [""]
 (note: even fixed-length splitters).

 
Splitter instances are thread-safe immutable, and are therefore safe to store as static
 final constants.

 
The Joiner class provides the inverse operation to splitting, but note that a
 round-trip between the two should be assumed to be lossy.

 
See the Guava User Guide article on [Splitter](https://github.com/google/guava/wiki/StringsExplained#splitter).

## Fields

### `trimmer`

**Type:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `omitEmptyStrings`

**Type:** `boolean`

### `strategy`

**Type:** `com.google.common.base.Splitter.Strategy`

### `limit`

**Type:** `int`

## Constructors

### `<init>(Splitter.Strategy strategy)`

**Parameters:**
- `strategy` (`com.google.common.base.Splitter.Strategy`)

### `<init>(Splitter.Strategy strategy, boolean omitEmptyStrings, CharMatcher trimmer, int limit)`

**Parameters:**
- `strategy` (`com.google.common.base.Splitter.Strategy`)
- `omitEmptyStrings` (`boolean`)
- `trimmer` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))
- `limit` (`int`)

## Methods

### `on(char separator)`

For example, 
 Splitter.on(',').split("foo,,bar") returns an iterable containing ["foo", "", "bar"].

**Parameters:**
- `separator` (`char`): the character to recognize as a separator

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `on(CharMatcher separatorMatcher)`

For example, 
 Splitter.on(CharMatcher.anyOf(";,")).split("foo,;bar,quux") returns an iterable containing
 ["foo", "", "bar", "quux"].

**Parameters:**
- `separatorMatcher` ([`com.google.common.base.CharMatcher`](./CharMatcher.md)): a CharMatcher that determines whether a character is a
       separator

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `on(String separator)`

For example, 
 Splitter.on(", ").split("foo, bar,baz") returns an iterable containing ["foo",
 "bar,baz"].

**Parameters:**
- `separator` (`java.lang.String`): the literal, nonempty string to recognize as a separator

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `on(Pattern separatorPattern)`

For example, Splitter.on(Pattern.compile("\r?\n")).split(entireFile) splits a string
 into lines whether it uses DOS-style or UNIX-style line terminators.

**Parameters:**
- `separatorPattern` (`java.util.regex.Pattern`): the pattern that determines whether a subsequence is a separator. This
       pattern may not match the empty string.

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `onPatternInternal(CommonPattern separatorPattern)`

**Parameters:**
- `separatorPattern` ([`com.google.common.base.CommonPattern`](./CommonPattern.md))

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `onPattern(String separatorPattern)`

For example, Splitter.onPattern("\r?\n").split(entireFile) splits a
 string into lines whether it uses DOS-style or UNIX-style line terminators. This is equivalent
 to Splitter.on(Pattern.compile(pattern)).

**Parameters:**
- `separatorPattern` (`java.lang.String`): the pattern that determines whether a subsequence is a separator. This
       pattern may not match the empty string.

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `fixedLength(int length)`

For example, 
 Splitter.fixedLength(2).split("abcde") returns an iterable containing ["ab", "cd",
 "e"]. The last piece can be smaller than length but will never be empty.

 
**Note:** if #fixedLength is used in conjunction with #limit, the final
 split piece *may be longer than the specified fixed length*. This is because the splitter
 will *stop splitting when the limit is reached*, and just return the final piece as-is.

 
**Exception:** for consistency with separator-based splitters, split("") does not
 yield an empty iterable, but an iterable containing "". This is the only case in which
 Iterables.size(split(input)) does not equal IntMath.divide(input.length(),
 length, CEILING). To avoid this behavior, use omitEmptyStrings.

**Parameters:**
- `length` (`int`): the desired length of pieces after splitting, a positive integer

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `omitEmptyStrings()`

For example, 
 Splitter.on(',').omitEmptyStrings().split(",a,,,b,c,,") returns an iterable containing only
 ["a", "b", "c"].

 
If either trimResults option is also specified when creating a splitter, that
 splitter always trims results first before checking for emptiness. So, for example, 
 Splitter.on(':').omitEmptyStrings().trimResults().split(": : : ") returns an empty iterable.

 
Note that it is ordinarily not possible for #split(CharSequence) to return an empty
 iterable, but when using this option, it can (if the input sequence consists of nothing but
 separators).

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `limit(int maxItems)`

The limit defines the maximum number of items returned by the iterator,
 or the maximum size of the list returned by #splitToList.

 
For example, Splitter.on(',').limit(3).split("a,b,c,d") returns an iterable
 containing ["a", "b", "c,d"]. When omitting empty strings, the omitted strings do not
 count. Hence, Splitter.on(',').limit(3).omitEmptyStrings().split("a,,,b,,,c,d") returns
 an iterable containing ["a", "b", "c,d". When trim is requested, all entries are
 trimmed, including the last. Hence Splitter.on(',').limit(3).trimResults().split(" a , b
 , c , d ") results in ["a", "b", "c , d"].

**Parameters:**
- `maxItems` (`int`): the maximum number of items returned

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `trimResults()`

For example, 
 Splitter.on(',').trimResults().split(" a, b ,c ") returns an iterable containing ["a",
 "b", "c"].

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `trimResults(CharMatcher trimmer)`

For
 example, Splitter.on(',').trimResults(CharMatcher.is('_')).split("_a ,_b_ ,c__")
 returns an iterable containing ["a ", "b_ ", "c"].

**Parameters:**
- `trimmer` ([`com.google.common.base.CharMatcher`](./CharMatcher.md)): a CharMatcher that determines whether a character should be removed from
       the beginning/end of a subsequence

**Returns:** [`com.google.common.base.Splitter`](./Splitter.md)

### `split(CharSequence sequence)`

If you want an eagerly computed List, use
 #splitToList(CharSequence). Java 8 users may prefer #splitToStream instead.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the sequence of characters to split

**Returns:** `java.lang.Iterable<java.lang.String>`

### `splittingIterator(CharSequence sequence)`

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `java.util.Iterator<java.lang.String>`

### `splitToList(CharSequence sequence)`

If you
 want an Iterable which may be lazily evaluated, use #split(CharSequence).

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the sequence of characters to split

**Returns:** `java.util.List<java.lang.String>`

### `splitToStream(CharSequence sequence)`

If you want an eagerly computed List, use
 #splitToList(CharSequence).

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the sequence of characters to split

**Returns:** `java.util.stream.Stream<java.lang.String>`

### `withKeyValueSeparator(String separator)`

**Parameters:**
- `separator` (`java.lang.String`)

**Returns:** `com.google.common.base.Splitter.MapSplitter`

### `withKeyValueSeparator(char separator)`

**Parameters:**
- `separator` (`char`)

**Returns:** `com.google.common.base.Splitter.MapSplitter`

### `withKeyValueSeparator(Splitter keyValueSplitter)`

Note: Any configuration option configured on this splitter, such as #trimResults,
 does not change the behavior of the keyValueSplitter.

 
Example:

 

```

 String toSplit = " x -> y, z-> a ";
 Splitter outerSplitter = Splitter.on(',').trimResults();
 MapSplitter mapSplitter = outerSplitter.withKeyValueSeparator(Splitter.on("->"));
 Map<String, String> result = mapSplitter.split(toSplit);
 assertThat(result).isEqualTo(ImmutableMap.of("x ", " y", "z", " a"));
 
```

**Parameters:**
- `keyValueSplitter` ([`com.google.common.base.Splitter`](./Splitter.md))

**Returns:** `com.google.common.base.Splitter.MapSplitter`

