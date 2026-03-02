# Class: `HostAndPort`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.HostAndPort`

**Implements:** `java.io.Serializable`

## Description

Example usage:

 

```

 HostAndPort hp = HostAndPort.fromString("[2001:db8::1]")
     .withDefaultPort(80)
     .requireBracketsForIPv6();
 hp.getHost();   // returns "2001:db8::1"
 hp.getPort();   // returns 80
 hp.toString();  // returns "[2001:db8::1]:80"
 
```


 
Here are some examples of recognized formats:

 

   - example.com
   - example.com:80
   - 192.0.2.1
   - 192.0.2.1:80
   - [2001:db8::1] - #getHost() omits brackets
   - [2001:db8::1]:80 - #getHost() omits brackets
   - 2001:db8::1 - Use #requireBracketsForIPv6() to prohibit this
 


 
Note that this is not an exhaustive list, because these methods are only concerned with
 brackets, colons, and port numbers. Full validation of the host field (if desired) is the
 caller's responsibility.

## Fields

### `NO_PORT`

**Type:** `int`

### `host`

**Type:** `java.lang.String`

### `port`

**Type:** `int`

### `hasBracketlessColons`

**Type:** `boolean`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.lang.String host, int port, boolean hasBracketlessColons)`

**Parameters:**
- `host` (`java.lang.String`)
- `port` (`int`)
- `hasBracketlessColons` (`boolean`)

## Methods

### `getHost()`

**Returns:** `java.lang.String`

A successful parse does not imply any degree of sanity in this field. For additional
 validation, see the HostSpecifier class.

### `hasPort()`

**Returns:** `boolean`

### `getPort()`

**Returns:** `int`

### `getPortOrDefault(int defaultPort)`

**Returns:** `int`

**Parameters:**
- `defaultPort` (`int`)

### `fromParts(java.lang.String host, int port)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Note: Non-bracketed IPv6 literals are allowed. Use #requireBracketsForIPv6() to
 prohibit these.

**Parameters:**
- `host` (`java.lang.String`): the host string to parse. Must not contain a port number.
- `port` (`int`): a port number from [0..65535]

### `fromHost(java.lang.String host)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Note: Non-bracketed IPv6 literals are allowed. Use #requireBracketsForIPv6() to
 prohibit these.

**Parameters:**
- `host` (`java.lang.String`): the host-only string to parse. Must not contain a port number.

### `fromString(java.lang.String hostPortString)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

Note that the host-only formats will leave the port field undefined. You can use #withDefaultPort(int) to patch in a default value.

**Parameters:**
- `hostPortString` (`java.lang.String`): the input string to parse.

### `getHostAndPortFromBracketedHost(java.lang.String hostPortString)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `hostPortString` (`java.lang.String`): the full bracketed host-port specification. Port might not be specified.

### `withDefaultPort(int defaultPort)`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

You can chain this after #fromString(String) to include a port in case the port was
 omitted from the input string. If a port was already provided, then this method is a no-op.

**Parameters:**
- `defaultPort` (`int`): a port number, from [0..65535]

### `requireBracketsForIPv6()`

**Returns:** [`com.google.common.net.HostAndPort`](./HostAndPort.md)

URI formatting requires that IPv6 literals be surrounded by brackets, like "[2001:db8::1]".
 Chain this call after #fromString(String) to increase the strictness of the parser, and
 disallow IPv6 literals that don't contain these brackets.

 
Note that this parser identifies IPv6 literals solely based on the presence of a colon. To
 perform actual validation of IP addresses, see the InetAddresses#forString(String)
 method.

### `equals(java.lang.Object other)`

**Returns:** `boolean`

**Parameters:**
- `other` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `isValidPort(int port)`

**Returns:** `boolean`

**Parameters:**
- `port` (`int`)

