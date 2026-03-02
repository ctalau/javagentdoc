# Interface: `DocumentTypeCustomRuleMatcher`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DocumentTypeCustomRuleMatcher`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

## Methods

### `matches(java.lang.String systemID, java.lang.String rootNamespace, java.lang.String rootLocalName, java.lang.String doctypePublicID, org.xml.sax.Attributes rootAttributes)`

**Parameters:**
- `systemID` (`java.lang.String`): The system ID of the current file in an URL format with not allowed characters corrected.
   For example: "file:/C:/path/to/file/file.xml"
- `rootNamespace` (`java.lang.String`): The namespace of the root.
- `rootLocalName` (`java.lang.String`): The root local name.
- `doctypePublicID` (`java.lang.String`): The public id of the specified DTD if any.
- `rootAttributes` (`org.xml.sax.Attributes`): The root attributes. The attributes are DOM level 2 
   and the namespaces are available for each one.

**Returns:** `boolean`

