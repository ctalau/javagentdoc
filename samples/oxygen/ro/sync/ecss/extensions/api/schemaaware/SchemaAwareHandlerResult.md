# Interface: `SchemaAwareHandlerResult`

**Package:** [`ro.sync.ecss.extensions.api.schemaaware`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`

**Extends:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResultInsertConstants`](./SchemaAwareHandlerResultInsertConstants.md)

## Description

The user can provide a custom implementation in order to transfer useful information about the 
 event handling.

## Fields

### `TYPE_HANDLE_DELETE_OPERATION`

**Type:** `java.lang.String`

### `TYPE_HANDLE_DELETE_ELEMENT_TAGS_OPERATION`

**Type:** `java.lang.String`

### `TYPE_HANDLE_DELETE_SELECTION_OPERATION`

**Type:** `java.lang.String`

### `TYPE_HANDLE_JOIN_ELEMENTS_OPERATION`

**Type:** `java.lang.String`

### `TYPE_HANDLE_INSERT_FRAGMENT_OPERATION`

**Type:** `java.lang.String`

### `TYPE_HANDLE_TYPING_OPERATION`

**Type:** `java.lang.String`

## Methods

### `getResult(java.lang.String resultId)`

**Parameters:**
- `resultId` (`java.lang.String`): One of the constants defined in this interface.

**Returns:** `java.lang.Object`

### `getType()`

Depending on a result type, different information is available through
 #getResult(String) method.
 Possible values are:
 

 - #TYPE_HANDLE_DELETE_ELEMENT_TAGS_OPERATION for delete element tags operation, 
 see AuthorSchemaAwareEditingHandler#handleDeleteElementTags(ro.sync.ecss.extensions.api.node.AuthorNode, AuthorAccess);

 - #TYPE_HANDLE_DELETE_OPERATION for a keyboard delete operation, 
 see AuthorSchemaAwareEditingHandler#handleDelete(int, int, AuthorAccess, boolean);

 - #TYPE_HANDLE_DELETE_SELECTION_OPERATION for delete selection operation, 
 see AuthorSchemaAwareEditingHandler#handleDeleteSelection(int, int, int, AuthorAccess);

 - #TYPE_HANDLE_JOIN_ELEMENTS_OPERATION for join elements operation, 
 see AuthorSchemaAwareEditingHandler#handleJoinElements(ro.sync.ecss.extensions.api.node.AuthorNode, java.util.List, AuthorAccess);

 - #TYPE_HANDLE_INSERT_FRAGMENT_OPERATION for insert fragment operation, 
 see AuthorSchemaAwareEditingHandler#handlePasteFragment(int, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[], int, AuthorAccess);

 - #TYPE_HANDLE_TYPING_OPERATION for typing operation, 
 see AuthorSchemaAwareEditingHandler#handleTyping(int, char, AuthorAccess).

**Returns:** `java.lang.String`

