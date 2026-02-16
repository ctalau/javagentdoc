# Class: `Partially`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Partially`

## Description

Outer class that exists solely to let us write {@code Partially.GwtIncompatible} instead of plain
 {@code GwtIncompatible}. This is more accurate for {@link Futures#catching}, which is available
 under GWT but with a slightly different signature.

 <p>We can't use {@code PartiallyGwtIncompatible} because then the GWT compiler wouldn't recognize
 it as a {@code GwtIncompatible} annotation. And for {@code Futures.catching}, we need the GWT
 compiler to autostrip the normal server method in order to expose the special, inherited GWT
 version.

## Constructors

### `<init>()`

