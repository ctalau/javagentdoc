# Class: `UserContext`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.UserContext`

## Description

## Fields

### `headersMap`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

### `sessionId`

**Type:** `java.lang.String`

## Constructors

### `<init>(Map<String,String> headersMap, String sessionId)`

**Parameters:**
- `headersMap` (`java.util.Map<java.lang.String,java.lang.String>`): The cookies that are part of the context of this URL.
- `sessionId` (`java.lang.String`): The session ID of the user.

## Methods

### `getCookies()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `getHeaders()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `getSessionId()`

**Returns:** `java.lang.String`

### `isServiceAccount()`

For example, in a concurrent editing session, users join and leave. 
 In order to have a robust way to save changes, a plugin may 
 choose to use a dedicated set of credentials that do not belong to any 
 of those users. Such credentials belong to a "service account".

**Returns:** `boolean`

