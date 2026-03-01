# Class: `SpellCheckingProblemInfo`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.SpellCheckingProblemInfo`

## Description

## Fields

### `startOffset`

**Type:** `int`

### `endOffset`

**Type:** `int`

### `errorCode`

**Type:** `int`

### `languageIsoName`

**Type:** `java.lang.String`

### `word`

**Type:** `java.lang.String`

### `suggestions`

**Type:** `java.util.List<java.lang.String>`

### `errorType`

**Type:** [`ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes`](webapp/WebAuthorSpellcheckErrorTypes.md)

### `errorMessage`

**Type:** `java.lang.String`

## Constructors

### `<init>(`int` startOffset, `int` endOffset, `int` errorCode, `java.lang.String` lang, `java.lang.String` word)`

### `<init>(`int` startOffset, `int` endOffset, `int` errorCode, `java.lang.String` lang, `java.lang.String` word, `java.util.List<java.lang.String>` suggestions)`

### `<init>(`int` startOffset, `int` endOffset, `int` errorCode, `java.lang.String` lang, `java.lang.String` word, `java.util.List<java.lang.String>` suggestions, [`ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes`](webapp/WebAuthorSpellcheckErrorTypes.md) errorType, `java.lang.String` errorMessage)`

## Methods

### `getStartOffset()`

**Returns:** `int`

### `getEndOffset()`

**Returns:** `int`

### `getErrorCode()`

**Returns:** `int`

### `getLanguageIsoName()`

**Returns:** `java.lang.String`

### `getWord()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

### `getSuggestions()`

**Returns:** `java.util.List<java.lang.String>`

Custom spell checking engines may provide suggestions on detection.

### `getErrorMessage()`

**Returns:** `java.lang.String`

### `getErrorType()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes`](webapp/WebAuthorSpellcheckErrorTypes.md)

