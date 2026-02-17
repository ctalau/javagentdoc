# Class: `MetaContentProvider`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.keys.MetaContentProvider`

## Description

This content will appear inline in the Author page for that particular keyref.
 It will also appear in the documentation window when the value for a keyref is computed.
 
 The API will get called by Oxygen either when the content completion shows the user descriptions for each key reference
 or when the content of a keyref is shown as static text in the editor.

## Constructors

### `<init>()`

## Methods

### `getContent(`java.lang.String` nodeClass)`

**Returns:** `java.lang.String`

For an XML like:

 `
 <keyword keyref="test"/>
 `

 the method gets called like:
 
 `getKeyRefContent("- topic/keyword ")`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

