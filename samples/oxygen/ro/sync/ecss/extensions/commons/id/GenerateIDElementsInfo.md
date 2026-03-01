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

### `<init>([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) defaultOptions)`

### `<init>(`boolean` autoGenerateIds, `java.lang.String` idGenerationPattern, `java.lang.String[]` elementsWithIDGeneration)`

### `<init>(`boolean` autoGenerateIds, `java.lang.String` idGenerationPattern, `java.lang.String[]` elementsWithIDGeneration, `boolean` filterIDsOnCopy)`

## Methods

### `getIDGenerationElements([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) defaultOptions)`

**Returns:** `java.lang.String[]`

### `getIdGenerationPattern([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) defaultOptions)`

**Returns:** `java.lang.String`

### `isAutoGenerateIDs([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) defaultOptions)`

**Returns:** `boolean`

### `isFilterIDs([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md) defaultOptions)`

**Returns:** `boolean`

### `splitStrings(`java.lang.String` optionsString)`

**Returns:** `java.lang.String[]`

### `isAutoGenerateIDs()`

**Returns:** `boolean`

### `isFilterIDsOnCopy()`

**Returns:** `boolean`

### `getIdGenerationPattern()`

**Returns:** `java.lang.String`

### `getElementsWithIDGeneration()`

**Returns:** `java.lang.String[]`

### `saveToOptions([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `getElementsAsOptionsString()`

**Returns:** `java.lang.String`

### `generateID(`java.lang.String` idGenerationPattern, `java.lang.String` elementLocalName)`

**Returns:** `java.lang.String`

### `generateID(`java.lang.String` idGenerationPattern, `java.lang.String` elementLocalName, `java.lang.String` editorLocation)`

**Returns:** `java.lang.String`

### `replaceAll(`java.lang.String` original, `java.lang.String` match, `java.lang.String` toReplaceWith)`

**Returns:** `java.lang.String`

### `setAutoGenerateIds(`boolean` autoGenerateIds)`

**Returns:** `void`

### `setElementsWithIDGeneration(`java.lang.String[]` elementsWithIDGeneration)`

**Returns:** `void`

### `setRemoveIDsOnCopy(`boolean` removeIDsOnCopy)`

**Returns:** `void`

### `setIdGenerationPattern(`java.lang.String` idGenerationPattern)`

**Returns:** `void`

### `getPatternTooltip()`

**Returns:** `java.lang.String`

Can be overwritten to provide another tooltip.

### `setPatternTooltip(`java.lang.String` patternTooltip)`

**Returns:** `void`

### `loadDefaultsFromConfiguration([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` proposedXMLResourceName)`

**Returns:** [`ro.sync.ecss.extensions.commons.id.GenerateIDElementsInfo`](./GenerateIDElementsInfo.md)

### `getAttrQname()`

**Returns:** `java.lang.String`

