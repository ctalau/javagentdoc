# Class: `InetAddresses`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.InetAddresses`

## Description

Static utility methods pertaining to {@link InetAddress} instances.

 <p><b>Important note:</b> Unlike {@code InetAddress.getByName()}, the methods of this class never
 cause DNS services to be accessed. For this reason, you should prefer these methods as much as
 possible over their JDK equivalents whenever you are expecting to handle only IP address string
 literals -- there is no blocking DNS penalty for a malformed string.

 <p>When dealing with {@link Inet4Address} and {@link Inet6Address} objects as byte arrays (vis.
 {@code InetAddress.getAddress()}) they are 4 and 16 bytes in length, respectively, and represent
 the address in network byte order.

 <p>Examples of IP addresses and their byte representations:

 <dl>
   <dt>The IPv4 loopback address, {@code "127.0.0.1"}.
   <dd>{@code 7f 00 00 01}
   <dt>The IPv6 loopback address, {@code "::1"}.
   <dd>{@code 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01}
   <dt>From the IPv6 reserved documentation prefix ({@code 2001:db8::/32}), {@code "2001:db8::1"}.
   <dd>{@code 20 01 0d b8 00 00 00 00 00 00 00 00 00 00 00 01}
   <dt>An IPv6 "IPv4 compatible" (or "compat") address, {@code "::192.168.0.1"}.
   <dd>{@code 00 00 00 00 00 00 00 00 00 00 00 00 c0 a8 00 01}
   <dt>An IPv6 "IPv4 mapped" address, {@code "::ffff:192.168.0.1"}.
   <dd>{@code 00 00 00 00 00 00 00 00 00 00 ff ff c0 a8 00 01}
 </dl>

 <p>A few notes about IPv6 "IPv4 mapped" addresses and their observed use in Java.

 <p>"IPv4 mapped" addresses were originally a representation of IPv4 addresses for use on an IPv6
 socket that could receive both IPv4 and IPv6 connections (by disabling the {@code IPV6_V6ONLY}
 socket option on an IPv6 socket). Yes, it's confusing. Nevertheless, these "mapped" addresses
 were never supposed to be seen on the wire. That assumption was dropped, some say mistakenly, in
 later RFCs with the apparent aim of making IPv4-to-IPv6 transition simpler.

 <p>Technically one <i>can</i> create a 128bit IPv6 address with the wire format of a "mapped"
 address, as shown above, and transmit it in an IPv6 packet header. However, Java's InetAddress
 creation methods appear to adhere doggedly to the original intent of the "mapped" address: all
 "mapped" addresses return {@link Inet4Address} objects.

 <p>For added safety, it is common for IPv6 network operators to filter all packets where either
 the source or destination address appears to be a "compat" or "mapped" address. Filtering
 suggestions usually recommend discarding any packets with source or destination addresses in the
 invalid range {@code ::/3}, which includes both of these bizarre address formats. For more
 information on "bogons", including lists of IPv6 bogon space, see:

 <ul>
   <li><a target="_parent" href="http://en.wikipedia.org/wiki/Bogon_filtering">http://en.wikipedia.
       org/wiki/Bogon_filtering</a>
   <li><a target="_parent" href="http://www.cymru.com/Bogons/ipv6.txt">http://www.cymru.com/Bogons/ ipv6.txt</a>
   <li><a target="_parent" href="http://www.cymru.com/Bogons/v6bogon.html">http://www.cymru.com/
       Bogons/v6bogon.html</a>
   <li><a target="_parent" href="http://www.space.net/~gert/RIPE/ipv6-filters.html">http://www.
       space.net/~gert/RIPE/ipv6-filters.html</a>
 </ul>
@author Erik Kline
@since 5.0

## Fields

### `IPV4_PART_COUNT`

**Type:** `int`

### `IPV6_PART_COUNT`

**Type:** `int`

### `IPV4_DELIMITER`

**Type:** `char`

### `IPV6_DELIMITER`

**Type:** `char`

### `IPV4_DELIMITER_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `IPV6_DELIMITER_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `LOOPBACK4`

**Type:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

### `ANY4`

**Type:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

## Constructors

### `<init>()`

## Methods

### `getInet4Address(`byte[]` bytes)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Returns an {@link Inet4Address}, given a byte array representation of the IPv4 address.
@param bytes byte array representing an IPv4 address (should be of length 4)
@return {@link Inet4Address} corresponding to the supplied byte array
@throws IllegalArgumentException if a valid {@link Inet4Address} can not be created

### `forString(`java.lang.String` ipString)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Returns the {@link InetAddress} having the given string representation.

 <p>This deliberately avoids all nameservice lookups (e.g. no DNS).

 <p>Anything after a {@code %} in an IPv6 address is ignored (assumed to be a Scope ID).

 <p>This method accepts non-ASCII digits, for example {@code "\uff11\uff19\uff12.\uff11\uff16\uff18.\uff10.\uff11"} (those are fullwidth
 characters). That is consistent with {@link InetAddress}, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like {@code
 CharMatcher.ascii().matchesAllOf(ipString)}.
@param ipString {@code String} containing an IPv4 or IPv6 string literal, e.g. {@code
     "192.168.0.1"} or {@code "2001:db8::1"}
@return {@link InetAddress} representing the argument
@throws IllegalArgumentException if the argument is not a valid IP string literal

### `isInetAddress(`java.lang.String` ipString)`

**Returns:** `boolean`

Returns {@code true} if the supplied string is a valid IP string literal, {@code false}
 otherwise.

 <p>This method accepts non-ASCII digits, for example {@code "\uff11\uff19\uff12.\uff11\uff16\uff18.\uff10.\uff11"} (those are fullwidth
 characters). That is consistent with {@link InetAddress}, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like {@code
 CharMatcher.ascii().matchesAllOf(ipString)}.
@param ipString {@code String} to evaluated as an IP string literal
@return {@code true} if the argument is a valid IP string literal

### `ipStringToBytes(`java.lang.String` ipStringParam)`

**Returns:** `byte[]`

Returns {@code null} if unable to parse into a {@code byte[]}.

### `textToNumericFormatV4(`java.lang.String` ipString)`

**Returns:** `byte[]`

### `textToNumericFormatV6(`java.lang.String` ipString)`

**Returns:** `byte[]`

### `convertDottedQuadToHex(`java.lang.String` ipString)`

**Returns:** `java.lang.String`

### `parseOctet(`java.lang.String` ipString, `int` start, `int` end)`

**Returns:** `byte`

### `parseHextet(`java.lang.String` ipString, `int` start, `int` end)`

**Returns:** `short`

### `bytesToInetAddress(`byte[]` addr)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Convert a byte array into an InetAddress.

 <p>{@link InetAddress#getByAddress} is documented as throwing a checked exception "if IP
 address is of illegal length." We replace it with an unchecked exception, for use by callers
 who already know that addr is an array of length 4 or 16.
@param addr the raw 4-byte or 16-byte IP address in big-endian order
@return an InetAddress object created from the raw IP address

### `toAddrString([`java.net.InetAddress`](../../../../java/net/InetAddress.md) ip)`

**Returns:** `java.lang.String`

Returns the string representation of an {@link InetAddress}.

 <p>For IPv4 addresses, this is identical to {@link InetAddress#getHostAddress()}, but for IPv6
 addresses, the output follows <a href="http://tools.ietf.org/html/rfc5952">RFC 5952</a> section
 4. The main difference is that this method uses "::" for zero compression, while Java's version
 uses the uncompressed form.

 <p>This method uses hexadecimal for all IPv6 addresses, including IPv4-mapped IPv6 addresses
 such as "::c000:201". The output does not include a Scope ID.
@param ip {@link InetAddress} to be converted to an address string
@return {@code String} containing the text-formatted IP address
@since 10.0

### `compressLongestRunOfZeroes(`int[]` hextets)`

**Returns:** `void`

Identify and mark the longest run of zeroes in an IPv6 address.

 <p>Only runs of two or more hextets are considered. In case of a tie, the leftmost run wins. If
 a qualifying run is found, its hextets are replaced by the sentinel value -1.
@param hextets {@code int[]} mutable array of eight 16-bit hextets

### `hextetsToIPv6String(`int[]` hextets)`

**Returns:** `java.lang.String`

Convert a list of hextets into a human-readable IPv6 address.

 <p>In order for "::" compression to work, the input should contain negative sentinel values in
 place of the elided zeroes.
@param hextets {@code int[]} array of eight 16-bit hextets, or -1s

### `toUriString([`java.net.InetAddress`](../../../../java/net/InetAddress.md) ip)`

**Returns:** `java.lang.String`

Returns the string representation of an {@link InetAddress} suitable for inclusion in a URI.

 <p>For IPv4 addresses, this is identical to {@link InetAddress#getHostAddress()}, but for IPv6
 addresses it compresses zeroes and surrounds the text with square brackets; for example {@code
 "[2001:db8::1]"}.

 <p>Per section 3.2.2 of <a target="_parent" href="http://tools.ietf.org/html/rfc3986#section-3.2.2">RFC 3986</a>, a URI containing an IPv6
 string literal is of the form {@code "http://[2001:db8::1]:8888/index.html"}.

 <p>Use of either {@link InetAddresses#toAddrString}, {@link InetAddress#getHostAddress()}, or
 this method is recommended over {@link InetAddress#toString()} when an IP address string
 literal is desired. This is because {@link InetAddress#toString()} prints the hostname and the
 IP address string joined by a "/".
@param ip {@link InetAddress} to be converted to URI string literal
@return {@code String} containing URI-safe string literal

### `forUriString(`java.lang.String` hostAddr)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Returns an InetAddress representing the literal IPv4 or IPv6 host portion of a URL, encoded in
 the format specified by RFC 3986 section 3.2.2.

 <p>This method is similar to {@link InetAddresses#forString(String)}, however, it requires that
 IPv6 addresses are surrounded by square brackets.

 <p>This method is the inverse of {@link InetAddresses#toUriString(java.net.InetAddress)}.

 <p>This method accepts non-ASCII digits, for example {@code "\uff11\uff19\uff12.\uff11\uff16\uff18.\uff10.\uff11"} (those are fullwidth
 characters). That is consistent with {@link InetAddress}, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like {@code
 CharMatcher.ascii().matchesAllOf(ipString)}.
@param hostAddr an RFC 3986 section 3.2.2 encoded IPv4 or IPv6 address
@return an InetAddress representing the address in {@code hostAddr}
@throws IllegalArgumentException if {@code hostAddr} is not a valid IPv4 address, or IPv6
     address surrounded by square brackets

### `forUriStringNoThrow(`java.lang.String` hostAddr)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

### `isUriInetAddress(`java.lang.String` ipString)`

**Returns:** `boolean`

Returns {@code true} if the supplied string is a valid URI IP string literal, {@code false}
 otherwise.

 <p>This method accepts non-ASCII digits, for example {@code "\uff11\uff19\uff12.\uff11\uff16\uff18.\uff10.\uff11"} (those are fullwidth
 characters). That is consistent with {@link InetAddress}, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like {@code
 CharMatcher.ascii().matchesAllOf(ipString)}.
@param ipString {@code String} to evaluated as an IP URI host string literal
@return {@code true} if the argument is a valid IP URI host

### `isCompatIPv4Address([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** `boolean`

Evaluates whether the argument is an IPv6 "compat" address.

 <p>An "IPv4 compatible", or "compat", address is one with 96 leading bits of zero, with the
 remaining 32 bits interpreted as an IPv4 address. These are conventionally represented in
 string literals as {@code "::192.168.0.1"}, though {@code "::c0a8:1"} is also considered an
 IPv4 compatible address (and equivalent to {@code "::192.168.0.1"}).

 <p>For more on IPv4 compatible addresses see section 2.5.5.1 of <a target="_parent" href="http://tools.ietf.org/html/rfc4291#section-2.5.5.1">RFC 4291</a>.

 <p>NOTE: This method is different from {@link Inet6Address#isIPv4CompatibleAddress} in that it
 more correctly classifies {@code "::"} and {@code "::1"} as proper IPv6 addresses (which they
 are), NOT IPv4 compatible addresses (which they are generally NOT considered to be).
@param ip {@link Inet6Address} to be examined for embedded IPv4 compatible address format
@return {@code true} if the argument is a valid "compat" address

### `getCompatIPv4Address([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Returns the IPv4 address embedded in an IPv4 compatible address.
@param ip {@link Inet6Address} to be examined for an embedded IPv4 address
@return {@link Inet4Address} of the embedded IPv4 address
@throws IllegalArgumentException if the argument is not a valid IPv4 compatible address

### `is6to4Address([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** `boolean`

Evaluates whether the argument is a 6to4 address.

 <p>6to4 addresses begin with the {@code "2002::/16"} prefix. The next 32 bits are the IPv4
 address of the host to which IPv6-in-IPv4 tunneled packets should be routed.

 <p>For more on 6to4 addresses see section 2 of <a target="_parent" href="http://tools.ietf.org/html/rfc3056#section-2">RFC 3056</a>.
@param ip {@link Inet6Address} to be examined for 6to4 address format
@return {@code true} if the argument is a 6to4 address

### `get6to4IPv4Address([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Returns the IPv4 address embedded in a 6to4 address.
@param ip {@link Inet6Address} to be examined for embedded IPv4 in 6to4 address
@return {@link Inet4Address} of embedded IPv4 in 6to4 address
@throws IllegalArgumentException if the argument is not a valid IPv6 6to4 address

### `isTeredoAddress([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** `boolean`

Evaluates whether the argument is a Teredo address.

 <p>Teredo addresses begin with the {@code "2001::/32"} prefix.
@param ip {@link Inet6Address} to be examined for Teredo address format
@return {@code true} if the argument is a Teredo address

### `getTeredoInfo([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** [`com.google.common.net.InetAddresses.TeredoInfo`](InetAddresses/TeredoInfo.md)

Returns the Teredo information embedded in a Teredo address.
@param ip {@link Inet6Address} to be examined for embedded Teredo information
@return extracted {@code TeredoInfo}
@throws IllegalArgumentException if the argument is not a valid IPv6 Teredo address

### `isIsatapAddress([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** `boolean`

Evaluates whether the argument is an ISATAP address.

 <p>From RFC 5214: "ISATAP interface identifiers are constructed in Modified EUI-64 format [...]
 by concatenating the 24-bit IANA OUI (00-00-5E), the 8-bit hexadecimal value 0xFE, and a 32-bit
 IPv4 address in network byte order [...]"

 <p>For more on ISATAP addresses see section 6.1 of <a target="_parent" href="http://tools.ietf.org/html/rfc5214#section-6.1">RFC 5214</a>.
@param ip {@link Inet6Address} to be examined for ISATAP address format
@return {@code true} if the argument is an ISATAP address

### `getIsatapIPv4Address([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Returns the IPv4 address embedded in an ISATAP address.
@param ip {@link Inet6Address} to be examined for embedded IPv4 in ISATAP address
@return {@link Inet4Address} of embedded IPv4 in an ISATAP address
@throws IllegalArgumentException if the argument is not a valid IPv6 ISATAP address

### `hasEmbeddedIPv4ClientAddress([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** `boolean`

Examines the Inet6Address to determine if it is an IPv6 address of one of the specified address
 types that contain an embedded IPv4 address.

 <p>NOTE: ISATAP addresses are explicitly excluded from this method due to their trivial
 spoofability. With other transition addresses spoofing involves (at least) infection of one's
 BGP routing table.
@param ip {@link Inet6Address} to be examined for embedded IPv4 client address
@return {@code true} if there is an embedded IPv4 client address
@since 7.0

### `getEmbeddedIPv4ClientAddress([`java.net.Inet6Address`](../../../../java/net/Inet6Address.md) ip)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Examines the Inet6Address to extract the embedded IPv4 client address if the InetAddress is an
 IPv6 address of one of the specified address types that contain an embedded IPv4 address.

 <p>NOTE: ISATAP addresses are explicitly excluded from this method due to their trivial
 spoofability. With other transition addresses spoofing involves (at least) infection of one's
 BGP routing table.
@param ip {@link Inet6Address} to be examined for embedded IPv4 client address
@return {@link Inet4Address} of embedded IPv4 client address
@throws IllegalArgumentException if the argument does not have a valid embedded IPv4 address

### `isMappedIPv4Address(`java.lang.String` ipString)`

**Returns:** `boolean`

Evaluates whether the argument is an "IPv4 mapped" IPv6 address.

 <p>An "IPv4 mapped" address is anything in the range ::ffff:0:0/96 (sometimes written as
 ::ffff:0.0.0.0/96), with the last 32 bits interpreted as an IPv4 address.

 <p>For more on IPv4 mapped addresses see section 2.5.5.2 of <a target="_parent" href="http://tools.ietf.org/html/rfc4291#section-2.5.5.2">RFC 4291</a>.

 <p>Note: This method takes a {@code String} argument because {@link InetAddress} automatically
 collapses mapped addresses to IPv4. (It is actually possible to avoid this using one of the
 obscure {@link Inet6Address} methods, but it would be unwise to depend on such a
 poorly-documented feature.)

 <p>This method accepts non-ASCII digits. That is consistent with {@link InetAddress}, but not
 with various RFCs. If you want to accept ASCII digits only, you can use something like {@code
 CharMatcher.ascii().matchesAllOf(ipString)}.
@param ipString {@code String} to be examined for embedded IPv4-mapped IPv6 address format
@return {@code true} if the argument is a valid "mapped" address
@since 10.0

### `getCoercedIPv4Address([`java.net.InetAddress`](../../../../java/net/InetAddress.md) ip)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Coerces an IPv6 address into an IPv4 address.

 <p>HACK: As long as applications continue to use IPv4 addresses for indexing into tables,
 accounting, et cetera, it may be necessary to <b>coerce</b> IPv6 addresses into IPv4 addresses.
 This method does so by hashing 64 bits of the IPv6 address into {@code 224.0.0.0/3} (64 bits
 into 29 bits):

 <ul>
   <li>If the IPv6 address contains an embedded IPv4 address, the function hashes that.
   <li>Otherwise, it hashes the upper 64 bits of the IPv6 address.
 </ul>

 <p>A "coerced" IPv4 address is equivalent to itself.

 <p>NOTE: This method is failsafe for security purposes: ALL IPv6 addresses (except localhost
 (::1)) are hashed to avoid the security risk associated with extracting an embedded IPv4
 address that might permit elevated privileges.
@param ip {@link InetAddress} to "coerce"
@return {@link Inet4Address} represented "coerced" address
@since 7.0

### `coerceToInteger([`java.net.InetAddress`](../../../../java/net/InetAddress.md) ip)`

**Returns:** `int`

Returns an integer representing an IPv4 address regardless of whether the supplied argument is
 an IPv4 address or not.

 <p>IPv6 addresses are <b>coerced</b> to IPv4 addresses before being converted to integers.

 <p>As long as there are applications that assume that all IP addresses are IPv4 addresses and
 can therefore be converted safely to integers (for whatever purpose) this function can be used
 to handle IPv6 addresses as well until the application is suitably fixed.

 <p>NOTE: an IPv6 address coerced to an IPv4 address can only be used for such purposes as
 rudimentary identification or indexing into a collection of real {@link InetAddress}es. They
 cannot be used as real addresses for the purposes of network communication.
@param ip {@link InetAddress} to convert
@return {@code int}, "coerced" if ip is not an IPv4 address
@since 7.0

### `toBigInteger([`java.net.InetAddress`](../../../../java/net/InetAddress.md) address)`

**Returns:** [`java.math.BigInteger`](../../../../java/math/BigInteger.md)

Returns a BigInteger representing the address.

 <p>Unlike {@code coerceToInteger}, IPv6 addresses are not coerced to IPv4 addresses.
@param address {@link InetAddress} to convert
@return {@code BigInteger} representation of the address
@since 28.2

### `fromInteger(`int` address)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Returns an Inet4Address having the integer value specified by the argument.
@param address {@code int}, the 32bit integer address to be converted
@return {@link Inet4Address} equivalent of the argument

### `fromIPv4BigInteger([`java.math.BigInteger`](../../../../java/math/BigInteger.md) address)`

**Returns:** [`java.net.Inet4Address`](../../../../java/net/Inet4Address.md)

Returns the {@code Inet4Address} corresponding to a given {@code BigInteger}.
@param address BigInteger representing the IPv4 address
@return Inet4Address representation of the given BigInteger
@throws IllegalArgumentException if the BigInteger is not between 0 and 2^32-1
@since 28.2

### `fromIPv6BigInteger([`java.math.BigInteger`](../../../../java/math/BigInteger.md) address)`

**Returns:** [`java.net.Inet6Address`](../../../../java/net/Inet6Address.md)

Returns the {@code Inet6Address} corresponding to a given {@code BigInteger}.
@param address BigInteger representing the IPv6 address
@return Inet6Address representation of the given BigInteger
@throws IllegalArgumentException if the BigInteger is not between 0 and 2^128-1
@since 28.2

### `fromBigInteger([`java.math.BigInteger`](../../../../java/math/BigInteger.md) address, `boolean` isIpv6)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Converts a BigInteger to either an IPv4 or IPv6 address. If the IP is IPv4, it must be
 constrained to 32 bits, otherwise it is constrained to 128 bits.
@param address the address represented as a big integer
@param isIpv6 whether the created address should be IPv4 or IPv6
@return the BigInteger converted to an address
@throws IllegalArgumentException if the BigInteger is not between 0 and maximum value for IPv4
     or IPv6 respectively

### `fromLittleEndianByteArray(`byte[]` addr)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Returns an address from a <b>little-endian ordered</b> byte array (the opposite of what {@link InetAddress#getByAddress} expects).

 <p>IPv4 address byte array must be 4 bytes long and IPv6 byte array must be 16 bytes long.
@param addr the raw IP address in little-endian byte order
@return an InetAddress object created from the raw IP address
@throws UnknownHostException if IP address is of illegal length

### `decrement([`java.net.InetAddress`](../../../../java/net/InetAddress.md) address)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Returns a new InetAddress that is one less than the passed in address. This method works for
 both IPv4 and IPv6 addresses.
@param address the InetAddress to decrement
@return a new InetAddress that is one less than the passed in address
@throws IllegalArgumentException if InetAddress is at the beginning of its range
@since 18.0

### `increment([`java.net.InetAddress`](../../../../java/net/InetAddress.md) address)`

**Returns:** [`java.net.InetAddress`](../../../../java/net/InetAddress.md)

Returns a new InetAddress that is one more than the passed in address. This method works for
 both IPv4 and IPv6 addresses.
@param address the InetAddress to increment
@return a new InetAddress that is one more than the passed in address
@throws IllegalArgumentException if InetAddress is at the end of its range
@since 10.0

### `isMaximum([`java.net.InetAddress`](../../../../java/net/InetAddress.md) address)`

**Returns:** `boolean`

Returns true if the InetAddress is either 255.255.255.255 for IPv4 or
 ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff for IPv6.
@return true if the InetAddress is either 255.255.255.255 for IPv4 or
     ffff:ffff:ffff:ffff:ffff:ffff:ffff:ffff for IPv6
@since 10.0

### `formatIllegalArgumentException(`java.lang.String` format, `java.lang.Object[]` args)`

**Returns:** `java.lang.IllegalArgumentException`

