# Class: `IDTypeRecognizer`

**Package:** [`ro.sync.ecss.extensions.api.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.link.IDTypeRecognizer`

## Description

The recognizer may be used when search references and declaration for a particular ID.

## Fields

### `MODE_LOCATE_DECLARATIONS`

**Type:** `short`

It is used to locate declaration.

### `MODE_LOCATE_REFERENCES`

**Type:** `short`

It is used to locate references.

## Constructors

### `<init>()`

## Methods

### `detectIDType(java.lang.String systemID, ro.sync.contentcompletion.xml.Context context, java.lang.String attrName, java.lang.String attrNs, java.lang.String attributeValue, int offset)`

The offset is relative to the attribute value.

**Parameters:**
- `systemID` (`java.lang.String`): The systemID of the resource that specifies the attribute.
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md)): The element content to detect the ID. 
   The top element from the context element stack represents the parent element.
- `attrName` (`java.lang.String`): The attribute name.
- `attrNs` (`java.lang.String`): The attribute namespace.
- `attributeValue` (`java.lang.String`): The attribute value.
- `offset` (`int`): The offset that is relative to the attribute value. It is zero based. 
   If it is -1 and the attribute type is IDREFS then all the IDs should be returned.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.link.IDTypeIdentifier>`

### `locateIDType(java.lang.String systemID, ro.sync.contentcompletion.xml.Context context, java.lang.String attrName, java.lang.String attrNs, java.lang.String attributeValue, ro.sync.ecss.extensions.api.link.IDTypeIdentifier idIdentifier, short mode)`

If an attribute declaration or reference was identified then compute it's location relative to the attribute value.
 
 Usually the method is used for attributes with IDREFS type to detect the internal ID references.

**Parameters:**
- `systemID` (`java.lang.String`): The systemID of the resource that specifies the attribute.
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md)): The element content to detect the ID. 
   The top element from the context element stack represents the parent element.
- `attrName` (`java.lang.String`): The attribute name.
- `attrNs` (`java.lang.String`): The attribute namespace.
- `attributeValue` (`java.lang.String`): The attribute value.
- `idIdentifier` ([`ro.sync.ecss.extensions.api.link.IDTypeIdentifier`](./IDTypeIdentifier.md)): The ID identifier.
- `mode` (`short`): The detection mode that is represented as a bitwise mask. 
   Supported modes are IDTypeRecognizer#MODE_LOCATE_REFERENCES and IDTypeRecognizer#MODE_LOCATE_DECLARATIONS.

**Returns:** `int[]`

### `isDefaultIDTypeRecognitionAvailable()`

Otherwise the IDs declaration and references will be detected for document with DTD, XML Schema or 
 RelaxNG schemas.

**Returns:** `boolean`

### `isIDTypeRecognitionAvailable()`

If this method return false also the default ID type 
 recognition will be disabled.

**Returns:** `boolean`

