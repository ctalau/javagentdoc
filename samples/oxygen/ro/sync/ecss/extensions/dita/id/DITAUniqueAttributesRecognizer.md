# Class: `DITAUniqueAttributesRecognizer`

**Package:** [`ro.sync.ecss.extensions.dita.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.id.DITAUniqueAttributesRecognizer`

**Extends:** [`ro.sync.ecss.extensions.commons.id.DefaultUniqueAttributesRecognizer`](../../commons/id/DefaultUniqueAttributesRecognizer.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `copyAttributeOnSplit(java.lang.String attrQName, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `boolean`

**Parameters:**
- `attrQName` (`java.lang.String`)
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

### `getDescription()`

**Returns:** `java.lang.String`

### `getGenerateIDAttributeQName(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String[] elemsWithAutoGeneration, boolean forceGeneration)`

**Returns:** `java.lang.String`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `elemsWithAutoGeneration` (`java.lang.String[]`)
- `forceGeneration` (`boolean`)

### `isInsideConref(ro.sync.ecss.extensions.api.AuthorElementBaseInterface element)`

**Returns:** `boolean`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../../api/AuthorElementBaseInterface.md)): the element

### `process(ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation fragmentInformation)`

**Returns:** `void`

**Parameters:**
- `fragmentInformation` ([`ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation`](../../api/content/ClipboardFragmentInformation.md))

