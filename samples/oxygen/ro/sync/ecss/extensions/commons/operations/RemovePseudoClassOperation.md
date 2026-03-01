# Class: `RemovePseudoClassOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.RemovePseudoClassOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.PseudoClassOperation`](./PseudoClassOperation.md)

## Description

Let's consider there is a pseudo class `myClass` on the element 
 `paragraph` and there are CSS styles matching the pseudo class.
 By removing the pseudo-class, the layout of the `paragraph` 
 is rebuilt by matching the other rules.
 
 

```

  paragraph:myClass{
    font-size:2em;
    color:red;
  }
  paragraph{
    color:blue;
  }
 
```
   
 The paragraph will become blue.

## Constructors

### `<init>()`

## Methods

### `execute([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` pseudoClassName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) targetElement)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

