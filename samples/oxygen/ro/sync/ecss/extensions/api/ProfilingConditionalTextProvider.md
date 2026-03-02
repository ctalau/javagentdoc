# Class: `ProfilingConditionalTextProvider`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ProfilingConditionalTextProvider`

## Description

It differs from one variant of the document to another,  
 while unconditional elements appear in all document versions.
 
 
 This class provides custom support for **Profiling/Conditional Text**.

## Constructors

### `<init>()`

## Methods

### `getXMLFragmentForContentProfiling(int startOffset, int endOffset, AuthorAccess authorAccess)`

The returned XML fragment is used to wrap the content included in the
 given offset interval. 
 

 The first leaf of the XML fragment will be the destination of the text to surround.
 The profiling attributes will be set on the first element of the XML fragment.

**Parameters:**
- `startOffset` (`int`): The start offset of the document content that must be profiled.
- `endOffset` (`int`): The end offset of the document content that must be profiled.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access class to the author functions.

**Returns:** `java.lang.String`

### `shouldAddProfilingDirectlyOnElement(AuthorElement element)`

If this method returns `false`, the selected contetn will be wrapped 
 in an XML fragment given by #getXMLFragmentForContentProfiling(int, int, AuthorAccess).

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element to be analyzed.

**Returns:** `boolean`

