# Class: `CacheLoader`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheLoader`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Most implementations will only need to implement #load. Other methods may be
 overridden as desired.

 
Usage example:

 

```

 CacheLoader<Key, Graph> loader = new CacheLoader<Key, Graph>() {
   public Graph load(Key key) throws AnyException {
     return createExpensiveGraph(key);
   }
 };
 LoadingCache<Key, Graph> cache = CacheBuilder.newBuilder().build(loader);
 
```


 
Since this example doesn't support reloading or bulk loading, it can also be specified much
 more simply:

 

```

 CacheLoader<Key, Graph> loader = CacheLoader.from(key -> createExpensiveGraph(key));
 
```

## Constructors

### `<init>()`

## Methods

### `load(K key)`

**Returns:** `V`

**Parameters:**
- `key` (`K`): the non-null key whose value should be loaded

### `reload(K key, V oldValue)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](../util/concurrent/ListenableFuture.md)

This
 method is called when an existing cache entry is refreshed by CacheBuilder#refreshAfterWrite, or through a call to LoadingCache#refresh.

 
This implementation synchronously delegates to #load. It is recommended that it be
 overridden with an asynchronous implementation when using CacheBuilder#refreshAfterWrite.

 
**Note:** *all exceptions thrown by this method will be logged and then swallowed*.

**Parameters:**
- `key` (`K`): the non-null key whose value should be loaded
- `oldValue` (`V`): the non-null old value corresponding to key

### `loadAll(java.lang.Iterable<? extends K> keys)`

**Returns:** `java.util.Map<K,V>`

This method is called by LoadingCache#getAll.

 
If the returned map doesn't contain all requested keys then the entries it does
 contain will be cached, but getAll will throw an exception. If the returned map
 contains extra keys not present in keys then all returned entries will be cached, but
 only the entries for keys will be returned from getAll.

 
This method should be overridden when bulk retrieval is significantly more efficient than
 many individual lookups. Note that LoadingCache#getAll will defer to individual calls
 to LoadingCache#get if this method is not overridden.

**Parameters:**
- `keys` (`java.lang.Iterable<? extends K>`): the unique, non-null keys whose values should be loaded

### `from(com.google.common.base.Function<K,V> function)`

**Returns:** [`com.google.common.cache.CacheLoader<K,V>`](./CacheLoader.md)

This allows creating a cache loader using a lambda expression.

 
The returned object is serializable if function is serializable.

**Parameters:**
- `function` ([`com.google.common.base.Function<K,V>`](../base/Function.md)): the function to be used for loading values; must never return null

### `from(com.google.common.base.Supplier<V> supplier)`

**Returns:** [`com.google.common.cache.CacheLoader<java.lang.Object,V>`](./CacheLoader.md)

Note that there's no need
 to create a *new* supplier just to pass it in here; just subclass CacheLoader and
 implement load instead.

 
The returned object is serializable if supplier is serializable.

**Parameters:**
- `supplier` ([`com.google.common.base.Supplier<V>`](../base/Supplier.md)): the supplier to be used for loading values; must never return null

### `asyncReloading(com.google.common.cache.CacheLoader<K,V> loader, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.cache.CacheLoader<K,V>`](./CacheLoader.md)

This method is useful only when loader.reload has a synchronous implementation, such
 as the default implementation.

**Parameters:**
- `loader` ([`com.google.common.cache.CacheLoader<K,V>`](./CacheLoader.md))
- `executor` (`java.util.concurrent.Executor`)

