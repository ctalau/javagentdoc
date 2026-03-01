# Class: `DITAIDTypeRecognizer`

**Package:** [`ro.sync.ecss.extensions.dita.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.id.DITAIDTypeRecognizer`

**Extends:** [`ro.sync.ecss.extensions.api.link.IDTypeRecognizer`](../../api/link/IDTypeRecognizer.md)

## Description

In this framework the IDs are declared in attributes with name 'id'. The references are recognized
 in href attributes.

## Fields

### `ID_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

### `HREF_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

### `KEYREF_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

### `CONREF_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

### `CONKEYREF_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

### `FIRST_TOPIC_ID`

**Type:** `java.lang.String`

### `SAME_TOPIC_ID`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `detectIDType(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attrNs, `java.lang.String` attributeValue, `int` offset)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.link.IDTypeIdentifier>`

### `getClosestTopicID([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context)`

**Returns:** `ro.sync.ecss.extensions.dita.id.DITAIDTypeRecognizer.ClosestTopicIDDetails`

### `isMapElement([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, [`ro.sync.contentcompletion.xml.ContextElement`](../../../../contentcompletion/xml/ContextElement.md) contextElement)`

**Returns:** `boolean`

### `isTopicElement([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, [`ro.sync.contentcompletion.xml.ContextElement`](../../../../contentcompletion/xml/ContextElement.md) contextElement)`

**Returns:** `boolean`

### `locateIDType(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attrNs, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.api.link.IDTypeIdentifier`](../../api/link/IDTypeIdentifier.md) idIdentifier, `short` mode)`

**Returns:** `int[]`

### `locateReference(`java.lang.String` systemID, `java.lang.String` attrName, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md) ditaID)`

**Returns:** `int[]`

### `locateIndirectReference(`java.lang.String` systemID, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md) ditaID)`

**Returns:** `int[]`

### `locateDirectReference(`java.lang.String` systemID, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md) ditaID)`

**Returns:** `int[]`

### `locateDeclaration(`java.lang.String` systemID, [`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md) context, `java.lang.String` attrName, `java.lang.String` attributeValue, [`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md) ditaID, [`ro.sync.contentcompletion.xml.ContextElement`](../../../../contentcompletion/xml/ContextElement.md) parentElement)`

**Returns:** `int[]`

### `getKeyRefTarget(`java.lang.String` keyRefValue, `java.lang.String` baseSystemID)`

**Returns:** `ro.sync.ecss.extensions.dita.id.DITAIDTypeRecognizer.RefTarget`

### `isDefaultIDTypeRecognitionAvailable()`

**Returns:** `boolean`

### `isIDTypeRecognitionAvailable()`

**Returns:** `boolean`

