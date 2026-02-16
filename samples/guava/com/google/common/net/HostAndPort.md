# Class: `HostAndPort`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.HostAndPort`

**Implements:** `java.io.Serializable`

## Description

An immutable representation of a host and port.

 <p>Example usage:

 <pre>
 HostAndPort hp = HostAndPort.fromString("[2001:db8::1]")
     .withDefaultPort(80)
     .requireBracketsForIPv6();
 hp.getHost();   // returns "2001:db8::1"
 hp.getPort();   // returns 80
 hp.toString();  // returns "[2001:db8::1]:80"
 </pre>

 <p>Here are some examples of recognized formats:

 <ul>
   <li>example.com
   <li>example.com:80
   <li>192.0.2.1
   <li>192.0.2.1:80
   <li>[2001:db8::1] - `getHost()` omits brackets
   <li>[2001:db8::1]:80 - `getHost()` omits brackets
   <li>2001:db8::1 - Use `requireBracketsForIPv6()` to prohibit this
 </ul>

 <p>Note that this is not an exhaustive list, because these methods are only concerned with
 brackets, colons, and port numbers. Full validation of the host field (if desired) is the
 caller's responsibility.
**Author:** Paul Marks
**Since:** 10.0

## Fields

### `NO_PORT`

**Type:** `int`

Magic value indicating the absence of a port number.

### `host`

**Type:** `java.lang.String`

Hostname, IPv4/IPv6 literal, or unvalidated nonsense.

### `port`

**Type:** `int`

Validated port number in the range [0..65535], or NO_PORT

### `hasBracketlessColons`

**Type:** `boolean`

True if the parsed host has colons, but no surrounding brackets.

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.lang.String` host, `int` port, `boolean` hasBracketlessColons)`

## Methods

### `getHost()`

**Returns:** `java.lang.String`

Returns the portion of this `HostAndPort` instance that should represent the hostname or
 IPv4/IPv6 literal.

 <p>A successful parse does not imply any degree of sanity in this field. For additional
 validation, see the `HostSpecifier` class.
**Since:** 20.0 (since 10.0 as `getHostText`)

### `hasPort()`

**Returns:** `boolean`

Return true if this instance has a defined port.

### `getPort()`

**Returns:** `int`

Get the current port number, failing if no port is defined.
@return a validated port number, in the range [0..65535]
@throws IllegalStateException if no port is defined. You can use `withDefaultPort(int)`
     to prevent this from occurring.

### `getPortOrDefault(`int` defaultPort)`

**Returns:** `int`

Returns the current port number, with a default if no port is defined.

### `fromParts(`java.lang.String` host, `int` port)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Build a HostAndPort instance from separate host and port values.

 <p>Note: Non-bracketed IPv6 literals are allowed. Use `requireBracketsForIPv6()` to
 prohibit these.
@param host the host string to parse. Must not contain a port number.
@param port a port number from [0..65535]
@return if parsing was successful, a populated HostAndPort object.
@throws IllegalArgumentException if `host` contains a port number, or `port` is out
     of range.

### `fromHost(`java.lang.String` host)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Build a HostAndPort instance from a host only.

 <p>Note: Non-bracketed IPv6 literals are allowed. Use `requireBracketsForIPv6()` to
 prohibit these.
@param host the host-only string to parse. Must not contain a port number.
@return if parsing was successful, a populated HostAndPort object.
@throws IllegalArgumentException if `host` contains a port number.
**Since:** 17.0

### `fromString(`java.lang.String` hostPortString)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Split a freeform string into a host and port, without strict validation.

 <p>Note that the host-only formats will leave the port field undefined. You can use `withDefaultPort(int)` to patch in a default value.
@param hostPortString the input string to parse.
@return if parsing was successful, a populated HostAndPort object.
@throws IllegalArgumentException if nothing meaningful could be parsed.

### `getHostAndPortFromBracketedHost(`java.lang.String` hostPortString)`

**Returns:** `java.lang.String[]`

Parses a bracketed host-port string, throwing IllegalArgumentException if parsing fails.
@param hostPortString the full bracketed host-port specification. Port might not be specified.
@return an array with 2 strings: host and port, in that order.
@throws IllegalArgumentException if parsing the bracketed host-port string fails.

### `withDefaultPort(`int` defaultPort)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Provide a default port if the parsed string contained only a host.

 <p>You can chain this after `fromString(String)` to include a port in case the port was
 omitted from the input string. If a port was already provided, then this method is a no-op.
@param defaultPort a port number, from [0..65535]
@return a HostAndPort instance, guaranteed to have a defined port.

### `requireBracketsForIPv6()`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Generate an error if the host might be a non-bracketed IPv6 literal.

 <p>URI formatting requires that IPv6 literals be surrounded by brackets, like "[2001:db8::1]".
 Chain this call after `fromString(String)` to increase the strictness of the parser, and
 disallow IPv6 literals that don't contain these brackets.

 <p>Note that this parser identifies IPv6 literals solely based on the presence of a colon. To
 perform actual validation of IP addresses, see the `InetAddresses.forString(String)`
 method.
@return `this`, to enable chaining of calls.
@throws IllegalArgumentException if bracketless IPv6 is detected.

### `equals(`java.lang.Object` other)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Rebuild the host:port string, including brackets if necessary.

### `isValidPort(`int` port)`

**Returns:** `boolean`

Return true for valid port numbers.

