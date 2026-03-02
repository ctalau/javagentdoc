# Interface: `SessionStore`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.SessionStore`

## Description

The invalidate method will be called when a session expires. Users of this interface do not need to call this method directly.
 All implementations should be thread-safe.

## Methods

### `get(java.lang.String sessionId, java.lang.String key)`

**Returns:** `T`

If the value is not an instance of the requested type T a ClassCastException will be thrown.

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key whose associated value is to be returned. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.

### `getAndDel(java.lang.String sessionId, java.lang.String key)`

**Returns:** `T`

Deletes the mapped value before returning.
 
 If the value is not an instance of the requested type T a ClassCastException will be thrown.

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key whose associated value is to be returned. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.

### `computeIfAbsent(java.lang.String sessionId, java.lang.String key, java.util.function.Supplier<T> supplier)`

**Returns:** `T`

If the computed value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `supplier` (`java.util.function.Supplier<T>`): The function to supply a value.

### `computeIfAbsentWithoutSessionCookieRefresh(java.lang.String sessionId, java.lang.String key, java.util.function.Supplier<T> supplier)`

**Returns:** `T`

If the computed value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).   *

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `supplier` (`java.util.function.Supplier<T>`): The function to supply a value.

### `putIfAbsent(java.lang.String sessionId, java.lang.String key, T value)`

**Returns:** `T`

If the value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).   *

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value associated with the specified keys.

### `putIfAbsentWithoutSessionCookieRefresh(java.lang.String sessionId, java.lang.String key, T value)`

**Returns:** `T`

If the value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).   *

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value associated with the specified keys.

### `put(java.lang.String sessionId, java.lang.String key, T value)`

**Returns:** `void`

If the store previously contained a mapping for the sessionId and key,
 the old value is replaced by the specified value.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated.
  The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value to be associated with the specified keys.

### `putWithoutSessionCookieRefresh(java.lang.String sessionId, java.lang.String key, T value)`

**Returns:** `void`

If the store previously contained a mapping for the sessionId and key,
 the old value is replaced by the specified value.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated.
  The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value to be associated with the specified keys.

### `remove(java.lang.String sessionId, java.lang.String key)`

**Returns:** `void`

**Parameters:**
- `sessionId` (`java.lang.String`): The session id for which to remove the associated value.
- `key` (`java.lang.String`): The key for which to remove the associated value.

### `invalidate(java.lang.String sessionId)`

**Returns:** `void`

**Parameters:**
- `sessionId` (`java.lang.String`): The session id for which to invalidate all keys.

### `refreshSessionCookie(java.lang.String sessionId)`

**Returns:** `void`

If you refresh the session cookie on a HTTP request, all concurrent requests will fail with
 status code 400. To limit this impact it is recommended to call this method only on HTTP requests 
 that take very a short time to complete.

**Parameters:**
- `sessionId` (`java.lang.String`): The ID of the session.

### `invalidateAll()`

**Returns:** `void`

