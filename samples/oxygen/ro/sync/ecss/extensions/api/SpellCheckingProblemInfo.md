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

### `<init>(int startOffset, int endOffset, int errorCode, String lang, String word)`

**Parameters:**
- `startOffset` (`int`): Word start position.
- `endOffset` (`int`): Word end position.
- `errorCode` (`int`): Error code result from spellchecking.
- `lang` (`java.lang.String`): ISO Name for the language of the word.
- `word` (`java.lang.String`): Word between the offsets.

### `<init>(int startOffset, int endOffset, int errorCode, String lang, String word, List<String> suggestions)`

**Parameters:**
- `startOffset` (`int`): Word start position.
- `endOffset` (`int`): Word end position.
- `errorCode` (`int`): Error code result from spellchecking.
- `lang` (`java.lang.String`): ISO Name for the language of the word.
- `word` (`java.lang.String`): Word between the offsets.
- `suggestions` (`java.util.List<java.lang.String>`): The suggestions for the word.

### `<init>(int startOffset, int endOffset, int errorCode, String lang, String word, List<String> suggestions, WebAuthorSpellcheckErrorTypes errorType, String errorMessage)`

**Parameters:**
- `startOffset` (`int`): Word start position.
- `endOffset` (`int`): Word end position.
- `errorCode` (`int`): Error code result from spellchecking.
- `lang` (`java.lang.String`): ISO Name for the language of the word.
- `word` (`java.lang.String`): Word between the offsets.
- `suggestions` (`java.util.List<java.lang.String>`): The suggestions for the word.
- `errorType` ([`ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes`](webapp/WebAuthorSpellcheckErrorTypes.md)): The error type.
- `errorMessage` (`java.lang.String`): Error message for the word.

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

Custom spell checking engines may provide suggestions on detection.

**Returns:** `java.util.List<java.lang.String>`

### `getErrorMessage()`

**Returns:** `java.lang.String`

### `getErrorType()`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes`](webapp/WebAuthorSpellcheckErrorTypes.md)

