# Interface: `AuthorPseudoClassController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorPseudoClassController`

## Description

## Methods

### `setPseudoClass(`java.lang.String` pseudoClass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

This change *IS NOT* subject to undo/redo.
 
What is good for: You can use a non standard (custom) pseudo class to impose a style 
 change on a specific element. For instance you can have CSS styles matching a 
 custom pseudo-class, like the one below:
 

```

   section:access-control-user {
      display:block;
   } 
   section {
      display:none;
   } 
 
```

 
 
By setting  the `pseudoClass` "access-control-user", the 
 element `section` will become visible.
 
Another example:
 

```

   *:caret-visited {
      color:red;
   } 
 
```

 You could create an AuthorCaretListener that sets the `caret-visited`  
 pseudo class to the element at the caret location. The effect will be that all the 
 elements traversed by the caret become red.

### `removePseudoClass(`java.lang.String` pseudoClass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

This change *IS NOT* subject to undo/redo.

