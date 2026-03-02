# Class: `HostSpecifier`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.HostSpecifier`

## Description

This may be either a numeric IP
 address in IPv4 or IPv6 notation, or a domain name.

 
Because this class is intended to represent host specifiers which can reasonably be used in a
 URI, the domain name case is further restricted to include only those domain names which end in a
 recognized public suffix; see InternetDomainName#isPublicSuffix() for details.

 
Note that no network lookups are performed by any HostSpecifier methods. No attempt is
 made to verify that a provided specifier corresponds to a real or accessible host. Only syntactic
 and pattern-based checks are performed.

 
If you know that a given string represents a numeric IP address, use InetAddresses to
 obtain and manipulate a java.net.InetAddress instance from it rather than using this
 class. Similarly, if you know that a given string represents a domain name, use InternetDomainName rather than this class.

## Fields

### `canonicalForm`

**Type:** `java.lang.String`

## Constructors

### `<init>(String canonicalForm)`

**Parameters:**
- `canonicalForm` (`java.lang.String`)

## Methods

### `fromValid(String specifier)`

If the specifier might be invalid, use #from(String)
 instead.

 
The specifier must be in one of these formats:

 

   - A domain name, like google.com
   - A IPv4 address string, like 127.0.0.1
   - An IPv6 address string with or without brackets, like [2001:db8::1] or 
       2001:db8::1

**Parameters:**
- `specifier` (`java.lang.String`)

**Returns:** [`com.google.common.net.HostSpecifier`](./HostSpecifier.md)

### `from(String specifier)`

Always use this method in preference to #fromValid(String) for a
 specifier that is not already known to be valid.

**Parameters:**
- `specifier` (`java.lang.String`)

**Returns:** [`com.google.common.net.HostSpecifier`](./HostSpecifier.md)

### `isValid(String specifier)`

**Parameters:**
- `specifier` (`java.lang.String`)

**Returns:** `boolean`

### `equals(Object other)`

**Parameters:**
- `other` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

If the
 host specifier is a domain name, the string will be normalized to all lower case. If the
 specifier was an IPv6 address without brackets, brackets are added so that the result will be
 usable in the host part of a URI.

**Returns:** `java.lang.String`

