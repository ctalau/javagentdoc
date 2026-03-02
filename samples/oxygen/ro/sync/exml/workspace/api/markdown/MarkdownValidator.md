# Interface: `MarkdownValidator`

**Package:** [`ro.sync.exml.workspace.api.markdown`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.markdown.MarkdownValidator`

## Description

## Methods

### `validate(java.lang.String systemID, java.io.Reader documentReader)`

Note: The validator may check the existence of external resources (e.g. images) 
 referred in the document with relative URLs. The given system ID in this case 
 can be used to resolve those URLs.

**Parameters:**
- `systemID` (`java.lang.String`): the system ID of the document to be validated. Can be `null`.
   Passing a `null` value for systemID may result in incorrect position (line, column)
   for the reported errors.
- `documentReader` (`java.io.Reader`): the reader of the markdown document

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

