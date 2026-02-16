# Class: `SubscriberRegistry`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.SubscriberRegistry`

## Description

Registry of subscribers to a single event bus.
**Author:** Colin Decker

## Fields

### `subscribers`

**Type:** `java.util.concurrent.ConcurrentMap<java.lang.Class<?>,java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>>`

All registered subscribers, indexed by event type.

 <p>The `CopyOnWriteArraySet` values make it easy and relatively lightweight to get an
 immutable snapshot of all current subscribers to an event without any locking.

### `bus`

**Type:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

The event bus this registry belongs to.

### `subscriberMethodsCache`

**Type:** [`com.google.common.cache.LoadingCache<java.lang.Class<?>,com.google.common.collect.ImmutableList<java.lang.reflect.Method>>`](../cache/LoadingCache,com/google/common/collect/ImmutableList>.md)

A thread-safe cache that contains the mapping from each class to all methods in that class and
 all super-classes, that are annotated with `@Subscribe`. The cache is shared across all
 instances of this class; this greatly improves performance if multiple EventBus instances are
 created and objects of the same class are registered on all of them.

### `flattenHierarchyCache`

**Type:** [`com.google.common.cache.LoadingCache<java.lang.Class<?>,com.google.common.collect.ImmutableSet<java.lang.Class<?>>>`](../cache/LoadingCache,com/google/common/collect/ImmutableSet>>.md)

Global cache of classes to their flattened hierarchy of supertypes.

## Constructors

### `<init>([`com.google.common.eventbus.EventBus`](./EventBus.md) bus)`

## Methods

### `register(`java.lang.Object` listener)`

**Returns:** `void`

Registers all subscriber methods on the given listener object.

### `unregister(`java.lang.Object` listener)`

**Returns:** `void`

Unregisters all subscribers on the given listener object.

### `getSubscribersForTesting(`java.lang.Class<?>` eventType)`

**Returns:** `java.util.Set<com.google.common.eventbus.Subscriber>`

### `getSubscribers(`java.lang.Object` event)`

**Returns:** `java.util.Iterator<com.google.common.eventbus.Subscriber>`

Gets an iterator representing an immutable snapshot of all subscribers to the given event at
 the time this method is called.

### `findAllSubscribers(`java.lang.Object` listener)`

**Returns:** [`com.google.common.collect.Multimap<java.lang.Class<?>,com.google.common.eventbus.Subscriber>`](../collect/Multimap,com/google/common/eventbus/Subscriber>.md)

Returns all subscribers for the given listener grouped by the type of event they subscribe to.

### `getAnnotatedMethods(`java.lang.Class<?>` clazz)`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.reflect.Method>`](../collect/ImmutableList.md)

### `getAnnotatedMethodsNotCached(`java.lang.Class<?>` clazz)`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.reflect.Method>`](../collect/ImmutableList.md)

### `flattenHierarchy(`java.lang.Class<?>` concreteClass)`

**Returns:** [`com.google.common.collect.ImmutableSet<java.lang.Class<?>>`](../collect/ImmutableSet>.md)

Flattens a class's type hierarchy into a set of `Class` objects including all
 superclasses (transitively) and all interfaces implemented by these superclasses.

