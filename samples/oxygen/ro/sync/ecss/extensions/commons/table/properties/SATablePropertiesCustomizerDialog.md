# Class: `SATablePropertiesCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.SATablePropertiesCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.ui.OKCancelDialog`](../../ui/OKCancelDialog.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)

### `colorThemeUtilities`

**Type:** [`ro.sync.exml.workspace.api.util.ColorThemeUtilities`](../../../../../exml/workspace/api/util/ColorThemeUtilities.md)

## Constructors

### `<init>(Frame parentFrame, AuthorResourceBundle authorResourceBundle, ColorThemeUtilities colorThemeUtilities)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame of the dialog.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The author resource bundle.It is used for translations.
- `colorThemeUtilities` ([`ro.sync.exml.workspace.api.util.ColorThemeUtilities`](../../../../../exml/workspace/api/util/ColorThemeUtilities.md)): The color theme.

## Methods

### `getTablePropertiesInformation(EditedTablePropertiesInfo info)`

**Parameters:**
- `info` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)): The information used to customize the "Table Properties dialog"

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

