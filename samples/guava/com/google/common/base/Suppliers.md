# Class: `Suppliers`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Suppliers`

## Description

Useful suppliers.

 <p>All methods return serializable suppliers as long as they're given serializable parameters.
@author Laurence Gonsalves
@author Harry Heymann
@since 2.0

## Constructors

### `<init>()`

## Methods

### `compose([`com.google.common.base.Function<? super F,T>`](./Function.md) function, [`com.google.common.base.Supplier<F>`](./Supplier.md) supplier)`

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

Returns a new supplier which is the composition of the provided function and supplier. In other
 words, the new supplier's value will be computed by retrieving the value from {@code supplier},
 and then applying {@code function} to that value. Note that the resulting supplier will not
 call {@code supplier} or invoke {@code function} until it is called.

### `memoize([`com.google.common.base.Supplier<T>`](./Supplier.md) delegate)`

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

Returns a supplier which caches the instance retrieved during the first call to {@code get()}
 and returns that value on subsequent calls to {@code get()}. See: <a href="http://en.wikipedia.org/wiki/Memoization">memoization</a>

 <p>The returned supplier is thread-safe. The delegate's {@code get()} method will be invoked at
 most once unless the underlying {@code get()} throws an exception. The supplier's serialized
 form does not contain the cached value, which will be recalculated when {@code get()} is called
 on the deserialized instance.

 <p>When the underlying delegate throws an exception then this memoizing supplier will keep
 delegating calls until it returns valid data.

 <p>If {@code delegate} is an instance created by an earlier call to {@code memoize}, it is
 returned directly.

### `memoizeWithExpiration([`com.google.common.base.Supplier<T>`](./Supplier.md) delegate, `long` duration, [`java.util.concurrent.TimeUnit`](../../../../java/util/concurrent/TimeUnit.md) unit)`

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

Returns a supplier that caches the instance supplied by the delegate and removes the cached
 value after the specified time has passed. Subsequent calls to {@code get()} return the cached
 value if the expiration time has not passed. After the expiration time, a new value is
 retrieved, cached, and returned. See: <a href="http://en.wikipedia.org/wiki/Memoization">memoization</a>

 <p>The returned supplier is thread-safe. The supplier's serialized form does not contain the
 cached value, which will be recalculated when {@code get()} is called on the reserialized
 instance. The actual memoization does not happen when the underlying delegate throws an
 exception.

 <p>When the underlying delegate throws an exception then this memoizing supplier will keep
 delegating calls until it returns valid data.
@param duration the length of time after a value is created that it should stop being returned
     by subsequent {@code get()} calls
@param unit the unit that {@code duration} is expressed in
@throws IllegalArgumentException if {@code duration} is not positive
@since 2.0

### `ofInstance([`T`](T.md) instance)`

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

Returns a supplier that always supplies {@code instance}.

### `synchronizedSupplier([`com.google.common.base.Supplier<T>`](./Supplier.md) delegate)`

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

Returns a supplier whose {@code get()} method synchronizes on {@code delegate} before calling
 it, making it thread-safe.

### `supplierFunction()`

**Returns:** [`com.google.common.base.Function<com.google.common.base.Supplier<T>,T>`](./Function,T>.md)

Returns a function that accepts a supplier and returns the result of invoking {@link Supplier#get} on that supplier.

 <p><b>Java 8 users:</b> use the method reference {@code Supplier::get} instead.
@since 8.0

