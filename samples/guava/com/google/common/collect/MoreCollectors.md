# Class: `MoreCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MoreCollectors`

## Description

Collectors not present in {@code java.util.stream.Collectors} that are not otherwise associated
 with a {@code com.google.common} type.
@author Louis Wasserman
@since 21.0

## Fields

### `TO_OPTIONAL`

**Type:** [`java.util.stream.Collector<java.lang.Object,?,java.util.Optional<java.lang.Object>>`](../../../../java/util/stream/Collector>.md)

### `NULL_PLACEHOLDER`

**Type:** `java.lang.Object`

### `ONLY_ELEMENT`

**Type:** [`java.util.stream.Collector<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object,?,java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object>`](../../../../java/util/stream/Collector.md)

## Constructors

### `<init>()`

## Methods

### `toOptional()`

**Returns:** [`java.util.stream.Collector<T,?,java.util.Optional<T>>`](../../../../java/util/stream/Collector>.md)

A collector that converts a stream of zero or one elements to an {@code Optional}.
@throws IllegalArgumentException if the stream consists of two or more elements.
@throws NullPointerException if any element in the stream is {@code null}.
@return {@code Optional.of(onlyElement)} if the stream has exactly one element (must not be
     {@code null}) and returns {@code Optional.empty()} if it has none.

### `onlyElement()`

**Returns:** [`java.util.stream.Collector<T,?,T>`](../../../../java/util/stream/Collector.md)

A collector that takes a stream containing exactly one element and returns that element. The
 returned collector throws an {@code IllegalArgumentException} if the stream consists of two or
 more elements, and a {@code NoSuchElementException} if the stream is empty.

