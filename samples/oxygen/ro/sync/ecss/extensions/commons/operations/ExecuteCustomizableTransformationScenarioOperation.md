# Class: `ExecuteCustomizableTransformationScenarioOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ExecuteCustomizableTransformationScenarioOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `XPATH_EXPRESSION_CURRENT_ELEMENT`

**Type:** `java.lang.String`

### `MARK_IN_PROGRESS_PSEUDO_CLASS`

**Type:** `java.lang.String`

### `MARK_OTHERS_IN_PROGRESS_PSEUDO_CLASS`

**Type:** `java.lang.String`

### `SPLITTER_ON_END_LINE`

**Type:** `com.google.common.base.Splitter`

### `SPLITTER_ON_EQUALS`

**Type:** `com.google.common.base.Splitter`

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `SCENARIO_NAME`

**Type:** `java.lang.String`

### `SCENARIO_PARAMETERS`

**Type:** `java.lang.String`

Pairs key=value separated by new line.

### `MARK_IN_PROGRESS_XPATH_LOCATION`

**Type:** `java.lang.String`

### `MARK_OTHERS_IN_PROGRESS_XPATH_LOCATION`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `findElementsByXPath([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, `java.lang.String` xpath)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `setPseudoClassToElements([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` elements, `java.lang.String` pseudoClass)`

**Returns:** `void`

### `removePseudoClassToElements([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` elements, `java.lang.String` pseudoClass)`

**Returns:** `void`

