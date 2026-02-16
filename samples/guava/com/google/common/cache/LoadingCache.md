# Interface: `LoadingCache`

**Package:** [`com.google.common.cache`](README.md)

**Fully Qualified Name:** `com.google.common.cache.LoadingCache`

**Extends:** [`com.google.common.cache.Cache<K,V>`](./Cache.md), [`com.google.common.base.Function<K,V>`](../base/Function.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A semi-persistent mapping from keys to values. Values are automatically loaded by the cache, and
 are stored in the cache until either evicted or manually invalidated. The common way to build
 instances is using `CacheBuilder`.

 <p>Implementations of this interface are expected to be thread-safe, and can be safely accessed
 by multiple concurrent threads.

 <p>When evaluated as a `Function`, a cache yields the same result as invoking `getUnchecked`.
@param <K> the type of the cache's keys, which are not permitted to be null
@param <V> the type of the cache's values, which are not permitted to be null
**Author:** Charles Fry
**Since:** 11.0

## Methods

### `get(`K` key)`

**Returns:** `V`

Returns the value associated with `key` in this cache, first loading that value if
 necessary. No observable state associated with this cache is modified until loading completes.

 <p>If another call to `get` or `getUnchecked` is currently loading the value for
 `key`, simply waits for that thread to finish and returns its loaded value. Note that
 multiple threads can concurrently load values for distinct keys.

 <p>Caches loaded by a `CacheLoader` will call `CacheLoader.load` to load new values
 into the cache. Newly loaded values are added to the cache using `Cache.asMap().putIfAbsent` after loading has completed; if another value was associated with
 `key` while the new value was loading then a removal notification will be sent for the
 new value.

 <p>If the cache loader associated with this cache is known not to throw checked exceptions,
 then prefer `getUnchecked` over this method.
@throws ExecutionException if a checked exception was thrown while loading the value. (`ExecutionException` is thrown <a href="https://github.com/google/guava/wiki/CachesExplained#interruption">even if
     computation was interrupted by an `InterruptedException`</a>.)
@throws UncheckedExecutionException if an unchecked exception was thrown while loading the
     value
@throws ExecutionError if an error was thrown while loading the value

### `getUnchecked(`K` key)`

**Returns:** `V`

Returns the value associated with `key` in this cache, first loading that value if
 necessary. No observable state associated with this cache is modified until loading completes.
 Unlike `get`, this method does not throw a checked exception, and thus should only be
 used in situations where checked exceptions are not thrown by the cache loader.

 <p>If another call to `get` or `getUnchecked` is currently loading the value for
 `key`, simply waits for that thread to finish and returns its loaded value. Note that
 multiple threads can concurrently load values for distinct keys.

 <p>Caches loaded by a `CacheLoader` will call `CacheLoader.load` to load new values
 into the cache. Newly loaded values are added to the cache using `Cache.asMap().putIfAbsent` after loading has completed; if another value was associated with
 `key` while the new value was loading then a removal notification will be sent for the
 new value.

 <p><b>Warning:</b> this method silently converts checked exceptions to unchecked exceptions,
 and should not be used with cache loaders which throw checked exceptions. In such cases use
 `get` instead.
@throws UncheckedExecutionException if an exception was thrown while loading the value. (As
     explained in the last paragraph above, this should be an unchecked exception only.)
@throws ExecutionError if an error was thrown while loading the value

### `getAll(`java.lang.Iterable<? extends K>` keys)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](../collect/ImmutableMap.md)

Returns a map of the values associated with `keys`, creating or retrieving those values
 if necessary. The returned map contains entries that were already cached, combined with newly
 loaded entries; it will never contain null keys or values.

 <p>Caches loaded by a `CacheLoader` will issue a single request to `CacheLoader.loadAll` for all keys which are not already present in the cache. All entries
 returned by `CacheLoader.loadAll` will be stored in the cache, over-writing any
 previously cached values. This method will throw an exception if `CacheLoader.loadAll`
 returns `null`, returns a map containing null keys or values, or fails to return an entry
 for each requested key.

 <p>Note that duplicate elements in `keys`, as determined by `Object.equals`, will
 be ignored.
@throws ExecutionException if a checked exception was thrown while loading the value. (`ExecutionException` is thrown <a href="https://github.com/google/guava/wiki/CachesExplained#interruption">even if
     computation was interrupted by an `InterruptedException`</a>.)
@throws UncheckedExecutionException if an unchecked exception was thrown while loading the
     values
@throws ExecutionError if an error was thrown while loading the values
**Since:** 11.0

### `apply(`K` key)`

**Returns:** `V`

**Deprecated:** Provided to satisfy the `Function` interface; use `get` or `getUnchecked` instead.
@throws UncheckedExecutionException if an exception was thrown while loading the value. (As
     described in the documentation for `getUnchecked`, `LoadingCache` should be
     used as a `Function` only with cache loaders that throw only unchecked exceptions.)

### `refresh(`K` key)`

**Returns:** `void`

Loads a new value for `key`, possibly asynchronously. While the new value is loading the
 previous value (if any) will continue to be returned by `get(key)` unless it is evicted.
 If the new value is loaded successfully it will replace the previous value in the cache; if an
 exception is thrown while refreshing the previous value will remain, <i>and the exception will
 be logged (using `java.util.logging.Logger`) and swallowed</i>.

 <p>Caches loaded by a `CacheLoader` will call `CacheLoader.reload` if the cache
 currently contains a value for `key`, and `CacheLoader.load` otherwise. Loading is
 asynchronous only if `CacheLoader.reload` was overridden with an asynchronous
 implementation.

 <p>Returns without doing anything if another thread is currently loading the value for `key`. If the cache loader associated with this cache performs refresh asynchronously then this
 method may return before refresh completes.
**Since:** 11.0

### `asMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

{@inheritDoc}

 <p><b>Note that although the view <i>is</i> modifiable, no method on the returned map will ever
 cause entries to be automatically loaded.</b>

