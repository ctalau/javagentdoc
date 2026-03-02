# Interface: `AuthorPersistentHighlighter`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlighter`

## Description

## Methods

### `addHighlight(int startOffset, int endOffset, java.util.LinkedHashMap<java.lang.String,java.lang.String> properties)`

The name of the processing instruction markers corresponding to this type of highlight are
 `oxy_custom_start` and `oxy_custom_end`.
 

 The type of the added persistent highlight is PersistentHighlightType#CUSTOM_HIGHLIGHT.

**Parameters:**
- `startOffset` (`int`): Start offset (inclusive).
- `endOffset` (`int`): End offset (inclusive). The highlight end offset must be equal
   or greater than the start offset.
- `properties` (`java.util.LinkedHashMap<java.lang.String,java.lang.String>`): name/value pairs which will get serialized to disk. 
   
  Notes:
  
   1. Each property name must be a valid XML attribute name.
  
   2. Each property value will be escaped to be a valid XML attribute value.
  
   3. In order to change the properties for a highlight you have to use the method: #setProperties(AuthorPersistentHighlight, LinkedHashMap).

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)

### `canAddHighlight(int startOffset, int endOffset)`

If one of these offsets correspond to a read-only context 
 (they are inside a content deleted with track changes, an element set as read-only from 
 CSS or a content generated from expanding a reference) the highlight cannot 
 be inserted and this method returns `false`.
 

 

 A custom persistent highlight can be added by using the 
 #addHighlight(int, int, LinkedHashMap) method. The name of the 
 processing instruction markers corresponding to the custom persistent 
 highlight are `oxy_custom_start` and `oxy_custom_end`.

**Parameters:**
- `startOffset` (`int`): Start offset (inclusive).
- `endOffset` (`int`): End offset (inclusive). The highlight end offset must be equal
   or greater than the start offset.

**Returns:** `boolean`

### `removeHighlight(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): the highlight to remove

**Returns:** `void`

### `removeAllHighlights()`

**Returns:** `void`

### `getHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](./AuthorPersistentHighlight.md)

### `getHighlights(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): The start offset(inclusive).
- `endOffset` (`int`): The end offset (inclusive).

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](./AuthorPersistentHighlight.md)

### `setProperties(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight highlight, java.util.LinkedHashMap<java.lang.String,java.lang.String> newProperties)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)): The highlight for which the properties will be set.
- `newProperties` (`java.util.LinkedHashMap<java.lang.String,java.lang.String>`): The new highlight properties.
   
  Notes:
  
   1. Each property name must be a valid XML attribute name.
   
  
   2. Each property value will be escaped to be a valid XML attribute value.

**Returns:** `void`

### `setHighlightRenderer(ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer renderer)`

**Parameters:**
- `renderer` ([`ro.sync.ecss.extensions.api.highlights.PersistentHighlightRenderer`](./PersistentHighlightRenderer.md)): The renderer defining the way in which the highlights are painted.

**Returns:** `void`

### `setHighlightsActionsProvider(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightActionsProvider provider)`

The actions are currently displayed in the persistent highlights associated callouts popup menu,
 but in future could be also used as actions presented for a highlight in the contextual menu 
 of the main editing area.
 

 The callouts are representations of Track Changes insert and delete highlights, 
 review comment highlights and custom review highlights in Author mode.
 To associate callout information to a custom highlight the 
 AuthorCalloutsController#setCalloutsRenderingInformationProvider(CalloutsRenderingInformationProvider)
 method must be used.

**Parameters:**
- `provider` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightActionsProvider`](./AuthorPersistentHighlightActionsProvider.md)): The highlights callout rendering information provider.

**Returns:** `void`

