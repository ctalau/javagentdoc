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

### `copyAttributeOnSplit(String attrQName, AuthorElement element)`

**Parameters:**
- `attrQName` (`java.lang.String`)
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getGenerateIDAttributeQName(AuthorElement element, String[] elemsWithAutoGeneration, boolean forceGeneration)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `elemsWithAutoGeneration` (`java.lang.String[]`)
- `forceGeneration` (`boolean`)

**Returns:** `java.lang.String`

### `isInsideConref(AuthorElementBaseInterface element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.AuthorElementBaseInterface`](../../api/AuthorElementBaseInterface.md)): the element

**Returns:** `boolean`

### `process(ClipboardFragmentInformation fragmentInformation)`

**Parameters:**
- `fragmentInformation` ([`ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation`](../../api/content/ClipboardFragmentInformation.md))

**Returns:** `void`

