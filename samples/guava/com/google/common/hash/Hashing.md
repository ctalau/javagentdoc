# Class: `Hashing`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Hashing`

## Description

Static methods to obtain `HashFunction` instances, and other static hashing-related
 utilities.

 <p>A comparison of the various hash functions can be found <a href="http://goo.gl/jS7HH">here</a>.
**Author:** Kevin Bourrillion
**Author:** Dimitris Andreou
**Author:** Kurt Alfred Kluever
**Since:** 11.0

## Fields

### `GOOD_FAST_HASH_SEED`

**Type:** `int`

Used to randomize `goodFastHash` instances, so that programs which persist anything
 dependent on the hash codes they produce will fail sooner.

## Constructors

### `<init>()`

## Methods

### `goodFastHash(`int` minimumBits)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a general-purpose, <b>temporary-use</b>, non-cryptographic hash function. The algorithm
 the returned function implements is unspecified and subject to change without notice.

 <p><b>Warning:</b> a new random seed for these functions is chosen each time the `Hashing` class is loaded. <b>Do not use this method</b> if hash codes may escape the current
 process in any way, for example being sent over RPC, or saved to disk. For a general-purpose,
 non-cryptographic hash function that will never change behavior, we suggest `murmur3_128`.

 <p>Repeated calls to this method on the same loaded `Hashing` class, using the same value
 for `minimumBits`, will return identically-behaving `HashFunction` instances.
@param minimumBits a positive integer. This can be arbitrarily large. The returned `HashFunction` instance may use memory proportional to this integer.
@return a hash function, described above, that produces hash codes of length `minimumBits` or greater

### `murmur3_32(`int` seed)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">32-bit murmur3
 algorithm, x86 variant</a> (little-endian variant), using the given seed value, <b>with a known
 bug</b> as described in the deprecation text.

 <p>The C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A), which however does not
 have the bug.
**Deprecated:**This implementation produces incorrect hash values from the `HashFunction.hashString` method if the string contains non-BMP characters. Use `murmur3_32_fixed(int)` instead.

### `murmur3_32()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">32-bit murmur3
 algorithm, x86 variant</a> (little-endian variant), using the given seed value, <b>with a known
 bug</b> as described in the deprecation text.

 <p>The C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A), which however does not
 have the bug.
**Deprecated:**This implementation produces incorrect hash values from the `HashFunction.hashString` method if the string contains non-BMP characters. Use `murmur3_32_fixed()` instead.

### `murmur3_32_fixed(`int` seed)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">32-bit murmur3
 algorithm, x86 variant</a> (little-endian variant), using the given seed value.

 <p>The exact C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A).

 <p>This method is called `murmur3_32_fixed` because it fixes a bug in the `HashFunction` returned by the original `murmur3_32` method.
**Since:** 31.0

### `murmur3_32_fixed()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">32-bit murmur3
 algorithm, x86 variant</a> (little-endian variant), using a seed value of zero.

 <p>The exact C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A).

 <p>This method is called `murmur3_32_fixed` because it fixes a bug in the `HashFunction` returned by the original `murmur3_32` method.
**Since:** 31.0

### `murmur3_128(`int` seed)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">128-bit murmur3
 algorithm, x64 variant</a> (little-endian variant), using the given seed value.

 <p>The exact C++ equivalent is the MurmurHash3_x64_128 function (Murmur3F).

### `murmur3_128()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://github.com/aappleby/smhasher/blob/master/src/MurmurHash3.cpp">128-bit murmur3
 algorithm, x64 variant</a> (little-endian variant), using a seed value of zero.

 <p>The exact C++ equivalent is the MurmurHash3_x64_128 function (Murmur3F).

### `sipHash24()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://131002.net/siphash/">64-bit
 SipHash-2-4 algorithm</a> using a seed value of `k = 00 01 02 ...`.
**Since:** 15.0

### `sipHash24(`long` k0, `long` k1)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the <a href="https://131002.net/siphash/">64-bit
 SipHash-2-4 algorithm</a> using the given seed.
**Since:** 15.0

### `md5()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the MD5 hash algorithm (128 hash bits).
**Deprecated:**If you must interoperate with a system that requires MD5, then use this method,
     despite its deprecation. But if you can choose your hash function, avoid MD5, which is
     neither fast nor secure. As of January 2017, we suggest:
     <ul>
       <li>For security:
           `Hashing.sha256` or a higher-level API.
       <li>For speed: `Hashing.goodFastHash`, though see its docs for caveats.
     </ul>

### `sha1()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the SHA-1 algorithm (160 hash bits).
**Deprecated:**If you must interoperate with a system that requires SHA-1, then use this method,
     despite its deprecation. But if you can choose your hash function, avoid SHA-1, which is
     neither fast nor secure. As of January 2017, we suggest:
     <ul>
       <li>For security:
           `Hashing.sha256` or a higher-level API.
       <li>For speed: `Hashing.goodFastHash`, though see its docs for caveats.
     </ul>

### `sha256()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the SHA-256 algorithm (256 hash bits).

### `sha384()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the SHA-384 algorithm (384 hash bits).
**Since:** 19.0

### `sha512()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the SHA-512 algorithm (512 hash bits).

### `hmacMd5(`java.security.Key` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 MD5 (128 hash bits) hash function and the given secret key.
@param key the secret key
@throws IllegalArgumentException if the given key is inappropriate for initializing this MAC
**Since:** 20.0

### `hmacMd5(`byte[]` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 MD5 (128 hash bits) hash function and a `SecretKeySpec` created from the given byte array
 and the MD5 algorithm.
@param key the key material of the secret key
**Since:** 20.0

### `hmacSha1(`java.security.Key` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 SHA-1 (160 hash bits) hash function and the given secret key.
@param key the secret key
@throws IllegalArgumentException if the given key is inappropriate for initializing this MAC
**Since:** 20.0

### `hmacSha1(`byte[]` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 SHA-1 (160 hash bits) hash function and a `SecretKeySpec` created from the given byte
 array and the SHA-1 algorithm.
@param key the key material of the secret key
**Since:** 20.0

### `hmacSha256(`java.security.Key` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 SHA-256 (256 hash bits) hash function and the given secret key.
@param key the secret key
@throws IllegalArgumentException if the given key is inappropriate for initializing this MAC
**Since:** 20.0

### `hmacSha256(`byte[]` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 SHA-256 (256 hash bits) hash function and a `SecretKeySpec` created from the given byte
 array and the SHA-256 algorithm.
@param key the key material of the secret key
**Since:** 20.0

### `hmacSha512(`java.security.Key` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 SHA-512 (512 hash bits) hash function and the given secret key.
@param key the secret key
@throws IllegalArgumentException if the given key is inappropriate for initializing this MAC
**Since:** 20.0

### `hmacSha512(`byte[]` key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Message Authentication Code (MAC) algorithm, using the
 SHA-512 (512 hash bits) hash function and a `SecretKeySpec` created from the given byte
 array and the SHA-512 algorithm.
@param key the key material of the secret key
**Since:** 20.0

### `hmacToString(`java.lang.String` methodName, `java.security.Key` key)`

**Returns:** `java.lang.String`

### `crc32c()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the CRC32C checksum algorithm (32 hash bits) as described
 by RFC 3720, Section 12.1.

 <p>This function is best understood as a <a href="https://en.wikipedia.org/wiki/Checksum">checksum</a> rather than a true <a href="https://en.wikipedia.org/wiki/Hash_function">hash function</a>.
**Since:** 18.0

### `crc32()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the CRC-32 checksum algorithm (32 hash bits).

 <p>To get the `long` value equivalent to `Checksum.getValue()` for a `HashCode` produced by this function, use `HashCode.padToLong()`.

 <p>This function is best understood as a <a href="https://en.wikipedia.org/wiki/Checksum">checksum</a> rather than a true <a href="https://en.wikipedia.org/wiki/Hash_function">hash function</a>.
**Since:** 14.0

### `adler32()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Adler-32 checksum algorithm (32 hash bits).

 <p>To get the `long` value equivalent to `Checksum.getValue()` for a `HashCode` produced by this function, use `HashCode.padToLong()`.

 <p>This function is best understood as a <a href="https://en.wikipedia.org/wiki/Checksum">checksum</a> rather than a true <a href="https://en.wikipedia.org/wiki/Hash_function">hash function</a>.
**Since:** 14.0

### `farmHashFingerprint64()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing FarmHash's Fingerprint64, an open-source algorithm.

 <p>This is designed for generating persistent fingerprints of strings. It isn't
 cryptographically secure, but it produces a high-quality hash with fewer collisions than some
 alternatives we've used in the past.

 <p>FarmHash fingerprints are encoded by `HashCode.asBytes` in little-endian order. This
 means `HashCode.asLong` is guaranteed to return the same value that
 farmhash::Fingerprint64() would for the same input (when compared using `com.google.common.primitives.UnsignedLongs`'s encoding of 64-bit unsigned numbers).

 <p>This function is best understood as a <a href="https://en.wikipedia.org/wiki/Fingerprint_(computing)">fingerprint</a> rather than a true
 <a href="https://en.wikipedia.org/wiki/Hash_function">hash function</a>.
**Since:** 20.0

### `fingerprint2011()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function implementing the Fingerprint2011 hashing function (64 hash bits).

 <p>This is designed for generating persistent fingerprints of strings. It isn't
 cryptographically secure, but it produces a high-quality hash with few collisions. Fingerprints
 generated using this are byte-wise identical to those created using the C++ version, but note
 that this uses unsigned integers (see `com.google.common.primitives.UnsignedInts`).
 Comparisons between the two should take this into account.

 <p>Fingerprint2011() is a form of Murmur2 on strings up to 32 bytes and a form of CityHash for
 longer strings. It could have been one or the other throughout. The main advantage of the
 combination is that CityHash has a bunch of special cases for short strings that don't need to
 be replicated here. The result will never be 0 or 1.

 <p>This function is best understood as a <a href="https://en.wikipedia.org/wiki/Fingerprint_(computing)">fingerprint</a> rather than a true
 <a href="https://en.wikipedia.org/wiki/Hash_function">hash function</a>.
**Since:** 31.1

### `consistentHash([`com.google.common.hash.HashCode`](./HashCode.md) hashCode, `int` buckets)`

**Returns:** `int`

Assigns to `hashCode` a "bucket" in the range `[0, buckets)`, in a uniform manner
 that minimizes the need for remapping as `buckets` grows. That is, `consistentHash(h, n)` equals:

 <ul>
   <li>`n - 1`, with approximate probability `1/n`
   <li>`consistentHash(h, n - 1)`, otherwise (probability `1 - 1/n`)
 </ul>

 <p>This method is suitable for the common use case of dividing work among buckets that meet the
 following conditions:

 <ul>
   <li>You want to assign the same fraction of inputs to each bucket.
   <li>When you reduce the number of buckets, you can accept that the most recently added
       buckets will be removed first. More concretely, if you are dividing traffic among tasks,
       you can decrease the number of tasks from 15 and 10, killing off the final 5 tasks, and
       `consistentHash` will handle it. If, however, you are dividing traffic among
       servers `alpha`, `bravo`, and `charlie` and you occasionally need to
       take each of the servers offline, `consistentHash` will be a poor fit: It provides
       no way for you to specify which of the three buckets is disappearing. Thus, if your
       buckets change from `[alpha, bravo, charlie]` to `[bravo, charlie]`, it will
       assign all the old `alpha` traffic to `bravo` and all the old `bravo`
       traffic to `charlie`, rather than letting `bravo` keep its traffic.
 </ul>

 <p>See the <a href="http://en.wikipedia.org/wiki/Consistent_hashing">Wikipedia article on
 consistent hashing</a> for more information.

### `consistentHash(`long` input, `int` buckets)`

**Returns:** `int`

Assigns to `input` a "bucket" in the range `[0, buckets)`, in a uniform manner that
 minimizes the need for remapping as `buckets` grows. That is, `consistentHash(h,
 n)` equals:

 <ul>
   <li>`n - 1`, with approximate probability `1/n`
   <li>`consistentHash(h, n - 1)`, otherwise (probability `1 - 1/n`)
 </ul>

 <p>This method is suitable for the common use case of dividing work among buckets that meet the
 following conditions:

 <ul>
   <li>You want to assign the same fraction of inputs to each bucket.
   <li>When you reduce the number of buckets, you can accept that the most recently added
       buckets will be removed first. More concretely, if you are dividing traffic among tasks,
       you can decrease the number of tasks from 15 and 10, killing off the final 5 tasks, and
       `consistentHash` will handle it. If, however, you are dividing traffic among
       servers `alpha`, `bravo`, and `charlie` and you occasionally need to
       take each of the servers offline, `consistentHash` will be a poor fit: It provides
       no way for you to specify which of the three buckets is disappearing. Thus, if your
       buckets change from `[alpha, bravo, charlie]` to `[bravo, charlie]`, it will
       assign all the old `alpha` traffic to `bravo` and all the old `bravo`
       traffic to `charlie`, rather than letting `bravo` keep its traffic.
 </ul>

 <p>See the <a href="http://en.wikipedia.org/wiki/Consistent_hashing">Wikipedia article on
 consistent hashing</a> for more information.

### `combineOrdered(`java.lang.Iterable<com.google.common.hash.HashCode>` hashCodes)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Returns a hash code, having the same bit length as each of the input hash codes, that combines
 the information of these hash codes in an ordered fashion. That is, whenever two equal hash
 codes are produced by two calls to this method, it is <i>as likely as possible</i> that each
 was computed from the <i>same</i> input hash codes in the <i>same</i> order.
@throws IllegalArgumentException if `hashCodes` is empty, or the hash codes do not all
     have the same bit length

### `combineUnordered(`java.lang.Iterable<com.google.common.hash.HashCode>` hashCodes)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Returns a hash code, having the same bit length as each of the input hash codes, that combines
 the information of these hash codes in an unordered fashion. That is, whenever two equal hash
 codes are produced by two calls to this method, it is <i>as likely as possible</i> that each
 was computed from the <i>same</i> input hash codes in <i>some</i> order.
@throws IllegalArgumentException if `hashCodes` is empty, or the hash codes do not all
     have the same bit length

### `checkPositiveAndMakeMultipleOf32(`int` bits)`

**Returns:** `int`

Checks that the passed argument is positive, and ceils it to a multiple of 32.

### `concatenating([`com.google.common.hash.HashFunction`](./HashFunction.md) first, [`com.google.common.hash.HashFunction`](./HashFunction.md) second, [`com.google.common.hash.HashFunction[]`](./HashFunction.md) rest)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function which computes its hash code by concatenating the hash codes of the
 underlying hash functions together. This can be useful if you need to generate hash codes of a
 specific length.

 <p>For example, if you need 1024-bit hash codes, you could join two `Hashing.sha512` hash
 functions together: `Hashing.concatenating(Hashing.sha512(), Hashing.sha512())`.
**Since:** 19.0

### `concatenating(`java.lang.Iterable<com.google.common.hash.HashFunction>` hashFunctions)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

Returns a hash function which computes its hash code by concatenating the hash codes of the
 underlying hash functions together. This can be useful if you need to generate hash codes of a
 specific length.

 <p>For example, if you need 1024-bit hash codes, you could join two `Hashing.sha512` hash
 functions together: `Hashing.concatenating(Hashing.sha512(), Hashing.sha512())`.
**Since:** 19.0

