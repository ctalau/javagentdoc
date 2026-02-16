# Interface: `PatternCompiler`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.PatternCompiler`

## Description

Pluggable interface for compiling a regex pattern. By default this package uses the `java.util.regex` library, but an alternate implementation can be supplied using the `java.util.ServiceLoader` mechanism.

## Methods

### `compile(`java.lang.String` pattern)`

**Returns:** [`com.google.common.base.CommonPattern`](./CommonPattern.md)

Compiles the given pattern.
@throws IllegalArgumentException if the pattern is invalid

### `isPcreLike()`

**Returns:** `boolean`

Returns `true` if the regex implementation behaves like Perl -- notably, by supporting
 possessive quantifiers but also being susceptible to catastrophic backtracking.

