# Interface: `ClipboardFragmentInformation`

**Package:** [`ro.sync.ecss.extensions.api.content`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.content.ClipboardFragmentInformation`

## Description

The fragment received in the callback can either be directly processed or a new fragment can be set instead.
 An easy way to modify the fragment XML content is like this:

 

```

  public void process(ClipboardFragmentInformation fragmentInformation) {
   AuthorDocumentFragment frag = fragmentInformation.getFragment();
   try {
     String xmlContent = authorAccess.getDocumentController().serializeFragmentToXML(frag);
     //Modify the XML content here.....
     
     //Re-create a new fragment from the XML
     AuthorDocumentFragment newFragment = authorAccess.getDocumentController().createNewDocumentFragmentInContext(xmlContent, authorAccess.getEditorAccess().getCaretOffset());
     
     fragmentInformation.setFragment(newFragment);
   } catch (BadLocationException e) {
     e.printStackTrace();
   } catch (AuthorOperationException e) {
     e.printStackTrace();
   }
 }
```

## Methods

### `getPurposeID()`

**Returns:** `int`

One of the constants:
 

  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_COPY
  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_CUT
  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_DND_COPY
  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_DND_MOVE

### `getClipboardObjectID()`

**Returns:** `java.lang.String`

For example if multiple pastes are made with same content, the same object ID is returned.

### `getFragmentOriginalLocation()`

**Returns:** `java.lang.String`

If the fragment was pasted from outside of Oxygen, the original location is null.

### `getFragment()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../node/AuthorDocumentFragment.md)

### `setFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../node/AuthorDocumentFragment.md) newFragment)`

**Returns:** `void`

### `getOriginalLocation()`

**Returns:** `java.lang.String`

If the fragment was pasted from outside of Oxygen, the original location is null.

### `getLocationOfLastPaste()`

**Returns:** `java.lang.String`

Can be `null`

