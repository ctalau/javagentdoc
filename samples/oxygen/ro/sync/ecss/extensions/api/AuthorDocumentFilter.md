# Class: `AuthorDocumentFilter`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorDocumentFilter`

## Description

When the `AuthorDocument`
 is modified through the methods from the `AuthorDocumentController`, 
 the appropriate method invocation is forwarded to the `AuthorDocumentFilter`. 
 The default implementation allows the modification to
 occur. Subclasses can filter the modifications by conditionally invoking
 methods on the superclass, or invoking the necessary methods on
 the passed in `AuthorDocumentFilterBypass`. 
 
**Warning: Subclasses should NOT call back
 into the AuthorDocumentController for modifications in the document
 instead call into the superclass or the `AuthorDocumentFilterBypass`!**
 

 When methods are invoked on the `AuthorDocumentFilter`, the 
 `AuthorDocumentFilter` may callback into the
 `AuthorDocumentFilterBypass` multiple times, or for different regions, but
 it should not callback into the `AuthorDocumentFilterBypass` after returning
 from the initially called method.
 
  
If you are working with framework level API, a good place to add an AuthorDocumentFilter in on AuthorExtensionStateListener#activated(AuthorAccess) notification.
  
If you are working with plugin level API you can add an AuthorDocumentFilter in an Workspace Access plugin:
  

```

   public void applicationStarted(final StandalonePluginWorkspace pluginWorkspaceAccess) {
    pluginWorkspaceAccess.addEditorChangeListener(
        new WSEditorChangeListener() {
          public void editorOpened(URL editorLocation) {
            WSEditor editorAccess = pluginWorkspaceAccess.getEditorAccess(editorLocation, PluginWorkspace.MAIN_EDITING_AREA);
            WSEditorPage currentPage = editorAccess.getCurrentPage();
            if (currentPage instanceof WSAuthorEditorPage) {
              WSAuthorEditorPage authorEditorPage = (WSAuthorEditorPage) currentPage;
              authorEditorPage.getAuthorAccess().getDocumentController().setDocumentFilter(authorDocumentFilter);
            }
            // It's also a good idea to listener for page changes on the editor.
            // Perhaps the editor opens in the text page and the user switches later on to author.
            editorAccess.addPageChangedListener(new WSEditorPageChangedListener() {
              public void editorPageChanged() {
                // Same code here to add the filter.
              }
            });
          }
        },
        PluginWorkspace.MAIN_EDITING_AREA);
  
```

## Constructors

### `<init>()`

## Methods

### `insertText(AuthorDocumentFilterBypass filterBypass, int offset, String toInsert)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `offset` (`int`): The offset where the text will be inserted. 0 based.
- `toInsert` (`java.lang.String`): The text to be inserted.

**Returns:** `void`

### `insertFragment(AuthorDocumentFilterBypass filterBypass, int offset, AuthorDocumentFragment frag)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `offset` (`int`): The offset where the fragment will be inserted. 0 based.
- `frag` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The AuthorDocumentFragment to be inserted.

**Returns:** `void`

### `insertNode(AuthorDocumentFilterBypass filterBypass, int offset, AuthorNode node)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `offset` (`int`): The offset where the node should be inserted. 0 based.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to be inserted.

**Returns:** `boolean`

### `insertMultipleElements(AuthorDocumentFilterBypass filterBypass, AuthorElement parentElement, String[] elementNames, int[] offsets, String namespace)`

Note: *The offsets and elements are in document order and this rule must also be followed
 by the filter processing.*
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The parent element that contains all the new inserted 
   elements.
- `elementNames` (`java.lang.String[]`): The element names to be inserted.
- `offsets` (`int[]`): The absolute offsets where the elements will be inserted. 0 based.
- `namespace` (`java.lang.String`): The namespace of the new inserted elements.

**Returns:** `void`

### `insertMultipleFragments(AuthorDocumentFilterBypass filterBypass, AuthorElement parentElement, AuthorDocumentFragment[] fragments, int[] offsets)`

Note: *The offsets and fragments are in document order and this rule must also be followed
 by the filter processing.*
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The parent element that contains all the new inserted 
   elements.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): The fragments to be inserted.
- `offsets` (`int[]`): The absolute offsets where the fragments will be inserted. 0 based.

**Returns:** `boolean`

### `delete(AuthorDocumentFilterBypass filterBypass, int startOffset, int endOffset, boolean withBackspace)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `startOffset` (`int`): Start offset of the fragment, 0 based and inclusive.
- `endOffset` (`int`): End offset of the fragment, 0 based and inclusive.
- `withBackspace` (`boolean`): `true` if `BACKSPACE` key was used for deleting the fragment.

**Returns:** `boolean`

### `deleteNode(AuthorDocumentFilterBypass filterBypass, AuthorNode node)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to delete.

**Returns:** `boolean`

### `multipleDelete(AuthorDocumentFilterBypass filterBypass, AuthorElement parentElement, int[] startOffsets, int[] endOffsets)`

Note: *The offsets must be in document order and the intervals must not 
 intersect with each other. This rule must also be followed by the filter processing.*
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element that contains all the deleted intervals.
- `startOffsets` (`int[]`): The start offset for each interval.
   Must be in document order. 0 based and inclusive.
- `endOffsets` (`int[]`): The end offset for each interval.
   Must be in document order. 0 based and inclusive.

**Returns:** `void`

### `renameElement(AuthorDocumentFilterBypass filterBypass, AuthorElement element, String newName, Object infoProvider)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement that is renamed.
- `newName` (`java.lang.String`): The new name for the element.
- `infoProvider` (`java.lang.Object`): Information provider used for internal processing. It must NOT be altered inside this 
   AuthorDocumentFilter method.

**Returns:** `void`

### `setAttribute(AuthorDocumentFilterBypass filterBypass, String attributeName, AttrValue value, AuthorElement element)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `attributeName` (`java.lang.String`): Name of the attribute being changed.
- `value` ([`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md)): New AttrValue for the attribute. If `null`, the attribute is 
   removed from the element.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute we are editing.

**Returns:** `void`

### `removeAttribute(AuthorDocumentFilterBypass filterBypass, String attributeName, AuthorElement element)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `attributeName` (`java.lang.String`): Name of the attribute to remove.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute will be removed.

**Returns:** `void`

### `split(AuthorDocumentFilterBypass filterBypass, AuthorNode toSplit, int splitOffset)`

The node to split is the first ancestor block level node containing the
 `splitOffset`.
 The attributes of the splitted node will also be copied excepting the 
 unique ones. The unique attributes are identified by the UniqueAttributesRecognizer.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `toSplit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to split.
- `splitOffset` (`int`): The split offset. The given offset is greater or equal 
   to 1 and less than the current document length.

**Returns:** `boolean`

### `surroundWithNode(AuthorDocumentFilterBypass filterBypass, AuthorNode node, int startOffset, int endOffset, boolean leftToRight)`

The fragment between the start and end offsets will become the node actual content.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that will surround the fragment.
- `startOffset` (`int`): Start offset of the surrounded fragment. 0 based and inclusive.
- `endOffset` (`int`): End offset of the surrounded fragment. 0 based and inclusive.
- `leftToRight` (`boolean`): `true` if after the operation the selection 
   in the author page is done from the left to the right.

**Returns:** `void`

### `surroundInFragment(AuthorDocumentFilterBypass filterBypass, String xmlFragment, int startOffset, int endOffset)`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `xmlFragment` (`java.lang.String`): The XML fragment which will surround the given interval.
   The first leaf node of the XML fragment will be the parent of the surrounded content.
- `startOffset` (`int`): The start offset of the content to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the content to be surrounded, 0 based and inclusive.

**Returns:** `void`

### `surroundInFragment(AuthorDocumentFilterBypass filterBypass, AuthorDocumentFragment xmlFragment, int startOffset, int endOffset)`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `xmlFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The XML fragment which will surround the given interval.
   The first leaf node of the XML fragment will be the parent of the surrounded content.
- `startOffset` (`int`): The start offset of the content to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the content to be surrounded, 0 based and inclusive.

**Returns:** `void`

### `surroundInText(AuthorDocumentFilterBypass filterBypass, String header, String footer, int startOffset, int endOffset)`

The method inserts the `header` at `startOffset` and 
 the `footer` at `endOffset`.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `header` (`java.lang.String`): The header to be inserted before the surrounded text.
- `footer` (`java.lang.String`): The footer to be inserted after the surrounded text.
- `startOffset` (`int`): The start offset of the text to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the text to be surrounded, 0 based and inclusive.

**Returns:** `void`

### `setDoctype(AuthorDocumentFilterBypass filterBypass, AuthorDocumentType docType)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `docType` ([`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md)): The document type information to set.

**Returns:** `void`

### `setMultipleDistinctAttributes(AuthorDocumentFilterBypass filterBypass, int parentElementStartOffset, int[] elementOffsets, List<Map<String,AttrValue>> attributes)`

Attributes set in this manner will be subject to undo/redo.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `parentElementStartOffset` (`int`): The start offset of the parent element.
- `elementOffsets` (`int[]`): The start offset for each element.
- `attributes` (`java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>>`): The list with attributes. Every attribute name is mapped to 
   an AttrValue object. If the value is `null`, the attribute will
   be removed.

**Returns:** `void`

### `setMultipleAttributes(AuthorDocumentFilterBypass filterBypass, int parentElementStartOffset, int[] elementOffsets, Map<String,AttrValue> attributes)`

Attributes set in this manner will be subject to undo/redo.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `parentElementStartOffset` (`int`): The start offset of the parent element.
- `elementOffsets` (`int[]`): The start offset for each element.
- `attributes` (`java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>`): The list with attributes. Every attribute name is mapped to 
   an AttrValue object. If the value is `null`, the attribute will
   be removed.

**Returns:** `void`

### `removeMarker(AuthorDocumentFilterBypass filterBypass, AuthorPersistentHighlight marker)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `marker` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)): The persistent marker to remove.

**Returns:** `boolean`

### `addCommentMarker(AuthorDocumentFilterBypass filterBypass, int startOffset, int endOffset, String comment, String parentID)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `startOffset` (`int`): Start offset of marker
- `endOffset` (`int`): End offset of marker
- `comment` (`java.lang.String`): The comment to be added.
- `parentID` (`java.lang.String`): The comment parent id (not `null` for replies).

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

### `addPersistentMarker(AuthorDocumentFilterBypass filterBypass, AuthorPersistentHighlight.PersistentHighlightType type, int startOffset, int endOffset, Map<String,String> properties)`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

**Parameters:**
- `filterBypass` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md)): The document filter bypass used for executing operations directly,
   without additional filtering.
- `type` (`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType`): The persistent marker type (comment or custom)
- `startOffset` (`int`): Start offset of marker
- `endOffset` (`int`): End offset of marker
- `properties` (`java.util.Map<java.lang.String,java.lang.String>`): The comment properties. See ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightConstants for 
                          properties that are meaningful in Oxygen.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

