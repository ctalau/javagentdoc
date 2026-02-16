# Class: `NullnessCasts`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.NullnessCasts`

## Description

A utility method to perform unchecked casts to suppress errors produced by nullness analyses.

## Constructors

### `<init>()`

## Methods

### `uncheckedCastNullableTToT(`T` t)`

**Returns:** `T`

Accepts a `@Nullable T` and returns a plain `T`, without performing any check that
 that conversion is safe.

 <p>This method is intended to help with usages of type parameters that have parametric nullness. If a type parameter instead ranges over only non-null
 types (or if the type is a non-variable type, like `String`), then code should almost
 never use this method, preferring instead to call `requireNonNull` so as to benefit from
 its runtime check.

 <p>An example use case for this method is in implementing an `Iterator<T>` whose `next` field is lazily initialized. The type of that field would be `@Nullable T`, and the
 code would be responsible for populating a "real" `T` (which might still be the value
 `null`!) before returning it to callers. Depending on how the code is structured, a
 nullness analysis might not understand that the field has been populated. To avoid that problem
 without having to add `@SuppressWarnings`, the code can call this method.

 <p>Why <i>not</i> just add `SuppressWarnings`? The problem is that this method is
 typically useful for `return` statements. That leaves the code with two options: Either
 add the suppression to the whole method (which turns off checking for a large section of code),
 or extract a variable, and put the suppression on that. However, a local variable typically
 doesn't work: Because nullness analyses typically infer the nullness of local variables,
 there's no way to assign a `@Nullable T` to a field `T foo;` and instruct the
 analysis that that means "plain `T`" rather than the inferred type `@Nullable T`.
 (Even if supported added `@NonNull`, that would not help, since the problem case
 addressed by this method is the case in which `T` has parametric nullness -- and thus its
 value may be legitimately `null`.)

### `unsafeNull()`

**Returns:** `T`

Returns `null` as any type, even one that does not include `null`.

