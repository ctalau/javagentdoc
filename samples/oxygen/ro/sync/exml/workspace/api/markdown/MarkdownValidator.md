# Interface: `MarkdownValidator`

**Package:** [`ro.sync.exml.workspace.api.markdown`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.markdown.MarkdownValidator`

## Description

## Methods

### `validate(`java.lang.String` systemID, `java.io.Reader` documentReader)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

Note: The validator may check the existence of external resources (e.g. images) 
 referred in the document with relative URLs. The given system ID in this case 
 can be used to resolve those URLs.

