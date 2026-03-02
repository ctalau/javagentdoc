# Class: `InetAddresses`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.InetAddresses`

## Description

**Important note:** Unlike InetAddress.getByName(), the methods of this class never
 cause DNS services to be accessed. For this reason, you should prefer these methods as much as
 possible over their JDK equivalents whenever you are expecting to handle only IP address string
 literals -- there is no blocking DNS penalty for a malformed string.

 
When dealing with Inet4Address and Inet6Address objects as byte arrays (vis.
 InetAddress.getAddress()) they are 4 and 16 bytes in length, respectively, and represent
 the address in network byte order.

 
Examples of IP addresses and their byte representations:

 
   The IPv4 loopback address, "127.0.0.1".
   7f 00 00 01
   The IPv6 loopback address, "::1".
   00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01
   From the IPv6 reserved documentation prefix (2001:db8::/32), "2001:db8::1".
   20 01 0d b8 00 00 00 00 00 00 00 00 00 00 00 01
   An IPv6 "IPv4 compatible" (or "compat") address, "::192.168.0.1".
   00 00 00 00 00 00 00 00 00 00 00 00 c0 a8 00 01
   An IPv6 "IPv4 mapped" address, "::ffff:192.168.0.1".
   00 00 00 00 00 00 00 00 00 00 ff ff c0 a8 00 01
 

 
A few notes about IPv6 "IPv4 mapped" addresses and their observed use in Java.

 
"IPv4 mapped" addresses were originally a representation of IPv4 addresses for use on an IPv6
 socket that could receive both IPv4 and IPv6 connections (by disabling the IPV6_V6ONLY
 socket option on an IPv6 socket). Yes, it's confusing. Nevertheless, these "mapped" addresses
 were never supposed to be seen on the wire. That assumption was dropped, some say mistakenly, in
 later RFCs with the apparent aim of making IPv4-to-IPv6 transition simpler.

 
Technically one *can* create a 128bit IPv6 address with the wire format of a "mapped"
 address, as shown above, and transmit it in an IPv6 packet header. However, Java's InetAddress
 creation methods appear to adhere doggedly to the original intent of the "mapped" address: all
 "mapped" addresses return Inet4Address objects.

 
For added safety, it is common for IPv6 network operators to filter all packets where either
 the source or destination address appears to be a "compat" or "mapped" address. Filtering
 suggestions usually recommend discarding any packets with source or destination addresses in the
 invalid range ::/3, which includes both of these bizarre address formats. For more
 information on "bogons", including lists of IPv6 bogon space, see:

 

   - [http://en.wikipedia.
       org/wiki/Bogon_filtering](http://en.wikipedia.org/wiki/Bogon_filtering)
   - [http://www.cymru.com/Bogons/ ipv6.txt](http://www.cymru.com/Bogons/ipv6.txt)
   - [http://www.cymru.com/
       Bogons/v6bogon.html](http://www.cymru.com/Bogons/v6bogon.html)
   - [http://www.
       space.net/~gert/RIPE/ipv6-filters.html](http://www.space.net/~gert/RIPE/ipv6-filters.html)

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

**Type:** `java.net.Inet4Address`

### `ANY4`

**Type:** `java.net.Inet4Address`

## Constructors

### `<init>()`

## Methods

### `getInet4Address(byte[] bytes)`

**Parameters:**
- `bytes` (`byte[]`): byte array representing an IPv4 address (should be of length 4)

**Returns:** `java.net.Inet4Address`

### `forString(String ipString)`

This deliberately avoids all nameservice lookups (e.g. no DNS).

 
Anything after a % in an IPv6 address is ignored (assumed to be a Scope ID).

 
This method accepts non-ASCII digits, for example "１９２.１６８.０.１" (those are fullwidth
 characters). That is consistent with InetAddress, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like 
 CharMatcher.ascii().matchesAllOf(ipString).

**Parameters:**
- `ipString` (`java.lang.String`): String containing an IPv4 or IPv6 string literal, e.g. 
       "192.168.0.1" or "2001:db8::1"

**Returns:** `java.net.InetAddress`

### `isInetAddress(String ipString)`

This method accepts non-ASCII digits, for example "１９２.１６８.０.１" (those are fullwidth
 characters). That is consistent with InetAddress, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like 
 CharMatcher.ascii().matchesAllOf(ipString).

**Parameters:**
- `ipString` (`java.lang.String`): String to evaluated as an IP string literal

**Returns:** `boolean`

### `ipStringToBytes(String ipStringParam)`

**Parameters:**
- `ipStringParam` (`java.lang.String`)

**Returns:** `byte[]`

### `textToNumericFormatV4(String ipString)`

**Parameters:**
- `ipString` (`java.lang.String`)

**Returns:** `byte[]`

### `textToNumericFormatV6(String ipString)`

**Parameters:**
- `ipString` (`java.lang.String`)

**Returns:** `byte[]`

### `convertDottedQuadToHex(String ipString)`

**Parameters:**
- `ipString` (`java.lang.String`)

**Returns:** `java.lang.String`

### `parseOctet(String ipString, int start, int end)`

**Parameters:**
- `ipString` (`java.lang.String`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `byte`

### `parseHextet(String ipString, int start, int end)`

**Parameters:**
- `ipString` (`java.lang.String`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `short`

### `bytesToInetAddress(byte[] addr)`

InetAddress#getByAddress is documented as throwing a checked exception "if IP
 address is of illegal length." We replace it with an unchecked exception, for use by callers
 who already know that addr is an array of length 4 or 16.

**Parameters:**
- `addr` (`byte[]`): the raw 4-byte or 16-byte IP address in big-endian order

**Returns:** `java.net.InetAddress`

### `toAddrString(InetAddress ip)`

For IPv4 addresses, this is identical to InetAddress#getHostAddress(), but for IPv6
 addresses, the output follows [RFC 5952](http://tools.ietf.org/html/rfc5952) section
 4. The main difference is that this method uses "::" for zero compression, while Java's version
 uses the uncompressed form.

 
This method uses hexadecimal for all IPv6 addresses, including IPv4-mapped IPv6 addresses
 such as "::c000:201". The output does not include a Scope ID.

**Parameters:**
- `ip` (`java.net.InetAddress`): InetAddress to be converted to an address string

**Returns:** `java.lang.String`

### `compressLongestRunOfZeroes(int[] hextets)`

Only runs of two or more hextets are considered. In case of a tie, the leftmost run wins. If
 a qualifying run is found, its hextets are replaced by the sentinel value -1.

**Parameters:**
- `hextets` (`int[]`): int[] mutable array of eight 16-bit hextets

**Returns:** `void`

### `hextetsToIPv6String(int[] hextets)`

In order for "::" compression to work, the input should contain negative sentinel values in
 place of the elided zeroes.

**Parameters:**
- `hextets` (`int[]`): int[] array of eight 16-bit hextets, or -1s

**Returns:** `java.lang.String`

### `toUriString(InetAddress ip)`

For IPv4 addresses, this is identical to InetAddress#getHostAddress(), but for IPv6
 addresses it compresses zeroes and surrounds the text with square brackets; for example 
 "[2001:db8::1]".

 
Per section 3.2.2 of [RFC 3986](http://tools.ietf.org/html/rfc3986#section-3.2.2), a URI containing an IPv6
 string literal is of the form "http://[2001:db8::1]:8888/index.html".

 
Use of either InetAddresses#toAddrString, InetAddress#getHostAddress(), or
 this method is recommended over InetAddress#toString() when an IP address string
 literal is desired. This is because InetAddress#toString() prints the hostname and the
 IP address string joined by a "/".

**Parameters:**
- `ip` (`java.net.InetAddress`): InetAddress to be converted to URI string literal

**Returns:** `java.lang.String`

### `forUriString(String hostAddr)`

This method is similar to InetAddresses#forString(String), however, it requires that
 IPv6 addresses are surrounded by square brackets.

 
This method is the inverse of InetAddresses#toUriString(java.net.InetAddress).

 
This method accepts non-ASCII digits, for example "１９２.１６８.０.１" (those are fullwidth
 characters). That is consistent with InetAddress, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like 
 CharMatcher.ascii().matchesAllOf(ipString).

**Parameters:**
- `hostAddr` (`java.lang.String`): an RFC 3986 section 3.2.2 encoded IPv4 or IPv6 address

**Returns:** `java.net.InetAddress`

### `forUriStringNoThrow(String hostAddr)`

**Parameters:**
- `hostAddr` (`java.lang.String`)

**Returns:** `java.net.InetAddress`

### `isUriInetAddress(String ipString)`

This method accepts non-ASCII digits, for example "１９２.１６８.０.１" (those are fullwidth
 characters). That is consistent with InetAddress, but not with various RFCs. If you
 want to accept ASCII digits only, you can use something like 
 CharMatcher.ascii().matchesAllOf(ipString).

**Parameters:**
- `ipString` (`java.lang.String`): String to evaluated as an IP URI host string literal

**Returns:** `boolean`

### `isCompatIPv4Address(Inet6Address ip)`

An "IPv4 compatible", or "compat", address is one with 96 leading bits of zero, with the
 remaining 32 bits interpreted as an IPv4 address. These are conventionally represented in
 string literals as "::192.168.0.1", though "::c0a8:1" is also considered an
 IPv4 compatible address (and equivalent to "::192.168.0.1").

 
For more on IPv4 compatible addresses see section 2.5.5.1 of [RFC 4291](http://tools.ietf.org/html/rfc4291#section-2.5.5.1).

 
NOTE: This method is different from Inet6Address#isIPv4CompatibleAddress in that it
 more correctly classifies "::" and "::1" as proper IPv6 addresses (which they
 are), NOT IPv4 compatible addresses (which they are generally NOT considered to be).

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for embedded IPv4 compatible address format

**Returns:** `boolean`

### `getCompatIPv4Address(Inet6Address ip)`

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for an embedded IPv4 address

**Returns:** `java.net.Inet4Address`

### `is6to4Address(Inet6Address ip)`

6to4 addresses begin with the "2002::/16" prefix. The next 32 bits are the IPv4
 address of the host to which IPv6-in-IPv4 tunneled packets should be routed.

 
For more on 6to4 addresses see section 2 of [RFC 3056](http://tools.ietf.org/html/rfc3056#section-2).

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for 6to4 address format

**Returns:** `boolean`

### `get6to4IPv4Address(Inet6Address ip)`

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for embedded IPv4 in 6to4 address

**Returns:** `java.net.Inet4Address`

### `isTeredoAddress(Inet6Address ip)`

Teredo addresses begin with the "2001::/32" prefix.

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for Teredo address format

**Returns:** `boolean`

### `getTeredoInfo(Inet6Address ip)`

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for embedded Teredo information

**Returns:** `com.google.common.net.InetAddresses.TeredoInfo`

### `isIsatapAddress(Inet6Address ip)`

From RFC 5214: "ISATAP interface identifiers are constructed in Modified EUI-64 format [...]
 by concatenating the 24-bit IANA OUI (00-00-5E), the 8-bit hexadecimal value 0xFE, and a 32-bit
 IPv4 address in network byte order [...]"

 
For more on ISATAP addresses see section 6.1 of [RFC 5214](http://tools.ietf.org/html/rfc5214#section-6.1).

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for ISATAP address format

**Returns:** `boolean`

### `getIsatapIPv4Address(Inet6Address ip)`

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for embedded IPv4 in ISATAP address

**Returns:** `java.net.Inet4Address`

### `hasEmbeddedIPv4ClientAddress(Inet6Address ip)`

NOTE: ISATAP addresses are explicitly excluded from this method due to their trivial
 spoofability. With other transition addresses spoofing involves (at least) infection of one's
 BGP routing table.

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for embedded IPv4 client address

**Returns:** `boolean`

### `getEmbeddedIPv4ClientAddress(Inet6Address ip)`

NOTE: ISATAP addresses are explicitly excluded from this method due to their trivial
 spoofability. With other transition addresses spoofing involves (at least) infection of one's
 BGP routing table.

**Parameters:**
- `ip` (`java.net.Inet6Address`): Inet6Address to be examined for embedded IPv4 client address

**Returns:** `java.net.Inet4Address`

### `isMappedIPv4Address(String ipString)`

An "IPv4 mapped" address is anything in the range ::ffff:0:0/96 (sometimes written as
 ::ffff:0.0.0.0/96), with the last 32 bits interpreted as an IPv4 address.

 
For more on IPv4 mapped addresses see section 2.5.5.2 of [RFC 4291](http://tools.ietf.org/html/rfc4291#section-2.5.5.2).

 
Note: This method takes a String argument because InetAddress automatically
 collapses mapped addresses to IPv4. (It is actually possible to avoid this using one of the
 obscure Inet6Address methods, but it would be unwise to depend on such a
 poorly-documented feature.)

 
This method accepts non-ASCII digits. That is consistent with InetAddress, but not
 with various RFCs. If you want to accept ASCII digits only, you can use something like 
 CharMatcher.ascii().matchesAllOf(ipString).

**Parameters:**
- `ipString` (`java.lang.String`): String to be examined for embedded IPv4-mapped IPv6 address format

**Returns:** `boolean`

### `getCoercedIPv4Address(InetAddress ip)`

HACK: As long as applications continue to use IPv4 addresses for indexing into tables,
 accounting, et cetera, it may be necessary to **coerce** IPv6 addresses into IPv4 addresses.
 This method does so by hashing 64 bits of the IPv6 address into 224.0.0.0/3 (64 bits
 into 29 bits):

 

   - If the IPv6 address contains an embedded IPv4 address, the function hashes that.
   - Otherwise, it hashes the upper 64 bits of the IPv6 address.
 


 
A "coerced" IPv4 address is equivalent to itself.

 
NOTE: This method is failsafe for security purposes: ALL IPv6 addresses (except localhost
 (::1)) are hashed to avoid the security risk associated with extracting an embedded IPv4
 address that might permit elevated privileges.

**Parameters:**
- `ip` (`java.net.InetAddress`): InetAddress to "coerce"

**Returns:** `java.net.Inet4Address`

### `coerceToInteger(InetAddress ip)`

IPv6 addresses are **coerced** to IPv4 addresses before being converted to integers.

 
As long as there are applications that assume that all IP addresses are IPv4 addresses and
 can therefore be converted safely to integers (for whatever purpose) this function can be used
 to handle IPv6 addresses as well until the application is suitably fixed.

 
NOTE: an IPv6 address coerced to an IPv4 address can only be used for such purposes as
 rudimentary identification or indexing into a collection of real InetAddresses. They
 cannot be used as real addresses for the purposes of network communication.

**Parameters:**
- `ip` (`java.net.InetAddress`): InetAddress to convert

**Returns:** `int`

### `toBigInteger(InetAddress address)`

Unlike coerceToInteger, IPv6 addresses are not coerced to IPv4 addresses.

**Parameters:**
- `address` (`java.net.InetAddress`): InetAddress to convert

**Returns:** `java.math.BigInteger`

### `fromInteger(int address)`

**Parameters:**
- `address` (`int`): int, the 32bit integer address to be converted

**Returns:** `java.net.Inet4Address`

### `fromIPv4BigInteger(BigInteger address)`

**Parameters:**
- `address` (`java.math.BigInteger`): BigInteger representing the IPv4 address

**Returns:** `java.net.Inet4Address`

### `fromIPv6BigInteger(BigInteger address)`

**Parameters:**
- `address` (`java.math.BigInteger`): BigInteger representing the IPv6 address

**Returns:** `java.net.Inet6Address`

### `fromBigInteger(BigInteger address, boolean isIpv6)`

If the IP is IPv4, it must be
 constrained to 32 bits, otherwise it is constrained to 128 bits.

**Parameters:**
- `address` (`java.math.BigInteger`): the address represented as a big integer
- `isIpv6` (`boolean`): whether the created address should be IPv4 or IPv6

**Returns:** `java.net.InetAddress`

### `fromLittleEndianByteArray(byte[] addr)`

IPv4 address byte array must be 4 bytes long and IPv6 byte array must be 16 bytes long.

**Parameters:**
- `addr` (`byte[]`): the raw IP address in little-endian byte order

**Returns:** `java.net.InetAddress`

### `decrement(InetAddress address)`

This method works for
 both IPv4 and IPv6 addresses.

**Parameters:**
- `address` (`java.net.InetAddress`): the InetAddress to decrement

**Returns:** `java.net.InetAddress`

### `increment(InetAddress address)`

This method works for
 both IPv4 and IPv6 addresses.

**Parameters:**
- `address` (`java.net.InetAddress`): the InetAddress to increment

**Returns:** `java.net.InetAddress`

### `isMaximum(InetAddress address)`

**Parameters:**
- `address` (`java.net.InetAddress`)

**Returns:** `boolean`

### `formatIllegalArgumentException(String format, Object[] args)`

**Parameters:**
- `format` (`java.lang.String`)
- `args` (`java.lang.Object[]`)

**Returns:** `java.lang.IllegalArgumentException`

