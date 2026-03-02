# Class: `SAIDElementsCustomizer`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.SAIDElementsCustomizer`

## Description

It is used on standalone implementation.

## Constructors

### `<init>()`

## Methods

### `customizeIDElements(AuthorAccess authorAccess, GenerateIDElementsInfo autoIDElementsInfo, String listMessage)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to author functionality.
- `autoIDElementsInfo` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Information about for what elements should IDs be generated.
- `listMessage` (`java.lang.String`): The label used on the dialog before the list

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `customizeIDElements(AuthorAccess authorAccess, GenerateIDElementsInfo autoIDElementsInfo, String listMessage, String helpPageID)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to author functionality.
- `autoIDElementsInfo` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Information about for what elements should IDs be generated.
- `listMessage` (`java.lang.String`): The label used on the dialog before the list
- `helpPageID` (`java.lang.String`): The ID of the help page which will be opened when users invoke help in the dialog.

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `customizeIDElements(AuthorAccess authorAccess, GenerateIDElementsInfo autoIDElementsInfo, String listMessage, String helpPageID, boolean isDocBook)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to author functionality.
- `autoIDElementsInfo` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Information about for what elements should IDs be generated.
- `listMessage` (`java.lang.String`): The label used on the dialog before the list
- `helpPageID` (`java.lang.String`): The ID of the help page which will be opened when users invoke help in the dialog.
- `isDocBook` (`boolean`): `true` if we are in DocBook.

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

