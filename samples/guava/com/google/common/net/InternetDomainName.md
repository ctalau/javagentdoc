# Class: `InternetDomainName`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.InternetDomainName`

## Description

Only
 syntactic analysis is performed; no DNS lookups or other network interactions take place. Thus
 there is no guarantee that the domain actually exists on the internet.

 
One common use of this class is to determine whether a given string is likely to represent an
 addressable domain on the web -- that is, for a candidate string "xxx", might browsing to
 "http://xxx/" result in a webpage being displayed? In the past, this test was frequently
 done by determining whether the domain ended with a public suffix
 but was not itself a public suffix. However, this test is no longer accurate. There are many
 domains which are both public suffixes and addressable as hosts; "uk.com" is one example.
 Using the subset of public suffixes that are registry suffixes,
 one can get a better result, as only a few registry suffixes are addressable. However, the most
 useful test to determine if a domain is a plausible web host is #hasPublicSuffix(). This
 will return true for many domains which (currently) are not hosts, such as "com",
 but given that any public suffix may become a host without warning, it is better to err on the
 side of permissiveness and thus avoid spurious rejection of valid sites. Of course, to actually
 determine addressability of any host, clients of this class will need to perform their own DNS
 lookups.

 
During construction, names are normalized in two ways:

 

   - ASCII uppercase characters are converted to lowercase.
   - Unicode dot separators other than the ASCII period ('.') are converted to the ASCII
       period.
 


 
The normalized values will be returned from #toString() and #parts(), and will
 be reflected in the result of #equals(Object).

 
[Internationalized domain
 names](http://en.wikipedia.org/wiki/Internationalized_domain_name) such as 网络.cn are supported, as are the equivalent [IDNA Punycode-encoded](http://en.wikipedia.org/wiki/Internationalized_domain_name)
 versions.

## Fields

### `DOTS_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `DOT_SPLITTER`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

### `DOT_JOINER`

**Type:** [`com.google.common.base.Joiner`](../base/Joiner.md)

### `NO_SUFFIX_FOUND`

**Type:** `int`

### `SUFFIX_NOT_INITIALIZED`

**Type:** `int`

### `MAX_PARTS`

**Type:** `int`

This value arises from the 255-octet limit described
 in [RFC 2181](http://www.ietf.org/rfc/rfc2181.txt) part 11 with the fact that the
 encoding of each part occupies at least two bytes (dot plus label externally, length byte plus
 label internally). Thus, if all labels have the minimum size of one byte, 127 of them will fit.

### `MAX_LENGTH`

**Type:** `int`

See [RFC 2181](http://www.ietf.org/rfc/rfc2181.txt) part 11.

### `MAX_DOMAIN_PART_LENGTH`

**Type:** `int`

See [RFC 2181](http://www.ietf.org/rfc/rfc2181.txt) part 11.

### `name`

**Type:** `java.lang.String`

### `parts`

**Type:** [`com.google.common.collect.ImmutableList<java.lang.String>`](../collect/ImmutableList.md)

### `publicSuffixIndexCache`

**Type:** `int`

Do not use directly.

 
Since this field isn't volatile, if an instance of this class is shared across
 threads before it is initialized, then each thread is likely to compute their own copy of the
 value.

### `registrySuffixIndexCache`

**Type:** `int`

Do not use directly.

 
Since this field isn't volatile, if an instance of this class is shared across
 threads before it is initialized, then each thread is likely to compute their own copy of the
 value.

### `DASH_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `DIGIT_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `LETTER_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `PART_CHAR_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

## Constructors

### `<init>(String name)`

**Parameters:**
- `name` (`java.lang.String`)

## Methods

### `publicSuffixIndex()`

For example, for the
 domain name myblog.blogspot.co.uk, the value would be 1 (the index of the 
 blogspot part). The value is negative (specifically, #NO_SUFFIX_FOUND) if no public
 suffix was found.

**Returns:** `int`

### `registrySuffixIndex()`

For example, for
 the domain name myblog.blogspot.co.uk, the value would be 2 (the index of the 
 co part). The value is negative (specifically, #NO_SUFFIX_FOUND) if no registry suffix
 was found.

**Returns:** `int`

### `findSuffixOfType(Optional<PublicSuffixType> desiredType)`

Note that the value
 defined as a suffix may not produce true results from #isPublicSuffix() or
 #isRegistrySuffix() if the domain ends with an excluded domain pattern such as 
 "nhs.uk".

 
If a desiredType is specified, this method only finds suffixes of the given type.
 Otherwise, it finds the first suffix of any type.

**Parameters:**
- `desiredType` ([`com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType>`](../base/Optional.md))

**Returns:** `int`

### `from(String domain)`

Specifically,
 validation against [RFC 3490](http://www.ietf.org/rfc/rfc3490.txt)
 ("Internationalizing Domain Names in Applications") is skipped, while validation against [RFC 1035](http://www.ietf.org/rfc/rfc1035.txt) is relaxed in the following ways:

 

   - Any part containing non-ASCII characters is considered valid.
   - Underscores ('_') are permitted wherever dashes ('-') are permitted.
   - Parts other than the final part may start with a digit, as mandated by [RFC 1123](https://tools.ietf.org/html/rfc1123#section-2).

**Parameters:**
- `domain` (`java.lang.String`): A domain name (not IP address)

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `validateSyntax(List<String> parts)`

**Parameters:**
- `parts` (`java.util.List<java.lang.String>`)

**Returns:** `boolean`

### `validatePart(String part, boolean isFinalPart)`

Validates that one part of a domain name is
 valid.

**Parameters:**
- `part` (`java.lang.String`): The domain name part to be validated
- `isFinalPart` (`boolean`): Is this the final (rightmost) domain part?

**Returns:** `boolean`

### `parts()`

For
 example, for the domain name mail.google.com, this method returns the list 
 ["mail", "google", "com"].

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.String>`](../collect/ImmutableList.md)

### `isPublicSuffix()`

A public suffix
 is one under which Internet users can directly register names, such as com, 
 co.uk or pvt.k12.wy.us. Examples of domain names that are *not* public suffixes
 include google.com, foo.co.uk, and myblog.blogspot.com.

 
Public suffixes are a proper superset of registry suffixes.
 The list of public suffixes additionally contains privately owned domain names under which
 Internet users can register subdomains. An example of a public suffix that is not a registry
 suffix is blogspot.com. Note that it is true that all public suffixes *have*
 registry suffixes, since domain name registries collectively control all internet domain names.

 
For considerations on whether the public suffix or registry suffix designation is more
 suitable for your application, see [this article](https://github.com/google/guava/wiki/InternetDomainNameExplained).

**Returns:** `boolean`

### `hasPublicSuffix()`

For example, returns true for 
 www.google.com, foo.co.uk and com, but not for invalid or 
 google.invalid. This is the recommended method for determining whether a domain is potentially
 an addressable host.

 
Note that this method is equivalent to #hasRegistrySuffix() because all registry
 suffixes are public suffixes *and* all public suffixes have registry suffixes.

**Returns:** `boolean`

### `publicSuffix()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `isUnderPublicSuffix()`

For example, returns true for 
 www.google.com, foo.co.uk and myblog.blogspot.com, but not for com,
 co.uk, google.invalid, or blogspot.com.

 
This method can be used to determine whether it will probably be possible to set cookies on
 the domain, though even that depends on individual browsers' implementations of cookie
 controls. See [RFC 2109](http://www.ietf.org/rfc/rfc2109.txt) for details.

**Returns:** `boolean`

### `isTopPrivateDomain()`

For example, returns true for 
 google.com foo.co.uk, and myblog.blogspot.com, but not for 
 www.google.com, co.uk, or blogspot.com.

 
This method can be used to determine whether a domain is probably the highest level for
 which cookies may be set, though even that depends on individual browsers' implementations of
 cookie controls. See [RFC 2109](http://www.ietf.org/rfc/rfc2109.txt) for details.

**Returns:** `boolean`

### `topPrivateDomain()`

For example, for x.adwords.google.co.uk it returns
 google.co.uk, since co.uk is a public suffix. Similarly, for 
 myblog.blogspot.com it returns the same domain, myblog.blogspot.com, since 
 blogspot.com is a public suffix.

 
If #isTopPrivateDomain() is true, the current domain name instance is returned.

 
This method can be used to determine the probable highest level parent domain for which
 cookies may be set, though even that depends on individual browsers' implementations of cookie
 controls.

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `isRegistrySuffix()`

A
 registry suffix is one under which Internet users can directly register names via a domain name
 registrar, and have such registrations lawfully protected by internet-governing bodies such as
 ICANN. Examples of registry suffixes include com, co.uk, and 
 pvt.k12.wy.us. Examples of domain names that are *not* registry suffixes include 
 google.com and foo.co.uk.

 
Registry suffixes are a proper subset of public suffixes. The
 list of public suffixes additionally contains privately owned domain names under which Internet
 users can register subdomains. An example of a public suffix that is not a registry suffix is
 blogspot.com. Note that it is true that all public suffixes *have* registry
 suffixes, since domain name registries collectively control all internet domain names.

 
For considerations on whether the public suffix or registry suffix designation is more
 suitable for your application, see [this article](https://github.com/google/guava/wiki/InternetDomainNameExplained).

**Returns:** `boolean`

### `hasRegistrySuffix()`

For example, returns true for 
 www.google.com, foo.co.uk and com, but not for invalid or 
 google.invalid.

 
Note that this method is equivalent to #hasPublicSuffix() because all registry
 suffixes are public suffixes *and* all public suffixes have registry suffixes.

**Returns:** `boolean`

### `registrySuffix()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `isUnderRegistrySuffix()`

For example, returns true for 
 www.google.com, foo.co.uk and blogspot.com, but not for com, 
 co.uk, or google.invalid.

**Returns:** `boolean`

### `isTopDomainUnderRegistrySuffix()`

For example, returns true for 
 google.com, foo.co.uk, and blogspot.com, but not for www.google.com,
 co.uk, or myblog.blogspot.com.

 
**Warning:** This method should not be used to determine the probable highest level
 parent domain for which cookies may be set. Use #topPrivateDomain() for that purpose.

**Returns:** `boolean`

### `topDomainUnderRegistrySuffix()`

For example, for x.adwords.google.co.uk it
 returns google.co.uk, since co.uk is a registry suffix. Similarly, for 
 myblog.blogspot.com it returns blogspot.com, since com is a registry suffix.

 
If #isTopDomainUnderRegistrySuffix() is true, the current domain name instance is
 returned.

 
**Warning:** This method should not be used to determine whether a domain is probably the
 highest level for which cookies may be set. Use #isTopPrivateDomain() for that purpose.

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `hasParent()`

**Returns:** `boolean`

### `parent()`

For example, the parent of 
 www.google.com is google.com.

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `ancestor(int levels)`

The number of levels must be non-negative, and less than N-1,
 where N is the number of parts in the domain.

 
TODO: Reasonable candidate for addition to public API.

**Parameters:**
- `levels` (`int`)

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `child(String leftParts)`

For example, InternetDomainName.from("foo.com").child("www.bar")
 returns a new InternetDomainName with the value www.bar.foo.com. Only lenient
 validation is performed, as described here.

**Parameters:**
- `leftParts` (`java.lang.String`)

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

### `isValid(String name)`

Specifically, validation against [RFC 3490](http://www.ietf.org/rfc/rfc3490.txt)
 ("Internationalizing Domain Names in Applications") is skipped.

 
The following two code snippets are equivalent:

 

```

 domainName = InternetDomainName.isValid(name)
     ? InternetDomainName.from(name)
     : DEFAULT_DOMAIN;
 
```


 

```

 try {
   domainName = InternetDomainName.from(name);
 } catch (IllegalArgumentException e) {
   domainName = DEFAULT_DOMAIN;
 }
 
```

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** `boolean`

### `matchesType(Optional<PublicSuffixType> desiredType, Optional<PublicSuffixType> actualType)`

Otherwise, returns true as long as actualType is present.

**Parameters:**
- `desiredType` ([`com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType>`](../base/Optional.md))
- `actualType` ([`com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType>`](../base/Optional.md))

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `equals(Object object)`

For example, a non-ASCII Unicode domain name and the Punycode
 version of the same domain name would not be considered equal.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

