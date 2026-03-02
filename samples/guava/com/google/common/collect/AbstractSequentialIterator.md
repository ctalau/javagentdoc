# Class: `AbstractSequentialIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractSequentialIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Null elements are not
 supported, nor is the #remove() method.

 
Example:

 

```

 Iterator<Integer> powersOfTwo =
     new AbstractSequentialIterator<Integer>(1) {
       protected Integer computeNext(Integer previous) {
         return (previous == 1 << 30) ? null : previous * 2;
       }
     };
 
```

## Fields

### `nextOrNull`

**Type:** `T`

## Constructors

### `<init>(T firstOrNull)`

**Parameters:**
- `firstOrNull` (`T`)

## Methods

### `computeNext(T previous)`

This method is invoked during each call to #next() in order to compute the
 result of a *future* call to next().

**Parameters:**
- `previous` (`T`)

**Returns:** `T`

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

