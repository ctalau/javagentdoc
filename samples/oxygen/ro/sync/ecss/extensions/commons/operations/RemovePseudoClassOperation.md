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

### `execute(AuthorAccess authorAccess, String pseudoClassName, AuthorElement targetElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The access.
- `pseudoClassName` (`java.lang.String`): The name of the pseudo class.
- `targetElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element that is changed.

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

