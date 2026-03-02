# Class: `Suppliers`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Suppliers`

## Description

All methods return serializable suppliers as long as they're given serializable parameters.

## Constructors

### `<init>()`

## Methods

### `compose(Function<? super F,T> function, Supplier<F> supplier)`

In other
 words, the new supplier's value will be computed by retrieving the value from supplier,
 and then applying function to that value. Note that the resulting supplier will not
 call supplier or invoke function until it is called.

**Parameters:**
- `function` ([`com.google.common.base.Function<? super F,T>`](./Function.md))
- `supplier` ([`com.google.common.base.Supplier<F>`](./Supplier.md))

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

### `memoize(Supplier<T> delegate)`

See: [memoization](http://en.wikipedia.org/wiki/Memoization)

 
The returned supplier is thread-safe. The delegate's get() method will be invoked at
 most once unless the underlying get() throws an exception. The supplier's serialized
 form does not contain the cached value, which will be recalculated when get() is called
 on the deserialized instance.

 
When the underlying delegate throws an exception then this memoizing supplier will keep
 delegating calls until it returns valid data.

 
If delegate is an instance created by an earlier call to memoize, it is
 returned directly.

**Parameters:**
- `delegate` ([`com.google.common.base.Supplier<T>`](./Supplier.md))

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

### `memoizeWithExpiration(Supplier<T> delegate, long duration, TimeUnit unit)`

Subsequent calls to get() return the cached
 value if the expiration time has not passed. After the expiration time, a new value is
 retrieved, cached, and returned. See: [memoization](http://en.wikipedia.org/wiki/Memoization)

 
The returned supplier is thread-safe. The supplier's serialized form does not contain the
 cached value, which will be recalculated when get() is called on the reserialized
 instance. The actual memoization does not happen when the underlying delegate throws an
 exception.

 
When the underlying delegate throws an exception then this memoizing supplier will keep
 delegating calls until it returns valid data.

**Parameters:**
- `delegate` ([`com.google.common.base.Supplier<T>`](./Supplier.md))
- `duration` (`long`): the length of time after a value is created that it should stop being returned
       by subsequent get() calls
- `unit` (`java.util.concurrent.TimeUnit`): the unit that duration is expressed in

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

### `ofInstance(T instance)`

**Parameters:**
- `instance` (`T`)

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

### `synchronizedSupplier(Supplier<T> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.base.Supplier<T>`](./Supplier.md))

**Returns:** [`com.google.common.base.Supplier<T>`](./Supplier.md)

### `supplierFunction()`

**Java 8 users:** use the method reference Supplier::get instead.

**Returns:** [`com.google.common.base.Function<com.google.common.base.Supplier<T>,T>`](./Function.md)

