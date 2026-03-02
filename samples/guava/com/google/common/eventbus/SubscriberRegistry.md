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

### `<init>(EventBus bus)`

**Parameters:**
- `bus` ([`com.google.common.eventbus.EventBus`](./EventBus.md))

## Methods

### `register(Object listener)`

**Parameters:**
- `listener` (`java.lang.Object`)

**Returns:** `void`

### `unregister(Object listener)`

**Parameters:**
- `listener` (`java.lang.Object`)

**Returns:** `void`

### `getSubscribersForTesting(Class<?> eventType)`

**Parameters:**
- `eventType` (`java.lang.Class<?>`)

**Returns:** `java.util.Set<com.google.common.eventbus.Subscriber>`

### `getSubscribers(Object event)`

**Parameters:**
- `event` (`java.lang.Object`)

**Returns:** `java.util.Iterator<com.google.common.eventbus.Subscriber>`

### `findAllSubscribers(Object listener)`

**Parameters:**
- `listener` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.Multimap<java.lang.Class<?>,com.google.common.eventbus.Subscriber>`](../collect/Multimap.md)

### `getAnnotatedMethods(Class<?> clazz)`

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.reflect.Method>`](../collect/ImmutableList.md)

### `getAnnotatedMethodsNotCached(Class<?> clazz)`

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.reflect.Method>`](../collect/ImmutableList.md)

### `flattenHierarchy(Class<?> concreteClass)`

**Parameters:**
- `concreteClass` (`java.lang.Class<?>`)

**Returns:** [`com.google.common.collect.ImmutableSet<java.lang.Class<?>>`](../collect/ImmutableSet.md)

