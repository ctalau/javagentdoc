# Class: `CollectSpliterators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CollectSpliterators`

## Description

## Constructors

### `<init>()`

## Methods

### `indexed(int size, int extraCharacteristics, java.util.function.IntFunction<T> function)`

**Returns:** `java.util.Spliterator<T>`

**Parameters:**
- `size` (`int`)
- `extraCharacteristics` (`int`)
- `function` (`java.util.function.IntFunction<T>`)

### `indexed(int size, int extraCharacteristics, java.util.function.IntFunction<T> function, java.util.Comparator<? super T> comparator)`

**Returns:** `java.util.Spliterator<T>`

**Parameters:**
- `size` (`int`)
- `extraCharacteristics` (`int`)
- `function` (`java.util.function.IntFunction<T>`)
- `comparator` (`java.util.Comparator<? super T>`)

### `map(java.util.Spliterator<InElementT> fromSpliterator, java.util.function.Function<? super InElementT,? extends OutElementT> function)`

**Returns:** `java.util.Spliterator<OutElementT>`

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,? extends OutElementT>`)

### `filter(java.util.Spliterator<T> fromSpliterator, java.util.function.Predicate<? super T> predicate)`

**Returns:** `java.util.Spliterator<T>`

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<T>`)
- `predicate` (`java.util.function.Predicate<? super T>`)

### `flatMap(java.util.Spliterator<InElementT> fromSpliterator, java.util.function.Function<? super InElementT,java.util.Spliterator<OutElementT>> function, int topCharacteristics, long topSize)`

**Returns:** `java.util.Spliterator<OutElementT>`

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator<OutElementT>>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

### `flatMapToInt(java.util.Spliterator<InElementT> fromSpliterator, java.util.function.Function<? super InElementT,java.util.Spliterator.OfInt> function, int topCharacteristics, long topSize)`

**Returns:** `java.util.Spliterator.OfInt`

(If 
 function returns null for an input, it is replaced with an empty stream.)

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator.OfInt>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

### `flatMapToLong(java.util.Spliterator<InElementT> fromSpliterator, java.util.function.Function<? super InElementT,java.util.Spliterator.OfLong> function, int topCharacteristics, long topSize)`

**Returns:** `java.util.Spliterator.OfLong`

(If 
 function returns null for an input, it is replaced with an empty stream.)

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator.OfLong>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

### `flatMapToDouble(java.util.Spliterator<InElementT> fromSpliterator, java.util.function.Function<? super InElementT,java.util.Spliterator.OfDouble> function, int topCharacteristics, long topSize)`

**Returns:** `java.util.Spliterator.OfDouble`

(If 
 function returns null for an input, it is replaced with an empty stream.)

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator.OfDouble>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

