# Class: `CharMatcher`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.CharMatcher`

**Implements:** [`com.google.common.base.Predicate<java.lang.Character>`](./Predicate.md)

## Description

Determines a true or false value for any Java {@code char} value, just as {@link Predicate} does
 for any {@link Object}. Also offers basic text processing methods based on this function.
 Implementations are strongly encouraged to be side-effect-free and immutable.

 <p>Throughout the documentation of this class, the phrase "matching character" is used to mean
 "any {@code char} value {@code c} for which {@code this.matches(c)} returns {@code true}".

 <p><b>Warning:</b> This class deals only with {@code char} values, that is, <a href="http://www.unicode.org/glossary/#BMP_character">BMP characters</a>. It does not understand
 <a href="http://www.unicode.org/glossary/#supplementary_code_point">supplementary Unicode code
 points</a> in the range {@code 0x10000} to {@code 0x10FFFF} which includes the majority of
 assigned characters, including important CJK characters and emoji.

 <p>Supplementary characters are <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#supplementary">encoded
 into a {@code String} using surrogate pairs</a>, and a {@code CharMatcher} treats these just as
 two separate characters. {@link #countIn} counts each supplementary character as 2 {@code char}s.

 <p>For up-to-date Unicode character properties (digit, letter, etc.) and support for
 supplementary code points, use ICU4J UCharacter and UnicodeSet (freeze() after building). For
 basic text processing based on UnicodeSet use the ICU4J UnicodeSetSpanner.

 <p>Example usages:

 <pre>
   String trimmed = {@link #whitespace() whitespace()}.{@link #trimFrom trimFrom}(userInput);
   if ({@link #ascii() ascii()}.{@link #matchesAllOf matchesAllOf}(s)) { ... }</pre>

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/StringsExplained#charmatcher">{@code CharMatcher}
 </a>.
@author Kevin Bourrillion
@since 1.0

## Fields

### `DISTINCT_CHARS`

**Type:** `int`

## Constructors

### `<init>()`

Constructor for use by subclasses. When subclassing, you may want to override {@code
 toString()} to provide a useful description.

## Methods

### `any()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Matches any character.
@since 19.0 (since 1.0 as constant {@code ANY})

### `none()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Matches no characters.
@since 19.0 (since 1.0 as constant {@code NONE})

### `whitespace()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is whitespace according to the latest Unicode standard, as
 illustrated <a href="http://unicode.org/cldr/utility/list-unicodeset.jsp?a=%5Cp%7Bwhitespace%7D">here</a>.
 This is not the same definition used by other Java APIs. (See a <a href="https://goo.gl/Y6SLWx">comparison of several definitions of "whitespace"</a>.)

 <p>All Unicode White_Space characters are on the BMP and thus supported by this API.

 <p><b>Note:</b> as the Unicode definition evolves, we will modify this matcher to keep it up to
 date.
@since 19.0 (since 1.0 as constant {@code WHITESPACE})

### `breakingWhitespace()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is a breaking whitespace (that is, a whitespace which can be
 interpreted as a break between words for formatting purposes). See {@link #whitespace()} for a
 discussion of that term.
@since 19.0 (since 2.0 as constant {@code BREAKING_WHITESPACE})

### `ascii()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is ASCII, meaning that its code point is less than 128.
@since 19.0 (since 1.0 as constant {@code ASCII})

### `digit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is a BMP digit according to <a href="http://unicode.org/cldr/utility/list-unicodeset.jsp?a=%5Cp%7Bdigit%7D">Unicode</a>. If
 you only care to match ASCII digits, you can use {@code inRange('0', '9')}.
@deprecated Many digits are supplementary characters; see the class documentation.
@since 19.0 (since 1.0 as constant {@code DIGIT})

### `javaDigit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is a BMP digit according to {@linkplain Character#isDigit(char) Java's definition}. If you only care to match ASCII digits, you can use {@code inRange('0',
 '9')}.
@deprecated Many digits are supplementary characters; see the class documentation.
@since 19.0 (since 1.0 as constant {@code JAVA_DIGIT})

### `javaLetter()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is a BMP letter according to {@linkplain Character#isLetter(char) Java's definition}. If you only care to match letters of the Latin
 alphabet, you can use {@code inRange('a', 'z').or(inRange('A', 'Z'))}.
@deprecated Most letters are supplementary characters; see the class documentation.
@since 19.0 (since 1.0 as constant {@code JAVA_LETTER})

### `javaLetterOrDigit()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is a BMP letter or digit according to {@linkplain Character#isLetterOrDigit(char) Java's definition}.
@deprecated Most letters and digits are supplementary characters; see the class documentation.
@since 19.0 (since 1.0 as constant {@code JAVA_LETTER_OR_DIGIT}).

### `javaUpperCase()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a BMP character is upper case according to {@linkplain Character#isUpperCase(char) Java's definition}.
@deprecated Some uppercase characters are supplementary characters; see the class
     documentation.
@since 19.0 (since 1.0 as constant {@code JAVA_UPPER_CASE})

### `javaLowerCase()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a BMP character is lower case according to {@linkplain Character#isLowerCase(char) Java's definition}.
@deprecated Some lowercase characters are supplementary characters; see the class
     documentation.
@since 19.0 (since 1.0 as constant {@code JAVA_LOWER_CASE})

### `javaIsoControl()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is an ISO control character as specified by {@link Character#isISOControl(char)}.

 <p>All ISO control codes are on the BMP and thus supported by this API.
@since 19.0 (since 1.0 as constant {@code JAVA_ISO_CONTROL})

### `invisible()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is invisible; that is, if its Unicode category is any of
 SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, SURROGATE, and
 PRIVATE_USE according to ICU4J.

 <p>See also the Unicode Default_Ignorable_Code_Point property (available via ICU).
@deprecated Most invisible characters are supplementary characters; see the class
     documentation.
@since 19.0 (since 1.0 as constant {@code INVISIBLE})

### `singleWidth()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Determines whether a character is single-width (not double-width). When in doubt, this matcher
 errs on the side of returning {@code false} (that is, it tends to assume a character is
 double-width).

 <p><b>Note:</b> as the reference file evolves, we will modify this matcher to keep it up to
 date.

 <p>See also <a href="http://www.unicode.org/reports/tr11/">UAX #11 East Asian Width</a>.
@deprecated Many such characters are supplementary characters; see the class documentation.
@since 19.0 (since 1.0 as constant {@code SINGLE_WIDTH})

### `is(`char` match)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a {@code char} matcher that matches only one specified BMP character.

### `isNot(`char` match)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a {@code char} matcher that matches any character except the BMP character specified.

 <p>To negate another {@code CharMatcher}, use {@link #negate()}.

### `anyOf(`java.lang.CharSequence` sequence)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a {@code char} matcher that matches any BMP character present in the given character
 sequence. Returns a bogus matcher if the sequence contains supplementary characters.

### `noneOf(`java.lang.CharSequence` sequence)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a {@code char} matcher that matches any BMP character not present in the given
 character sequence. Returns a bogus matcher if the sequence contains supplementary characters.

### `inRange(`char` startInclusive, `char` endInclusive)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a {@code char} matcher that matches any character in a given BMP range (both endpoints
 are inclusive). For example, to match any lowercase letter of the English alphabet, use {@code
 CharMatcher.inRange('a', 'z')}.
@throws IllegalArgumentException if {@code endInclusive < startInclusive}

### `forPredicate([`com.google.common.base.Predicate<? super java.lang.Character>`](./Predicate.md) predicate)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a matcher with identical behavior to the given {@link Character}-based predicate, but
 which operates on primitive {@code char} instances instead.

### `matches(`char` c)`

**Returns:** `boolean`

Determines a true or false value for the given character.

### `negate()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a matcher that matches any character not matched by this matcher.

### `and([`com.google.common.base.CharMatcher`](./CharMatcher.md) other)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a matcher that matches any character matched by both this matcher and {@code other}.

### `or([`com.google.common.base.CharMatcher`](./CharMatcher.md) other)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a matcher that matches any character matched by either this matcher or {@code other}.

### `precomputed()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Returns a {@code char} matcher functionally equivalent to this one, but which may be faster to
 query than the original; your mileage may vary. Precomputation takes time and is likely to be
 worthwhile only if the precomputed matcher is queried many thousands of times.

 <p>This method has no effect (returns {@code this}) when called in GWT: it's unclear whether a
 precomputed matcher is faster, but it certainly consumes more memory, which doesn't seem like a
 worthwhile tradeoff in a browser.

### `precomputedInternal()`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

This is the actual implementation of {@link #precomputed}, but we bounce calls through a method
 on {@link Platform} so that we can have different behavior in GWT.

 <p>This implementation tries to be smart in a number of ways. It recognizes cases where the
 negation is cheaper to precompute than the matcher itself; it tries to build small hash tables
 for matchers that only match a few characters, and so on. In the worst-case scenario, it
 constructs an eight-kilobyte bit array and queries that. In many situations this produces a
 matcher which is faster to query than the original.

### `precomputedPositive(`int` totalCharacters, [`java.util.BitSet`](../../../../java/util/BitSet.md) table, `java.lang.String` description)`

**Returns:** [`com.google.common.base.CharMatcher`](./CharMatcher.md)

Helper method for {@link #precomputedInternal} that doesn't test if the negation is cheaper.

### `isSmall(`int` totalCharacters, `int` tableLength)`

**Returns:** `boolean`

### `setBits([`java.util.BitSet`](../../../../java/util/BitSet.md) table)`

**Returns:** `void`

Sets bits in {@code table} matched by this matcher.

### `matchesAnyOf(`java.lang.CharSequence` sequence)`

**Returns:** `boolean`

Returns {@code true} if a character sequence contains at least one matching BMP character.
 Equivalent to {@code !matchesNoneOf(sequence)}.

 <p>The default implementation iterates over the sequence, invoking {@link #matches} for each
 character, until this returns {@code true} or the end is reached.
@param sequence the character sequence to examine, possibly empty
@return {@code true} if this matcher matches at least one character in the sequence
@since 8.0

### `matchesAllOf(`java.lang.CharSequence` sequence)`

**Returns:** `boolean`

Returns {@code true} if a character sequence contains only matching BMP characters.

 <p>The default implementation iterates over the sequence, invoking {@link #matches} for each
 character, until this returns {@code false} or the end is reached.
@param sequence the character sequence to examine, possibly empty
@return {@code true} if this matcher matches every character in the sequence, including when
     the sequence is empty

### `matchesNoneOf(`java.lang.CharSequence` sequence)`

**Returns:** `boolean`

Returns {@code true} if a character sequence contains no matching BMP characters. Equivalent to
 {@code !matchesAnyOf(sequence)}.

 <p>The default implementation iterates over the sequence, invoking {@link #matches} for each
 character, until this returns {@code true} or the end is reached.
@param sequence the character sequence to examine, possibly empty
@return {@code true} if this matcher matches no characters in the sequence, including when the
     sequence is empty

### `indexIn(`java.lang.CharSequence` sequence)`

**Returns:** `int`

Returns the index of the first matching BMP character in a character sequence, or {@code -1} if
 no matching character is present.

 <p>The default implementation iterates over the sequence in forward order calling {@link #matches} for each character.
@param sequence the character sequence to examine from the beginning
@return an index, or {@code -1} if no character matches

### `indexIn(`java.lang.CharSequence` sequence, `int` start)`

**Returns:** `int`

Returns the index of the first matching BMP character in a character sequence, starting from a
 given position, or {@code -1} if no character matches after that position.

 <p>The default implementation iterates over the sequence in forward order, beginning at {@code
 start}, calling {@link #matches} for each character.
@param sequence the character sequence to examine
@param start the first index to examine; must be nonnegative and no greater than {@code
     sequence.length()}
@return the index of the first matching character, guaranteed to be no less than {@code start},
     or {@code -1} if no character matches
@throws IndexOutOfBoundsException if start is negative or greater than {@code
     sequence.length()}

### `lastIndexIn(`java.lang.CharSequence` sequence)`

**Returns:** `int`

Returns the index of the last matching BMP character in a character sequence, or {@code -1} if
 no matching character is present.

 <p>The default implementation iterates over the sequence in reverse order calling {@link #matches} for each character.
@param sequence the character sequence to examine from the end
@return an index, or {@code -1} if no character matches

### `countIn(`java.lang.CharSequence` sequence)`

**Returns:** `int`

Returns the number of matching {@code char}s found in a character sequence.

 <p>Counts 2 per supplementary character, such as for {@link #whitespace}().{@link #negate}().

### `removeFrom(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.String`

Returns a string containing all non-matching characters of a character sequence, in order. For
 example:

 <pre>{@code
 CharMatcher.is('a').removeFrom("bazaar")
 }</pre>

 ... returns {@code "bzr"}.

### `retainFrom(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.String`

Returns a string containing all matching BMP characters of a character sequence, in order. For
 example:

 <pre>{@code
 CharMatcher.is('a').retainFrom("bazaar")
 }</pre>

 ... returns {@code "aaa"}.

### `replaceFrom(`java.lang.CharSequence` sequence, `char` replacement)`

**Returns:** `java.lang.String`

Returns a string copy of the input character sequence, with each matching BMP character
 replaced by a given replacement character. For example:

 <pre>{@code
 CharMatcher.is('a').replaceFrom("radar", 'o')
 }</pre>

 ... returns {@code "rodor"}.

 <p>The default implementation uses {@link #indexIn(CharSequence)} to find the first matching
 character, then iterates the remainder of the sequence calling {@link #matches(char)} for each
 character.
@param sequence the character sequence to replace matching characters in
@param replacement the character to append to the result string in place of each matching
     character in {@code sequence}
@return the new string

### `replaceFrom(`java.lang.CharSequence` sequence, `java.lang.CharSequence` replacement)`

**Returns:** `java.lang.String`

Returns a string copy of the input character sequence, with each matching BMP character
 replaced by a given replacement sequence. For example:

 <pre>{@code
 CharMatcher.is('a').replaceFrom("yaha", "oo")
 }</pre>

 ... returns {@code "yoohoo"}.

 <p><b>Note:</b> If the replacement is a fixed string with only one character, you are better
 off calling {@link #replaceFrom(CharSequence, char)} directly.
@param sequence the character sequence to replace matching characters in
@param replacement the characters to append to the result string in place of each matching
     character in {@code sequence}
@return the new string

### `trimFrom(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.String`

Returns a substring of the input character sequence that omits all matching BMP characters from
 the beginning and from the end of the string. For example:

 <pre>{@code
 CharMatcher.anyOf("ab").trimFrom("abacatbab")
 }</pre>

 ... returns {@code "cat"}.

 <p>Note that:

 <pre>{@code
 CharMatcher.inRange('\0', ' ').trimFrom(str)
 }</pre>

 ... is equivalent to {@link String#trim()}.

### `trimLeadingFrom(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.String`

Returns a substring of the input character sequence that omits all matching BMP characters from
 the beginning of the string. For example:

 <pre>{@code
 CharMatcher.anyOf("ab").trimLeadingFrom("abacatbab")
 }</pre>

 ... returns {@code "catbab"}.

### `trimTrailingFrom(`java.lang.CharSequence` sequence)`

**Returns:** `java.lang.String`

Returns a substring of the input character sequence that omits all matching BMP characters from
 the end of the string. For example:

 <pre>{@code
 CharMatcher.anyOf("ab").trimTrailingFrom("abacatbab")
 }</pre>

 ... returns {@code "abacat"}.

### `collapseFrom(`java.lang.CharSequence` sequence, `char` replacement)`

**Returns:** `java.lang.String`

Returns a string copy of the input character sequence, with each group of consecutive matching
 BMP characters replaced by a single replacement character. For example:

 <pre>{@code
 CharMatcher.anyOf("eko").collapseFrom("bookkeeper", '-')
 }</pre>

 ... returns {@code "b-p-r"}.

 <p>The default implementation uses {@link #indexIn(CharSequence)} to find the first matching
 character, then iterates the remainder of the sequence calling {@link #matches(char)} for each
 character.
@param sequence the character sequence to replace matching groups of characters in
@param replacement the character to append to the result string in place of each group of
     matching characters in {@code sequence}
@return the new string

### `trimAndCollapseFrom(`java.lang.CharSequence` sequence, `char` replacement)`

**Returns:** `java.lang.String`

Collapses groups of matching characters exactly as {@link #collapseFrom} does, except that
 groups of matching BMP characters at the start or end of the sequence are removed without
 replacement.

### `finishCollapseFrom(`java.lang.CharSequence` sequence, `int` start, `int` end, `char` replacement, `java.lang.StringBuilder` builder, `boolean` inMatchingGroup)`

**Returns:** `java.lang.String`

### `apply(`java.lang.Character` character)`

**Returns:** `boolean`

@deprecated Provided only to satisfy the {@link Predicate} interface; use {@link #matches}
     instead.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this {@code CharMatcher}, such as {@code
 CharMatcher.or(WHITESPACE, JAVA_DIGIT)}.

### `showCharacter(`char` c)`

**Returns:** `java.lang.String`

Returns the Java Unicode escape sequence for the given {@code char}, in the form "\u12ab" where
 "12AB" is the four hexadecimal digits representing the 16-bit code unit.

### `isEither(`char` c1, `char` c2)`

**Returns:** [`com.google.common.base.CharMatcher.IsEither`](CharMatcher/IsEither.md)

