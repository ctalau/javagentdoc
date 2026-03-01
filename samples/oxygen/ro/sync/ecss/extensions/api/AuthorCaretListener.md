# Interface: `AuthorCaretListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorCaretListener`

## Description

Adding a caret listener starting from an AuthorAccess :
 

 

```

 authorAccess.getEditorAccess().addAuthorCaretListener(caretListener);
 
```

 
 Adding a caret listener starting from a PluginWorkspace :
 

 

```

 WSEditor editorAccess = pluginWorkspaceAccess.getCurrentEditorAccess(StandalonePluginWorkspace.MAIN_EDITING_AREA);
 if (editorAccess != null && EditorPageConstants.PAGE_AUTHOR.equals(editorAccess.getCurrentPageID())) {
     WSAuthorEditorPage authorPageAccess = (WSAuthorEditorPage) editorAccess.getCurrentPage();
     authorPageAccess.addAuthorCaretListener(caretListener);
  }
 
```

## Methods

### `caretMoved([`ro.sync.ecss.extensions.api.AuthorCaretEvent`](./AuthorCaretEvent.md) caretEvent)`

**Returns:** `void`

