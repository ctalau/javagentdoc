# Interface: `WebappSpellchecker`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappSpellchecker`

## Description

## Methods

### `getSuggestionsForWordAtPosition(`int` position)`

**Returns:** [`ro.sync.ecss.extensions.api.SpellSuggestionsInfo`](../SpellSuggestionsInfo.md)

### `replaceWithSuggestion(`int` startOffset, `int` endOffset, `java.lang.String` newWord)`

**Returns:** `void`

### `getTextDescriptors(`int` startOffset, `int` endOffset)`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.util.TextChunkDescriptor>`

### `check(`java.util.List<ro.sync.exml.workspace.api.util.TextChunkDescriptor>` textDescriptors)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.SpellCheckingProblemInfo>`

This method is thread-safe. Can be called on multiple threads and can also be called while 
 other threads are modifying the document.

### `getTermsDictionary()`

**Returns:** [`ro.sync.exml.workspace.api.spell.Dictionary`](../../../../exml/workspace/api/spell/Dictionary.md)

### `setTermsDictionary([`ro.sync.exml.workspace.api.spell.Dictionary`](../../../../exml/workspace/api/spell/Dictionary.md) apiDict)`

**Returns:** `void`

### `setDefaultLanguage(`java.lang.String` lang)`

**Returns:** `void`

Examples of format: **en_US**, **fr_FR**, **de_DE**, **jp_JP**, **it_IT**, **nl_NL**

### `setSpellcheckingEngine(`java.lang.String` lang, [`ro.sync.ecss.extensions.api.webapp.SpellcheckingEngine`](./SpellcheckingEngine.md) checker)`

**Returns:** `void`

Examples of language format: **en_US**, **fr_FR**, **de_DE**, **jp_JP**, **it_IT**, **nl_NL**

