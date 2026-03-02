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

### `detectIDType(java.lang.String systemID, ro.sync.contentcompletion.xml.Context context, java.lang.String attrName, java.lang.String attrNs, java.lang.String attributeValue, int offset)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md))
- `attrName` (`java.lang.String`)
- `attrNs` (`java.lang.String`)
- `attributeValue` (`java.lang.String`)
- `offset` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.link.IDTypeIdentifier>`

### `getClosestTopicID(ro.sync.contentcompletion.xml.Context context)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md)): The context.

**Returns:** `ro.sync.ecss.extensions.dita.id.DITAIDTypeRecognizer.ClosestTopicIDDetails`

### `isMapElement(ro.sync.contentcompletion.xml.Context context, ro.sync.contentcompletion.xml.ContextElement contextElement)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md)): The context.
- `contextElement` ([`ro.sync.contentcompletion.xml.ContextElement`](../../../../contentcompletion/xml/ContextElement.md)): The context element.

**Returns:** `boolean`

### `isTopicElement(ro.sync.contentcompletion.xml.Context context, ro.sync.contentcompletion.xml.ContextElement contextElement)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md)): The context.
- `contextElement` ([`ro.sync.contentcompletion.xml.ContextElement`](../../../../contentcompletion/xml/ContextElement.md)): The context element.

**Returns:** `boolean`

### `locateIDType(java.lang.String systemID, ro.sync.contentcompletion.xml.Context context, java.lang.String attrName, java.lang.String attrNs, java.lang.String attributeValue, ro.sync.ecss.extensions.api.link.IDTypeIdentifier idIdentifier, short mode)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md))
- `attrName` (`java.lang.String`)
- `attrNs` (`java.lang.String`)
- `attributeValue` (`java.lang.String`)
- `idIdentifier` ([`ro.sync.ecss.extensions.api.link.IDTypeIdentifier`](../../api/link/IDTypeIdentifier.md))
- `mode` (`short`)

**Returns:** `int[]`

### `locateReference(java.lang.String systemID, java.lang.String attrName, java.lang.String attributeValue, ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier ditaID)`

**Parameters:**
- `systemID` (`java.lang.String`): Base URL of current file.
- `attrName` (`java.lang.String`): Current attribute name.
- `attributeValue` (`java.lang.String`): Current attribute value.
- `ditaID` ([`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md)): The ID Type to locate.

**Returns:** `int[]`

### `locateIndirectReference(java.lang.String systemID, java.lang.String attributeValue, ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier ditaID)`

**Parameters:**
- `systemID` (`java.lang.String`): Base URL.
- `attributeValue` (`java.lang.String`): Attribute value
- `ditaID` ([`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md)): The ID to locate.

**Returns:** `int[]`

### `locateDirectReference(java.lang.String systemID, java.lang.String attributeValue, ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier ditaID)`

**Parameters:**
- `systemID` (`java.lang.String`): Base URL of the document
- `attributeValue` (`java.lang.String`): Attribute value
- `ditaID` ([`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md)): ID to locate

**Returns:** `int[]`

### `locateDeclaration(java.lang.String systemID, ro.sync.contentcompletion.xml.Context context, java.lang.String attrName, java.lang.String attributeValue, ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier ditaID, ro.sync.contentcompletion.xml.ContextElement parentElement)`

**Parameters:**
- `systemID` (`java.lang.String`): Base URL of current file.
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../../contentcompletion/xml/Context.md)): Context.
- `attrName` (`java.lang.String`): Current attribute name
- `attributeValue` (`java.lang.String`): Current attribute value
- `ditaID` ([`ro.sync.ecss.extensions.dita.id.DITAIDTypeIdentifier`](./DITAIDTypeIdentifier.md)): The ID to locate.
- `parentElement` ([`ro.sync.contentcompletion.xml.ContextElement`](../../../../contentcompletion/xml/ContextElement.md)): The parent context element.

**Returns:** `int[]`

### `getKeyRefTarget(java.lang.String keyRefValue, java.lang.String baseSystemID)`

**Parameters:**
- `keyRefValue` (`java.lang.String`)
- `baseSystemID` (`java.lang.String`): The base system ID.

**Returns:** `ro.sync.ecss.extensions.dita.id.DITAIDTypeRecognizer.RefTarget`

### `isDefaultIDTypeRecognitionAvailable()`

**Returns:** `boolean`

### `isIDTypeRecognitionAvailable()`

**Returns:** `boolean`

