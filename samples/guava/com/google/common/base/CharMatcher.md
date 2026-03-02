# Class: `CharMatcher`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.CharMatcher`

**Implements:** [`com.google.common.base.Predicate<java.lang.Character>`](./Predicate.md)

## Description

Also offers basic text processing methods based on this function.
 Implementations are strongly encouraged to be side-effect-free and immutable.

 
Throughout the documentation of this class, the phrase "matching character" is used to mean
 "any char value c for which this.matches(c) returns true".

 
**Warning:** This class deals only with char values, that is, [BMP characters](http://www.unicode.org/glossary/#BMP_character). It does not understand
 [supplementary Unicode code
 points](http://www.unicode.org/glossary/#supplementary_code_point) in the range 0x10000 to 0x10FFFF which includes the majority of
 assigned characters, including important CJK characters and emoji.

 
Supplementary characters are [encoded
 into a String using surrogate pairs](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#supplementary), and a CharMatcher treats these just as
 two separate characters. #countIn counts each supplementary character as 2 chars.

 
For up-to-date Unicode character properties (digit, letter, etc.) and support for
 supplementary code points, use ICU4J UCharacter and UnicodeSet (freeze() after building). For
 basic text processing based on UnicodeSet use the ICU4J UnicodeSetSpanner.

 
Example usages:

 

```

   String trimmed = whitespace().trimFrom(userInput);
   if (ascii().matchesAllOf(s)) { ... }
```


 
See the Guava User Guide article on [CharMatcher
 ](https://github.com/google/guava/wiki/StringsExplained#charmatcher).

## Fields

### `DISTINCT_CHARS`

**Type:** `int`

## Constructors

### `<init>()`

When subclassing, you may want to override 
 toString() to provide a useful description.

## Methods

### `any()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `none()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `whitespace()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

This is not the same definition used by other Java APIs. (See a [comparison of several definitions of "whitespace"](https://goo.gl/Y6SLWx).)

 
All Unicode White_Space characters are on the BMP and thus supported by this API.

 
**Note:** as the Unicode definition evolves, we will modify this matcher to keep it up to
 date.

### `breakingWhitespace()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

See #whitespace() for a
 discussion of that term.

### `ascii()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `digit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

If
 you only care to match ASCII digits, you can use inRange('0', '9').

### `javaDigit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

If you only care to match ASCII digits, you can use inRange('0',
 '9').

### `javaLetter()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

If you only care to match letters of the Latin
 alphabet, you can use inRange('a', 'z').or(inRange('A', 'Z')).

### `javaLetterOrDigit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaUpperCase()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaLowerCase()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaIsoControl()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

All ISO control codes are on the BMP and thus supported by this API.

### `invisible()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

See also the Unicode Default_Ignorable_Code_Point property (available via ICU).

### `singleWidth()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

When in doubt, this matcher
 errs on the side of returning false (that is, it tends to assume a character is
 double-width).

 
**Note:** as the reference file evolves, we will modify this matcher to keep it up to
 date.

 
See also [UAX #11 East Asian Width](http://www.unicode.org/reports/tr11/).

### `is(char match)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `match` (`char`)

### `isNot(char match)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

To negate another CharMatcher, use #negate().

**Parameters:**
- `match` (`char`)

### `anyOf(java.lang.CharSequence sequence)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a bogus matcher if the sequence contains supplementary characters.

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `noneOf(java.lang.CharSequence sequence)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a bogus matcher if the sequence contains supplementary characters.

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `inRange(char startInclusive, char endInclusive)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

For example, to match any lowercase letter of the English alphabet, use 
 CharMatcher.inRange('a', 'z').

**Parameters:**
- `startInclusive` (`char`)
- `endInclusive` (`char`)

### `forPredicate(com.google.common.base.Predicate<? super java.lang.Character> predicate)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super java.lang.Character>`](./Predicate.md))

### `matches(char c)`

**Returns:** `boolean`

**Parameters:**
- `c` (`char`)

### `negate()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `and(com.google.common.base.CharMatcher other)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `other` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))

### `or(com.google.common.base.CharMatcher other)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `other` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))

### `precomputed()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Precomputation takes time and is likely to be
 worthwhile only if the precomputed matcher is queried many thousands of times.

 
This method has no effect (returns this) when called in GWT: it's unclear whether a
 precomputed matcher is faster, but it certainly consumes more memory, which doesn't seem like a
 worthwhile tradeoff in a browser.

### `precomputedInternal()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

This implementation tries to be smart in a number of ways. It recognizes cases where the
 negation is cheaper to precompute than the matcher itself; it tries to build small hash tables
 for matchers that only match a few characters, and so on. In the worst-case scenario, it
 constructs an eight-kilobyte bit array and queries that. In many situations this produces a
 matcher which is faster to query than the original.

### `precomputedPositive(int totalCharacters, java.util.BitSet table, java.lang.String description)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

**Parameters:**
- `totalCharacters` (`int`)
- `table` (`java.util.BitSet`)
- `description` (`java.lang.String`)

### `isSmall(int totalCharacters, int tableLength)`

**Returns:** `boolean`

**Parameters:**
- `totalCharacters` (`int`)
- `tableLength` (`int`)

### `setBits(java.util.BitSet table)`

**Returns:** `void`

**Parameters:**
- `table` (`java.util.BitSet`)

### `matchesAnyOf(java.lang.CharSequence sequence)`

**Returns:** `boolean`

Equivalent to !matchesNoneOf(sequence).

 
The default implementation iterates over the sequence, invoking #matches for each
 character, until this returns true or the end is reached.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine, possibly empty

### `matchesAllOf(java.lang.CharSequence sequence)`

**Returns:** `boolean`

The default implementation iterates over the sequence, invoking #matches for each
 character, until this returns false or the end is reached.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine, possibly empty

### `matchesNoneOf(java.lang.CharSequence sequence)`

**Returns:** `boolean`

Equivalent to
 !matchesAnyOf(sequence).

 
The default implementation iterates over the sequence, invoking #matches for each
 character, until this returns true or the end is reached.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine, possibly empty

### `indexIn(java.lang.CharSequence sequence)`

**Returns:** `int`

The default implementation iterates over the sequence in forward order calling #matches for each character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine from the beginning

### `indexIn(java.lang.CharSequence sequence, int start)`

**Returns:** `int`

The default implementation iterates over the sequence in forward order, beginning at 
 start, calling #matches for each character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine
- `start` (`int`): the first index to examine; must be nonnegative and no greater than 
     sequence.length()

### `lastIndexIn(java.lang.CharSequence sequence)`

**Returns:** `int`

The default implementation iterates over the sequence in reverse order calling #matches for each character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine from the end

### `countIn(java.lang.CharSequence sequence)`

**Returns:** `int`

Counts 2 per supplementary character, such as for #whitespace().#negate().

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `removeFrom(java.lang.CharSequence sequence)`

**Returns:** `java.lang.String`

For
 example:

 

```

 CharMatcher.is('a').removeFrom("bazaar")
 
```


 ... returns "bzr".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `retainFrom(java.lang.CharSequence sequence)`

**Returns:** `java.lang.String`

For
 example:

 

```

 CharMatcher.is('a').retainFrom("bazaar")
 
```


 ... returns "aaa".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `replaceFrom(java.lang.CharSequence sequence, char replacement)`

**Returns:** `java.lang.String`

For example:

 

```

 CharMatcher.is('a').replaceFrom("radar", 'o')
 
```


 ... returns "rodor".

 
The default implementation uses #indexIn(CharSequence) to find the first matching
 character, then iterates the remainder of the sequence calling #matches(char) for each
 character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to replace matching characters in
- `replacement` (`char`): the character to append to the result string in place of each matching
     character in sequence

### `replaceFrom(java.lang.CharSequence sequence, java.lang.CharSequence replacement)`

**Returns:** `java.lang.String`

For example:

 

```

 CharMatcher.is('a').replaceFrom("yaha", "oo")
 
```


 ... returns "yoohoo".

 
**Note:** If the replacement is a fixed string with only one character, you are better
 off calling #replaceFrom(CharSequence, char) directly.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to replace matching characters in
- `replacement` (`java.lang.CharSequence`): the characters to append to the result string in place of each matching
     character in sequence

### `trimFrom(java.lang.CharSequence sequence)`

**Returns:** `java.lang.String`

For example:

 

```

 CharMatcher.anyOf("ab").trimFrom("abacatbab")
 
```


 ... returns "cat".

 
Note that:

 

```

 CharMatcher.inRange('\0', ' ').trimFrom(str)
 
```


 ... is equivalent to String#trim().

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `trimLeadingFrom(java.lang.CharSequence sequence)`

**Returns:** `java.lang.String`

For example:

 

```

 CharMatcher.anyOf("ab").trimLeadingFrom("abacatbab")
 
```


 ... returns "catbab".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `trimTrailingFrom(java.lang.CharSequence sequence)`

**Returns:** `java.lang.String`

For example:

 

```

 CharMatcher.anyOf("ab").trimTrailingFrom("abacatbab")
 
```


 ... returns "abacat".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

### `collapseFrom(java.lang.CharSequence sequence, char replacement)`

**Returns:** `java.lang.String`

For example:

 

```

 CharMatcher.anyOf("eko").collapseFrom("bookkeeper", '-')
 
```


 ... returns "b-p-r".

 
The default implementation uses #indexIn(CharSequence) to find the first matching
 character, then iterates the remainder of the sequence calling #matches(char) for each
 character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to replace matching groups of characters in
- `replacement` (`char`): the character to append to the result string in place of each group of
     matching characters in sequence

### `trimAndCollapseFrom(java.lang.CharSequence sequence, char replacement)`

**Returns:** `java.lang.String`

**Parameters:**
- `sequence` (`java.lang.CharSequence`)
- `replacement` (`char`)

### `finishCollapseFrom(java.lang.CharSequence sequence, int start, int end, char replacement, java.lang.StringBuilder builder, boolean inMatchingGroup)`

**Returns:** `java.lang.String`

**Parameters:**
- `sequence` (`java.lang.CharSequence`)
- `start` (`int`)
- `end` (`int`)
- `replacement` (`char`)
- `builder` (`java.lang.StringBuilder`)
- `inMatchingGroup` (`boolean`)

### `apply(java.lang.Character character)`

**Returns:** `boolean`

**Parameters:**
- `character` (`java.lang.Character`)

### `toString()`

**Returns:** `java.lang.String`

### `showCharacter(char c)`

**Returns:** `java.lang.String`

**Parameters:**
- `c` (`char`)

### `isEither(char c1, char c2)`

**Returns:** `com.google.common.base.CharMatcher.IsEither`

**Parameters:**
- `c1` (`char`)
- `c2` (`char`)

