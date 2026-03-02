# Class: `MoreObjects`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.MoreObjects`

## Description

See the Guava User Guide on [writing Object
 methods with MoreObjects](https://github.com/google/guava/wiki/CommonObjectUtilitiesExplained).

## Constructors

### `<init>()`

## Methods

### `firstNonNull(T first, T second)`

**Returns:** `T`

To find the first non-null element in an iterable, use Iterables.find(iterable,
 Predicates.notNull()). For varargs, use Iterables.find(Arrays.asList(a, b, c, ...),
 Predicates.notNull()), static importing as necessary.

 
**Note:** if first is represented as an Optional, this can be
 accomplished with first.or(second). That approach also allows for
 lazy evaluation of the fallback instance, using first.or(supplier).

 
**Java 9 users:** use java.util.Objects.requireNonNullElse(first, second)
 instead.

**Parameters:**
- `first` (`T`)
- `second` (`T`)

### `toStringHelper(java.lang.Object self)`

**Returns:** `com.google.common.base.MoreObjects.ToStringHelper`

This is helpful for implementing Object#toString(). Specification by example:

 

```

 // Returns "ClassName{}"
 MoreObjects.toStringHelper(this)
     .toString();

 // Returns "ClassName{x=1}"
 MoreObjects.toStringHelper(this)
     .add("x", 1)
     .toString();

 // Returns "MyObject{x=1}"
 MoreObjects.toStringHelper("MyObject")
     .add("x", 1)
     .toString();

 // Returns "ClassName{x=1, y=foo}"
 MoreObjects.toStringHelper(this)
     .add("x", 1)
     .add("y", "foo")
     .toString();

 // Returns "ClassName{x=1}"
 MoreObjects.toStringHelper(this)
     .omitNullValues()
     .add("x", 1)
     .add("y", null)
     .toString();
 
```


 
Note that in GWT, class names are often obfuscated.

**Parameters:**
- `self` (`java.lang.Object`): the object to generate the string for (typically this), used only for its
     class name

### `toStringHelper(java.lang.Class<?> clazz)`

**Returns:** `com.google.common.base.MoreObjects.ToStringHelper`

Note that in GWT, class names are often obfuscated.

**Parameters:**
- `clazz` (`java.lang.Class<?>`): the Class of the instance

### `toStringHelper(java.lang.String className)`

**Returns:** `com.google.common.base.MoreObjects.ToStringHelper`

**Parameters:**
- `className` (`java.lang.String`): the name of the instance type

