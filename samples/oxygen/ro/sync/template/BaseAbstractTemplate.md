# Class: `BaseAbstractTemplate`

**Package:** [`ro.sync.template`](README.md)

**Fully Qualified Name:** `ro.sync.template.BaseAbstractTemplate`

**Implements:** [`ro.sync.exml.editor.EditorTemplate`](../exml/editor/EditorTemplate.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `SMALL_ICON`

**Type:** `java.lang.String`

### `BIG_ICON`

**Type:** `java.lang.String`

### `LONG_DESC_REF`

**Type:** `java.lang.String`

### `TYPE`

**Type:** `java.lang.String`

### `FILENAME_PREFIX`

**Type:** `java.lang.String`

### `FILENAME_SUFFIX`

**Type:** `java.lang.String`

### `DISPLAY_NAME`

**Type:** `java.lang.String`

### `EXPAND_ED_VARS_INCLUDE_FILTER`

**Type:** `java.lang.String`

### `EXPAND_ED_VARS_EXCLUDE_FILTER`

**Type:** `java.lang.String`

### `sourceInformation`

**Type:** `java.lang.String`

### `isFromFrameworks`

**Type:** `boolean`

### `smallIconPath`

**Type:** `java.lang.String`

### `bigIconPath`

**Type:** `java.lang.String`

### `longDescriptionProvider`

**Type:** `ro.sync.template.e`

### `typeProperty`

**Type:** `java.lang.String`

### `filenamePrefix`

**Type:** `java.lang.String`

### `filenameSuffix`

**Type:** `java.lang.String`

### `displayName`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

## Methods

### `getTemplateType(java.io.File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `int`

### `getTemplateType(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `int`

### `setMainProperties(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)

**Returns:** `void`

### `getTemplateFileName()`

**Returns:** `java.lang.String`

### `getExtension()`

**Returns:** `java.lang.String`

### `getDescription()`

**Returns:** `java.lang.String`

### `getName()`

**Returns:** `java.lang.String`

### `getAdditionalInformation()`

**Returns:** `java.lang.String`

### `isFromFrameworks()`

**Returns:** `boolean`

### `isCustomizable()`

**Returns:** `boolean`

### `getCustomizePageID()`

**Returns:** `java.lang.String`

### `getSmallIconPath()`

**Returns:** `java.lang.String`

### `getBigIconPath()`

**Returns:** `java.lang.String`

### `getCaretPosition()`

**Returns:** `int`

### `getNotPersistentFieldNames()`

**Returns:** `java.lang.String[]`

### `getLongDescription()`

**Returns:** `java.lang.String`

### `setLongDescriptionProvider(ro.sync.template.e arg0, ro.sync.template.BaseAbstractTemplate arg1)`

**Parameters:**
- `arg0` (`ro.sync.template.e`)
- `arg1` ([`ro.sync.template.BaseAbstractTemplate`](./BaseAbstractTemplate.md))

**Returns:** `void`

### `getTypeProperty()`

**Returns:** `java.lang.String`

### `getFilenamePrefix()`

**Returns:** `java.lang.String`

### `getFilenameSuffix()`

**Returns:** `java.lang.String`

### `clone()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

