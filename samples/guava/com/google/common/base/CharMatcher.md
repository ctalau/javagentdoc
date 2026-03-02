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

This is not the same definition used by other Java APIs. (See a [comparison of several definitions of "whitespace"](https://goo.gl/Y6SLWx).)

 
All Unicode White_Space characters are on the BMP and thus supported by this API.

 
**Note:** as the Unicode definition evolves, we will modify this matcher to keep it up to
 date.

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `breakingWhitespace()`

See #whitespace() for a
 discussion of that term.

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `ascii()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `digit()`

If
 you only care to match ASCII digits, you can use inRange('0', '9').

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaDigit()`

If you only care to match ASCII digits, you can use inRange('0',
 '9').

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaLetter()`

If you only care to match letters of the Latin
 alphabet, you can use inRange('a', 'z').or(inRange('A', 'Z')).

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaLetterOrDigit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaUpperCase()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaLowerCase()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `javaIsoControl()`

All ISO control codes are on the BMP and thus supported by this API.

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `invisible()`

See also the Unicode Default_Ignorable_Code_Point property (available via ICU).

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `singleWidth()`

When in doubt, this matcher
 errs on the side of returning false (that is, it tends to assume a character is
 double-width).

 
**Note:** as the reference file evolves, we will modify this matcher to keep it up to
 date.

 
See also [UAX #11 East Asian Width](http://www.unicode.org/reports/tr11/).

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `is(char match)`

**Parameters:**
- `match` (`char`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `isNot(char match)`

To negate another CharMatcher, use #negate().

**Parameters:**
- `match` (`char`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `anyOf(CharSequence sequence)`

Returns a bogus matcher if the sequence contains supplementary characters.

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `noneOf(CharSequence sequence)`

Returns a bogus matcher if the sequence contains supplementary characters.

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `inRange(char startInclusive, char endInclusive)`

For example, to match any lowercase letter of the English alphabet, use 
 CharMatcher.inRange('a', 'z').

**Parameters:**
- `startInclusive` (`char`)
- `endInclusive` (`char`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `forPredicate(Predicate<? super Character> predicate)`

**Parameters:**
- `predicate` ([`com.google.common.base.Predicate<? super java.lang.Character>`](./Predicate.md))

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `matches(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** `boolean`

### `negate()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `and(CharMatcher other)`

**Parameters:**
- `other` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `or(CharMatcher other)`

**Parameters:**
- `other` ([`com.google.common.base.CharMatcher`](./CharMatcher.md))

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `precomputed()`

Precomputation takes time and is likely to be
 worthwhile only if the precomputed matcher is queried many thousands of times.

 
This method has no effect (returns this) when called in GWT: it's unclear whether a
 precomputed matcher is faster, but it certainly consumes more memory, which doesn't seem like a
 worthwhile tradeoff in a browser.

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `precomputedInternal()`

This implementation tries to be smart in a number of ways. It recognizes cases where the
 negation is cheaper to precompute than the matcher itself; it tries to build small hash tables
 for matchers that only match a few characters, and so on. In the worst-case scenario, it
 constructs an eight-kilobyte bit array and queries that. In many situations this produces a
 matcher which is faster to query than the original.

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `precomputedPositive(int totalCharacters, BitSet table, String description)`

**Parameters:**
- `totalCharacters` (`int`)
- `table` (`java.util.BitSet`)
- `description` (`java.lang.String`)

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

### `isSmall(int totalCharacters, int tableLength)`

**Parameters:**
- `totalCharacters` (`int`)
- `tableLength` (`int`)

**Returns:** `boolean`

### `setBits(BitSet table)`

**Parameters:**
- `table` (`java.util.BitSet`)

**Returns:** `void`

### `matchesAnyOf(CharSequence sequence)`

Equivalent to !matchesNoneOf(sequence).

 
The default implementation iterates over the sequence, invoking #matches for each
 character, until this returns true or the end is reached.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine, possibly empty

**Returns:** `boolean`

### `matchesAllOf(CharSequence sequence)`

The default implementation iterates over the sequence, invoking #matches for each
 character, until this returns false or the end is reached.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine, possibly empty

**Returns:** `boolean`

### `matchesNoneOf(CharSequence sequence)`

Equivalent to
 !matchesAnyOf(sequence).

 
The default implementation iterates over the sequence, invoking #matches for each
 character, until this returns true or the end is reached.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine, possibly empty

**Returns:** `boolean`

### `indexIn(CharSequence sequence)`

The default implementation iterates over the sequence in forward order calling #matches for each character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine from the beginning

**Returns:** `int`

### `indexIn(CharSequence sequence, int start)`

The default implementation iterates over the sequence in forward order, beginning at 
 start, calling #matches for each character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine
- `start` (`int`): the first index to examine; must be nonnegative and no greater than 
       sequence.length()

**Returns:** `int`

### `lastIndexIn(CharSequence sequence)`

The default implementation iterates over the sequence in reverse order calling #matches for each character.

**Parameters:**
- `sequence` (`java.lang.CharSequence`): the character sequence to examine from the end

**Returns:** `int`

### `countIn(CharSequence sequence)`

Counts 2 per supplementary character, such as for #whitespace().#negate().

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `int`

### `removeFrom(CharSequence sequence)`

For
 example:

 

```

 CharMatcher.is('a').removeFrom("bazaar")
 
```


 ... returns "bzr".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `retainFrom(CharSequence sequence)`

For
 example:

 

```

 CharMatcher.is('a').retainFrom("bazaar")
 
```


 ... returns "aaa".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `replaceFrom(CharSequence sequence, char replacement)`

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

**Returns:** `java.lang.String`

### `replaceFrom(CharSequence sequence, CharSequence replacement)`

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

**Returns:** `java.lang.String`

### `trimFrom(CharSequence sequence)`

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

**Returns:** `java.lang.String`

### `trimLeadingFrom(CharSequence sequence)`

For example:

 

```

 CharMatcher.anyOf("ab").trimLeadingFrom("abacatbab")
 
```


 ... returns "catbab".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `trimTrailingFrom(CharSequence sequence)`

For example:

 

```

 CharMatcher.anyOf("ab").trimTrailingFrom("abacatbab")
 
```


 ... returns "abacat".

**Parameters:**
- `sequence` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `collapseFrom(CharSequence sequence, char replacement)`

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

**Returns:** `java.lang.String`

### `trimAndCollapseFrom(CharSequence sequence, char replacement)`

**Parameters:**
- `sequence` (`java.lang.CharSequence`)
- `replacement` (`char`)

**Returns:** `java.lang.String`

### `finishCollapseFrom(CharSequence sequence, int start, int end, char replacement, StringBuilder builder, boolean inMatchingGroup)`

**Parameters:**
- `sequence` (`java.lang.CharSequence`)
- `start` (`int`)
- `end` (`int`)
- `replacement` (`char`)
- `builder` (`java.lang.StringBuilder`)
- `inMatchingGroup` (`boolean`)

**Returns:** `java.lang.String`

### `apply(Character character)`

**Parameters:**
- `character` (`java.lang.Character`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `showCharacter(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** `java.lang.String`

### `isEither(char c1, char c2)`

**Parameters:**
- `c1` (`char`)
- `c2` (`char`)

**Returns:** `com.google.common.base.CharMatcher.IsEither`

