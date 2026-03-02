# Interface: `SchemaManagerFilter`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.SchemaManagerFilter`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](../../ecss/extensions/api/Extension.md)

## Description

This should be implemented if the
 list of content completion proposals must be filtered based on some criteria or 
 some new entries need to be added.

## Methods

### `filterElements(java.util.List<ro.sync.contentcompletion.xml.CIElement> elements, ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

The original list of elements is obtained by examining the current document
 schema and determining what possible elements can be inserted in the
 current context.
 For example if `person` is the current `CIElement`,
 and the list of children contains the elements `name`
 and `address`, the result of choosing
 the **person** entry from the content completion window
 will be the insertion of the following sequence:
 

```

 `
 <person>
     <name>...</name>
     <address>...</address>
 </person>
 `
 
```

 Given this example, the original `name` CIElement can be replaced
 by a new one which returns a list with two new CIElements, `firstName` and
 `lastName`, on the CIElement#getGuessElements() method call. 
 The new generated sequence would be:
 

```

 `
 <person>
     <name>
         <firstName>...</firstName>
         <lastName>...</lastName>
     </name>
     <address>...</address>
 </person>
 `
 
```

**Parameters:**
- `elements` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`): The list of elements (CIElement) to be filtered.
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](./WhatElementsCanGoHereContext.md)): The WhatElementsCanGoHereContext where the list of 
 elements is requested.
 If `null` then the given list of content completion elements contains
 global elements.

### `filterAttributes(java.util.List<ro.sync.contentcompletion.xml.CIAttribute> attributes, ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

The original list of attributes is obtained by examining the current document
 schema and determining what attributes can be inserted in the current element
 and taking into account the list of existing attributes.

**Parameters:**
- `attributes` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`): The list of attributes (CIAttribute) to be filtered. Can be NULL
- `context` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](./WhatAttributesCanGoHereContext.md)): The WhatAttributesCanGoHereContext where the list of
 attributes is requested.

### `filterAttributeValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> attributeValues, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

The original list of attribute values is obtained by examining the current 
 document schema and determining what values are permitted for the current attribute.
 If the attribute type was an enumeration, then a list with the tokens of the
 enumeration will be returned for that attribute.

**Parameters:**
- `attributeValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`): The list of attribute values (CIValue) to be filtered.
- `context` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](./WhatPossibleValuesHasAttributeContext.md)): The WhatPossibleValuesHasAttributeContext where the 
 list of attribute values is requested.

### `filterElementValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> elementValues, ro.sync.contentcompletion.xml.Context context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

The original list of element values is obtained by examining the current 
 document schema and determining what values are permitted for the current element.
 If the element type was an enumeration, then a list with the values of the
 enumeration will be returned for that element.

**Parameters:**
- `elementValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`): The list of element values (CIValue) to be filtered.
- `context` ([`ro.sync.contentcompletion.xml.Context`](./Context.md)): The Context where the list of element values is requested.

