# Class: `DITASchemaManagerFilter`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITASchemaManagerFilter`

**Extends:** [`ro.sync.contentcompletion.xml.SchemaManagerFilterBase`](../../../contentcompletion/xml/SchemaManagerFilterBase.md)

## Description

## Fields

### `TITLE_PARENTS`

**Type:** `com.google.common.collect.ImmutableSet<java.lang.String>`

### `TITLE_ELEMENT_NAME`

**Type:** `java.lang.String`

### `documentTypeName`

**Type:** `java.lang.String`

### `keyManagerProvider`

**Type:** [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)

### `userNameProvider`

**Type:** `java.util.function.Supplier<java.lang.String>`

## Constructors

### `<init>(java.lang.String documentTypeName, ro.sync.ecss.dita.ContextKeyManagerProvider contextKeyManagerProvider, java.util.function.Supplier<java.lang.String> userNameProvider)`

**Parameters:**
- `documentTypeName` (`java.lang.String`): The document type name
- `contextKeyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): A provider of a context key manager used to propose attributes values for 
 attributes like keyref.
- `userNameProvider` (`java.util.function.Supplier<java.lang.String>`): User name provider - it may return `null` in which case a fallback is used.

## Methods

### `filterAttributeValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> attributeValues, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `attributeValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

### `filterAttributes(java.util.List<ro.sync.contentcompletion.xml.CIAttribute> attributes, ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

**Parameters:**
- `attributes` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md))

### `filterElementValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> elementValues, ro.sync.contentcompletion.xml.Context context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `elementValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md))

### `filterElements(java.util.List<ro.sync.contentcompletion.xml.CIElement> elements, ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `elements` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

### `disallowElementsBeforeTitle(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context, java.util.List<ro.sync.contentcompletion.xml.CIElement> elems, java.util.Set<java.lang.String> parentNames)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.
- `elems` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of current elements which are proposed.
- `parentNames` (`java.util.Set<java.lang.String>`): The elements names where this applies.

### `disallowDuplicateTitlesInElements(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context, java.util.List<ro.sync.contentcompletion.xml.CIElement> elems, java.util.Set<java.lang.String> parentNames)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The current context.
- `elems` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of current elements which are proposed...
- `parentNames` (`java.util.Set<java.lang.String>`): The name of the parent elements where a duplicate title is not allowed.

### `getDescription()`

**Returns:** `java.lang.String`

