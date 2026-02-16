# Class: `InternetDomainName`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.InternetDomainName`

## Description

An immutable well-formed internet domain name, such as `com` or `foo.co.uk`. Only
 syntactic analysis is performed; no DNS lookups or other network interactions take place. Thus
 there is no guarantee that the domain actually exists on the internet.

 <p>One common use of this class is to determine whether a given string is likely to represent an
 addressable domain on the web -- that is, for a candidate string `"xxx"`, might browsing to
 `"http://xxx/"` result in a webpage being displayed? In the past, this test was frequently
 done by determining whether the domain ended with a public suffix
 but was not itself a public suffix. However, this test is no longer accurate. There are many
 domains which are both public suffixes and addressable as hosts; `"uk.com"` is one example.
 Using the subset of public suffixes that are registry suffixes,
 one can get a better result, as only a few registry suffixes are addressable. However, the most
 useful test to determine if a domain is a plausible web host is `hasPublicSuffix()`. This
 will return `true` for many domains which (currently) are not hosts, such as `"com"`,
 but given that any public suffix may become a host without warning, it is better to err on the
 side of permissiveness and thus avoid spurious rejection of valid sites. Of course, to actually
 determine addressability of any host, clients of this class will need to perform their own DNS
 lookups.

 <p>During construction, names are normalized in two ways:

 <ol>
   <li>ASCII uppercase characters are converted to lowercase.
   <li>Unicode dot separators other than the ASCII period (`'.'`) are converted to the ASCII
       period.
 </ol>

 <p>The normalized values will be returned from `toString()` and `parts()`, and will
 be reflected in the result of `equals(Object)`.

 <p><a href="http://en.wikipedia.org/wiki/Internationalized_domain_name">Internationalized domain
 names</a> such as `\u7f51\u7edc.cn` are supported, as are the equivalent <a href="http://en.wikipedia.org/wiki/Internationalized_domain_name">IDNA Punycode-encoded</a>
 versions.
**Author:** Catherine Berry
**Since:** 5.0

## Fields

### `DOTS_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `DOT_SPLITTER`

**Type:** [`com.google.common.base.Splitter`](../base/Splitter.md)

### `DOT_JOINER`

**Type:** [`com.google.common.base.Joiner`](../base/Joiner.md)

### `NO_SUFFIX_FOUND`

**Type:** `int`

Value of `publicSuffixIndex()` or `registrySuffixIndex()` which indicates that no
 relevant suffix was found.

### `SUFFIX_NOT_INITIALIZED`

**Type:** `int`

Value of `publicSuffixIndexCache` or `registrySuffixIndexCache` which indicates
 that they were not initialized yet.

### `MAX_PARTS`

**Type:** `int`

Maximum parts (labels) in a domain name. This value arises from the 255-octet limit described
 in <a href="http://www.ietf.org/rfc/rfc2181.txt">RFC 2181</a> part 11 with the fact that the
 encoding of each part occupies at least two bytes (dot plus label externally, length byte plus
 label internally). Thus, if all labels have the minimum size of one byte, 127 of them will fit.

### `MAX_LENGTH`

**Type:** `int`

Maximum length of a full domain name, including separators, and leaving room for the root
 label. See <a href="http://www.ietf.org/rfc/rfc2181.txt">RFC 2181</a> part 11.

### `MAX_DOMAIN_PART_LENGTH`

**Type:** `int`

Maximum size of a single part of a domain name. See <a href="http://www.ietf.org/rfc/rfc2181.txt">RFC 2181</a> part 11.

### `name`

**Type:** `java.lang.String`

The full domain name, converted to lower case.

### `parts`

**Type:** [`com.google.common.collect.ImmutableList<java.lang.String>`](../collect/ImmutableList.md)

The parts of the domain name, converted to lower case.

### `publicSuffixIndexCache`

**Type:** `int`

Cached value of #publicSuffixIndex(). Do not use directly.

 <p>Since this field isn't `volatile`, if an instance of this class is shared across
 threads before it is initialized, then each thread is likely to compute their own copy of the
 value.

### `registrySuffixIndexCache`

**Type:** `int`

Cached value of #registrySuffixIndex(). Do not use directly.

 <p>Since this field isn't `volatile`, if an instance of this class is shared across
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

### `<init>(`java.lang.String` name)`

Constructor used to implement `from(String)`, and from subclasses.

## Methods

### `publicSuffixIndex()`

**Returns:** `int`

The index in the `parts()` list at which the public suffix begins. For example, for the
 domain name `myblog.blogspot.co.uk`, the value would be 1 (the index of the `blogspot` part). The value is negative (specifically, `NO_SUFFIX_FOUND`) if no public
 suffix was found.

### `registrySuffixIndex()`

**Returns:** `int`

The index in the `parts()` list at which the registry suffix begins. For example, for
 the domain name `myblog.blogspot.co.uk`, the value would be 2 (the index of the `co` part). The value is negative (specifically, `NO_SUFFIX_FOUND`) if no registry suffix
 was found.

### `findSuffixOfType([`com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType>`](../base/Optional.md) desiredType)`

**Returns:** `int`

Returns the index of the leftmost part of the suffix, or -1 if not found. Note that the value
 defined as a suffix may not produce `true` results from `isPublicSuffix()` or
 `isRegistrySuffix()` if the domain ends with an excluded domain pattern such as `"nhs.uk"`.

 <p>If a `desiredType` is specified, this method only finds suffixes of the given type.
 Otherwise, it finds the first suffix of any type.

### `from(`java.lang.String` domain)`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns an instance of `InternetDomainName` after lenient validation. Specifically,
 validation against <a href="http://www.ietf.org/rfc/rfc3490.txt">RFC 3490</a>
 ("Internationalizing Domain Names in Applications") is skipped, while validation against <a href="http://www.ietf.org/rfc/rfc1035.txt">RFC 1035</a> is relaxed in the following ways:

 <ul>
   <li>Any part containing non-ASCII characters is considered valid.
   <li>Underscores ('_') are permitted wherever dashes ('-') are permitted.
   <li>Parts other than the final part may start with a digit, as mandated by <a href="https://tools.ietf.org/html/rfc1123#section-2">RFC 1123</a>.
 </ul>
@param domain A domain name (not IP address)
@throws IllegalArgumentException if `domain` is not syntactically valid according to
     `isValid`
**Since:** 10.0 (previously named `fromLenient`)

### `validateSyntax(`java.util.List<java.lang.String>` parts)`

**Returns:** `boolean`

Validation method used by `from` to ensure that the domain name is syntactically valid
 according to RFC 1035.
@return Is the domain name syntactically valid?

### `validatePart(`java.lang.String` part, `boolean` isFinalPart)`

**Returns:** `boolean`

Helper method for `validateSyntax(List)`. Validates that one part of a domain name is
 valid.
@param part The domain name part to be validated
@param isFinalPart Is this the final (rightmost) domain part?
@return Whether the part is valid

### `parts()`

**Returns:** [`com.google.common.collect.ImmutableList<java.lang.String>`](../collect/ImmutableList.md)

Returns the individual components of this domain name, normalized to all lower case. For
 example, for the domain name `mail.google.com`, this method returns the list `["mail", "google", "com"]`.

### `isPublicSuffix()`

**Returns:** `boolean`

Indicates whether this domain name represents a <i>public suffix</i>, as defined by the Mozilla
 Foundation's <a href="http://publicsuffix.org/">Public Suffix List</a> (PSL). A public suffix
 is one under which Internet users can directly register names, such as `com`, `co.uk` or `pvt.k12.wy.us`. Examples of domain names that are <i>not</i> public suffixes
 include `google.com`, `foo.co.uk`, and `myblog.blogspot.com`.

 <p>Public suffixes are a proper superset of registry suffixes.
 The list of public suffixes additionally contains privately owned domain names under which
 Internet users can register subdomains. An example of a public suffix that is not a registry
 suffix is `blogspot.com`. Note that it is true that all public suffixes <i>have</i>
 registry suffixes, since domain name registries collectively control all internet domain names.

 <p>For considerations on whether the public suffix or registry suffix designation is more
 suitable for your application, see <a href="https://github.com/google/guava/wiki/InternetDomainNameExplained">this article</a>.
@return `true` if this domain name appears exactly on the public suffix list
**Since:** 6.0

### `hasPublicSuffix()`

**Returns:** `boolean`

Indicates whether this domain name ends in a public suffix,
 including if it is a public suffix itself. For example, returns `true` for `www.google.com`, `foo.co.uk` and `com`, but not for `invalid` or `google.invalid`. This is the recommended method for determining whether a domain is potentially
 an addressable host.

 <p>Note that this method is equivalent to `hasRegistrySuffix()` because all registry
 suffixes are public suffixes <i>and</i> all public suffixes have registry suffixes.
**Since:** 6.0

### `publicSuffix()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns the public suffix portion of the domain name, or `null` if no public suffix is present.
**Since:** 6.0

### `isUnderPublicSuffix()`

**Returns:** `boolean`

Indicates whether this domain name ends in a public suffix,
 while not being a public suffix itself. For example, returns `true` for `www.google.com`, `foo.co.uk` and `myblog.blogspot.com`, but not for `com`,
 `co.uk`, `google.invalid`, or `blogspot.com`.

 <p>This method can be used to determine whether it will probably be possible to set cookies on
 the domain, though even that depends on individual browsers' implementations of cookie
 controls. See <a href="http://www.ietf.org/rfc/rfc2109.txt">RFC 2109</a> for details.
**Since:** 6.0

### `isTopPrivateDomain()`

**Returns:** `boolean`

Indicates whether this domain name is composed of exactly one subdomain component followed by a
 public suffix. For example, returns `true` for `google.com` `foo.co.uk`, and `myblog.blogspot.com`, but not for `www.google.com`, `co.uk`, or `blogspot.com`.

 <p>This method can be used to determine whether a domain is probably the highest level for
 which cookies may be set, though even that depends on individual browsers' implementations of
 cookie controls. See <a href="http://www.ietf.org/rfc/rfc2109.txt">RFC 2109</a> for details.
**Since:** 6.0

### `topPrivateDomain()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns the portion of this domain name that is one level beneath the public suffix. For example, for `x.adwords.google.co.uk` it returns
 `google.co.uk`, since `co.uk` is a public suffix. Similarly, for `myblog.blogspot.com` it returns the same domain, `myblog.blogspot.com`, since `blogspot.com` is a public suffix.

 <p>If `isTopPrivateDomain()` is true, the current domain name instance is returned.

 <p>This method can be used to determine the probable highest level parent domain for which
 cookies may be set, though even that depends on individual browsers' implementations of cookie
 controls.
@throws IllegalStateException if this domain does not end with a public suffix
**Since:** 6.0

### `isRegistrySuffix()`

**Returns:** `boolean`

Indicates whether this domain name represents a <i>registry suffix</i>, as defined by a subset
 of the Mozilla Foundation's <a href="http://publicsuffix.org/">Public Suffix List</a> (PSL). A
 registry suffix is one under which Internet users can directly register names via a domain name
 registrar, and have such registrations lawfully protected by internet-governing bodies such as
 ICANN. Examples of registry suffixes include `com`, `co.uk`, and `pvt.k12.wy.us`. Examples of domain names that are <i>not</i> registry suffixes include `google.com` and `foo.co.uk`.

 <p>Registry suffixes are a proper subset of public suffixes. The
 list of public suffixes additionally contains privately owned domain names under which Internet
 users can register subdomains. An example of a public suffix that is not a registry suffix is
 `blogspot.com`. Note that it is true that all public suffixes <i>have</i> registry
 suffixes, since domain name registries collectively control all internet domain names.

 <p>For considerations on whether the public suffix or registry suffix designation is more
 suitable for your application, see <a href="https://github.com/google/guava/wiki/InternetDomainNameExplained">this article</a>.
@return `true` if this domain name appears exactly on the public suffix list as part of
     the registry suffix section (labelled "ICANN").
**Since:** 23.3

### `hasRegistrySuffix()`

**Returns:** `boolean`

Indicates whether this domain name ends in a registry suffix,
 including if it is a registry suffix itself. For example, returns `true` for `www.google.com`, `foo.co.uk` and `com`, but not for `invalid` or `google.invalid`.

 <p>Note that this method is equivalent to `hasPublicSuffix()` because all registry
 suffixes are public suffixes <i>and</i> all public suffixes have registry suffixes.
**Since:** 23.3

### `registrySuffix()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns the registry suffix portion of the domain name, or
 `null` if no registry suffix is present.
**Since:** 23.3

### `isUnderRegistrySuffix()`

**Returns:** `boolean`

Indicates whether this domain name ends in a registry suffix,
 while not being a registry suffix itself. For example, returns `true` for `www.google.com`, `foo.co.uk` and `blogspot.com`, but not for `com`, `co.uk`, or `google.invalid`.
**Since:** 23.3

### `isTopDomainUnderRegistrySuffix()`

**Returns:** `boolean`

Indicates whether this domain name is composed of exactly one subdomain component followed by a
 registry suffix. For example, returns `true` for `google.com`, `foo.co.uk`, and `blogspot.com`, but not for `www.google.com`,
 `co.uk`, or `myblog.blogspot.com`.

 <p><b>Warning:</b> This method should not be used to determine the probable highest level
 parent domain for which cookies may be set. Use `topPrivateDomain()` for that purpose.
**Since:** 23.3

### `topDomainUnderRegistrySuffix()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns the portion of this domain name that is one level beneath the registry suffix. For example, for `x.adwords.google.co.uk` it
 returns `google.co.uk`, since `co.uk` is a registry suffix. Similarly, for `myblog.blogspot.com` it returns `blogspot.com`, since `com` is a registry suffix.

 <p>If `isTopDomainUnderRegistrySuffix()` is true, the current domain name instance is
 returned.

 <p><b>Warning:</b> This method should not be used to determine whether a domain is probably the
 highest level for which cookies may be set. Use `isTopPrivateDomain()` for that purpose.
@throws IllegalStateException if this domain does not end with a registry suffix
**Since:** 23.3

### `hasParent()`

**Returns:** `boolean`

Indicates whether this domain is composed of two or more parts.

### `parent()`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns an `InternetDomainName` that is the immediate ancestor of this one; that is, the
 current domain with the leftmost part removed. For example, the parent of `www.google.com` is `google.com`.
@throws IllegalStateException if the domain has no parent, as determined by `hasParent`

### `ancestor(`int` levels)`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Returns the ancestor of the current domain at the given number of levels "higher" (rightward)
 in the subdomain list. The number of levels must be non-negative, and less than `N-1`,
 where `N` is the number of parts in the domain.

 <p>TODO: Reasonable candidate for addition to public API.

### `child(`java.lang.String` leftParts)`

**Returns:** [`com.google.common.net.InternetDomainName`](./InternetDomainName.md)

Creates and returns a new `InternetDomainName` by prepending the argument and a dot to
 the current name. For example, `InternetDomainName.from("foo.com").child("www.bar")`
 returns a new `InternetDomainName` with the value `www.bar.foo.com`. Only lenient
 validation is performed, as described `from(String) here`.
@throws NullPointerException if leftParts is null
@throws IllegalArgumentException if the resulting name is not valid

### `isValid(`java.lang.String` name)`

**Returns:** `boolean`

Indicates whether the argument is a syntactically valid domain name using lenient validation.
 Specifically, validation against <a href="http://www.ietf.org/rfc/rfc3490.txt">RFC 3490</a>
 ("Internationalizing Domain Names in Applications") is skipped.

 <p>The following two code snippets are equivalent:

 <pre>`domainName = InternetDomainName.isValid(name)
     ? InternetDomainName.from(name)
     : DEFAULT_DOMAIN;
 `</pre>

 <pre>`try {
   domainName = InternetDomainName.from(name);
 ` catch (IllegalArgumentException e) {
   domainName = DEFAULT_DOMAIN;
 }
 }</pre>
**Since:** 8.0 (previously named `isValidLenient`)

### `matchesType([`com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType>`](../base/Optional.md) desiredType, [`com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType>`](../base/Optional.md) actualType)`

**Returns:** `boolean`

If a `desiredType` is specified, returns true only if the `actualType` is
 identical. Otherwise, returns true as long as `actualType` is present.

### `toString()`

**Returns:** `java.lang.String`

Returns the domain name, normalized to all lower case.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

Equality testing is based on the text supplied by the caller, after normalization as described
 in the class documentation. For example, a non-ASCII Unicode domain name and the Punycode
 version of the same domain name would not be considered equal.

### `hashCode()`

**Returns:** `int`

