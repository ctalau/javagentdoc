# Class: `HostSpecifier`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.HostSpecifier`

## Description

A syntactically valid host specifier, suitable for use in a URI. This may be either a numeric IP
 address in IPv4 or IPv6 notation, or a domain name.

 <p>Because this class is intended to represent host specifiers which can reasonably be used in a
 URI, the domain name case is further restricted to include only those domain names which end in a
 recognized public suffix; see `InternetDomainName.isPublicSuffix()` for details.

 <p>Note that no network lookups are performed by any `HostSpecifier` methods. No attempt is
 made to verify that a provided specifier corresponds to a real or accessible host. Only syntactic
 and pattern-based checks are performed.

 <p>If you know that a given string represents a numeric IP address, use `InetAddresses` to
 obtain and manipulate a `java.net.InetAddress` instance from it rather than using this
 class. Similarly, if you know that a given string represents a domain name, use `InternetDomainName` rather than this class.
**Author:** Craig Berry
**Since:** 5.0

## Fields

### `canonicalForm`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` canonicalForm)`

## Methods

### `fromValid(`java.lang.String` specifier)`

**Returns:** [`com.google.common.net.HostSpecifier`](./HostSpecifier.md)

Returns a `HostSpecifier` built from the provided `specifier`, which is already
 known to be valid. If the `specifier` might be invalid, use `from(String)`
 instead.

 <p>The specifier must be in one of these formats:

 <ul>
   <li>A domain name, like `google.com`
   <li>A IPv4 address string, like `127.0.0.1`
   <li>An IPv6 address string with or without brackets, like `[2001:db8::1]` or `2001:db8::1`
 </ul>
@throws IllegalArgumentException if the specifier is not valid.

### `from(`java.lang.String` specifier)`

**Returns:** [`com.google.common.net.HostSpecifier`](./HostSpecifier.md)

Attempts to return a `HostSpecifier` for the given string, throwing an exception if
 parsing fails. Always use this method in preference to `fromValid(String)` for a
 specifier that is not already known to be valid.
@throws ParseException if the specifier is not valid.

### `isValid(`java.lang.String` specifier)`

**Returns:** `boolean`

Determines whether `specifier` represents a valid `HostSpecifier` as described in
 the documentation for `fromValid(String)`.

### `equals(`java.lang.Object` other)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of the host specifier suitable for inclusion in a URI. If the
 host specifier is a domain name, the string will be normalized to all lower case. If the
 specifier was an IPv6 address without brackets, brackets are added so that the result will be
 usable in the host part of a URI.

