# Class: `MoreCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MoreCollectors`

## Description

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

### `onlyElement()`

The
 returned collector throws an IllegalArgumentException if the stream consists of two or
 more elements, and a NoSuchElementException if the stream is empty.

**Returns:** `java.util.stream.Collector<T,?,T>`

