# Class: `JSOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.JSOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

This operation has the following parameters:
 

  - **script**: the JavaScript content to execute. 
   
It must have a function called doOperation(), which can use the predefined authorAccess variable. 
   The **authorAccess** variable has access to the ro.sync.ecss.extensions.api.AuthorAccess instance.
  
  The following example is a script that can be used to move the caret location after the current element:
  
  

```

    function doOperation(){ 
      caretOffset = authorAccess.getEditorAccess().getCaretOffset(); 
      currentNode = authorAccess.getDocumentController().getNodeAtOffset(caretOffset); 
      //Move caret after current node 
      authorAccess.getEditorAccess().setCaretPosition(currentNode.getEndOffset() + 1); 
    }
  
```

 

 

 Note: If you have a script called commons.js in the framework directory, you can call functions 
 defined inside it from your custom script content so that you can use that external script 
 file as a library of functions.

## Fields

### `ARGUMENT_SCRIPT`

**Type:** `java.lang.String`

The value is `script`.

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

