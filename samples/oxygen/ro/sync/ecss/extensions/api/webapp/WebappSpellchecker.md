# Interface: `WebappSpellchecker`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappSpellchecker`

## Description

## Methods

### `getSuggestionsForWordAtPosition(int position)`

**Returns:** [`ro.sync.ecss.extensions.api.SpellSuggestionsInfo`](../SpellSuggestionsInfo.md)

**Parameters:**
- `position` (`int`): Position in the document.

### `replaceWithSuggestion(int startOffset, int endOffset, java.lang.String newWord)`

**Returns:** `void`

**Parameters:**
- `startOffset` (`int`): Start offset for replacement.
- `endOffset` (`int`): End offset for replacement.
- `newWord` (`java.lang.String`): Word to be inserted.

### `getTextDescriptors(int startOffset, int endOffset)`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.util.TextChunkDescriptor>`

**Parameters:**
- `startOffset` (`int`): The start offset.
- `endOffset` (`int`): The end offset.

### `check(java.util.List<ro.sync.exml.workspace.api.util.TextChunkDescriptor> textDescriptors)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.SpellCheckingProblemInfo>`

This method is thread-safe. Can be called on multiple threads and can also be called while 
 other threads are modifying the document.

**Parameters:**
- `textDescriptors` (`java.util.List<ro.sync.exml.workspace.api.util.TextChunkDescriptor>`): The text descriptors.

### `getTermsDictionary()`

**Returns:** [`ro.sync.exml.workspace.api.spell.Dictionary`](../../../../exml/workspace/api/spell/Dictionary.md)

### `setTermsDictionary(ro.sync.exml.workspace.api.spell.Dictionary apiDict)`

**Returns:** `void`

**Parameters:**
- `apiDict` ([`ro.sync.exml.workspace.api.spell.Dictionary`](../../../../exml/workspace/api/spell/Dictionary.md)): The terms dictionary to set.

### `setDefaultLanguage(java.lang.String lang)`

**Returns:** `void`

Examples of format: **en_US**, **fr_FR**, **de_DE**, **jp_JP**, **it_IT**, **nl_NL**

**Parameters:**
- `lang` (`java.lang.String`): The language used to be used for spell checking.

### `setSpellcheckingEngine(java.lang.String lang, ro.sync.ecss.extensions.api.webapp.SpellcheckingEngine checker)`

**Returns:** `void`

Examples of language format: **en_US**, **fr_FR**, **de_DE**, **jp_JP**, **it_IT**, **nl_NL**

**Parameters:**
- `lang` (`java.lang.String`): The language to be handled by the spell checking engine.
- `checker` ([`ro.sync.ecss.extensions.api.webapp.SpellcheckingEngine`](./SpellcheckingEngine.md)): The spell checking engine to be used for the language.

