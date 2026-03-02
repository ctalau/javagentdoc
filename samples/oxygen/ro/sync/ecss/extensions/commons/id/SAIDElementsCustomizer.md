# Class: `SAIDElementsCustomizer`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.SAIDElementsCustomizer`

## Description

It is used on standalone implementation.

## Constructors

### `<init>()`

## Methods

### `customizeIDElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo autoIDElementsInfo, java.lang.String listMessage)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to author functionality.
- `autoIDElementsInfo` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Information about for what elements should IDs be generated.
- `listMessage` (`java.lang.String`): The label used on the dialog before the list

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `customizeIDElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo autoIDElementsInfo, java.lang.String listMessage, java.lang.String helpPageID)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to author functionality.
- `autoIDElementsInfo` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Information about for what elements should IDs be generated.
- `listMessage` (`java.lang.String`): The label used on the dialog before the list
- `helpPageID` (`java.lang.String`): The ID of the help page which will be opened when users invoke help in the dialog.

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `customizeIDElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo autoIDElementsInfo, java.lang.String listMessage, java.lang.String helpPageID, boolean isDocBook)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to author functionality.
- `autoIDElementsInfo` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Information about for what elements should IDs be generated.
- `listMessage` (`java.lang.String`): The label used on the dialog before the list
- `helpPageID` (`java.lang.String`): The ID of the help page which will be opened when users invoke help in the dialog.
- `isDocBook` (`boolean`): `true` if we are in DocBook.

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

