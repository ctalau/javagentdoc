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

### `setValueReference(com.google.common.cache.LocalCache.ValueReference<K,V> valueReference)`

**Returns:** `void`

**Parameters:**
- `valueReference` (`com.google.common.cache.LocalCache.ValueReference<K,V>`)

### `getNext()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `getHash()`

**Returns:** `int`

### `getKey()`

**Returns:** `K`

### `getAccessTime()`

**Returns:** `long`

### `setAccessTime(long time)`

**Returns:** `void`

**Parameters:**
- `time` (`long`)

### `getNextInAccessQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K,V> next)`

**Returns:** `void`

**Parameters:**
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `getPreviousInAccessQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K,V> previous)`

**Returns:** `void`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `getWriteTime()`

**Returns:** `long`

### `setWriteTime(long time)`

**Returns:** `void`

**Parameters:**
- `time` (`long`)

### `getNextInWriteQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K,V> next)`

**Returns:** `void`

**Parameters:**
- `next` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

### `getPreviousInWriteQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

### `setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K,V> previous)`

**Returns:** `void`

**Parameters:**
- `previous` ([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md))

