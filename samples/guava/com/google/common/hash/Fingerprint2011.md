# Class: `Fingerprint2011`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Fingerprint2011`

**Extends:** [`com.google.common.hash.AbstractNonStreamingHashFunction`](./AbstractNonStreamingHashFunction.md)

## Description

See Hashing#fingerprint2011
 for information on the behaviour of the algorithm.

 
On Intel Core2 2.66, on 1000 bytes, fingerprint2011 takes 0.9 microseconds compared to
 fingerprint at 4.0 microseconds and md5 at 4.5 microseconds.

 
Note to maintainers: This implementation relies on signed arithmetic being bit-wise equivalent
 to unsigned arithmetic in all cases except:

 

   - comparisons (signed values can be negative)
   - division (avoided here)
   - shifting (right shift must be unsigned)

## Fields

### `FINGERPRINT_2011`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `K0`

**Type:** `long`

### `K1`

**Type:** `long`

### `K2`

**Type:** `long`

### `K3`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `hashBytes(byte[] input, int off, int len)`

**Parameters:**
- `input` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `fingerprint(byte[] bytes, int offset, int length)`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

**Returns:** `long`

### `shiftMix(long val)`

**Parameters:**
- `val` (`long`)

**Returns:** `long`

### `hash128to64(long high, long low)`

**Parameters:**
- `high` (`long`)
- `low` (`long`)

**Returns:** `long`

### `weakHashLength32WithSeeds(byte[] bytes, int offset, long seedA, long seedB, long[] output)`

Results are
 returned in the output array - this is 12% faster than allocating new arrays every time.

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `seedA` (`long`)
- `seedB` (`long`)
- `output` (`long[]`)

**Returns:** `void`

### `fullFingerprint(byte[] bytes, int offset, int length)`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

**Returns:** `long`

### `hashLength33To64(byte[] bytes, int offset, int length)`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

**Returns:** `long`

### `murmurHash64WithSeed(byte[] bytes, int offset, int length, long seed)`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)
- `seed` (`long`)

**Returns:** `long`

