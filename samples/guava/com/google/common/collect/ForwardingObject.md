# Class: `ForwardingObject`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingObject`

## Description

The #delegate() method must be overridden to return the instance being decorated.

 
This class does *not* forward the hashCode and equals methods through to
 the backing object, but relies on Object's implementation. This is necessary to preserve
 the symmetry of equals. Custom definitions of equality are usually based on an interface,
 such as Set or List, so that the implementation of equals can cast the
 object being tested for equality to the custom interface. ForwardingObject implements no
 such custom interfaces directly; they are implemented only in subclasses. Therefore, forwarding
 equals would break symmetry, as the forwarding object might consider itself equal to the
 object being tested, but the reverse could not be true. This behavior is consistent with the
 JDK's collection wrappers, such as java.util.Collections#unmodifiableCollection. Use an
 interface-specific subclass of ForwardingObject, such as ForwardingList, to
 preserve equality behavior, or override equals directly.

 
The toString method is forwarded to the delegate. Although this class does not
 implement Serializable, a serializable subclass may be created since this class has a
 parameter-less constructor.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.lang.Object`

Abstract subclasses
 generally override this method with an abstract method that has a more specific return type,
 such as ForwardingSet#delegate. Concrete subclasses override this method to supply the
 instance being decorated.

### `toString()`

**Returns:** `java.lang.String`

