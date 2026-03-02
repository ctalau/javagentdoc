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

One of the constants:
 

  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_COPY
  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_CUT
  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_DND_COPY
  - AuthorSchemaAwareEditingHandler#CREATE_FRAGMENT_PURPOSE_DND_MOVE

**Returns:** `int`

### `getClipboardObjectID()`

For example if multiple pastes are made with same content, the same object ID is returned.

**Returns:** `java.lang.String`

### `getFragmentOriginalLocation()`

If the fragment was pasted from outside of Oxygen, the original location is null.

**Returns:** `java.lang.String`

### `getFragment()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../node/AuthorDocumentFragment.md)

### `setFragment(AuthorDocumentFragment newFragment)`

**Parameters:**
- `newFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../node/AuthorDocumentFragment.md)): The fragment which will be pasted/dropped.

**Returns:** `void`

### `getOriginalLocation()`

If the fragment was pasted from outside of Oxygen, the original location is null.

**Returns:** `java.lang.String`

### `getLocationOfLastPaste()`

Can be `null`

**Returns:** `java.lang.String`

