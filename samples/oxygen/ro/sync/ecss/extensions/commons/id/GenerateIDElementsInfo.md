# Class: `GenerateIDElementsInfo`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `GENERATE_ID_ELEMENTS_KEY`

**Type:** `java.lang.String`

### `GENERATE_ID_ELEMENTS_ACTIVE_KEY`

**Type:** `java.lang.String`

### `GENERATE_ID_PATTERN_KEY`

**Type:** `java.lang.String`

### `FILTER_IDS_ON_COPY_KEY`

**Type:** `java.lang.String`

### `LOCAL_NAME_PATTERN_MACRO`

**Type:** `java.lang.String`

### `LOCAL_NAME_PATTERN_DESCRIPTION`

**Type:** `java.lang.String`

### `UUID_PATTERN_DESCRIPTION`

**Type:** `java.lang.String`

### `ID_PATTERN_DESCRIPTION`

**Type:** `java.lang.String`

### `DEFAULT_ID_GENERATION_PATTERN`

**Type:** `java.lang.String`

### `PATTERN_TOOLTIP`

**Type:** `java.lang.String`

### `autoGenerateIds`

**Type:** `boolean`

### `idGenerationPattern`

**Type:** `java.lang.String`

### `elementsWithIDGeneration`

**Type:** `java.lang.String[]`

### `removeIDsOnCopy`

**Type:** `boolean`

### `patternTooltip`

**Type:** `java.lang.String`

### `attrQname`

**Type:** `java.lang.String`

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo defaultOptions)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access
- `defaultOptions` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): The default options.

### `<init>(boolean autoGenerateIds, java.lang.String idGenerationPattern, java.lang.String[] elementsWithIDGeneration)`

**Parameters:**
- `autoGenerateIds` (`boolean`): `true` to auto generate IDs.
- `idGenerationPattern` (`java.lang.String`): The pattern for id generation.
- `elementsWithIDGeneration` (`java.lang.String[]`): List of elements for which to generate IDs.

### `<init>(boolean autoGenerateIds, java.lang.String idGenerationPattern, java.lang.String[] elementsWithIDGeneration, boolean filterIDsOnCopy)`

**Parameters:**
- `autoGenerateIds` (`boolean`): `true` to auto generate IDs.
- `idGenerationPattern` (`java.lang.String`): The pattern for id generation.
- `elementsWithIDGeneration` (`java.lang.String[]`): List of elements for which to generate IDs.
- `filterIDsOnCopy` (`boolean`): Filter IDs when copying content in the same file.

## Methods

### `getIDGenerationElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo defaultOptions)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access
- `defaultOptions` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): Default options

### `getIdGenerationPattern(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo defaultOptions)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access
- `defaultOptions` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md))

### `isAutoGenerateIDs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo defaultOptions)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access
- `defaultOptions` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): The default options

### `isFilterIDs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo defaultOptions)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `defaultOptions` ([`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)): The default options.

### `splitStrings(java.lang.String optionsString)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `optionsString` (`java.lang.String`): String read from options with comma separated values

### `isAutoGenerateIDs()`

**Returns:** `boolean`

### `isFilterIDsOnCopy()`

**Returns:** `boolean`

### `getIdGenerationPattern()`

**Returns:** `java.lang.String`

### `getElementsWithIDGeneration()`

**Returns:** `java.lang.String[]`

### `saveToOptions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access

### `getElementsAsOptionsString()`

**Returns:** `java.lang.String`

### `generateID(java.lang.String idGenerationPattern, java.lang.String elementLocalName)`

**Returns:** `java.lang.String`

**Parameters:**
- `idGenerationPattern` (`java.lang.String`): The pattern.
- `elementLocalName` (`java.lang.String`): The element local name

### `generateID(java.lang.String idGenerationPattern, java.lang.String elementLocalName, java.lang.String editorLocation)`

**Returns:** `java.lang.String`

**Parameters:**
- `idGenerationPattern` (`java.lang.String`): The pattern.
- `elementLocalName` (`java.lang.String`): The element local name
- `editorLocation` (`java.lang.String`): Editor location

### `replaceAll(java.lang.String original, java.lang.String match, java.lang.String toReplaceWith)`

**Returns:** `java.lang.String`

**Parameters:**
- `original` (`java.lang.String`): The original string.
- `match` (`java.lang.String`): The match string (not a regular expression)
- `toReplaceWith` (`java.lang.String`): String to replace with

### `setAutoGenerateIds(boolean autoGenerateIds)`

**Returns:** `void`

**Parameters:**
- `autoGenerateIds` (`boolean`): `true` to auto generate IDs.

### `setElementsWithIDGeneration(java.lang.String[] elementsWithIDGeneration)`

**Returns:** `void`

**Parameters:**
- `elementsWithIDGeneration` (`java.lang.String[]`): a list of elements with ID generation

### `setRemoveIDsOnCopy(boolean removeIDsOnCopy)`

**Returns:** `void`

**Parameters:**
- `removeIDsOnCopy` (`boolean`): The filterIDsOnCopy to set.

### `setIdGenerationPattern(java.lang.String idGenerationPattern)`

**Returns:** `void`

**Parameters:**
- `idGenerationPattern` (`java.lang.String`): The idGeneration pattern.

### `getPatternTooltip()`

**Returns:** `java.lang.String`

Can be overwritten to provide another tooltip.

### `setPatternTooltip(java.lang.String patternTooltip)`

**Returns:** `void`

**Parameters:**
- `patternTooltip` (`java.lang.String`): the pattern tooltip which will be shown in the configuration dialog.

### `loadDefaultsFromConfiguration(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String proposedXMLResourceName)`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access
- `proposedXMLResourceName` (`java.lang.String`): The proposed name of the resource from which to load the configuration.

### `getAttrQname()`

**Returns:** `java.lang.String`

