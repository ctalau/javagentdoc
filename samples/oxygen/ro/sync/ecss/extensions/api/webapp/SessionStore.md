# Interface: `SessionStore`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.SessionStore`

## Description

The invalidate method will be called when a session expires. Users of this interface do not need to call this method directly.
 All implementations should be thread-safe.

## Methods

### `get(String sessionId, String key)`

If the value is not an instance of the requested type T a ClassCastException will be thrown.

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key whose associated value is to be returned. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.

**Returns:** `T`

### `getAndDel(String sessionId, String key)`

Deletes the mapped value before returning.
 
 If the value is not an instance of the requested type T a ClassCastException will be thrown.

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key whose associated value is to be returned. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.

**Returns:** `T`

### `computeIfAbsent(String sessionId, String key, Supplier<T> supplier)`

If the computed value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `supplier` (`java.util.function.Supplier<T>`): The function to supply a value.

**Returns:** `T`

### `computeIfAbsentWithoutSessionCookieRefresh(String sessionId, String key, Supplier<T> supplier)`

If the computed value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).   *

**Parameters:**
- `sessionId` (`java.lang.String`): The id of the session for which to return the value of a key.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `supplier` (`java.util.function.Supplier<T>`): The function to supply a value.

**Returns:** `T`

### `putIfAbsent(String sessionId, String key, T value)`

If the value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).   *

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value associated with the specified keys.

**Returns:** `T`

### `putIfAbsentWithoutSessionCookieRefresh(String sessionId, String key, T value)`

If the value is not an instance of the requested type T a ClassCastException will be thrown.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).   *

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated. The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value associated with the specified keys.

**Returns:** `T`

### `put(String sessionId, String key, T value)`

If the store previously contained a mapping for the sessionId and key,
 the old value is replaced by the specified value.
 
 This method will refresh the session cookie. See #refreshSessionCookie(String).

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated.
    The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value to be associated with the specified keys.

**Returns:** `void`

### `putWithoutSessionCookieRefresh(String sessionId, String key, T value)`

If the store previously contained a mapping for the sessionId and key,
 the old value is replaced by the specified value.
 
 This method will not refresh the session cookie. See #refreshSessionCookie(String).

**Parameters:**
- `sessionId` (`java.lang.String`): The session id with which the specified value is to be associated.
- `key` (`java.lang.String`): The key with which the specified value is to be associated.
    The key should be name-spaced because this store may be used by multiple plugins. ex: plugin-name.key-name.
- `value` (`T`): The value to be associated with the specified keys.

**Returns:** `void`

### `remove(String sessionId, String key)`

**Parameters:**
- `sessionId` (`java.lang.String`): The session id for which to remove the associated value.
- `key` (`java.lang.String`): The key for which to remove the associated value.

**Returns:** `void`

### `invalidate(String sessionId)`

**Parameters:**
- `sessionId` (`java.lang.String`): The session id for which to invalidate all keys.

**Returns:** `void`

### `refreshSessionCookie(String sessionId)`

If you refresh the session cookie on a HTTP request, all concurrent requests will fail with
 status code 400. To limit this impact it is recommended to call this method only on HTTP requests 
 that take very a short time to complete.

**Parameters:**
- `sessionId` (`java.lang.String`): The ID of the session.

**Returns:** `void`

### `invalidateAll()`

**Returns:** `void`

