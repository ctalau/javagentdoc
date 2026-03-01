# Class: `EditedTablePropertiesInfo`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`

## Description

## Fields

### `categories`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

The keyTab represents the category 
 name and the properties represent a list with TableProperty elements for 
 the given category. The category represents the tab name in the "Table Properties" 
 dialog or the element name/alias for which the properties are edited.

### `selectedTab`

**Type:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

## Constructors

### `<init>(`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>` categories)`

This constructor will consider that table tab should be selected when the 
 "Table Properties" dialog is shown.

### `<init>(`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>` categories, `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE` selectedTab)`

## Methods

### `getCategories()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getSelectedTab()`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

