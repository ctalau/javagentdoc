# Class: `CacheBuilderSpec`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheBuilderSpec`

## Description

A specification of a `CacheBuilder` configuration.

 <p>`CacheBuilderSpec` supports parsing configuration off of a string, which makes it
 especially useful for command-line configuration of a `CacheBuilder`.

 <p>The string syntax is a series of comma-separated keys or key-value pairs, each corresponding
 to a `CacheBuilder` method.

 <ul>
   <li>`concurrencyLevel=[integer]`: sets `CacheBuilder.concurrencyLevel`.
   <li>`initialCapacity=[integer]`: sets `CacheBuilder.initialCapacity`.
   <li>`maximumSize=[long]`: sets `CacheBuilder.maximumSize`.
   <li>`maximumWeight=[long]`: sets `CacheBuilder.maximumWeight`.
   <li>`expireAfterAccess=[duration]`: sets `CacheBuilder.expireAfterAccess`.
   <li>`expireAfterWrite=[duration]`: sets `CacheBuilder.expireAfterWrite`.
   <li>`refreshAfterWrite=[duration]`: sets `CacheBuilder.refreshAfterWrite`.
   <li>`weakKeys`: sets `CacheBuilder.weakKeys`.
   <li>`softValues`: sets `CacheBuilder.softValues`.
   <li>`weakValues`: sets `CacheBuilder.weakValues`.
   <li>`recordStats`: sets `CacheBuilder.recordStats`.
 </ul>

 <p>The set of supported keys will grow as `CacheBuilder` evolves, but existing keys will
 never be removed.

 <p>Durations are represented by an integer, followed by one of "d", "h", "m", or "s",
 representing days, hours, minutes, or seconds respectively. (There is currently no syntax to
 request expiration in milliseconds, microseconds, or nanoseconds.)

 <p>Whitespace before and after commas and equal signs is ignored. Keys may not be repeated; it is
 also illegal to use the following pairs of keys in a single value:

 <ul>
   <li>`maximumSize` and `maximumWeight`
   <li>`softValues` and `weakValues`
 </ul>

 <p>`CacheBuilderSpec` does not support configuring `CacheBuilder` methods with
 non-value parameters. These must be configured in code.

 <p>A new `CacheBuilder` can be instantiated from a `CacheBuilderSpec` using `CacheBuilder.from(CacheBuilderSpec)` or `CacheBuilder.from(String)`.
**Author:** Adam Winer
**Since:** 12.0

## Fields

### `KEYS_SPLITTER`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

Splits each key-value pair.

### `KEY_VALUE_SPLITTER`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

Splits the key from the value.

### `VALUE_PARSERS`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.common.cache.CacheBuilderSpec.ValueParser>`](../collect/ImmutableMap.md)

Map of names to ValueParser.

### `initialCapacity`

**Type:** `java.lang.Integer`

### `maximumSize`

**Type:** `java.lang.Long`

### `maximumWeight`

**Type:** `java.lang.Long`

### `concurrencyLevel`

**Type:** `java.lang.Integer`

### `keyStrength`

**Type:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

### `valueStrength`

**Type:** [`com.google.common.cache.LocalCache.Strength`](LocalCache/Strength.md)

### `recordStats`

**Type:** `java.lang.Boolean`

### `writeExpirationDuration`

**Type:** `long`

### `writeExpirationTimeUnit`

**Type:** `java.util.concurrent.TimeUnit`

### `accessExpirationDuration`

**Type:** `long`

### `accessExpirationTimeUnit`

**Type:** `java.util.concurrent.TimeUnit`

### `refreshDuration`

**Type:** `long`

### `refreshTimeUnit`

**Type:** `java.util.concurrent.TimeUnit`

### `specification`

**Type:** `java.lang.String`

Specification; used for toParseableString().

## Constructors

### `<init>(`java.lang.String` specification)`

## Methods

### `parse(`java.lang.String` cacheBuilderSpecification)`

**Returns:** [`com.google.common.cache.CacheBuilderSpec`](./CacheBuilderSpec.md)

Creates a CacheBuilderSpec from a string.
@param cacheBuilderSpecification the string form

### `disableCaching()`

**Returns:** [`com.google.common.cache.CacheBuilderSpec`](./CacheBuilderSpec.md)

Returns a CacheBuilderSpec that will prevent caching.

### `toCacheBuilder()`

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

Returns a CacheBuilder configured according to this instance's specification.

### `toParsableString()`

**Returns:** `java.lang.String`

Returns a string that can be used to parse an equivalent `CacheBuilderSpec`. The order
 and form of this representation is not guaranteed, except that reparsing its output will
 produce a `CacheBuilderSpec` equal to this instance.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation for this CacheBuilderSpec instance. The form of this
 representation is not guaranteed.

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `durationInNanos(`long` duration, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `java.lang.Long`

Converts an expiration duration/unit pair into a single Long for hashing and equality. Uses
 nanos to match CacheBuilder implementation.

### `format(`java.lang.String` format, `java.lang.Object[]` args)`

**Returns:** `java.lang.String`

