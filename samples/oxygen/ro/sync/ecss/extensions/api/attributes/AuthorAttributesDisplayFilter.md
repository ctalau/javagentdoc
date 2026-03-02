# Class: `AuthorAttributesDisplayFilter`

**Package:** [`ro.sync.ecss.extensions.api.attributes`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.attributes.AuthorAttributesDisplayFilter`

## Description

## Fields

### `SOURCE_ATTRIBUTES_VIEW`

**Type:** `int`

This type of source means that the callback is received either from the Attributes view associated to an Author page
 or from the in-place Attributes editor from either the Author or the DITA Maps Manager editing page.

### `SOURCE_OUTLINE_VIEW`

**Type:** `int`

This type of source means that the callback is received
 either from the Outline view associated to an Author page.

### `SOURCE_FULL_TAGS_WITH_ATTRS`

**Type:** `int`

This type of source means that the callback is received
 when displaying the node in the Full Tags with Attributes in the Author page.

### `SOURCE_CSS_CONTENT`

**Type:** `int`

This type of source means that the callback is received
 when having CSS extension functions like attributes().

### `SOURCE_EDIT_PROPERTIES`

**Type:** `int`

This type of source means that the callback is received
 from "Edit Properties" (available for DITA documents).

### `SOURCE_INSERT_REFERENCE`

**Type:** `int`

This type of source means that the callback is received
 from "Insert reference" dialogs (available for DITA documents).

## Constructors

### `<init>()`

## Methods

### `shouldFilterAttribute(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, java.lang.String attributeQName, int source)`

**Returns:** `boolean`

This method should be implemented in subclasses.

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)): The parent element.
- `attributeQName` (`java.lang.String`): The name of the attribute.
- `source` (`int`): The place from which the attribute should be filtered. 
 One of the constants AuthorAttributesDisplayFilter#SOURCE_ATTRIBUTES_VIEW or AuthorAttributesDisplayFilter#SOURCE_OUTLINE_VIEW

### `shouldFilterAttribute(ro.sync.contentcompletion.xml.CIElement parentElement, java.lang.String attributeQName, int source)`

**Returns:** `boolean`

This method should be implemented in subclasses.

**Parameters:**
- `parentElement` ([`ro.sync.contentcompletion.xml.CIElement`](../../../../contentcompletion/xml/CIElement.md)): The parent CI element.
- `attributeQName` (`java.lang.String`): The name of the attribute.
- `source` (`int`): The place from which the attribute should be filtered. 
 A possible value can be AuthorAttributesDisplayFilter#SOURCE_INSERT_REFERENCE

