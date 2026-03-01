# Interface: `InplaceRenderer`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceRenderer`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](../Extension.md)

## Description

Subclasses contain implementation based on real
 SWT or Swing components like combo boxes, text fields, check boxes, buttons etc.
 
 
A renderer is associated with an oxy_editor CSS function and it's the instance
 that handles the painting of the value that the InplaceEditor will edit.
 
 
It is recommended to extend the adapter class InplaceEditorRendererAdapter
 or InplaceRendererAdapter in order to be protected from future API additions.
 
 

 A renderer of a certain type will be reused to render in different contexts so the 
 renderer must initialize itself for the given AuthorInplaceContext on 
 each of its called methods.
 
 Example: For the following CSS, the same **combo** renderer (same instance) will be used for both
 attributes. So for each callback it must prepare itself for the current context.
 

```

 code {
   content: 
     "Attr1: " oxy_editor(type, combo, edit, '@attr1')
     "Attr2: " oxy_editor(type, combo, edit, '@attr2')
  }
 
```

 
 
 
 For a custom implementation property InplaceEditorCSSConstants#PROPERTY_RENDERER_CLASS_NAME
 must be used. The same implementation will be used in Standalone or Eclipse plugin
 environment:
 

```

 myElement {
   content: oxy_editor(
       rendererClassName, "com.custom.editors.CustomRenderer",
       swingEditorClassName, "com.custom.editors.SwingCustomEditor",
       swtEditorClassName, "com.custom.editors.SwtCustomEditor",
       edit, "@my_attr"
       customProperty1, "customValue1",
       customProperty2, "customValue2"
   )
 }
 
```

 In the previous example, the renderer class com.custom.editors.CustomRenderer 
 must be added in the Classpath of the document type associated with the edited document.

## Methods

### `getRendererComponent([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** `java.lang.Object`

It's up to the caller to use the renderer to paint.

### `getCursorType([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

For a more complex renderer, the given X,Y coordinates can be used to decide
 what cursor to return.

### `getCursorType(`int` x, `int` y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../CursorType.md)

For a more complex renderer, the given X,Y coordinates can be used to decide
 what cursor to return.
 
 We recommend using #getCursorType(AuthorInplaceContext, int, int) as 
 you can use the provided context to get additional information.

### `getTooltipText([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context, `int` x, `int` y)`

**Returns:** `java.lang.String`

**Because a renderer is reused, when this 
 called is received, the renderer must re-initialize itself from the given context.**

### `getRenderingInfo([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](./RendererLayoutInfo.md)

This contains information about the baseline
 and the size in a certain context. The baseline is measured from the top of 
 the component.
 
 **Because a renderer is reused, when this 
 call is received, the renderer must re-initialize itself from the given context.**

