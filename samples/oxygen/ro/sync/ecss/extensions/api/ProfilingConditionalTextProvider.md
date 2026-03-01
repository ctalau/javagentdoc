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

### `getXMLFragmentForContentProfiling(`int` startOffset, `int` endOffset, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

The returned XML fragment is used to wrap the content included in the
 given offset interval. 
 

 The first leaf of the XML fragment will be the destination of the text to surround.
 The profiling attributes will be set on the first element of the XML fragment.

### `shouldAddProfilingDirectlyOnElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `boolean`

If this method returns `false`, the selected contetn will be wrapped 
 in an XML fragment given by #getXMLFragmentForContentProfiling(int, int, AuthorAccess).

