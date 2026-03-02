# Class: `TopicRefTargetInfo`

**Package:** [`ro.sync.exml.workspace.api.standalone.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfo`

## Description

This is filled on the API side.

## Fields

### `TITLE`

**Type:** `java.lang.String`

### `CLASS_VALUE`

**Type:** `java.lang.String`

### `ELEMENT_NAME`

**Type:** `java.lang.String`

### `PARSE_ERROR`

**Type:** `java.lang.String`

### `RESOLVED`

**Type:** `java.lang.String`

### `properties`

**Type:** `java.util.Map<java.lang.String,java.lang.Object>`

## Constructors

### `<init>()`

## Methods

### `getProperty(java.lang.String propertyName)`

**Returns:** `java.lang.Object`

**Parameters:**
- `propertyName` (`java.lang.String`): The property name. One of the following constants:
 

  - #RESOLVED

  - #TITLE

  - #CLASS_VALUE

  - #ELEMENT_NAME

  - #PARSE_ERROR

 


### `setProperty(java.lang.String propertyName, java.lang.Object propertyValue)`

**Returns:** `void`

**Parameters:**
- `propertyName` (`java.lang.String`): The property name. One of the following constants:
 

  - #RESOLVED

  - #TITLE

  - #CLASS_VALUE

  - #ELEMENT_NAME

  - #PARSE_ERROR

 

- `propertyValue` (`java.lang.Object`): The value of the property.

