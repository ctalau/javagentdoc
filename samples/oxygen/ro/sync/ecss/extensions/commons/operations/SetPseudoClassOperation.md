# Class: `SetPseudoClassOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.SetPseudoClassOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.PseudoClassOperation`](./PseudoClassOperation.md)

## Description

There is no constraint on pseudo-class name. Let's consider we 
 set a pseudo class `myClass` on the element 
 `paragraph`. If there are CSS styles matching the pseudo class, 
 the layout of the `paragraph` is rebuilt taking them into account.
 
 

```

  paragraph{
    color:blue;
  }
 
  paragraph:myClass{
    font-size:2em;
    color:red;
  }
 
```
   
 The paragraph is now red.

## Constructors

### `<init>()`

## Methods

### `execute([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` pseudoClassName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) targetElement)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

