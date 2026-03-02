# Class: `InvalidEditException`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.InvalidEditException`

**Extends:** `java.lang.Exception`

## Description

## Fields

### `presentToUser`

**Type:** `boolean`

### `title`

**Type:** `java.lang.String`

### `htmlMessage`

**Type:** `java.lang.String`

### `showLinkToSchemaAwarePreferences`

**Type:** `boolean`

## Constructors

### `<init>(java.lang.String title, java.lang.String description, boolean presentToUser, boolean showLinkToSchemaAwarePreferences)`

**Parameters:**
- `title` (`java.lang.String`): Title to be presented to the user.
- `description` (`java.lang.String`): Error message.
- `presentToUser` (`boolean`): `true` if the error message must be presented to the user.
- `showLinkToSchemaAwarePreferences` (`boolean`): If `true` when the error message is presented to the user a link
 to the Schema Aware preference page will be added.

### `<init>(java.lang.String title, java.lang.String description, boolean presentToUser)`

**Parameters:**
- `title` (`java.lang.String`): Title to be presented to the user.
- `description` (`java.lang.String`): Error message.
- `presentToUser` (`boolean`): `true` if the error message must be presented to the user.

### `<init>(java.lang.String title, java.lang.String description, java.lang.Throwable cause, boolean presentToUser)`

**Parameters:**
- `title` (`java.lang.String`): Title to be presented to the user.
- `description` (`java.lang.String`): Error message.
- `cause` (`java.lang.Throwable`): The exception cause. A null value is
         permitted, and indicates that the cause is nonexistent or
         unknown.
- `presentToUser` (`boolean`): `true` if the error message must be presented to the user.

## Methods

### `isPresentToUser()`

**Returns:** `boolean`

### `getTitle()`

**Returns:** `java.lang.String`

### `setHtmlMessage(java.lang.String htmlMessage)`

**Returns:** `void`

**Parameters:**
- `htmlMessage` (`java.lang.String`): An error message that uses HTML elements for styling.

### `getHtmlMessage()`

**Returns:** `java.lang.String`

### `setShowLinkToSchemaAwarePreferences(boolean showLinkToSchemaAwarePreferences)`

**Returns:** `void`

**Parameters:**
- `showLinkToSchemaAwarePreferences` (`boolean`): The showLinkToSchemaAwarePreferences to set.

### `isShowLinkToSchemaAwarePreferences()`

**Returns:** `boolean`

### `setPresentToUser(boolean presentToUser)`

**Returns:** `void`

**Parameters:**
- `presentToUser` (`boolean`): The presentToUser to set.

