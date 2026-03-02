# Class: `SpellCheckingProblemInfoWithSuggestions`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.SpellCheckingProblemInfoWithSuggestions`

**Extends:** [`ro.sync.ecss.extensions.api.SpellCheckingProblemInfo`](./SpellCheckingProblemInfo.md)

## Description

## Fields

### `UNSPECIFIED_ERROR_CODE`

**Type:** `int`

## Constructors

### `<init>(int startOffset, int endOffset, java.lang.String lang, java.lang.String word, java.util.List<java.lang.String> suggestions)`

**Parameters:**
- `startOffset` (`int`): The start offset of the word.
- `endOffset` (`int`): The end offset of the word.
- `lang` (`java.lang.String`): ISO Name for the language of the word.
- `word` (`java.lang.String`): The word found at the offsets.
- `suggestions` (`java.util.List<java.lang.String>`): List of suggestions, should not be null.

### `<init>(int startOffset, int endOffset, java.lang.String lang, java.lang.String word, java.util.List<java.lang.String> suggestions, ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes errorType, java.lang.String errorMessage)`

**Parameters:**
- `startOffset` (`int`): The start offset of the word.
- `endOffset` (`int`): The end offset of the word.
- `lang` (`java.lang.String`): ISO Name for the language of the word.
- `word` (`java.lang.String`): The word found at the offsets.
- `suggestions` (`java.util.List<java.lang.String>`): List of suggestions, should not be null.
- `errorType` ([`ro.sync.ecss.extensions.api.webapp.WebAuthorSpellcheckErrorTypes`](webapp/WebAuthorSpellcheckErrorTypes.md)): The error type.
- `errorMessage` (`java.lang.String`): Error message for the word.

## Methods

### `checkNotNull(java.util.List<java.lang.String> suggestions)`

**Parameters:**
- `suggestions` (`java.util.List<java.lang.String>`): The suggestions.

**Returns:** `java.util.List<java.lang.String>`

