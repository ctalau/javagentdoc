# Class: `Hashing`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Hashing`

## Description

A comparison of the various hash functions can be found [here](http://goo.gl/jS7HH).

## Fields

### `GOOD_FAST_HASH_SEED`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `goodFastHash(int minimumBits)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The algorithm
 the returned function implements is unspecified and subject to change without notice.

 
**Warning:** a new random seed for these functions is chosen each time the 
 Hashing class is loaded. **Do not use this method** if hash codes may escape the current
 process in any way, for example being sent over RPC, or saved to disk. For a general-purpose,
 non-cryptographic hash function that will never change behavior, we suggest #murmur3_128.

 
Repeated calls to this method on the same loaded Hashing class, using the same value
 for minimumBits, will return identically-behaving HashFunction instances.

**Parameters:**
- `minimumBits` (`int`): a positive integer. This can be arbitrarily large. The returned HashFunction instance may use memory proportional to this integer.

### `murmur3_32(int seed)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A), which however does not
 have the bug.

**Parameters:**
- `seed` (`int`)

### `murmur3_32()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A), which however does not
 have the bug.

### `murmur3_32_fixed(int seed)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The exact C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A).

 
This method is called murmur3_32_fixed because it fixes a bug in the 
 HashFunction returned by the original murmur3_32 method.

**Parameters:**
- `seed` (`int`)

### `murmur3_32_fixed()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The exact C++ equivalent is the MurmurHash3_x86_32 function (Murmur3A).

 
This method is called murmur3_32_fixed because it fixes a bug in the 
 HashFunction returned by the original murmur3_32 method.

### `murmur3_128(int seed)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The exact C++ equivalent is the MurmurHash3_x64_128 function (Murmur3F).

**Parameters:**
- `seed` (`int`)

### `murmur3_128()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

The exact C++ equivalent is the MurmurHash3_x64_128 function (Murmur3F).

### `sipHash24()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `sipHash24(long k0, long k1)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `k0` (`long`)
- `k1` (`long`)

### `md5()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `sha1()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `sha256()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `sha384()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `sha512()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `hmacMd5(java.security.Key key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`java.security.Key`): the secret key

### `hmacMd5(byte[] key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`byte[]`): the key material of the secret key

### `hmacSha1(java.security.Key key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`java.security.Key`): the secret key

### `hmacSha1(byte[] key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`byte[]`): the key material of the secret key

### `hmacSha256(java.security.Key key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`java.security.Key`): the secret key

### `hmacSha256(byte[] key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`byte[]`): the key material of the secret key

### `hmacSha512(java.security.Key key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`java.security.Key`): the secret key

### `hmacSha512(byte[] key)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

**Parameters:**
- `key` (`byte[]`): the key material of the secret key

### `hmacToString(java.lang.String methodName, java.security.Key key)`

**Returns:** `java.lang.String`

**Parameters:**
- `methodName` (`java.lang.String`)
- `key` (`java.security.Key`)

### `crc32c()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

This function is best understood as a [checksum](https://en.wikipedia.org/wiki/Checksum) rather than a true [hash function](https://en.wikipedia.org/wiki/Hash_function).

### `crc32()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

To get the long value equivalent to Checksum#getValue() for a 
 HashCode produced by this function, use HashCode#padToLong().

 
This function is best understood as a [checksum](https://en.wikipedia.org/wiki/Checksum) rather than a true [hash function](https://en.wikipedia.org/wiki/Hash_function).

### `adler32()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

To get the long value equivalent to Checksum#getValue() for a 
 HashCode produced by this function, use HashCode#padToLong().

 
This function is best understood as a [checksum](https://en.wikipedia.org/wiki/Checksum) rather than a true [hash function](https://en.wikipedia.org/wiki/Hash_function).

### `farmHashFingerprint64()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

This is designed for generating persistent fingerprints of strings. It isn't
 cryptographically secure, but it produces a high-quality hash with fewer collisions than some
 alternatives we've used in the past.

 
FarmHash fingerprints are encoded by HashCode#asBytes in little-endian order. This
 means HashCode#asLong is guaranteed to return the same value that
 farmhash::Fingerprint64() would for the same input (when compared using com.google.common.primitives.UnsignedLongs's encoding of 64-bit unsigned numbers).

 
This function is best understood as a [fingerprint](https://en.wikipedia.org/wiki/Fingerprint_(computing)) rather than a true
 [hash function](https://en.wikipedia.org/wiki/Hash_function).

### `fingerprint2011()`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

This is designed for generating persistent fingerprints of strings. It isn't
 cryptographically secure, but it produces a high-quality hash with few collisions. Fingerprints
 generated using this are byte-wise identical to those created using the C++ version, but note
 that this uses unsigned integers (see com.google.common.primitives.UnsignedInts).
 Comparisons between the two should take this into account.

 
Fingerprint2011() is a form of Murmur2 on strings up to 32 bytes and a form of CityHash for
 longer strings. It could have been one or the other throughout. The main advantage of the
 combination is that CityHash has a bunch of special cases for short strings that don't need to
 be replicated here. The result will never be 0 or 1.

 
This function is best understood as a [fingerprint](https://en.wikipedia.org/wiki/Fingerprint_(computing)) rather than a true
 [hash function](https://en.wikipedia.org/wiki/Hash_function).

### `consistentHash(com.google.common.hash.HashCode hashCode, int buckets)`

**Returns:** `int`

That is, 
 consistentHash(h, n) equals:

 

   - n - 1, with approximate probability 1/n
   - consistentHash(h, n - 1), otherwise (probability 1 - 1/n)
 


 
This method is suitable for the common use case of dividing work among buckets that meet the
 following conditions:

 

   - You want to assign the same fraction of inputs to each bucket.
   - When you reduce the number of buckets, you can accept that the most recently added
       buckets will be removed first. More concretely, if you are dividing traffic among tasks,
       you can decrease the number of tasks from 15 and 10, killing off the final 5 tasks, and
       consistentHash will handle it. If, however, you are dividing traffic among
       servers alpha, bravo, and charlie and you occasionally need to
       take each of the servers offline, consistentHash will be a poor fit: It provides
       no way for you to specify which of the three buckets is disappearing. Thus, if your
       buckets change from [alpha, bravo, charlie] to [bravo, charlie], it will
       assign all the old alpha traffic to bravo and all the old bravo
       traffic to charlie, rather than letting bravo keep its traffic.
 


 
See the [Wikipedia article on
 consistent hashing](http://en.wikipedia.org/wiki/Consistent_hashing) for more information.

**Parameters:**
- `hashCode` ([`com.google.common.hash.HashCode`](./HashCode.md))
- `buckets` (`int`)

### `consistentHash(long input, int buckets)`

**Returns:** `int`

That is, consistentHash(h,
 n) equals:

 

   - n - 1, with approximate probability 1/n
   - consistentHash(h, n - 1), otherwise (probability 1 - 1/n)
 


 
This method is suitable for the common use case of dividing work among buckets that meet the
 following conditions:

 

   - You want to assign the same fraction of inputs to each bucket.
   - When you reduce the number of buckets, you can accept that the most recently added
       buckets will be removed first. More concretely, if you are dividing traffic among tasks,
       you can decrease the number of tasks from 15 and 10, killing off the final 5 tasks, and
       consistentHash will handle it. If, however, you are dividing traffic among
       servers alpha, bravo, and charlie and you occasionally need to
       take each of the servers offline, consistentHash will be a poor fit: It provides
       no way for you to specify which of the three buckets is disappearing. Thus, if your
       buckets change from [alpha, bravo, charlie] to [bravo, charlie], it will
       assign all the old alpha traffic to bravo and all the old bravo
       traffic to charlie, rather than letting bravo keep its traffic.
 


 
See the [Wikipedia article on
 consistent hashing](http://en.wikipedia.org/wiki/Consistent_hashing) for more information.

**Parameters:**
- `input` (`long`)
- `buckets` (`int`)

### `combineOrdered(java.lang.Iterable<com.google.common.hash.HashCode> hashCodes)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

That is, whenever two equal hash
 codes are produced by two calls to this method, it is *as likely as possible* that each
 was computed from the *same* input hash codes in the *same* order.

**Parameters:**
- `hashCodes` (`java.lang.Iterable<com.google.common.hash.HashCode>`)

### `combineUnordered(java.lang.Iterable<com.google.common.hash.HashCode> hashCodes)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

That is, whenever two equal hash
 codes are produced by two calls to this method, it is *as likely as possible* that each
 was computed from the *same* input hash codes in *some* order.

**Parameters:**
- `hashCodes` (`java.lang.Iterable<com.google.common.hash.HashCode>`)

### `checkPositiveAndMakeMultipleOf32(int bits)`

**Returns:** `int`

**Parameters:**
- `bits` (`int`)

### `concatenating(com.google.common.hash.HashFunction first, com.google.common.hash.HashFunction second, com.google.common.hash.HashFunction[] rest)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

This can be useful if you need to generate hash codes of a
 specific length.

 
For example, if you need 1024-bit hash codes, you could join two Hashing#sha512 hash
 functions together: Hashing.concatenating(Hashing.sha512(), Hashing.sha512()).

**Parameters:**
- `first` ([`com.google.common.hash.HashFunction`](./HashFunction.md))
- `second` ([`com.google.common.hash.HashFunction`](./HashFunction.md))
- `rest` ([`com.google.common.hash.HashFunction[]`](./HashFunction.md))

### `concatenating(java.lang.Iterable<com.google.common.hash.HashFunction> hashFunctions)`

**Returns:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

This can be useful if you need to generate hash codes of a
 specific length.

 
For example, if you need 1024-bit hash codes, you could join two Hashing#sha512 hash
 functions together: Hashing.concatenating(Hashing.sha512(), Hashing.sha512()).

**Parameters:**
- `hashFunctions` (`java.lang.Iterable<com.google.common.hash.HashFunction>`)

