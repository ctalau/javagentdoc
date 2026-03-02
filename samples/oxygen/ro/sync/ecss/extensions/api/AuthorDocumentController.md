# Interface: `AuthorDocumentController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorDocumentController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorAttributesController`](./AuthorAttributesController.md), [`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](./AuthorPseudoClassController.md)

## Description

## Methods

### `delete(int startOffset, int endOffset)`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `startOffset` (`int`): Start offset, 0 based, inclusive.
- `endOffset` (`int`): End offset, 0 based, inclusive.

**Returns:** `boolean`

### `delete(int startOffset, int endOffset, boolean backspace)`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `startOffset` (`int`): Start offset, 0 based, inclusive.
- `endOffset` (`int`): End offset, 0 based, inclusive.
- `backspace` (`boolean`): `true` if delete operation was triggered 
   by the user pressing the backspace key.

**Returns:** `boolean`

### `deleteNode(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to delete.

**Returns:** `boolean`

### `replaceRoot(AuthorDocumentFragment fragment)`

The fragment must contain only one element, otherwise the replacement will not be performed.

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The document fragment containing the new root element.

**Returns:** `void`

### `createDocumentFragment(int startOffset, int endOffset)`

The offset ranges must be from the current AuthorDocument.
 
The change tracking markers are automatically accepted in the fragment if change tracking is enabled in the document.
 

 

 The Author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `startOffset` (`int`): The start offset, 0 based, inclusive.
- `endOffset` (`int`): The end offset, 0 based, inclusive.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `createDocumentFragment(int startOffset, int endOffset, boolean preserveTrackChange)`

The offset ranges must be from the current AuthorDocument.
 

 

 The Author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `startOffset` (`int`): The start offset, 0 based, inclusive.
- `endOffset` (`int`): The end offset, 0 based, inclusive.
- `preserveTrackChange` (`boolean`): `true` to preserve track changes exactly as they are,
    no matter if change tracking is enabled or disabled. `false` to preserve the changes if change tracking is disabled
    or to automatically accept them if change tracking is enabled.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `createNewDocumentFragmentInContext(String xmlFragment, int contentOffset)`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML Fragment.
- `contentOffset` (`int`): The offset where the XML fragment should be inserted.
   This method doesn't perform any insertion. This parameter is used to
   resolve entities and default attribute values from the DTD in the
   specified XML fragment.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `createNewDocumentFragmentsInContext(String[] xmlFragments, int[] contentOffsets)`

This method should be used when multiple Author document fragments must be created.
 In this situation the fragments are created faster than creating each of them by calling 
 AuthorDocumentController#createNewDocumentFragmentInContext(String, int) method.   
 

 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `xmlFragments` (`java.lang.String[]`): The array of XML fragments.
- `contentOffsets` (`int[]`): The offsets where the XML fragments should be inserted. 
   The xml fragments and context offsets arrays must have the same size. The 
   nth offset corresponds to the nth xml fragment.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)

### `createNewDocumentTextFragment(String textFragment)`

The returned 
 fragment will contain **only a text node** and if the text fragment contains 
 mark-up, it will be escaped. If the text has mark-up and you actually want 
 to create author nodes from it then you should use #createNewDocumentFragmentInContext(String, int).

**Parameters:**
- `textFragment` (`java.lang.String`): The text fragment.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `serializeFragmentToXML(AuthorDocumentFragment fragment)`

The following code example extracts the selection as an XML fragment, 
 processes and then reinserts it:
 

 

```

 if(authorAccess.getEditorAccess().hasSelection()) {
    AuthorDocumentController documentController = authorAccess.getDocumentController();
    AuthorDocumentFragment selectionAsAFragment = documentController.createDocumentFragment(
         authorAccess.getEditorAccess().getSelectionStart(), authorAccess.getEditorAccess().getSelectionEnd());
    String selectionAsXML = documentController.serializeFragmentToXML(selectionAsAFragment);
    
    //Deletes the selection
    authorAccess.getEditorAccess().deleteSelection();
    
    //Process the selectionAsXML fragment, modify it.
    //................
    
    //Insert the XML fragment back at caret position.
    documentController.insertXMLFragment(selectionAsXML, authorAccess.getEditorAccess().getCaretOffset());
 }
 
```

 
 If the fragment contains change tracking highlights, they will be 
 serialized as processing instructions.

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The AuthorDocumentFragment to serialize.

**Returns:** `java.lang.String`

### `setAttribute(String attributeName, AttrValue value, AuthorElement element)`

If the element does not have the attribute specified by name, then an attribute with the specified value will be automatically created. 
 
 Attributes set in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) 
 will be subject to undo/redo.

**Parameters:**
- `attributeName` (`java.lang.String`): Name of the attribute being changed.
- `value` ([`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md)): New AttrValue for the attribute. If `null`, the attribute is 
   removed from the element.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute is changing.

**Returns:** `void`

### `setMultipleAttributes(int parentElementStartOffset, int[] elementOffsets, Map<String,AttrValue> attributes)`

Attributes set in this manner will be subject to undo/redo.

**Parameters:**
- `parentElementStartOffset` (`int`): The start offset of the parent element.
- `elementOffsets` (`int[]`): The start offset for each element.
- `attributes` (`java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>`): The list with attributes. Every attribute name is mapped to 
   an AttrValue object. If the value is `null`, the attribute will
   be removed.

**Returns:** `void`

### `setMultipleDistinctAttributes(int parentElementStartOffset, int[] elementOffsets, List<Map<String,AttrValue>> attributes)`

**Parameters:**
- `parentElementStartOffset` (`int`): The start offset of an ancestor node which contains all other elements.
- `elementOffsets` (`int[]`): The start offset for each element.
- `attributes` (`java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>>`): The list with attribute sets. Every attribute name is mapped to 
   an AttrValue object. If the value is `null`, the attribute will
   be removed.

**Returns:** `void`

### `removeAttribute(String attributeName, AuthorElement element)`

Attributes removed in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) will 
 be subject to undo/redo.

**Parameters:**
- `attributeName` (`java.lang.String`): Name of the attribute to remove.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute will be removed.

**Returns:** `void`

### `setPseudoClassUndoable(String pseudoClass, AuthorElement element)`

This change *IS* subject to undo/redo.

**Parameters:**
- `pseudoClass` (`java.lang.String`): Name of the pseudo class being set.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute is changing.

**Returns:** `void`

### `removePseudoClassUndoable(String pseudoClass, AuthorElement element)`

This change *IS* subject to undo/redo.

**Parameters:**
- `pseudoClass` (`java.lang.String`): Name of the pseudo class being set.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute will be removed.

**Returns:** `void`

### `getNodeAtOffset(int offset)`

The given offset must be
 greater or equal to 0 and less than the current document length.
 


 Note: 
 *If the caret has the offset of an element's start offset marker character, it is considered to be before the element.*
 

 *If the caret has the offset of an element's end offset marker character, it is considered to be inside the element.*
 


 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `offset` (`int`): The offset in the content, zero based.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getContentInformationAtOffset(int offset)`

If the offset is on a marker character the returned result will also contain the node which contains the range indicated by the marker.

**Parameters:**
- `offset` (`int`): The offset in the content, zero based.

**Returns:** [`ro.sync.ecss.extensions.api.content.OffsetInformation`](content/OffsetInformation.md)

### `createDocumentFragment(AuthorNode node, boolean copyContent)`

The node must be from the current AuthorDocument.
 The attributes of the elements will be copied. 
 If `copyContent` is `true` the node content 
 will be copied also.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to be duplicated.
- `copyContent` (`boolean`): If `true` the content of the node will 
   also be duplicated.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `getText(int offset, int length)`

The document text content can be obtained by adding all the text nodes
 content.
 

 The `offset` is considered to be relative to the
 text content start offset. So the 0 offset corresponds to the offset of 
 the first valid char in the document.
 

 The `length` represents also a number of valid chars encountered
 after the real start offset was determined.
 

 

 For the document:
 `
 

 [?PI?][article][!COMMENT][para]PARAGRAPH[/para][/article]
 

 `
 

 `getText(0, 18)` returns "PICOMMENTPARAGRAPH"
 

 `getText(5, 8)` returns "MENTPARA"

**Parameters:**
- `offset` (`int`): The starting offset >= 0.
- `length` (`int`): The number of characters to retrieve >= 0

**Returns:** `java.lang.String`

### `getTextContentLength()`

This is the number of valid 
 characters in the document text. The length
 can be determined by the adding all text nodes content length.
 
 
 

 For the document:
 `
 

 [?PI?][article][!COMMENT][para]PARAGRAPH[/para][/article]
 

 `
 
 The text content length will be:
 

 `
 "PI".length() + "COMMENT".length() + "PARAGRAPH".length()
 

 2 + 7 + 9 = 18
 `

**Returns:** `int`

### `getUndoManager()`

**Returns:** `javax.swing.undo.UndoManager`

### `beginCompoundEdit()`

This method should be called
 to signal to the editing support that a complex editing operation begins.
 The editing operations that occur between `beginCompoundEdit()`
 and `endCompoundEdit()` methods calls are regarded by the UndoManager 
 as a single operation which can be undone/redone in one step.

**Returns:** `void`

### `endCompoundEdit()`

This method should be called
 to signal to the editing support that a complex editing operation ends.

**Returns:** `void`

### `cancelCompoundEdit()`

This method should be called
 to signal to the editing support that all edits performed so far inside a current compound edit must be undone.
 The editing operations that occurred after the previous call to `beginCompoundEdit()`
 will be undo by the UndoManager.
 
 Note that the compound edit does not end after a call to this method, so an
 explicit call to #endCompoundEdit() is required.

**Returns:** `void`

### `insertText(int offset, String text)`

After the operation the caret will be 
 positioned at the end of the inserted text.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `offset` (`int`): The insert position, 0 based.
- `text` (`java.lang.String`): The text to be inserted.

**Returns:** `void`

### `insertXMLFragment(String xmlFragment, int offset)`

After the operation the caret will be positioned in the first leaf of the fragment.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment to insert.
- `offset` (`int`): The insert position, 0 based.

**Returns:** `void`

### `insertXMLFragment(String xmlFragment, String xpathLocation, String relativePosition)`

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at caret position and the `relativePosition` will be ignored. 
 

 After the operation the caret will be positioned in the first leaf of the fragment.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `xpathLocation` (`java.lang.String`): The XPath location.
- `relativePosition` (`java.lang.String`): The position relative to the node identified by the XPath location. 
   Can be one of the constants: AuthorConstants#POSITION_BEFORE, AuthorConstants#POSITION_AFTER, 
   AuthorConstants#POSITION_INSIDE_FIRST or AuthorConstants#POSITION_INSIDE_LAST.

**Returns:** `void`

### `insertXMLFragment(String xmlFragment, AuthorNode relativeTo, String relativePosition)`

After the operation the caret will be positioned at the end of the inserted XML fragment.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `relativeTo` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to insert fragment relative to.
- `relativePosition` (`java.lang.String`): The position relative to the node. 
   Can be one of the constants: AuthorConstants#POSITION_BEFORE, AuthorConstants#POSITION_AFTER, 
   AuthorConstants#POSITION_INSIDE_FIRST or AuthorConstants#POSITION_INSIDE_LAST.

**Returns:** `void`

### `insertXMLFragmentSchemaAware(String xmlFragment, int offset)`

A normal insertion is executed when no schema is specified or schema aware feature is disable by the user
 (see Preferences / Editor / Pages / Author / Schema aware).
 
 If the fragments insertion is not allowed, a dialog will be shown proposing one of following solutions if they apply:
 

   - insert the fragments inside a new element. The name of the element to wrap the fragments in is computed by analyzing the 
   left or right siblings. 
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title</title>
  {caret}
  <para>para content</para>
</sect1>
    
```
 if insert a fragment like: `<emphasis>text</emphasis>` the proposal is to 
    create a new `para` element and insert the fragment inside it. The proposal result will be:
    

```
<sect1>
  <title>Section title</title>
  <para><emphasis>text</emphasis></para>
  <para>para content</para>
</sect1>
    
```
    
   

   
   
   
   - split an ancestor of the node at insertion offset and insert the fragments between the resulted elements.
   
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title</title>
  {caret}
  <para>para content</para>
</sect1>
    
```
 if insert a fragment like: `<sect1>...section content...</sect1>` the proposal is to 
    split the parent `sect1` element and insert the fragment between the resulted sections. The proposal result will be:
    

```
<sect1>
  <title>Section title</title>
</sect1>
<sect1>...section content...</sect1>
<sect1>
  <para>para content</para>
</sect1>
```


    
    
    
   - insert the fragments somewhere in the proximity of the insertion offset(left or right without skipping content).
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title</title>
  {caret}
  <para>para content</para>
</sect1>
    
```
 if insert a fragment like: `<emphasis>text</emphasis>` the proposals are to 
    insert the fragment at the end of `title` or at beginning of `para` element.


   
   
   - insert at offset the plain text resulted after removing the mark-up.
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title {caret}</title>
</sect1>
    
```
 if insert a fragment like: `<para>fragment <emphasis>content</emphasis></para>` 
    the proposal is to remove the fragment mark-up and insert the text 'fragment content' at caret position. 
    The proposal result will be:
    

```
<sect1>
  <title>Section title fragment content</title>
</sect1>
    
```
       
    

   
   
   - insert the fragments at insertion offset, even they are not allowed.

 

 
 
If the developer specifies an AuthorSchemaAwareEditingHandler then this handler has priority 
 for executing the insert operation.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment to insert.
- `offset` (`int`): The insert position, 0 based.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `insertXMLFragmentSchemaAware(String xmlFragment, int offset, boolean replaceSelection)`

A normal insertion is executed when no schema is specified or schema aware feature is disable by the user
 (see Preferences / Editor / Pages / Author / Schema aware).
 
 If the fragments insertion is not allowed, a dialog will be shown proposing one of following solutions if they apply:
 

   - insert the fragments inside a new element. The name of the element to wrap the fragments in is computed by analyzing the 
   left or right siblings. 
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title</title>
  {caret}
  <para>para content</para>
</sect1>
    
```
 if insert a fragment like: `<emphasis>text</emphasis>` the proposal is to 
    create a new `para` element and insert the fragment inside it. The proposal result will be:
    

```
<sect1>
  <title>Section title</title>
  <para><emphasis>text</emphasis></para>
  <para>para content</para>
</sect1>
    
```
    
   

   
   
   
   - split an ancestor of the node at insertion offset and insert the fragments between the resulted elements.
   
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title</title>
  {caret}
  <para>para content</para>
</sect1>
    
```
 if insert a fragment like: `<sect1>...section content...</sect1>` the proposal is to 
    split the parent `sect1` element and insert the fragment between the resulted sections. The proposal result will be:
    

```
<sect1>
  <title>Section title</title>
</sect1>
<sect1>...section content...</sect1>
<sect1>
  <para>para content</para>
</sect1>
```


    
    
    
   - insert the fragments somewhere in the proximity of the insertion offset(left or right without skipping content).
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title</title>
  {caret}
  <para>para content</para>
</sect1>
    
```
 if insert a fragment like: `<emphasis>text</emphasis>` the proposals are to 
    insert the fragment at the end of `title` or at beginning of `para` element.


   
   
   - insert at offset the plain text resulted after removing the mark-up.
   
 By example, for the next Docbook situation:
   

```
<sect1>
  <title>Section title {caret}</title>
</sect1>
    
```
 if insert a fragment like: `<para>fragment <emphasis>content</emphasis></para>` 
    the proposal is to remove the fragment mark-up and insert the text 'fragment content' at caret position. 
    The proposal result will be:
    

```
<sect1>
  <title>Section title fragment content</title>
</sect1>
    
```
       
    

   
   
   - insert the fragments at insertion offset, even they are not allowed.

 

 
 
If the developer specifies an AuthorSchemaAwareEditingHandler then this handler has priority 
 for executing the insert operation.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment to insert.
- `offset` (`int`): The insert position, 0 based.
- `replaceSelection` (`boolean`): `true` to replace the selected Author content with the fragment, 
   `false` to leave the selected content and paste at caret position.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `insertXMLFragmentSchemaAware(String xmlFragment, int offset, int actionID, boolean replaceSelection)`

The insertion behavior depends on the action type (specified by the 
 actionID parameter) that triggered it. For more details see the 
 description of #insertXMLFragmentSchemaAware(String, int, boolean).

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment to insert.
- `offset` (`int`): The insert position, 0 based.
- `actionID` (`int`): The action that caused the insertion. One of the constants 
   in AuthorSchemaAwareEditingHandler.
- `replaceSelection` (`boolean`): `true` to replace the selected Author content with the fragment, 
   `false` to leave the selected content and paste at caret position.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `insertFragment(int insertOffset, AuthorDocumentFragment frag)`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `insertOffset` (`int`): The offset where the fragment will be inserted, 0 based.
- `frag` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The AuthorDocumentFragment to be inserted. Never `null`.

**Returns:** `void`

### `processContentRange(int startOffset, int endOffset, RangeProcessor rangeProcessor)`

You will receive a call back which will give you the AuthorDocumentFragment to process.
 When finished, the range will be replaced with the processed fragment. 
 
 
The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 
The start and end offsets pointed to by the AuthorNode can be retrieved using the
 `AuthorNode.getStartOffset()` and `AuthorNode.getEndOffset()`.
 

 
 
The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `startOffset` (`int`): Start offset of the processed range (inclusive).
- `endOffset` (`int`): End offset of the processed range (inclusive).
- `rangeProcessor` ([`ro.sync.ecss.extensions.api.content.RangeProcessor`](content/RangeProcessor.md)): The range processor which gets notified to process the
                          AuthorDocumentFragment.

**Returns:** `boolean`

### `insertFragmentSchemaAware(int insertOffset, AuthorDocumentFragment frag)`

A normal insertion is executed when no schema is specified or schema aware feature is disable by the user
 (see Preferences / Editor / Pages / Author / Schema aware).
 
For more details about schema aware solutions see comments from #insertXMLFragmentSchemaAware(String, int) method.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `insertOffset` (`int`): The offset where the fragment will be inserted, 0 based.
- `frag` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The AuthorDocumentFragment to be inserted.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `surroundInFragment(String xmlFragment, int startOffset, int endOffset)`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment which will surround the given interval.
   The first leaf node of the XML fragment will be the parent of the surrounded content.
- `startOffset` (`int`): The start offset of the content to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the content to be surrounded, 0 based and inclusive.

**Returns:** `void`

### `surroundInFragment(AuthorDocumentFragment xmlFragment, int startOffset, int endOffset)`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `xmlFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The XML fragment which will surround the given interval.
   The first leaf node of the XML fragment will be the parent of the surrounded content.
- `startOffset` (`int`): The start offset of the content to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the content to be surrounded, 0 based and inclusive.

**Returns:** `void`

### `surroundInText(String header, String footer, int startOffset, int endOffset)`

The method inserts the `header` at `startOffset` and 
 the `footer` at `endOffset`.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `header` (`java.lang.String`): The header to be inserted before the surrounded text.
- `footer` (`java.lang.String`): The footer to be inserted after the surrounded text.
- `startOffset` (`int`): The start offset of the text to be surrounded, 0 based.
- `endOffset` (`int`): The end offset of the text to be surrounded, 0 based.

**Returns:** `void`

### `inInlineContext(int offset)`

The CSS **display** property is taken into account when determining this state.
 
 For example a text paragraph determines an **inline** context, 
 and for an offset inside this paragraph the method will return `true`. 
 For an offset between two paragraphs (considered to be **block** level) 
 the method will return `false`.

**Parameters:**
- `offset` (`int`): The offset in the document, zero based.

**Returns:** `boolean`

### `addAuthorListener(AuthorListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md)): The AuthorListener to be added.

**Returns:** `void`

### `addAuthorPersistentHighlightListener(AuthorPersistentHighlightsListener listener)`

In the persistent highlights are included:
 

  -  Change tracking markers and comments
  -  Additional persistent highlights 
    added using AuthorPersistentHighlighter#addHighlight(int, int, java.util.LinkedHashMap)

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md)): The listener

**Returns:** `void`

### `removeAuthorPersistentHighlightListener(AuthorPersistentHighlightsListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md)): The listener to remove.

**Returns:** `void`

### `addPersistentHighlightsFilter(AuthorPersistentHighlightsFilter persistentHighlightsFilter)`

A filter capable of filtering the highlights by author is present by default.

**Parameters:**
- `persistentHighlightsFilter` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsFilter`](highlights/AuthorPersistentHighlightsFilter.md)): The filter to be added.

**Returns:** `void`

### `removeAuthorListener(AuthorListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md)): The AuthorListener to be removed.

**Returns:** `void`

### `evaluateXPath(String xpathExpression, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers)`

This function returns the result of the given XPath expression as an array of Object.
 Author DOM text nodes, DOM CDATA sections and DOM comment wrappers can be 
 ignored for performance reasons.
 

 For example, executing the expression:
 
 `//node()`
 
 will return an array with all the Author DOM Node wrappers in the document.
 

 while evaluating the expression:
 
 `count(//node())`
 
 will return an array having a single component representing the number of nodes in the document.
 

 Evaluating the expression:
 
 `//node(), count(//node())`
 
 will return an array containing all the Author DOM Node wrappers in the document and having as last component
 the total number of nodes.
 
 
You can also use the XPath extension functions *oxy:current-selected-element()* and *oxy:allows-child-element()*.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `ignoreTexts` (`boolean`): If `true` DOM text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` DOM CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` DOM comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).

**Returns:** `java.lang.Object[]`

### `evaluateXPath(String xpathExpression, AuthorNode contextNode, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers, XPathVersion xpathVersion)`

This function returns the result of the given XPath expression as an array of Object.
 Author DOM text nodes, DOM CDATA sections and DOM comment wrappers can be 
 ignored for performance reasons.
 

 For example, executing the expression:
 
 `//node()`
 
 will return an array with all the Author DOM Node wrappers in the document.
 

 while evaluating the expression:
 
 `count(//node())`
 
 will return an array having a single component representing the number of nodes in the document.
 

 Evaluating the expression:
 
 `//node(), count(//node())`
 
 will return an array containing all the Author DOM Node wrappers in the document and having as last component
 the total number of nodes.
 
You can also use the XPath extension functions *oxy:current-selected-element()* and *oxy:allows-child-element()*.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node in the context of which the relative XPath Expressions will computed. 
   If `null` the context node will be the node at the current caret position.
- `ignoreTexts` (`boolean`): If `true` DOM text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` DOM CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` DOM comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).
- `xpathVersion` ([`ro.sync.ecss.extensions.api.XPathVersion`](./XPathVersion.md)): Used version of XPath.

**Returns:** `java.lang.Object[]`

### `evaluateXPath(String xpathExpression, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments)`

This function returns the result of the given XPath expression as an array of Object.
 Author DOM text nodes, DOM CDATA sections and DOM comment wrappers can be 
 ignored for performance reasons.
 

 For example, executing the expression:
 
 `//node()`
 
 will return an array with all the Author DOM Node wrappers in the document.
 

 while evaluating the expression:
 
 `count(//node())`
 
 will return an array having a single component representing the number of nodes in the document.
 

 Evaluating the expression:
 
 `//node(), count(//node())`
 
 will return an array containing all the Author DOM Node wrappers in the document and having as last component
 the total number of nodes.
 
 If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
 
 
You can also use the XPath extension functions *oxy:current-selected-element()* and *oxy:allows-child-element()*.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `ignoreTexts` (`boolean`): If `true` DOM text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` DOM CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` DOM comments will not be returned.

**Returns:** `java.lang.Object[]`

### `findNodesByXPath(String xpathExpression, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers)`

The result of this function is an array of AuthorNode selected 
 by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes 
 can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

 If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression.
- `ignoreTexts` (`boolean`): If `true` Author text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` Author CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` Author comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

### `findNodesByXPath(String xpathExpression, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments)`

The result of this function is an array of AuthorNode selected 
 by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes 
 can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.
 
 If change tracking (insert/remove/comment) markers exist in the document the XPath will be applied over the document as if the change tracking is applied 
 (All changes processed to processing instructions like when the XML document gets saved on disk).

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `ignoreTexts` (`boolean`): If `true` Author text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` Author CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` Author comments will not be returned.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

### `getXPathLocationOffset(String xpathLocation, String relativePosition, boolean processChangeMarkers)`

**Parameters:**
- `xpathLocation` (`java.lang.String`): The XPath defining a node in document.
- `relativePosition` (`java.lang.String`): The relative position to the node. 
   One of the following: AuthorConstants#POSITION_BEFORE, 
   AuthorConstants#POSITION_INSIDE_FIRST, AuthorConstants#POSITION_INSIDE_LAST or
   AuthorConstants#POSITION_AFTER
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).

**Returns:** `int`

### `getXPathLocationOffset(String xpathLocation, String relativePosition)`

If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.

**Parameters:**
- `xpathLocation` (`java.lang.String`): The XPath defining a node in document.
- `relativePosition` (`java.lang.String`): The relative position to the node. 
   One of the following: AuthorConstants#POSITION_BEFORE, 
   AuthorConstants#POSITION_INSIDE_FIRST, AuthorConstants#POSITION_INSIDE_LAST or
   AuthorConstants#POSITION_AFTER

**Returns:** `int`

### `insertMultipleElements(AuthorElement parentElement, String[] elementNames, int[] offsets, String namespace)`

Note: *The offsets and fragments must be in document order. The offset 
 must be given in the original document, before any insertion occurs.*
 
 To insert two elements one after another:
 

```

          String[] fragments = new String[] {"elem1", "elem2"};
          insertMultipleElements(parentElement, fragments, new int[] {offset, offset}, null);
 
```

 The result of running the above code will be: 
 

```

   parent
     elem1
     elem2
 
```

 

 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The parent element that contains all the new inserted 
   elements.
- `elementNames` (`java.lang.String[]`): The element names to be inserted.
- `offsets` (`int[]`): The absolute offsets where the elements will be inserted.
- `namespace` (`java.lang.String`): The namespace of the new inserted elements.

**Returns:** `void`

### `insertMultipleFragments(AuthorElement parentElement, AuthorDocumentFragment[] fragments, int[] offsets)`

Note: *The offsets and fragments must be in document order. The offset 
 must be given in the original document, before any insertion occurs.*
 
 To insert two fragment one after another:
 

```

          AuthorDocumentFragment[] fragments = new AuthorDocumentFragment[] {frag1, frag2};
          insertMultipleFragments(parentElement, fragments, new int[] {offset, offset});
 
```

 The result of running the above code will be: 
 

```

   parent
     frag1
     frag2
 
```

 

 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The parent element that contains all the new inserted 
   elements.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): The fragments to be inserted.
- `offsets` (`int[]`): The absolute offsets where the fragments will be inserted. 
   The offset must be given in the original document.

**Returns:** `boolean`

### `multipleDelete(AuthorElement parentElement, int[] startOffsets, int[] endOffsets)`

Note: *The offsets must be in document order and the intervals must not 
 intersect with each other.*
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element that contains all the deleted intervals.
- `startOffsets` (`int[]`): The start offset for each interval.
   Must be in document order.
- `endOffsets` (`int[]`): The end offset for each interval.
   Must be in document order. 0 based and inclusive.

**Returns:** `void`

### `setDoctype(AuthorDocumentType docType)`

This is a good method to add new entities (regular or unparsed) to the internal document type of the document.
 
 WARNING: if these modifications affect regular entities already inserted and expanded,
 they will not be re-parsed and their old content will remain rendered as such.

**Parameters:**
- `docType` ([`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md)): The document type information.

**Returns:** `void`

### `getDoctype()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md)

### `getCommonParentNode(AuthorDocument doc, int startOffset, int endOffset)`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

**Parameters:**
- `doc` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)): The author document.
- `startOffset` (`int`): The start offset.
- `endOffset` (`int`): The end offset.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getNodesToSelect(int selectionStart, int selectionEnd)`

Balanced selection and select all nodes between first and last selected nodes.

**Parameters:**
- `selectionStart` (`int`): The selection start.
- `selectionEnd` (`int`): The selection end exclusive.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `getCommonAncestor(AuthorNode[] nodes)`

**Parameters:**
- `nodes` ([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)): The array which contains the nodes.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getStrictCommonAncestor(AuthorNode[] nodes)`

**Parameters:**
- `nodes` ([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)): The array which contains the nodes.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getAuthorDocumentNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)

### `setDocumentFilter(AuthorDocumentFilter authorDocumentFilter)`

**Parameters:**
- `authorDocumentFilter` ([`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md)): The AuthorDocumentFilter to be used.

**Returns:** `void`

### `getDocumentFilter()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md)

### `getChars(int where, int len, Segment chars)`

Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
  
 

 
 

 
 Retrieves a portion of the content into the specified Segment.

**Parameters:**
- `where` (`int`): The starting position >= 0, where + len <= length()
- `len` (`int`): The number of characters to be retrieved >= 0
- `chars` (`javax.swing.text.Segment`): The Segment object to return the characters int.o

**Returns:** `void`

### `getContentCharSequence()`

Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()

**Returns:** `java.lang.CharSequence`

### `getFilteredContent(int start, int end, AuthorNodesFilter nodesFilter)`

The content represents the entire text content of the Author page + additional markers/sentinels 
 at offsets which are pointed to by the AuthorNodes.
 Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 
 Retrieves the content from start to end offsets,

**Parameters:**
- `start` (`int`): The starting position >= 0.
- `end` (`int`): The end position >= 0, inclusive
- `nodesFilter` ([`ro.sync.ecss.extensions.api.filter.AuthorNodesFilter`](filter/AuthorNodesFilter.md)): Provides information about the Author nodes that should be filtered.

**Returns:** [`ro.sync.ecss.extensions.api.filter.AuthorFilteredContent`](filter/AuthorFilteredContent.md)

### `getAuthorSchemaManager()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](./AuthorSchemaManager.md)

### `insertXMLFragmentSchemaAware(String xmlFragment, String xpathLocation, String relativePosition)`

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at caret position and the `relativePosition` will be ignored. 
 

 
For more details about schema aware solutions see comments from #insertXMLFragmentSchemaAware(String, int) method.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `xpathLocation` (`java.lang.String`): The XPath location.
- `relativePosition` (`java.lang.String`): The position relative to the node identified by the XPath location. 
   Can be one of the constants: AuthorConstants#POSITION_BEFORE, AuthorConstants#POSITION_AFTER, 
   AuthorConstants#POSITION_INSIDE_FIRST or AuthorConstants#POSITION_INSIDE_LAST.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `insertXMLFragmentSchemaAware(String xmlFragment, String xpathLocation, String relativePosition, boolean insertEvenIfInvalid)`

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at caret position and the `relativePosition` will be ignored. 
 

 
For more details about schema aware solutions see comments from #insertXMLFragmentSchemaAware(String, int) method.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.
- `xpathLocation` (`java.lang.String`): The XPath location.
- `relativePosition` (`java.lang.String`): The position relative to the node identified by the XPath location. 
   Can be one of the constants: AuthorConstants#POSITION_BEFORE, AuthorConstants#POSITION_AFTER, 
   AuthorConstants#POSITION_INSIDE_FIRST or AuthorConstants#POSITION_INSIDE_LAST.
- `insertEvenIfInvalid` (`boolean`): `true` to insert the fragment even if the document becomes invalid. This is used as a last attempt
   after all the schema aware insertion strategies have failed.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

### `insertElement(int caretOffset, AuthorNode element)`

**Parameters:**
- `caretOffset` (`int`): The offset in the document.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The element to insert.

**Returns:** `boolean`

### `createElement(String qName)`

Please note that this method does not insert the default attributes from the 
 schema so it is recommended to use #createNewDocumentFragmentInContext(String, int)
 instead, if it is possible.

**Parameters:**
- `qName` (`java.lang.String`): The qualified name of the element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `isEditable(AuthorNode node)`

A node is not editable for one of the following cases:
 

   - the CSS property 'editable' is to 'false';

   - the node is entirely included into a DELETED change marker.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to test if is editable.

**Returns:** `boolean`

### `renameElement(AuthorElement contextNode, String newName)`

**Parameters:**
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element to rename.
- `newName` (`java.lang.String`): The new qualified name to set to it.

**Returns:** `void`

### `getTextContentIterator(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): Start offset, 0 based, inclusive.
- `endOffset` (`int`): End offset, 0 based, inclusive.

**Returns:** [`ro.sync.ecss.extensions.api.content.TextContentIterator`](content/TextContentIterator.md)

### `createPositionInContent(int offset)`

The position is updated automatically when modifications occur before it. 
 It behaves exactly like a javax.swing.text.Position added to a swing Document.

**Parameters:**
- `offset` (`int`): The offset where to create the position

**Returns:** `javax.swing.text.Position`

### `addClipboardFragmentProcessor(ClipboardFragmentProcessor clipboardFragmentProcessor)`

The processor specified in the ExtensionsBundle will have maximum priority.

**Parameters:**
- `clipboardFragmentProcessor` ([`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](content/ClipboardFragmentProcessor.md)): a processor which can analyze and modify AuthorDocumentFragment objects before they are inserted in the Author.

**Returns:** `void`

### `removeClipboardFragmentProcessor(ClipboardFragmentProcessor clipboardFragmentProcessor)`

**Parameters:**
- `clipboardFragmentProcessor` ([`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](content/ClipboardFragmentProcessor.md)): a processor which can analyze and modify AuthorDocumentFragment objects before they are inserted in the Author.

**Returns:** `void`

### `addUniqueAttributesProcessor(UniqueAttributesProcessor uniqueAttributesProcessor)`

The processor can also specify which attributes can be copied on split.
 
 The UniqueAttributesRecognizer specified in the ExtensionsBundle will have maximum priority.

**Parameters:**
- `uniqueAttributesProcessor` ([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md)): a processor which is asked to automatically generate unique IDs after content has been inserted in the Author.
   The processor can also specify which attributes can be copied on split.

**Returns:** `void`

### `getUniqueAttributesProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md)

### `removeUniqueAttributesProcessor(UniqueAttributesProcessor uniqueAttributesProcessor)`

The processor can also specify which attributes can be copied on split.
 
 The UniqueAttributesRecognizer specified in the ExtensionsBundle will have maximum priority.

**Parameters:**
- `uniqueAttributesProcessor` ([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md)): a processor which is asked to automatically generate unique IDs after content has been inserted in the Author.
   The processor can also specify which attributes can be copied on split.

**Returns:** `void`

### `findNodesByXPath(String xpathExpression, AuthorNode contextNode, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers)`

The result of this function is an array of AuthorNode selected 
 by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes 
 can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

 If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
 
 **Note:** References (like XInclude) will be transparent for the Xpath execution.
 The Xpath will see the referenced nodes as though they belong to the document.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node in the context of which the relative XPath Expressions will computed. 
   The context node should be an AuthorElement. If `null`, the context node will be the element at the current caret position.
- `ignoreTexts` (`boolean`): If `true` Author text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` Author CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` Author comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

### `findNodesByXPath(String xpathExpression, AuthorNode contextNode, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers, XPathVersion xpathVersion)`

The result of this function is an array of AuthorNode selected 
 by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes 
 can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

 If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node in the context of which the relative XPath Expressions will computed. 
   The context node should be an AuthorElement. If `null`, the context node will be the element at the current caret position.
- `ignoreTexts` (`boolean`): If `true` Author text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` Author CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` Author comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).
- `xpathVersion` ([`ro.sync.ecss.extensions.api.XPathVersion`](./XPathVersion.md)): Used version of XPath.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

### `findNodesByXPath(String xpathExpression, AuthorNode contextNode, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers, XPathVersion xpathVersion, boolean transparentReferences)`

The result of this function is an array of AuthorNode selected 
 by the given XPath expression.
 Author text nodes, Author CDATA section nodes and Author comment nodes 
 can be ignored for performance reasons.
 

 For example executing the expression:
 
 `//node()`
 
 will return an array with all the AuthorNode's in the document.
 

 But the result of calling the function with the expression:
 
 `count(//node())`
 
 will return an empty array.

 If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the current caret position.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node in the context of which the relative XPath Expressions will computed.
   The context node should be an AuthorElement. If `null`, the context node will be the element at the current caret position.
- `ignoreTexts` (`boolean`): If `true` Author text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` Author CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` Author comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).
- `xpathVersion` ([`ro.sync.ecss.extensions.api.XPathVersion`](./XPathVersion.md)): Used version of XPath.
- `transparentReferences` (`boolean`): If `true` the references (like XInclude, or entities) will be transparent for the Xpath execution.
   The Xpath will see the referenced nodes as though they belong to the document.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

### `evaluateXPath(String xpathExpression, AuthorNode contextNode, boolean ignoreTexts, boolean ignoreCData, boolean ignoreComments, boolean processChangeMarkers)`

This function returns the result of the given XPath expression as an array of Object.
 Author DOM text nodes, DOM CDATA sections and DOM comment wrappers can be 
 ignored for performance reasons.
 

 For example, executing the expression:
 
 `//node()`
 
 will return an array with all the Author DOM Node wrappers in the document.
 

 while evaluating the expression:
 
 `count(//node())`
 
 will return an array having a single component representing the number of nodes in the document.
 

 Evaluating the expression:
 
 `//node(), count(//node())`
 
 will return an array containing all the Author DOM Node wrappers in the document and having as last component
 the total number of nodes.
 
You can also use the XPath extension functions *oxy:current-selected-element()* and *oxy:allows-child-element()*.
 
 **Note:** References (like XInclude) will be transparent for the Xpath execution.
 The Xpath will see the referenced nodes as though they belong to the document.

**Parameters:**
- `xpathExpression` (`java.lang.String`): The XPath expression. If the XPath expression is relative, it will be computed in the context of the context node.
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node in the context of which the relative XPath Expressions will computed. 
   If `null` the context node will be the node at the current caret position.
- `ignoreTexts` (`boolean`): If `true` DOM text nodes will not be returned.
- `ignoreCData` (`boolean`): If `true` DOM CDATA sections will not be returned.
- `ignoreComments` (`boolean`): If `true` DOM comments will not be returned.
- `processChangeMarkers` (`boolean`): If `false` the change markers (inserts/deletes/comments) will be ignored 
   and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.
   If `true` the XPath will be applied over the document as if the change markers are applied.
   (All changes processed to processing instructions like when the XML document gets saved on disk).

**Returns:** `java.lang.Object[]`

### `unwrapDocumentFragment(AuthorDocumentFragment fragmentToUnwrap)`

If the given fragment has a root 
 element, this method returns a fragment containing the content of the root 
 (or `null` if the root is empty), else the given fragment is returned.
 

 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 The following image represents the architecture of an Author document fragment that is a part 
 of the document content. The red markers represent special control characters which 
 represent the node ranges:

**Parameters:**
- `fragmentToUnwrap` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The Author document fragment to be unwrapped.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `getUnparsedEntityUri(AuthorNode contextNode, String entityName)`

**Parameters:**
- `contextNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): Context node.
- `entityName` (`java.lang.String`): Unparsed entity name.

**Returns:** `java.lang.String`

### `refreshNodeReferences(AuthorNode node)`

If a node has expanded references on it created using the "ro.sync.ecss.extensions.api.AuthorReferenceResolver" API this method
 will call again the API to provide a fresh reference content for the node.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node on which to refresh the references.

**Returns:** `void`

### `setRenderingInfoChangedListener(RenderingInfoChangedListener listener)`

The rendering info is represented by the node's styles computed from
 the associated CSS stylesheet and its content.

**Parameters:**
- `listener` ([`ro.sync.ecss.component.RenderingInfoChangedListener`](../../component/RenderingInfoChangedListener.md)): The listener.

**Returns:** `void`

### `getXPathExpression(int offset)`

The offset must be a valid document offset.
 

 Nodes deleted with change tracking are also considered when creating the 
 context for the XPath expression.
 
**Note:** If the offset is inside an expanded reference (for example an 
 XIncluded content) the reference is transparent. The result will be just as
 the reference was replaced with the refered content.

**Parameters:**
- `offset` (`int`): The offset of the node to get the XPath expression for.

**Returns:** `java.lang.String`

### `getXPathExpression(int offset, boolean processChanges)`

The offset must be a valid document offset.
 

 **Note:** If the offset is inside an expanded reference (for example an 
 XIncluded content) the reference is transparent. The result will be just as
 the reference was replaced with the refered content.

**Parameters:**
- `offset` (`int`): The offset of the node to get the XPath expression for.
- `processChanges` (`boolean`): if `true` nodes which have been marked as deletion changes are ignored when building the expession.

**Returns:** `java.lang.String`

### `getXPathExpressionBuilder(int offset)`

The offset must be a valid document offset.
 

 **Note:** If the offset is inside an expanded reference (for example an 
 XIncluded content) the reference is transparent. The result will be just as
 the reference was replaced with the refered content.

**Parameters:**
- `offset` (`int`): The offset of the node to get the XPath expression for.

**Returns:** [`ro.sync.ecss.extensions.api.AuthorXPathExpressionBuilder`](./AuthorXPathExpressionBuilder.md)

### `disableLayoutUpdate()`

On every model change event the view model is updated accordingly. This call
 will disable this support. 
 
 When is this desirable: 
 - when processing a large number or nodes. It might be best to disable the 
 notifications generated by node and just generate a notification for the parent node.
 
 Possible side effects to be aware of:
 - if these notifications are disabled the view model will become unsynchronized 
 with the nodes model. If the views model will be interogated at this point it will
 give eronous results. 
 
 **Important** #enableLayoutUpdate(AuthorNode) should allways be 
 called at the end.

**Returns:** `void`

### `enableLayoutUpdate(AuthorNode ancestorOfChanges)`

Enables the layout update on model changes that was previously disabled 
 using AuthorDocumentController#disableLayoutUpdate() and fires
 the required notifications to update the views and styles.

**Parameters:**
- `ancestorOfChanges` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node that contains all the structural changes.
   If `null` the root element will be used instead.

**Returns:** `void`

### `split(AuthorNode toSplit, int splitOffset)`

**Parameters:**
- `toSplit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to split
- `splitOffset` (`int`): The split offset

**Returns:** `boolean`

### `getFilteredText(int offset, int length)`

The content marked as deleted (using change tracking) will be filtered out.
 Also the special sentinel characters are removed.

**Parameters:**
- `offset` (`int`): The starting offset >= 0.
- `length` (`int`): The number of characters to retrieve >= 0

**Returns:** `java.lang.String`

### `markSelection(List<int[]> newSelection, int newCaretOffset, SelectionInterpretationMode newSelectionType, List<int[]> oldSelection, int oldCaretOffset, SelectionInterpretationMode oldSelectionType)`

It also keeps 
 and restores the selection when undo and redo actions are performed.

**Parameters:**
- `newSelection` (`java.util.List<int[]>`): New selection intervals. An interval is an array with start 
   and end offsets or `null` if not interested. Each ContentInterval 
   contains the **inclusive** start selection offset and the **exclusive** end selection offset.
- `newCaretOffset` (`int`): New caret offset.
- `newSelectionType` ([`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md)): New selection type.
- `oldSelection` (`java.util.List<int[]>`): Old selection intervals. An interval is an array with start 
   and end offsets or `null` if not interested. Each ContentInterval 
   contains the **inclusive** start selection offset and the **exclusive** end selection offset.
- `oldCaretOffset` (`int`): Old caret offset.
- `oldSelectionType` ([`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md)): Old selection type.

**Returns:** `void`

