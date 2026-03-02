# Class: `CollectSpliterators`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CollectSpliterators`

## Description

## Constructors

### `<init>()`

## Methods

### `indexed(int size, int extraCharacteristics, IntFunction<T> function)`

**Parameters:**
- `size` (`int`)
- `extraCharacteristics` (`int`)
- `function` (`java.util.function.IntFunction<T>`)

**Returns:** `java.util.Spliterator<T>`

### `indexed(int size, int extraCharacteristics, IntFunction<T> function, Comparator<? super T> comparator)`

**Parameters:**
- `size` (`int`)
- `extraCharacteristics` (`int`)
- `function` (`java.util.function.IntFunction<T>`)
- `comparator` (`java.util.Comparator<? super T>`)

**Returns:** `java.util.Spliterator<T>`

### `map(Spliterator<InElementT> fromSpliterator, Function<? super InElementT,? extends OutElementT> function)`

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,? extends OutElementT>`)

**Returns:** `java.util.Spliterator<OutElementT>`

### `filter(Spliterator<T> fromSpliterator, Predicate<? super T> predicate)`

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<T>`)
- `predicate` (`java.util.function.Predicate<? super T>`)

**Returns:** `java.util.Spliterator<T>`

### `flatMap(Spliterator<InElementT> fromSpliterator, Function<? super InElementT,Spliterator<OutElementT>> function, int topCharacteristics, long topSize)`

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator<OutElementT>>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

**Returns:** `java.util.Spliterator<OutElementT>`

### `flatMapToInt(Spliterator<InElementT> fromSpliterator, Function<? super InElementT,Spliterator.OfInt> function, int topCharacteristics, long topSize)`

(If 
 function returns null for an input, it is replaced with an empty stream.)

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator.OfInt>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

**Returns:** `java.util.Spliterator.OfInt`

### `flatMapToLong(Spliterator<InElementT> fromSpliterator, Function<? super InElementT,Spliterator.OfLong> function, int topCharacteristics, long topSize)`

(If 
 function returns null for an input, it is replaced with an empty stream.)

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator.OfLong>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

**Returns:** `java.util.Spliterator.OfLong`

### `flatMapToDouble(Spliterator<InElementT> fromSpliterator, Function<? super InElementT,Spliterator.OfDouble> function, int topCharacteristics, long topSize)`

(If 
 function returns null for an input, it is replaced with an empty stream.)

**Parameters:**
- `fromSpliterator` (`java.util.Spliterator<InElementT>`)
- `function` (`java.util.function.Function<? super InElementT,java.util.Spliterator.OfDouble>`)
- `topCharacteristics` (`int`)
- `topSize` (`long`)

**Returns:** `java.util.Spliterator.OfDouble`

