# Interface: `Funnel`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Funnel`

**Extends:** `java.io.Serializable`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Implementations for common types can be found in Funnels.

 
Note that serialization of bloom filters requires the proper
 serialization of funnels. When possible, it is recommended that funnels be implemented as a
 single-element enum to maintain serialization guarantees. See Effective Java (2nd Edition), Item
 3: "Enforce the singleton property with a private constructor or an enum type". For example:

 

```

 public enum PersonFunnel implements Funnel<Person> {
   INSTANCE;
   public void funnel(Person person, PrimitiveSink into) {
     into.putUnencodedChars(person.getFirstName())
         .putUnencodedChars(person.getLastName())
         .putInt(person.getAge());
   }
 }
 
```

## Methods

### `funnel(T from, PrimitiveSink into)`

There is no
 requirement that this data be complete enough to fully reconstitute the object later.

**Parameters:**
- `from` (`T`)
- `into` ([`com.google.common.hash.PrimitiveSink`](./PrimitiveSink.md))

**Returns:** `void`

