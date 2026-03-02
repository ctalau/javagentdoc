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

### `<init>(java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo> categories)`

This constructor will consider that table tab should be selected when the 
 "Table Properties" dialog is shown.

**Parameters:**
- `categories` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`): The properties that will be edited in the table properties 
 for the given element. The element will be also the tab name in the dialog.

### `<init>(java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo> categories, ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE selectedTab)`

**Parameters:**
- `categories` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`): The properties that will be edited in the table properties 
 for the given element. The element will be also the tab name in the dialog.
- `selectedTab` (`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`): The tab that is selected when the dialog is shown.

## Methods

### `getCategories()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getSelectedTab()`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

