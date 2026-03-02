# Class: `FarmHashFingerprint64`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.FarmHashFingerprint64`

**Extends:** [`com.google.common.hash.AbstractNonStreamingHashFunction`](./AbstractNonStreamingHashFunction.md)

## Description

Its speed is comparable to CityHash64, and its quality of hashing is at least as good.

 
Note to maintainers: This implementation relies on signed arithmetic being bit-wise equivalent
 to unsigned arithmetic in all cases except:

 

   - comparisons (signed values can be negative)
   - division (avoided here)
   - shifting (right shift must be unsigned)

## Fields

### `FARMHASH_FINGERPRINT_64`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

### `K0`

**Type:** `long`

### `K1`

**Type:** `long`

### `K2`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `hashBytes(byte[] input, int off, int len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

**Parameters:**
- `input` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `fingerprint(byte[] bytes, int offset, int length)`

**Returns:** `long`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

### `shiftMix(long val)`

**Returns:** `long`

**Parameters:**
- `val` (`long`)

### `hashLength16(long u, long v, long mul)`

**Returns:** `long`

**Parameters:**
- `u` (`long`)
- `v` (`long`)
- `mul` (`long`)

### `weakHashLength32WithSeeds(byte[] bytes, int offset, long seedA, long seedB, long[] output)`

**Returns:** `void`

Results are
 returned in the output array because when we last measured, this was 12% faster than allocating
 new arrays every time.

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `seedA` (`long`)
- `seedB` (`long`)
- `output` (`long[]`)

### `hashLength0to16(byte[] bytes, int offset, int length)`

**Returns:** `long`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

### `hashLength17to32(byte[] bytes, int offset, int length)`

**Returns:** `long`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

### `hashLength33To64(byte[] bytes, int offset, int length)`

**Returns:** `long`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

### `hashLength65Plus(byte[] bytes, int offset, int length)`

**Returns:** `long`

**Parameters:**
- `bytes` (`byte[]`)
- `offset` (`int`)
- `length` (`int`)

