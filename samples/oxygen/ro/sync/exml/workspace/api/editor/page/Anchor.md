# Interface: `Anchor`

**Package:** [`ro.sync.exml.workspace.api.editor.page`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.Anchor`

## Description

An Anchor is usually implemented as a simple XPath expression along with a relative offset 
 to remember the current position inside the current XML element's text content.

 You can serialize an Anchor to a string and back using the "ro.sync.exml.workspace.api.options.GlobalOptionsStorage.serializePersistentObject(Object)" 
 and "ro.sync.exml.workspace.api.options.GlobalOptionsStorage.deserializePersistentObject(Object)" APIs.

