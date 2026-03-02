# Interface: `HashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.HashFunction`

## Description

Definition

 
Unpacking this definition:

 

   - **block of data:** the input for a hash function is always, in concept, an ordered byte
       array. This hashing API accepts an arbitrary sequence of byte and multibyte values (via
       Hasher), but this is merely a convenience; these are always translated into raw
       byte sequences under the covers.
   - **hash code:** each hash function always yields hash codes of the same fixed bit length
       (given by #bits). For example, Hashing#sha1 produces a 160-bit number,
       while Hashing#murmur3_32() yields only 32 bits. Because a long value is
       clearly insufficient to hold all hash code values, this API represents a hash code as an
       instance of HashCode.
   - **pure function:** the value produced must depend only on the input bytes, in the order
       they appear. Input data is never modified. HashFunction instances should always be
       stateless, and therefore thread-safe.
   - **collision-averse:** while it can't be helped that a hash function will sometimes
       produce the same hash code for distinct inputs (a "collision"), every hash function strives
       to *some* degree to make this unlikely. (Without this condition, a function that
       always returns zero could be called a hash function. It is not.)
 


 
Summarizing the last two points: "equal yield equal *always*; unequal yield unequal
 *often*." This is the most important characteristic of all hash functions.

 Desirable properties

 
A high-quality hash function strives for some subset of the following virtues:

 

   - **collision-resistant:** while the definition above requires making at least *some*
       token attempt, one measure of the quality of a hash function is *how well* it succeeds
       at this goal. Important note: it may be easy to achieve the theoretical minimum collision
       rate when using completely *random* sample input. The true test of a hash function is
       how it performs on representative real-world data, which tends to contain many hidden
       patterns and clumps. The goal of a good hash function is to stamp these patterns out as
       thoroughly as possible.
   - **bit-dispersing:** masking out any *single bit* from a hash code should yield only
       the expected *twofold* increase to all collision rates. Informally, the "information"
       in the hash code should be as evenly "spread out" through the hash code's bits as possible.
       The result is that, for example, when choosing a bucket in a hash table of size 2^8,
       *any* eight bits could be consistently used.
   - **cryptographic:** certain hash functions such as Hashing#sha512 are designed to
       make it as infeasible as possible to reverse-engineer the input that produced a given hash
       code, or even to discover *any* two distinct inputs that yield the same result. These
       are called *cryptographic hash functions*. But, whenever it is learned that either of
       these feats has become computationally feasible, the function is deemed "broken" and should
       no longer be used for secure purposes. (This is the likely eventual fate of *all*
       cryptographic hashes.)
   - **fast:** perhaps self-explanatory, but often the most important consideration.
 


 Providing input to a hash function

 
The primary way to provide the data that your hash function should act on is via a Hasher. Obtain a new hasher from the hash function using #newHasher, "push" the relevant
 data into it using methods like Hasher#putBytes(byte[]), and finally ask for the 
 HashCode when finished using Hasher#hash. (See an example of
 this.)

 
If all you want to hash is a single byte array, string or long value, there are
 convenient shortcut methods defined directly on HashFunction to make this easier.

 
Hasher accepts primitive data types, but can also accept any Object of type T provided
 that you implement a Funnel<T> to specify how to "feed" data from that object
 into the function. (See an example of this.)

 
**Compatibility note:** Throughout this API, multibyte values are always interpreted in
 *little-endian* order. That is, hashing the byte array {0x01, 0x02, 0x03, 0x04} is
 equivalent to hashing the int value 0x04030201. If this isn't what you need,
 methods such as Integer#reverseBytes and Ints#toByteArray will help.

 Relationship to Object#hashCode

 
Java's baked-in concept of hash codes is constrained to 32 bits, and provides no separation
 between hash algorithms and the data they act on, so alternate hash algorithms can't be easily
 substituted. Also, implementations of hashCode tend to be poor-quality, in part because
 they end up depending on *other* existing poor-quality hashCode implementations,
 including those in many JDK classes.

 
Object.hashCode implementations tend to be very fast, but have weak collision
 prevention and *no* expectation of bit dispersion. This leaves them perfectly suitable for
 use in hash tables, because extra collisions cause only a slight performance hit, while poor bit
 dispersion is easily corrected using a secondary hash function (which all reasonable hash table
 implementations in Java use). For the many uses of hash functions beyond data structures,
 however, Object.hashCode almost always falls short -- hence this library.

## Methods

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

Example:

 

```

 HashFunction hf = Hashing.md5();
 HashCode hc = hf.newHasher()
     .putLong(id)
     .putBoolean(isActive)
     .hash();
 
```

### `newHasher(int expectedInputSize)`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

This is only important for non-streaming hash functions (hash
 functions that need to buffer their whole input before processing any of it).

**Parameters:**
- `expectedInputSize` (`int`)

### `hashInt(int input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation *might*
 perform better than its longhand equivalent, but should not perform worse.

**Parameters:**
- `input` (`int`)

### `hashLong(long input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation *might*
 perform better than its longhand equivalent, but should not perform worse.

**Parameters:**
- `input` (`long`)

### `hashBytes(byte[] input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation *might*
 perform better than its longhand equivalent, but should not perform worse.

**Parameters:**
- `input` (`byte[]`)

### `hashBytes(byte[] input, int off, int len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation
 *might* perform better than its longhand equivalent, but should not perform worse.

**Parameters:**
- `input` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `hashBytes(java.nio.ByteBuffer input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation *might*
 perform better than its longhand equivalent, but should not perform worse.

**Parameters:**
- `input` (`java.nio.ByteBuffer`)

### `hashUnencodedChars(java.lang.CharSequence input)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation
 *might* perform better than its longhand equivalent, but should not perform worse. Note
 that no character encoding is performed; the low byte and high byte of each char are
 hashed directly (in that order).

 
**Warning:** This method will produce different output than most other languages do when
 running the same hash function on the equivalent input. For cross-language compatibility, use
 #hashString, usually with a charset of UTF-8. For other use cases, use 
 hashUnencodedChars.

**Parameters:**
- `input` (`java.lang.CharSequence`)

### `hashString(java.lang.CharSequence input, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

Characters are encoded using
 the given Charset. The implementation *might* perform better than its longhand
 equivalent, but should not perform worse.

 
**Warning:** This method, which reencodes the input before hashing it, is useful only for
 cross-language compatibility. For other use cases, prefer #hashUnencodedChars, which is
 faster, produces the same output across Java releases, and hashes every char in the
 input, even if some are invalid.

**Parameters:**
- `input` (`java.lang.CharSequence`)
- `charset` (`java.nio.charset.Charset`)

### `hashObject(T instance, com.google.common.hash.Funnel<? super T> funnel)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

The implementation
 *might* perform better than its longhand equivalent, but should not perform worse.

**Parameters:**
- `instance` (`T`)
- `funnel` ([`com.google.common.hash.Funnel<? super T>`](./Funnel.md))

### `bits()`

**Returns:** `int`

