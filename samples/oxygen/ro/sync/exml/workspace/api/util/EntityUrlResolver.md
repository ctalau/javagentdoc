# Interface: `EntityUrlResolver`

**Package:** [`ro.sync.exml.workspace.api.util`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.EntityUrlResolver`

**Extends:** `org.xml.sax.EntityResolver`

## Description

This method can be more efficient than the 
 resolveEntity method in the parent interface.

## Methods

### `resolveEntityUrl(java.lang.String publicId, java.lang.String systemId)`

**Returns:** `java.lang.String`

**Parameters:**
- `publicId` (`java.lang.String`): The public identifier of the external entity
        being referenced, or null if none was supplied.
- `systemId` (`java.lang.String`): The system identifier of the external entity
        being referenced.

