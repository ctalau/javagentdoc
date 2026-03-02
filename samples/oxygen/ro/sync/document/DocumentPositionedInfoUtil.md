# Class: `DocumentPositionedInfoUtil`

**Package:** [`ro.sync.document`](README.md)

**Fully Qualified Name:** `ro.sync.document.DocumentPositionedInfoUtil`

## Fields

### `c`

**Type:** `int`

### `b`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `getDpisOfSeverity(List<DocumentPositionedInfo> arg0, int arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)
- `arg1` (`int`)

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `getDpisOfMinimumSeverity(List<DocumentPositionedInfo> arg0, int arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)
- `arg1` (`int`)

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `hasFatalErrors(List<DocumentPositionedInfo> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)

**Returns:** `boolean`

### `hasErrorsOrHigher(List<DocumentPositionedInfo> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)

**Returns:** `boolean`

### `hasWarningsOrHigher(List<DocumentPositionedInfo> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)

**Returns:** `boolean`

### `hasInfosOrHigher(List<DocumentPositionedInfo> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)

**Returns:** `boolean`

### `b(List<DocumentPositionedInfo> arg0, int arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`)
- `arg1` (`int`)

**Returns:** `boolean`

### `mapDPISeverityToValidationRangeSeverityLevel(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `int`

### `getMaskedAndCorrectedURL(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getMessageCSSStyle()`

**Returns:** `java.lang.String`

