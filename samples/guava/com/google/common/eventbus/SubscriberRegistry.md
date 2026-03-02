# Class: `SubscriberRegistry`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.SubscriberRegistry`

## Description

## Fields

### `subscribers`

**Type:** `java.util.concurrent.ConcurrentMap<java.lang.Class<?>,java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>>`

The CopyOnWriteArraySet values make it easy and relatively lightweight to get an
 immutable snapshot of all current subscribers to an event without any locking.

### `bus`

**Type:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

### `subscriberMethodsCache`

**Type:** [`com.google.common.cache.LoadingCache<java.lang.Class<?>,com.google.common.collect.ImmutableList<java.lang.reflect.Method>>`](../cache/LoadingCache.md)

The cache is shared across all
 instances of this class; this greatly improves performance if multiple EventBus instances are
 created and objects of the same class are registered on all of them.

### `flattenHierarchyCache`

**Type:** [`com.google.common.cache.LoadingCache<java.lang.Class<?>,com.google.common.collect.ImmutableSet<java.lang.Class<?>>>`](../cache/LoadingCache.md)

## Constructors

### `<init>(com.google.common.eventbus.EventBus bus)`

**Parameters:**
- `bus` ([`com.google.common.eventbus.EventBus`](./EventBus.md))

## Methods

### `register(java.lang.Object listener)`

**Returns:** `void`

**Parameters:**
- `listener` (`java.lang.Object`)

### `unregister(java.lang.Object listener)`

**Returns:** `void`

**Parameters:**
- `listener` (`java.lang.Object`)

### `getSubscribersForTesting(java.lang.Class<?> eventType)`

**Returns:** `java.util.Set<com.google.common.eventbus.Subscriber>`

**Parameters:**
- `eventType` (`java.lang.Class<?>`)

### `getSubscribers(java.lang.Object event)`

**Returns:** `java.util.Iterator<com.google.common.eventbus.Subscriber>`

**Parameters:**
- `event` (`java.lang.Object`)

### `findAllSubscribers(java.lang.Object listener)`

**Returns:** [`com.google.common.collect.Multimap<java.lang.Class<?>,com.google.common.eventbus.Subscriber>`](../collect/Multimap.md)

**Parameters:**
- `listener` (`java.lang.Object`)

### `getAnnotatedMethods(java.lang.Class<?> clazz)`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.reflect.Method>`](../collect/ImmutableList.md)

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

### `getAnnotatedMethodsNotCached(java.lang.Class<?> clazz)`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.reflect.Method>`](../collect/ImmutableList.md)

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

### `flattenHierarchy(java.lang.Class<?> concreteClass)`

**Returns:** [`com.google.common.collect.ImmutableSet<java.lang.Class<?>>`](../collect/ImmutableSet.md)

**Parameters:**
- `concreteClass` (`java.lang.Class<?>`)

