# Class: `CacheLoader`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.CacheLoader`

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Computes or retrieves values, based on a key, for use in populating a `LoadingCache`.

 <p>Most implementations will only need to implement `load`. Other methods may be
 overridden as desired.

 <p>Usage example:

 <pre>`CacheLoader<Key, Graph> loader = new CacheLoader<Key, Graph>() {
   public Graph load(Key key) throws AnyException {
     return createExpensiveGraph(key);
   `
 };
 LoadingCache<Key, Graph> cache = CacheBuilder.newBuilder().build(loader);
 }</pre>

 <p>Since this example doesn't support reloading or bulk loading, it can also be specified much
 more simply:

 <pre>`CacheLoader<Key, Graph> loader = CacheLoader.from(key -> createExpensiveGraph(key));
 `</pre>
**Author:** Charles Fry
**Since:** 10.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `load(`K` key)`

**Returns:** `V`

Computes or retrieves the value corresponding to `key`.
@param key the non-null key whose value should be loaded
@return the value associated with `key`; <b>must not be null</b>
@throws Exception if unable to load the result
@throws InterruptedException if this method is interrupted. `InterruptedException` is
     treated like any other `Exception` in all respects except that, when it is caught,
     the thread's interrupt status is set

### `reload(`K` key, `V` oldValue)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](../util/concurrent/ListenableFuture.md)

Computes or retrieves a replacement value corresponding to an already-cached `key`. This
 method is called when an existing cache entry is refreshed by `CacheBuilder.refreshAfterWrite`, or through a call to `LoadingCache.refresh`.

 <p>This implementation synchronously delegates to `load`. It is recommended that it be
 overridden with an asynchronous implementation when using `CacheBuilder.refreshAfterWrite`.

 <p><b>Note:</b> <i>all exceptions thrown by this method will be logged and then swallowed</i>.
@param key the non-null key whose value should be loaded
@param oldValue the non-null old value corresponding to `key`
@return the future new value associated with `key`; <b>must not be null, must not return
     null</b>
@throws Exception if unable to reload the result
@throws InterruptedException if this method is interrupted. `InterruptedException` is
     treated like any other `Exception` in all respects except that, when it is caught,
     the thread's interrupt status is set
**Since:** 11.0

### `loadAll(`java.lang.Iterable<? extends K>` keys)`

**Returns:** `java.util.Map<K,V>`

Computes or retrieves the values corresponding to `keys`. This method is called by `LoadingCache.getAll`.

 <p>If the returned map doesn't contain all requested `keys` then the entries it does
 contain will be cached, but `getAll` will throw an exception. If the returned map
 contains extra keys not present in `keys` then all returned entries will be cached, but
 only the entries for `keys` will be returned from `getAll`.

 <p>This method should be overridden when bulk retrieval is significantly more efficient than
 many individual lookups. Note that `LoadingCache.getAll` will defer to individual calls
 to `LoadingCache.get` if this method is not overridden.
@param keys the unique, non-null keys whose values should be loaded
@return a map from each key in `keys` to the value associated with that key; <b>may not
     contain null values</b>
@throws Exception if unable to load the result
@throws InterruptedException if this method is interrupted. `InterruptedException` is
     treated like any other `Exception` in all respects except that, when it is caught,
     the thread's interrupt status is set
**Since:** 11.0

### `from([`com.google.common.base.Function<K,V>`](../base/Function.md) function)`

**Returns:** [`com.google.common.cache.CacheLoader<K,V>`](./CacheLoader.md)

Returns a cache loader that uses `function` to load keys, without supporting either
 reloading or bulk loading. This allows creating a cache loader using a lambda expression.

 <p>The returned object is serializable if `function` is serializable.
@param function the function to be used for loading values; must never return `null`
@return a cache loader that loads values by passing each key to `function`

### `from([`com.google.common.base.Supplier<V>`](../base/Supplier.md) supplier)`

**Returns:** [`com.google.common.cache.CacheLoader<java.lang.Object,V>`](./CacheLoader.md)

Returns a cache loader based on an <i>existing</i> supplier instance. Note that there's no need
 to create a <i>new</i> supplier just to pass it in here; just subclass `CacheLoader` and
 implement `load load` instead.

 <p>The returned object is serializable if `supplier` is serializable.
@param supplier the supplier to be used for loading values; must never return `null`
@return a cache loader that loads values by calling `Supplier.get`, irrespective of the
     key

### `asyncReloading([`com.google.common.cache.CacheLoader<K,V>`](./CacheLoader.md) loader, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.cache.CacheLoader<K,V>`](./CacheLoader.md)

Returns a `CacheLoader` which wraps `loader`, executing calls to `CacheLoader.reload` using `executor`.

 <p>This method is useful only when `loader.reload` has a synchronous implementation, such
 as the default implementation.
**Since:** 17.0

