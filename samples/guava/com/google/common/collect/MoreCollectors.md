# Class: `MoreCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MoreCollectors`

## Description

Collectors not present in `java.util.stream.Collectors` that are not otherwise associated
 with a `com.google.common` type.
**Author:** Louis Wasserman
**Since:** 21.0

## Fields

### `TO_OPTIONAL`

**Type:** `java.util.stream.Collector<java.lang.Object,?,java.util.Optional<java.lang.Object>>`

### `NULL_PLACEHOLDER`

**Type:** `java.lang.Object`

### `ONLY_ELEMENT`

**Type:** `java.util.stream.Collector<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object,?,java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`

## Constructors

### `<init>()`

## Methods

### `toOptional()`

**Returns:** `java.util.stream.Collector<T,?,java.util.Optional<T>>`

A collector that converts a stream of zero or one elements to an `Optional`.
@throws IllegalArgumentException if the stream consists of two or more elements.
@throws NullPointerException if any element in the stream is `null`.
@return `Optional.of(onlyElement)` if the stream has exactly one element (must not be
     `null`) and returns `Optional.empty()` if it has none.

### `onlyElement()`

**Returns:** `java.util.stream.Collector<T,?,T>`

A collector that takes a stream containing exactly one element and returns that element. The
 returned collector throws an `IllegalArgumentException` if the stream consists of two or
 more elements, and a `NoSuchElementException` if the stream is empty.

