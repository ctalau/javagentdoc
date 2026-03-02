# Class: `ImmutableMultisetGwtSerializationDependencies`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMultisetGwtSerializationDependencies`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

The GWT supersource for this class contains a field of type E.

 
For details about this hack, see GwtSerializationDependencies, which takes the same
 approach but with a subclass rather than a superclass.

 
TODO(cpovirk): Consider applying this subclass approach to our other types.

 
For ImmutableMultiset in particular, I ran into a problem with the 
 GwtSerializationDependencies approach: When autogenerating a serializer for the new class, GWT
 tries to refer to our dummy serializer for the superclass,
 ImmutableMultiset_CustomFieldSerializer. But that type has no methods (since it's never actually
 used). We could probably fix the problem by adding dummy methods to that class, but that is
 starting to sound harder than taking the superclass approach, which I've been coming to like,
 anyway, since it doesn't require us to declare dummy methods (though occasionally constructors)
 and make types non-final.

## Constructors

### `<init>()`

