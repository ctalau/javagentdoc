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

**Parameters:**
- `attributeValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributes(java.util.List<ro.sync.contentcompletion.xml.CIAttribute> attributes, ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext context)`

**Parameters:**
- `attributes` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `filterElementValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> elementValues, ro.sync.contentcompletion.xml.Context context)`

**Parameters:**
- `elementValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterElements(java.util.List<ro.sync.contentcompletion.xml.CIElement> elements, ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context)`

**Parameters:**
- `elements` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `disallowElementsBeforeTitle(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context, java.util.List<ro.sync.contentcompletion.xml.CIElement> elems, java.util.Set<java.lang.String> parentNames)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.
- `elems` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of current elements which are proposed.
- `parentNames` (`java.util.Set<java.lang.String>`): The elements names where this applies.

**Returns:** `void`

### `disallowDuplicateTitlesInElements(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context, java.util.List<ro.sync.contentcompletion.xml.CIElement> elems, java.util.Set<java.lang.String> parentNames)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The current context.
- `elems` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of current elements which are proposed...
- `parentNames` (`java.util.Set<java.lang.String>`): The name of the parent elements where a duplicate title is not allowed.

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

