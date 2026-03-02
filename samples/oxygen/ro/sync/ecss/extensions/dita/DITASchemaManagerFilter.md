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

### `<init>(String documentTypeName, ContextKeyManagerProvider contextKeyManagerProvider, Supplier<String> userNameProvider)`

**Parameters:**
- `documentTypeName` (`java.lang.String`): The document type name
- `contextKeyManagerProvider` ([`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md)): A provider of a context key manager used to propose attributes values for 
   attributes like keyref.
- `userNameProvider` (`java.util.function.Supplier<java.lang.String>`): User name provider - it may return `null` in which case a fallback is used.

## Methods

### `filterAttributeValues(List<CIValue> attributeValues, WhatPossibleValuesHasAttributeContext context)`

**Parameters:**
- `attributeValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributes(List<CIAttribute> attributes, WhatAttributesCanGoHereContext context)`

**Parameters:**
- `attributes` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `filterElementValues(List<CIValue> elementValues, Context context)`

**Parameters:**
- `elementValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterElements(List<CIElement> elements, WhatElementsCanGoHereContext context)`

**Parameters:**
- `elements` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `disallowElementsBeforeTitle(WhatElementsCanGoHereContext context, List<CIElement> elems, Set<String> parentNames)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.
- `elems` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of current elements which are proposed.
- `parentNames` (`java.util.Set<java.lang.String>`): The elements names where this applies.

**Returns:** `void`

### `disallowDuplicateTitlesInElements(WhatElementsCanGoHereContext context, List<CIElement> elems, Set<String> parentNames)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The current context.
- `elems` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of current elements which are proposed...
- `parentNames` (`java.util.Set<java.lang.String>`): The name of the parent elements where a duplicate title is not allowed.

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

