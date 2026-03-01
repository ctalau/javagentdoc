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

### `detectIDType(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attrNs, `java.lang.String` attributeValue, `int` offset)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.link.IDTypeIdentifier>`

The offset is relative to the attribute value.

### `locateIDType(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attrNs, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.api.link.IDTypeIdentifier`](./IDTypeIdentifier.md) idIdentifier, `short` mode)`

**Returns:** `int[]`

If an attribute declaration or reference was identified then compute it's location relative to the attribute value.
 
 Usually the method is used for attributes with IDREFS type to detect the internal ID references.

### `isDefaultIDTypeRecognitionAvailable()`

**Returns:** `boolean`

Otherwise the IDs declaration and references will be detected for document with DTD, XML Schema or 
 RelaxNG schemas.

### `isIDTypeRecognitionAvailable()`

**Returns:** `boolean`

If this method return false also the default ID type 
 recognition will be disabled.

