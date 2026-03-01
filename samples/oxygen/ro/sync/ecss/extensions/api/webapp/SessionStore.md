# Interface: `SessionStore`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.SessionStore`

## Description

The invalidate method will be called when a session expires. Users of this interface do not need to call this method directly.
 All implementations should be thread-safe.

## Methods

### `get(`java.lang.String` sessionId, `java.lang.String` key)`

**Returns:** `T`

If the value is not an instance of the requested type T a ClassCastException will be thrown.

### `getAndDel(`java.lang.String` sessionId, `java.lang.String` key)`

**Returns:** `T`

Deletes the mapped value before returning.
 
 If the value is not an instance of the requested type T a ClassCastException will be thrown.

### `computeIfAbsent(`java.lang.String` sessionId, `java.lang.String` key, `java.util.function.Supplier<T>` supplier)`

**Returns:** `T`

If the computed value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).

### `computeIfAbsentWithoutSessionCookieRefresh(`java.lang.String` sessionId, `java.lang.String` key, `java.util.function.Supplier<T>` supplier)`

**Returns:** `T`

If the computed value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).   *

### `putIfAbsent(`java.lang.String` sessionId, `java.lang.String` key, `T` value)`

**Returns:** `T`

If the value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).   *

### `putIfAbsentWithoutSessionCookieRefresh(`java.lang.String` sessionId, `java.lang.String` key, `T` value)`

**Returns:** `T`

If the value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).   *

### `put(`java.lang.String` sessionId, `java.lang.String` key, `T` value)`

**Returns:** `void`

If the store previously contained a mapping for the sessionId and key,
 the old value is replaced by the specified value.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).

### `putWithoutSessionCookieRefresh(`java.lang.String` sessionId, `java.lang.String` key, `T` value)`

**Returns:** `void`

If the store previously contained a mapping for the sessionId and key,
 the old value is replaced by the specified value.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).

### `remove(`java.lang.String` sessionId, `java.lang.String` key)`

**Returns:** `void`

### `invalidate(`java.lang.String` sessionId)`

**Returns:** `void`

### `refreshSessionCookie(`java.lang.String` sessionId)`

**Returns:** `void`

If you refresh the session cookie on a HTTP request, all concurrent requests will fail with
 status code 400. To limit this impact it is recommended to call this method only on HTTP requests 
 that take very a short time to complete.

### `invalidateAll()`

**Returns:** `void`

