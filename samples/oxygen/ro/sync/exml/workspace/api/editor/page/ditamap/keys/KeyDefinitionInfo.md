# Class: `KeyDefinitionInfo`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionInfo`

## Description

This is filled on the API side.

## Fields

### `NAME`

**Type:** `java.lang.String`

### `HREF`

**Type:** `java.lang.String`

Can be null.
 
 If the defined key points indirectly (using a keyref) to other definitions,
 it is the responsibility of the developer to set here the final href value.
 
 The absolute reference will be resolved based on the "DEFINITION_LOCATION" property 
 which needs to be set in the KeyDefinitionInfo.

### `DESCRIPTION`

**Type:** `java.lang.String`

It is used for display purposes when a key reference is inserted. Can be null.

### `DEFINITION_LOCATION`

**Type:** `java.lang.String`

This must be given as an URL in the Oxygen standalone version.
 In the Oxygen plugin for Eclipse this can be also given as a native resource like IResource.
 
 The location is useful in order for Oxygen to determine the absolute location where the keyref is pointing.
 When the user clicks a keyref or a conkeyref in the Author page Oxygen has to open the target location corresponding to it.

### `META_CONTENT_PROVIDER`

**Type:** `java.lang.String`

The provider is useful in order for Oxygen to show the static text in place in the Author page.

### `IS_SUBJECT_DEF`

**Type:** `java.lang.String`

### `SUBJECT_DEF_CHILDREN`

**Type:** `java.lang.String`

### `properties`

**Type:** `java.util.Map<java.lang.String,java.lang.Object>`

### `attributes`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

## Constructors

### `<init>()`

## Methods

### `getProperty(java.lang.String propertyName)`

**Returns:** `java.lang.Object`

**Parameters:**
- `propertyName` (`java.lang.String`): The property name. One of the following constants:
 

  - #DESCRIPTION

  - #NAME

  - #HREF

  - #DEFINITION_LOCATION

  - #IS_SUBJECT_DEF

  - #SUBJECT_DEF_CHILDREN

 


### `setProperty(java.lang.String propertyName, java.lang.Object propertyValue)`

**Returns:** `void`

**Parameters:**
- `propertyName` (`java.lang.String`): The property name. One of the following constants:
 

  - #DESCRIPTION

  - #NAME

  - #HREF

  - #DEFINITION_LOCATION

  - #IS_SUBJECT_DEF

  - #SUBJECT_DEF_CHILDREN

 

- `propertyValue` (`java.lang.Object`): The value of the property.

### `toString()`

**Returns:** `java.lang.String`

### `setAttribute(java.lang.String attributeName, java.lang.String attributeValue)`

**Returns:** `void`

For example the application may use the "format" attribute to hide when inserting key references, 
 key definitions which point to DITA resources.

**Parameters:**
- `attributeName` (`java.lang.String`): The attribute name.
- `attributeValue` (`java.lang.String`): The value of the attribute.

### `getAttributes()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

Can be `null`

