# Interface: `Dictionary`

**Package:** [`ro.sync.exml.workspace.api.spell`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.spell.Dictionary`

## Description

## Methods

### `isLearned(java.lang.String lang, java.lang.String word)`

**Returns:** `boolean`

**Parameters:**
- `lang` (`java.lang.String`): The language code, may be null. 
 The language will be determined from the nearest ancestor with xml:lang attribute, 
 otherwise will default to the user's interface language.
 Respects the xml:lang encoding (http://www.w3.org/TR/REC-xml/)
 Ex: "en", "en-GB", "en-US"
- `word` (`java.lang.String`): The word to check.

### `isForbidden(java.lang.String lang, java.lang.String word)`

**Returns:** `boolean`

**Parameters:**
- `lang` (`java.lang.String`): The language code, may be null. 
 The language will be determined from the nearest ancestor with xml:lang attribute, 
 otherwise will default to the user's interface language.
 Respects the xml:lang encoding (http://www.w3.org/TR/REC-xml/)
 Ex: "en", "en-GB", "en-US"
- `word` (`java.lang.String`): The word to check.

### `getSuggestions(java.lang.String lang, java.lang.String word)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `lang` (`java.lang.String`): The language code, may be null. 
 The language will be determined from the nearest ancestor with xml:lang attribute, 
 otherwise will default to the user's interface language.
 Respects the xml:lang encoding (http://www.w3.org/TR/REC-xml/)
 Ex: "en", "en-GB", "en-US"
- `word` (`java.lang.String`): The word to check.

