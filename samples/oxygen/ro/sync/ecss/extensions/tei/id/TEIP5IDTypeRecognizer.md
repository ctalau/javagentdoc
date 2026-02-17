# Class: `TEIP5IDTypeRecognizer`

**Package:** [`ro.sync.ecss.extensions.tei.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.id.TEIP5IDTypeRecognizer`

**Extends:** [`ro.sync.ecss.extensions.api.link.IDTypeRecognizer`](../../api/link/IDTypeRecognizer.md)

## Description

In this framework the IDs are declared in attributes with name 'id'. The references are recognized
 in attributes ptr/@target or ref/@target, see http://www.tei-c.org/release/doc/tei-p5-doc/en/html/ref-ptr.html.

## Constructors

### `<init>()`

## Methods

### `detectIDType(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attrNs, `java.lang.String` attributeValue, `int` offset)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.link.IDTypeIdentifier>`

### `locateIDType(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attrNs, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.api.link.IDTypeIdentifier`](../../api/link/IDTypeIdentifier.md) idIdentifier, `short` mode)`

**Returns:** `int[]`

### `isDefaultIDTypeRecognitionAvailable()`

**Returns:** `boolean`

### `isIDTypeRecognitionAvailable()`

**Returns:** `boolean`

