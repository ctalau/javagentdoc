# Class: `CacheBuilderSpec`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheBuilderSpec`

## Description

A specification of a {@link CacheBuilder} configuration.

 <p>{@code CacheBuilderSpec} supports parsing configuration off of a string, which makes it
 especially useful for command-line configuration of a {@code CacheBuilder}.

 <p>The string syntax is a series of comma-separated keys or key-value pairs, each corresponding
 to a {@code CacheBuilder} method.

 <ul>
   <li>{@code concurrencyLevel=[integer]}: sets {@link CacheBuilder#concurrencyLevel}.
   <li>{@code initialCapacity=[integer]}: sets {@link CacheBuilder#initialCapacity}.
   <li>{@code maximumSize=[long]}: sets {@link CacheBuilder#maximumSize}.
   <li>{@code maximumWeight=[long]}: sets {@link CacheBuilder#maximumWeight}.
   <li>{@code expireAfterAccess=[duration]}: sets {@link CacheBuilder#expireAfterAccess}.
   <li>{@code expireAfterWrite=[duration]}: sets {@link CacheBuilder#expireAfterWrite}.
   <li>{@code refreshAfterWrite=[duration]}: sets {@link CacheBuilder#refreshAfterWrite}.
   <li>{@code weakKeys}: sets {@link CacheBuilder#weakKeys}.
   <li>{@code softValues}: sets {@link CacheBuilder#softValues}.
   <li>{@code weakValues}: sets {@link CacheBuilder#weakValues}.
   <li>{@code recordStats}: sets {@link CacheBuilder#recordStats}.
 </ul>

 <p>The set of supported keys will grow as {@code CacheBuilder} evolves, but existing keys will
 never be removed.

 <p>Durations are represented by an integer, followed by one of "d", "h", "m", or "s",
 representing days, hours, minutes, or seconds respectively. (There is currently no syntax to
 request expiration in milliseconds, microseconds, or nanoseconds.)

 <p>Whitespace before and after commas and equal signs is ignored. Keys may not be repeated; it is
 also illegal to use the following pairs of keys in a single value:

 <ul>
   <li>{@code maximumSize} and {@code maximumWeight}
   <li>{@code softValues} and {@code weakValues}
 </ul>

 <p>{@code CacheBuilderSpec} does not support configuring {@code CacheBuilder} methods with
 non-value parameters. These must be configured in code.

 <p>A new {@code CacheBuilder} can be instantiated from a {@code CacheBuilderSpec} using {@link CacheBuilder#from(CacheBuilderSpec)} or {@link CacheBuilder#from(String)}.
@author Adam Winer
@since 12.0

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

**Type:** [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md)

### `accessExpirationDuration`

**Type:** `long`

### `accessExpirationTimeUnit`

**Type:** [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md)

### `refreshDuration`

**Type:** `long`

### `refreshTimeUnit`

**Type:** [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md)

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

Returns a string that can be used to parse an equivalent {@code CacheBuilderSpec}. The order
 and form of this representation is not guaranteed, except that reparsing its output will
 produce a {@code CacheBuilderSpec} equal to this instance.

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation for this CacheBuilderSpec instance. The form of this
 representation is not guaranteed.

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `durationInNanos(`long` duration, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** `java.lang.Long`

Converts an expiration duration/unit pair into a single Long for hashing and equality. Uses
 nanos to match CacheBuilder implementation.

### `format(`java.lang.String` format, `java.lang.Object[]` args)`

**Returns:** `java.lang.String`

