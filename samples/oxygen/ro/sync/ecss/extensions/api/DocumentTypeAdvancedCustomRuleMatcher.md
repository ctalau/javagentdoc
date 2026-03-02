# Class: `DocumentTypeAdvancedCustomRuleMatcher`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DocumentTypeAdvancedCustomRuleMatcher`

**Implements:** [`ro.sync.ecss.extensions.api.DocumentTypeCustomRuleMatcher`](./DocumentTypeCustomRuleMatcher.md)

## Description

## Constructors

### `<init>()`

## Methods

### `matches(String systemID, String rootNamespace, String rootLocalName, String doctypePublicID, Attributes rootAttributes)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `rootNamespace` (`java.lang.String`)
- `rootLocalName` (`java.lang.String`)
- `doctypePublicID` (`java.lang.String`)
- `rootAttributes` (`org.xml.sax.Attributes`)

**Returns:** `boolean`

### `matches(String systemID, String rootNamespace, String rootLocalName, String doctypePublicID, Attributes rootAttributes, Reader contentReader)`

This method receives a reader over the entire content.

**Parameters:**
- `systemID` (`java.lang.String`): The system ID of the current file in an URL format with not allowed characters corrected.
   For example: "file:/C:/path/to/file/file.xml"
- `rootNamespace` (`java.lang.String`): The namespace of the root.
- `rootLocalName` (`java.lang.String`): The root local name.
- `doctypePublicID` (`java.lang.String`): The public id of the specified DTD if any.
- `rootAttributes` (`org.xml.sax.Attributes`): The root attributes. The attributes are DOM level 2 
   and the namespaces are available for each one.
- `contentReader` (`java.io.Reader`): Reader over the entire XML content. Can be used for detection
   if all other parameters are not enough. The reader does not need to be reset or closed. It may be `null`.

**Returns:** `boolean`

### `matches(String systemID, String rootNamespace, String rootLocalName, String doctypePublicID, String doctypeSystemID, Attributes rootAttributes, Map<String,String> queryParameters, Reader contentReader)`

This method receives a reader over the entire content.

**Parameters:**
- `systemID` (`java.lang.String`): The system ID of the current file in an URL format with not allowed characters corrected.
   For example: "file:/C:/path/to/file/file.xml"
- `rootNamespace` (`java.lang.String`): The namespace of the root.
- `rootLocalName` (`java.lang.String`): The root local name.
- `doctypePublicID` (`java.lang.String`): The public id of the specified DTD if any.
- `doctypeSystemID` (`java.lang.String`): The system id of the specified DTD if any.
- `rootAttributes` (`org.xml.sax.Attributes`): The root attributes. The attributes are DOM level 2 
   and the namespaces are available for each one.
- `queryParameters` (`java.util.Map<java.lang.String,java.lang.String>`): The parameters which were set in the query string used to open this resource. May be `null`.
- `contentReader` (`java.io.Reader`): Reader over the entire XML content. Can be used for detection
   if all other parameters are not enough. The reader does not need to be reset or closed. It may be `null`.

**Returns:** `boolean`

