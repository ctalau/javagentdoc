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

### `<init>(`java.lang.String` documentTypeName, [`ro.sync.ecss.dita.ContextKeyManagerProvider`](../../dita/ContextKeyManagerProvider.md) contextKeyManagerProvider, `java.util.function.Supplier<java.lang.String>` userNameProvider)`

## Methods

### `filterAttributeValues(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` attributeValues, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributes(`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>` attributes, [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md) context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `filterElementValues(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` elementValues, [`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md) context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterElements(`java.util.List<ro.sync.contentcompletion.xml.CIElement>` elements, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `disallowElementsBeforeTitle([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.util.List<ro.sync.contentcompletion.xml.CIElement>` elems, `java.util.Set<java.lang.String>` parentNames)`

**Returns:** `void`

### `disallowDuplicateTitlesInElements([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.util.List<ro.sync.contentcompletion.xml.CIElement>` elems, `java.util.Set<java.lang.String>` parentNames)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

