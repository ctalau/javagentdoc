# Interface: `AuthorPersistentHighlight`

**Package:** [`ro.sync.ecss.extensions.api.highlights`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`

**Extends:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightConstants`](./AuthorPersistentHighlightConstants.md)

## Description

The Author Persistent Highlight has one of the following types defined in 
 PersistentHighlightType:
 

 - 
 PersistentHighlightType#CUSTOM_HIGHLIGHT represents the `Custom defined 
 highlights` that can be managed by using the AuthorPersistentHighlighter.
 The name of the processing instruction markers corresponding to this type of highlight are
 `oxy_custom_start` and `oxy_custom_end`
 

 - 
 PersistentHighlightType#COMMENT represents the `Comment highlights`
 which get serialized using the `oxy_comment_start` and 
 `oxy_comment_end` processing instruction names.
 

 - 
 PersistentHighlightType#CHANGE_INSERT represents the `Insert 
 highlight from Change Tracking`, with the `oxy_insert_start`
 and `oxy_insert_end` corresponding processing instruction names.
 

 - 
 PersistentHighlightType#CHANGE_DELETE represents the `Delete 
 highlight from Change Tracking`, which get serialized by using the 
 `oxy_delete` processing instruction name.
 

 

 

 The `Comment`, `Insert` and `Delete` 
 persistent highlights can be accessed and customized by using the 
 AuthorReviewController.

## Methods

### `getStartOffset()`

**Returns:** `int`

### `getEndOffset()`

**Returns:** `int`

**Note:** empty persistent highlights have `startOffset == endOffset & isEmpty() == true`

### `getClonedProperties()`

**Returns:** `java.util.LinkedHashMap<java.lang.String,java.lang.String>`

The properties can contain 
 details about the highlight author or the highlight modification timestamp, 
 depending on the highlight type:
 

 

 - The properties names for *change tracking highlights* are:
 AuthorPersistentHighlightConstants#AUTHOR_NAME_ATTRIBUTE,
 AuthorPersistentHighlightConstants#MODIFICATION_TIME
 

 - For *comment highlights* the properties names are: 
 AuthorPersistentHighlightConstants#AUTHOR_NAME_ATTRIBUTE,
 AuthorPersistentHighlightConstants#MODIFICATION_TIME,  
 AuthorPersistentHighlightConstants#COMMENT_ATTRIBUTE and 
 AuthorPersistentHighlightConstants#COMMENT_PARENT_ID (if it is a reply)

 - Both *comment highlights* and *insert and delete highlights* 
 can also have the AuthorPersistentHighlightConstants#COMMENT_ID property 
 set
 

 - The properties for *custom persistent highlights* are specified 
 when the highlight is added (@see AuthorPersistentHighlighter#addHighlight(int, int, LinkedHashMap)) 
 and can be changed using the AuthorPersistentHighlighter#setProperties(AuthorPersistentHighlight, LinkedHashMap)
 method.

### `getType()`

**Returns:** `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType`

### `isEmpty()`

**Returns:** `boolean`

### `clone(ro.sync.ecss.extensions.api.Content content)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](./AuthorPersistentHighlight.md)

**Parameters:**
- `content` ([`ro.sync.ecss.extensions.api.Content`](../Content.md)): The new content in which to clone the current highlight.

### `getPropertiesIterator()`

**Returns:** `java.util.Iterator<java.util.Map.Entry<java.lang.String,java.lang.String>>`

### `getProperty(java.lang.String key)`

**Returns:** `java.lang.String`

**Parameters:**
- `key` (`java.lang.String`): The property key.

