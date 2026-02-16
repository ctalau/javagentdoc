# Class: `Internal`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Internal`

## Description

This class is for {@code com.google.common.util.concurrent} use only!

## Constructors

### `<init>()`

## Methods

### `toNanosSaturated([`java.time.Duration`](../../../../../java/time/Duration.md) duration)`

**Returns:** `long`

Returns the number of nanoseconds of the given duration without throwing or overflowing.

 <p>Instead of throwing {@link ArithmeticException}, this method silently saturates to either
 {@link Long#MAX_VALUE} or {@link Long#MIN_VALUE}. This behavior can be useful when decomposing
 a duration in order to call a legacy API which requires a {@code long, TimeUnit} pair.

