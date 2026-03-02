# Interface: `MapDifference`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MapDifference`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Methods

### `areEqual()`

**Returns:** `boolean`

### `entriesOnlyOnLeft()`

**Returns:** `java.util.Map<K,V>`

### `entriesOnlyOnRight()`

**Returns:** `java.util.Map<K,V>`

### `entriesInCommon()`

**Returns:** `java.util.Map<K,V>`

### `entriesDiffering()`

**Returns:** `java.util.Map<K,com.google.common.collect.MapDifference.ValueDifference<V>>`

### `equals(Object object)`

Returns true if the
 given object is also a MapDifference and the values returned by the #entriesOnlyOnLeft(), #entriesOnlyOnRight(), #entriesInCommon() and #entriesDiffering() of the two instances are equal.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

This is defined as the hash code of

 

```

 Arrays.asList(entriesOnlyOnLeft(), entriesOnlyOnRight(),
     entriesInCommon(), entriesDiffering())
 
```

**Returns:** `int`

