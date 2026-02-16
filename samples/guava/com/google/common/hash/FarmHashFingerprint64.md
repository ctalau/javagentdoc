# Class: `FarmHashFingerprint64`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.FarmHashFingerprint64`

**Extends:** [`com.google.common.hash.AbstractNonStreamingHashFunction`](./AbstractNonStreamingHashFunction.md)

## Description

Implementation of FarmHash Fingerprint64, an open-source fingerprinting algorithm for strings.

 <p>Its speed is comparable to CityHash64, and its quality of hashing is at least as good.

 <p>Note to maintainers: This implementation relies on signed arithmetic being bit-wise equivalent
 to unsigned arithmetic in all cases except:

 <ul>
   <li>comparisons (signed values can be negative)
   <li>division (avoided here)
   <li>shifting (right shift must be unsigned)
 </ul>
**Author:** Kyle Maddison
**Author:** Geoff Pike

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

### `hashLength16(`long` u, `long` v, `long` mul)`

**Returns:** `long`

### `weakHashLength32WithSeeds(`byte[]` bytes, `int` offset, `long` seedA, `long` seedB, `long[]` output)`

**Returns:** `void`

Computes intermediate hash of 32 bytes of byte array from the given offset. Results are
 returned in the output array because when we last measured, this was 12% faster than allocating
 new arrays every time.

### `hashLength0to16(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

### `hashLength17to32(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

### `hashLength33To64(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

### `hashLength65Plus(`byte[]` bytes, `int` offset, `int` length)`

**Returns:** `long`

