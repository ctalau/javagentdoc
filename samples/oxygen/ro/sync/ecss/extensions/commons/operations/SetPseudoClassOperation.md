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

### `execute(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String pseudoClassName, ro.sync.ecss.extensions.api.node.AuthorElement targetElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The access.
- `pseudoClassName` (`java.lang.String`): The name of the pseudo class.
- `targetElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element that is changed.

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

