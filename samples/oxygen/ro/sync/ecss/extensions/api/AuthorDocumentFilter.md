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

### `insertText([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` offset, `java.lang.String` toInsert)`

**Returns:** `void`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `insertFragment([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) frag)`

**Returns:** `void`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `insertNode([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` offset, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `insertMultipleElements([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `java.lang.String[]` elementNames, `int[]` offsets, `java.lang.String` namespace)`

**Returns:** `void`

Note: *The offsets and elements are in document order and this rule must also be followed
 by the filter processing.*
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `insertMultipleFragments([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragments, `int[]` offsets)`

**Returns:** `boolean`

Note: *The offsets and fragments are in document order and this rule must also be followed
 by the filter processing.*
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `delete([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` startOffset, `int` endOffset, `boolean` withBackspace)`

**Returns:** `boolean`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `deleteNode([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `multipleDelete([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `int[]` startOffsets, `int[]` endOffsets)`

**Returns:** `void`

Note: *The offsets must be in document order and the intervals must not 
 intersect with each other. This rule must also be followed by the filter processing.*
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `renameElement([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element, `java.lang.String` newName, `java.lang.Object` infoProvider)`

**Returns:** `void`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `setAttribute([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md) value, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `removeAttribute([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `split([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) toSplit, `int` splitOffset)`

**Returns:** `boolean`

The node to split is the first ancestor block level node containing the
 `splitOffset`.
 The attributes of the splitted node will also be copied excepting the 
 unique ones. The unique attributes are identified by the UniqueAttributesRecognizer.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `surroundWithNode([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, `int` startOffset, `int` endOffset, `boolean` leftToRight)`

**Returns:** `void`

The fragment between the start and end offsets will become the node actual content.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `surroundInFragment([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `java.lang.String` xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `surroundInFragment([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `surroundInText([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `java.lang.String` header, `java.lang.String` footer, `int` startOffset, `int` endOffset)`

**Returns:** `void`

The method inserts the `header` at `startOffset` and 
 the `footer` at `endOffset`.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `setDoctype([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md) docType)`

**Returns:** `void`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `setMultipleDistinctAttributes([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` parentElementStartOffset, `int[]` elementOffsets, `java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>>` attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `setMultipleAttributes([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` parentElementStartOffset, `int[]` elementOffsets, `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>` attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.
 
Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `removeMarker([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md) marker)`

**Returns:** `boolean`

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `addCommentMarker([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `int` startOffset, `int` endOffset, `java.lang.String` comment, `java.lang.String` parentID)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

### `addPersistentMarker([`ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`](./AuthorDocumentFilterBypass.md) filterBypass, `ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType` type, `int` startOffset, `int` endOffset, `java.util.Map<java.lang.String,java.lang.String>` properties)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

Subclasses that want to conditionally modify the default processing
 should override this and only call super implementation as
 necessary, or call directly into the AuthorDocumentFilterBypass as
 necessary.

