# Class: `Fingerprint2011`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Fingerprint2011`

**Extends:** [`com.google.common.hash.AbstractNonStreamingHashFunction`](./AbstractNonStreamingHashFunction.md)

## Description

Implementation of Geoff Pike's fingerprint2011 hash function. See {@link Hashing#fingerprint2011}
 for information on the behaviour of the algorithm.

 <p>On Intel Core2 2.66, on 1000 bytes, fingerprint2011 takes 0.9 microseconds compared to
 fingerprint at 4.0 microseconds and md5 at 4.5 microseconds.

 <p>Note to maintainers: This implementation relies on signed arithmetic being bit-wise equivalent
 to unsigned arithmetic in all cases except:

 <ul>
   <li>comparisons (signed values can be negative)
   <li>division (avoided here)
   <li>shifting (right shift must be unsigned)
 </ul>
@author kylemaddison@google.com (Kyle Maddison)
@author gpike@google.com (Geoff Pike)

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

### `hashBytes(`byte[]` input, `int` off, `int` len)`

**Returns:** [`com.google.common.hash.HashCode`](./HashCode.md)

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `fingerprint(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

### `shiftMix(`long` val)`

**Returns:** `long`

### `hash128to64(`long` high, `long` low)`

**Returns:** `long`

Implementation of Hash128to64 from util/hash/hash128to64.h

### `weakHashLength32WithSeeds(`byte[]` bytes, `int` offset, `long` seedA, `long` seedB, `long[]` output)`

**Returns:** `void`

Computes intermediate hash of 32 bytes of byte array from the given offset. Results are
 returned in the output array - this is 12% faster than allocating new arrays every time.

### `fullFingerprint(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

### `hashLength33To64(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

### `murmurHash64WithSeed(`byte[]` bytes, `int` offset, `int` length, `long` seed)`

**Returns:** `long`

