# Class: `CacheBuilderSpec`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheBuilderSpec`

## Description

CacheBuilderSpec supports parsing configuration off of a string, which makes it
 especially useful for command-line configuration of a CacheBuilder.

 
The string syntax is a series of comma-separated keys or key-value pairs, each corresponding
 to a CacheBuilder method.

 

   - concurrencyLevel=[integer]: sets CacheBuilder#concurrencyLevel.
   - initialCapacity=[integer]: sets CacheBuilder#initialCapacity.
   - maximumSize=[long]: sets CacheBuilder#maximumSize.
   - maximumWeight=[long]: sets CacheBuilder#maximumWeight.
   - expireAfterAccess=[duration]: sets CacheBuilder#expireAfterAccess.
   - expireAfterWrite=[duration]: sets CacheBuilder#expireAfterWrite.
   - refreshAfterWrite=[duration]: sets CacheBuilder#refreshAfterWrite.
   - weakKeys: sets CacheBuilder#weakKeys.
   - softValues: sets CacheBuilder#softValues.
   - weakValues: sets CacheBuilder#weakValues.
   - recordStats: sets CacheBuilder#recordStats.
 


 
The set of supported keys will grow as CacheBuilder evolves, but existing keys will
 never be removed.

 
Durations are represented by an integer, followed by one of "d", "h", "m", or "s",
 representing days, hours, minutes, or seconds respectively. (There is currently no syntax to
 request expiration in milliseconds, microseconds, or nanoseconds.)

 
Whitespace before and after commas and equal signs is ignored. Keys may not be repeated; it is
 also illegal to use the following pairs of keys in a single value:

 

   - maximumSize and maximumWeight
   - softValues and weakValues
 


 
CacheBuilderSpec does not support configuring CacheBuilder methods with
 non-value parameters. These must be configured in code.

 
A new CacheBuilder can be instantiated from a CacheBuilderSpec using CacheBuilder#from(CacheBuilderSpec) or CacheBuilder#from(String).

## Fields

### `KEYS_SPLITTER`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

### `KEY_VALUE_SPLITTER`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

### `VALUE_PARSERS`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.String,com.google.common.cache.CacheBuilderSpec.ValueParser>`](../collect/ImmutableMap.md)

### `initialCapacity`

**Type:** `java.lang.Integer`

### `maximumSize`

**Type:** `java.lang.Long`

### `maximumWeight`

**Type:** `java.lang.Long`

### `concurrencyLevel`

**Type:** `java.lang.Integer`

### `keyStrength`

**Type:** `com.google.common.cache.LocalCache.Strength`

### `valueStrength`

**Type:** `com.google.common.cache.LocalCache.Strength`

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

## Constructors

### `<init>(java.lang.String specification)`

**Parameters:**
- `specification` (`java.lang.String`)

## Methods

### `parse(java.lang.String cacheBuilderSpecification)`

**Returns:** [`com.google.common.cache.CacheBuilderSpec`](./CacheBuilderSpec.md)

**Parameters:**
- `cacheBuilderSpecification` (`java.lang.String`): the string form

### `disableCaching()`

**Returns:** [`com.google.common.cache.CacheBuilderSpec`](./CacheBuilderSpec.md)

### `toCacheBuilder()`

**Returns:** [`com.google.common.cache.CacheBuilder<java.lang.Object,java.lang.Object>`](./CacheBuilder.md)

### `toParsableString()`

**Returns:** `java.lang.String`

The order
 and form of this representation is not guaranteed, except that reparsing its output will
 produce a CacheBuilderSpec equal to this instance.

### `toString()`

**Returns:** `java.lang.String`

The form of this
 representation is not guaranteed.

### `hashCode()`

**Returns:** `int`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `durationInNanos(long duration, java.util.concurrent.TimeUnit unit)`

**Returns:** `java.lang.Long`

Uses
 nanos to match CacheBuilder implementation.

**Parameters:**
- `duration` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `format(java.lang.String format, java.lang.Object[] args)`

**Returns:** `java.lang.String`

**Parameters:**
- `format` (`java.lang.String`)
- `args` (`java.lang.Object[]`)

