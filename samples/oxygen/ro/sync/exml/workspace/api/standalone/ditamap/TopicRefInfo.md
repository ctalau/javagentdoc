# Class: `TopicRefInfo`

**Package:** [`ro.sync.exml.workspace.api.standalone.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ditamap.TopicRefInfo`

## Description

This is filled on the Oxygen side.

## Fields

### `ABSOLUTE_URL`

**Type:** `java.lang.String`

It does not include the id location.

### `ID_PATH`

**Type:** `java.lang.String`

### `HREF_VALUE`

**Type:** `java.lang.String`

### `KEY_SCOPES`

**Type:** `java.lang.String`

Either empty string or something like "ks1.ks2".

### `ABSOLUTE_BASE_URL`

**Type:** `java.lang.String`

### `properties`

**Type:** `java.util.Map<java.lang.String,java.lang.Object>`

## Constructors

### `<init>()`

## Methods

### `getProperty(java.lang.String propertyName)`

**Parameters:**
- `propertyName` (`java.lang.String`): The property name. One of the following constants:
   
  
    - #ABSOLUTE_URL
  
    - #ID_PATH
  
    - #HREF_VALUE
  
   
  
   
   For example if a DITA Map with the URL "cms://test/file.ditamap" references a topic using the #HREF_VALUE **task.dita#task**
   then the #ABSOLUTE_URL of the topic reference will be **cms://test/task.dita** and the #ID_PATH will be **task**

**Returns:** `java.lang.Object`

### `setProperty(java.lang.String propertyName, java.lang.Object propertyValue)`

**Parameters:**
- `propertyName` (`java.lang.String`): The property name. One of the following constants:
   
  
    - #ABSOLUTE_URL
  
    - #ID_PATH
  
    - #HREF_VALUE
- `propertyValue` (`java.lang.Object`): The value of the property.

**Returns:** `void`

