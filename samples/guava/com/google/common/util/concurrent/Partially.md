# Class: `Partially`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Partially`

## Description

Outer class that exists solely to let us write `Partially.GwtIncompatible` instead of plain
 `GwtIncompatible`. This is more accurate for `Futures.catching`, which is available
 under GWT but with a slightly different signature.

 <p>We can't use `PartiallyGwtIncompatible` because then the GWT compiler wouldn't recognize
 it as a `GwtIncompatible` annotation. And for `Futures.catching`, we need the GWT
 compiler to autostrip the normal server method in order to expose the special, inherited GWT
 version.

## Constructors

### `<init>()`

