# Interface: `InplaceHeavyEditor`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceHeavyEditor`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](../Extension.md)

## Description

It differs from the classic
 form control by the fact that it is placed in the component hierarchy from 
 the very beginning.

## Methods

### `getRenderingInfo([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](./RendererLayoutInfo.md)

This contains information about the baseline
 and the size in a certain context. The baseline is measured from the top of 
 the component.
 
 **Because a renderer is reused, when this 
 call is received, the renderer must re-initialize itself from the given context.**

### `getEditorComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `ro.sync.exml.view.graphics.Rectangle` allocation)`

**Returns:** `java.lang.Object`

### `dispose()`

**Returns:** `void`

This is the time to dispose any resources allocated with it.

### `deactivate()`

**Returns:** `void`

For example 
 another editor was selected. 
 
 For example, if a media player form control that is playing receives this event it should pause.

