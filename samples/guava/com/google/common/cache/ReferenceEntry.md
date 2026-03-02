# Interface: `ReferenceEntry`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ReferenceEntry`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Entries in the map can be in the following states:

 
Valid:

 

   - Live: valid key/value are set
   - Loading: loading is pending
 


 
Invalid:

 

   - Expired: time expired (key/value may still be set)
   - Collected: key/value was partially collected, but not yet cleaned up
   - Unset: marked as unset, awaiting cleanup or reuse

## Methods

### `getValueReference()`

**Returns:** `com.google.common.cache.LocalCache.ValueReference<K,V>`

### `setValueReference(LocalCache.ValueReference<K,V> valueReference)`

**Parameters:**
- `valueReference` (`com.google.common.cache.LocalCache.ValueReference<K,V>`)

**Returns:** `void`

### `getNext()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `getHash()`

**Returns:** `int`

### `getKey()`

**Returns:** `K`

### `getAccessTime()`

**Returns:** `long`

### `setAccessTime(long time)`

**Parameters:**
- `time` (`long`)

**Returns:** `void`

### `getNextInAccessQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setNextInAccessQueue(ReferenceEntry<K,V> next)`

**Parameters:**
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `getPreviousInAccessQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setPreviousInAccessQueue(ReferenceEntry<K,V> previous)`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `getWriteTime()`

**Returns:** `long`

### `setWriteTime(long time)`

**Parameters:**
- `time` (`long`)

**Returns:** `void`

### `getNextInWriteQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setNextInWriteQueue(ReferenceEntry<K,V> next)`

**Parameters:**
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

### `getPreviousInWriteQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setPreviousInWriteQueue(ReferenceEntry<K,V> previous)`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

**Returns:** `void`

