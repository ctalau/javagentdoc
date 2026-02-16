# Interface: `ReferenceEntry`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.ReferenceEntry`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

An entry in a reference map.

 <p>Entries in the map can be in the following states:

 <p>Valid:

 <ul>
   <li>Live: valid key/value are set
   <li>Loading: loading is pending
 </ul>

 <p>Invalid:

 <ul>
   <li>Expired: time expired (key/value may still be set)
   <li>Collected: key/value was partially collected, but not yet cleaned up
   <li>Unset: marked as unset, awaiting cleanup or reuse
 </ul>

## Methods

### `getValueReference()`

**Returns:** [`com.google.common.cache.LocalCache.ValueReference<K,V>`](LocalCache/ValueReference.md)

Returns the value reference from this entry.

### `setValueReference([`com.google.common.cache.LocalCache.ValueReference<K,V>`](LocalCache/ValueReference.md) valueReference)`

**Returns:** `void`

Sets the value reference for this entry.

### `getNext()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Returns the next entry in the chain.

### `getHash()`

**Returns:** `int`

Returns the entry's hash.

### `getKey()`

**Returns:** `K`

Returns the key for this entry.

### `getAccessTime()`

**Returns:** `long`

Returns the time that this entry was last accessed, in ns.

### `setAccessTime(`long` time)`

**Returns:** `void`

Sets the entry access time in ns.

### `getNextInAccessQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Returns the next entry in the access queue.

### `setNextInAccessQueue([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) next)`

**Returns:** `void`

Sets the next entry in the access queue.

### `getPreviousInAccessQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Returns the previous entry in the access queue.

### `setPreviousInAccessQueue([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) previous)`

**Returns:** `void`

Sets the previous entry in the access queue.

### `getWriteTime()`

**Returns:** `long`

### `setWriteTime(`long` time)`

**Returns:** `void`

Sets the entry write time in ns.

### `getNextInWriteQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Returns the next entry in the write queue.

### `setNextInWriteQueue([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) next)`

**Returns:** `void`

Sets the next entry in the write queue.

### `getPreviousInWriteQueue()`

**Returns:** [`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md)

Returns the previous entry in the write queue.

### `setPreviousInWriteQueue([`com.google.common.cache.ReferenceEntry<K,V>`](./ReferenceEntry.md) previous)`

**Returns:** `void`

Sets the previous entry in the write queue.

