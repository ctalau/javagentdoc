# Interface: `AuthorDocumentController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorDocumentController`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorAttributesController`](./AuthorAttributesController.md), [`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](./AuthorPseudoClassController.md)

## Description

## Methods

### `delete(`int` startOffset, `int` endOffset)`

**Returns:** `boolean`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `delete(`int` startOffset, `int` endOffset, `boolean` backspace)`

**Returns:** `boolean`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `deleteNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

### `replaceRoot([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) fragment)`

**Returns:** `void`

The fragment must contain only one element, otherwise the replacement will not be performed.

### `createDocumentFragment(`int` startOffset, `int` endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

The offset ranges must be from the current AuthorDocument.
 
The change tracking markers are automatically accepted in the fragment if change tracking is enabled in the document.
 

 

 The Author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `createDocumentFragment(`int` startOffset, `int` endOffset, `boolean` preserveTrackChange)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

The offset ranges must be from the current AuthorDocument.
 

 

 The Author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `createNewDocumentFragmentInContext(`java.lang.String` xmlFragment, `int` contentOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `createNewDocumentFragmentsInContext(`java.lang.String[]` xmlFragments, `int[]` contentOffsets)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)

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

### `createNewDocumentTextFragment(`java.lang.String` textFragment)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

The returned 
 fragment will contain **only a text node** and if the text fragment contains 
 mark-up, it will be escaped. If the text has mark-up and you actually want 
 to create author nodes from it then you should use #createNewDocumentFragmentInContext(String, int).

### `serializeFragmentToXML([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) fragment)`

**Returns:** `java.lang.String`

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

### `setAttribute(`java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md) value, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

If the element does not have the attribute specified by name, then an attribute with the specified value will be automatically created. 
 
 Attributes set in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) 
 will be subject to undo/redo.

### `setMultipleAttributes(`int` parentElementStartOffset, `int[]` elementOffsets, `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>` attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.

### `setMultipleDistinctAttributes(`int` parentElementStartOffset, `int[]` elementOffsets, `java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>>` attributes)`

**Returns:** `void`

### `removeAttribute(`java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

Attributes removed in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) will 
 be subject to undo/redo.

### `setPseudoClassUndoable(`java.lang.String` pseudoClass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

This change *IS* subject to undo/redo.

### `removePseudoClassUndoable(`java.lang.String` pseudoClass, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

This change *IS* subject to undo/redo.

### `getNodeAtOffset(`int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

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

### `getContentInformationAtOffset(`int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.content.OffsetInformation`](content/OffsetInformation.md)

If the offset is on a marker character the returned result will also contain the node which contains the range indicated by the marker.

### `createDocumentFragment([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, `boolean` copyContent)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

The node must be from the current AuthorDocument.
 The attributes of the elements will be copied. 
 If `copyContent` is `true` the node content 
 will be copied also.

### `getText(`int` offset, `int` length)`

**Returns:** `java.lang.String`

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

### `getTextContentLength()`

**Returns:** `int`

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

### `getUndoManager()`

**Returns:** `javax.swing.undo.UndoManager`

### `beginCompoundEdit()`

**Returns:** `void`

This method should be called
 to signal to the editing support that a complex editing operation begins.
 The editing operations that occur between `beginCompoundEdit()`
 and `endCompoundEdit()` methods calls are regarded by the UndoManager 
 as a single operation which can be undone/redone in one step.

### `endCompoundEdit()`

**Returns:** `void`

This method should be called
 to signal to the editing support that a complex editing operation ends.

### `cancelCompoundEdit()`

**Returns:** `void`

This method should be called
 to signal to the editing support that all edits performed so far inside a current compound edit must be undone.
 The editing operations that occurred after the previous call to `beginCompoundEdit()`
 will be undo by the UndoManager.
 
 Note that the compound edit does not end after a call to this method, so an
 explicit call to #endCompoundEdit() is required.

### `insertText(`int` offset, `java.lang.String` text)`

**Returns:** `void`

After the operation the caret will be 
 positioned at the end of the inserted text.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `insertXMLFragment(`java.lang.String` xmlFragment, `int` offset)`

**Returns:** `void`

After the operation the caret will be positioned in the first leaf of the fragment.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `insertXMLFragment(`java.lang.String` xmlFragment, `java.lang.String` xpathLocation, `java.lang.String` relativePosition)`

**Returns:** `void`

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at caret position and the `relativePosition` will be ignored. 
 

 After the operation the caret will be positioned in the first leaf of the fragment.

### `insertXMLFragment(`java.lang.String` xmlFragment, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) relativeTo, `java.lang.String` relativePosition)`

**Returns:** `void`

After the operation the caret will be positioned at the end of the inserted XML fragment.

### `insertXMLFragmentSchemaAware(`java.lang.String` xmlFragment, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

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

### `insertXMLFragmentSchemaAware(`java.lang.String` xmlFragment, `int` offset, `boolean` replaceSelection)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

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

### `insertXMLFragmentSchemaAware(`java.lang.String` xmlFragment, `int` offset, `int` actionID, `boolean` replaceSelection)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

The insertion behavior depends on the action type (specified by the 
 actionID parameter) that triggered it. For more details see the 
 description of #insertXMLFragmentSchemaAware(String, int, boolean).

### `insertFragment(`int` insertOffset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) frag)`

**Returns:** `void`

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `processContentRange(`int` startOffset, `int` endOffset, [`ro.sync.ecss.extensions.api.content.RangeProcessor`](content/RangeProcessor.md) rangeProcessor)`

**Returns:** `boolean`

You will receive a call back which will give you the AuthorDocumentFragment to process.
 When finished, the range will be replaced with the processed fragment. 
 
 
The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 
The start and end offsets pointed to by the AuthorNode can be retrieved using the
 `AuthorNode.getStartOffset()` and `AuthorNode.getEndOffset()`.
 

 
 
The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `insertFragmentSchemaAware(`int` insertOffset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) frag)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

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

### `surroundInFragment(`java.lang.String` xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `surroundInFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `surroundInText(`java.lang.String` header, `java.lang.String` footer, `int` startOffset, `int` endOffset)`

**Returns:** `void`

The method inserts the `header` at `startOffset` and 
 the `footer` at `endOffset`.
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `inInlineContext(`int` offset)`

**Returns:** `boolean`

The CSS **display** property is taken into account when determining this state.
 
 For example a text paragraph determines an **inline** context, 
 and for an offset inside this paragraph the method will return `true`. 
 For an offset between two paragraphs (considered to be **block** level) 
 the method will return `false`.

### `addAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md) listener)`

**Returns:** `void`

### `addAuthorPersistentHighlightListener([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md) listener)`

**Returns:** `void`

In the persistent highlights are included:
 

  -  Change tracking markers and comments
  -  Additional persistent highlights 
    added using AuthorPersistentHighlighter#addHighlight(int, int, java.util.LinkedHashMap)

### `removeAuthorPersistentHighlightListener([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsListener`](highlights/AuthorPersistentHighlightsListener.md) listener)`

**Returns:** `void`

### `addPersistentHighlightsFilter([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlightsFilter`](highlights/AuthorPersistentHighlightsFilter.md) persistentHighlightsFilter)`

**Returns:** `void`

A filter capable of filtering the highlights by author is present by default.

### `removeAuthorListener([`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md) listener)`

**Returns:** `void`

### `evaluateXPath(`java.lang.String` xpathExpression, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers)`

**Returns:** `java.lang.Object[]`

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

### `evaluateXPath(`java.lang.String` xpathExpression, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) contextNode, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers, [`ro.sync.ecss.extensions.api.XPathVersion`](./XPathVersion.md) xpathVersion)`

**Returns:** `java.lang.Object[]`

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

### `evaluateXPath(`java.lang.String` xpathExpression, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments)`

**Returns:** `java.lang.Object[]`

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

### `findNodesByXPath(`java.lang.String` xpathExpression, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

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

### `findNodesByXPath(`java.lang.String` xpathExpression, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

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

### `getXPathLocationOffset(`java.lang.String` xpathLocation, `java.lang.String` relativePosition, `boolean` processChangeMarkers)`

**Returns:** `int`

### `getXPathLocationOffset(`java.lang.String` xpathLocation, `java.lang.String` relativePosition)`

**Returns:** `int`

If change tracking (insert/remove/comment) markers exist in the document they will be ignored 
 and the XPath will return results as if the insert changes are accepted, the delete changes are rejected and the comment changes are ignored.

### `insertMultipleElements([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `java.lang.String[]` elementNames, `int[]` offsets, `java.lang.String` namespace)`

**Returns:** `void`

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

### `insertMultipleFragments([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragments, `int[]` offsets)`

**Returns:** `boolean`

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

### `multipleDelete([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `int[]` startOffsets, `int[]` endOffsets)`

**Returns:** `void`

Note: *The offsets must be in document order and the intervals must not 
 intersect with each other.*
 

 The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `setDoctype([`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md) docType)`

**Returns:** `void`

This is a good method to add new entities (regular or unparsed) to the internal document type of the document.
 
 WARNING: if these modifications affect regular entities already inserted and expanded,
 they will not be re-parsed and their old content will remain rendered as such.

### `getDoctype()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md)

### `getCommonParentNode([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md) doc, `int` startOffset, `int` endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

The author content contains the entire XML document text and special marker characters.
 Each author node points in the content to the start and end marker characters which are used to  
 delimit it's range.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 The image represents part of the document content and red markers represent special control
 characters which represent the node ranges.

### `getNodesToSelect(`int` selectionStart, `int` selectionEnd)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

Balanced selection and select all nodes between first and last selected nodes.

### `getCommonAncestor([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md) nodes)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getStrictCommonAncestor([`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md) nodes)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `getAuthorDocumentNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)

### `setDocumentFilter([`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md) authorDocumentFilter)`

**Returns:** `void`

### `getDocumentFilter()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentFilter`](./AuthorDocumentFilter.md)

### `getChars(`int` where, `int` len, `javax.swing.text.Segment` chars)`

**Returns:** `void`

Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
  
 

 
 

 
 Retrieves a portion of the content into the specified Segment.

### `getContentCharSequence()`

**Returns:** `java.lang.CharSequence`

Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()

### `getFilteredContent(`int` start, `int` end, [`ro.sync.ecss.extensions.api.filter.AuthorNodesFilter`](filter/AuthorNodesFilter.md) nodesFilter)`

**Returns:** [`ro.sync.ecss.extensions.api.filter.AuthorFilteredContent`](filter/AuthorFilteredContent.md)

The content represents the entire text content of the Author page + additional markers/sentinels 
 at offsets which are pointed to by the AuthorNodes.
 Each AuthorNode points to specific start and end character markers in the content.
 The start and end offsets pointed to by the AuthorNode can be retrieved using the
 AuthorNode.getStartOffset() and AuthorNode.getEndOffset()
 

 
 

 
 Retrieves the content from start to end offsets,

### `getAuthorSchemaManager()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](./AuthorSchemaManager.md)

### `insertXMLFragmentSchemaAware(`java.lang.String` xmlFragment, `java.lang.String` xpathLocation, `java.lang.String` relativePosition)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at caret position and the `relativePosition` will be ignored. 
 

 
For more details about schema aware solutions see comments from #insertXMLFragmentSchemaAware(String, int) method.

### `insertXMLFragmentSchemaAware(`java.lang.String` xmlFragment, `java.lang.String` xpathLocation, `java.lang.String` relativePosition, `boolean` insertEvenIfInvalid)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](schemaaware/SchemaAwareHandlerResult.md)

Note: if the `xpathLocation` is not specified then the XML fragment 
 will be inserted at caret position and the `relativePosition` will be ignored. 
 

 
For more details about schema aware solutions see comments from #insertXMLFragmentSchemaAware(String, int) method.

### `insertElement(`int` caretOffset, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) element)`

**Returns:** `boolean`

### `createElement(`java.lang.String` qName)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

Please note that this method does not insert the default attributes from the 
 schema so it is recommended to use #createNewDocumentFragmentInContext(String, int)
 instead, if it is possible.

### `isEditable([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

A node is not editable for one of the following cases:
 

   - the CSS property 'editable' is to 'false';

   - the node is entirely included into a DELETED change marker.

### `renameElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) contextNode, `java.lang.String` newName)`

**Returns:** `void`

### `getTextContentIterator(`int` startOffset, `int` endOffset)`

**Returns:** [`ro.sync.ecss.extensions.api.content.TextContentIterator`](content/TextContentIterator.md)

### `createPositionInContent(`int` offset)`

**Returns:** `javax.swing.text.Position`

The position is updated automatically when modifications occur before it. 
 It behaves exactly like a javax.swing.text.Position added to a swing Document.

### `addClipboardFragmentProcessor([`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](content/ClipboardFragmentProcessor.md) clipboardFragmentProcessor)`

**Returns:** `void`

The processor specified in the ExtensionsBundle will have maximum priority.

### `removeClipboardFragmentProcessor([`ro.sync.ecss.extensions.api.content.ClipboardFragmentProcessor`](content/ClipboardFragmentProcessor.md) clipboardFragmentProcessor)`

**Returns:** `void`

### `addUniqueAttributesProcessor([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md) uniqueAttributesProcessor)`

**Returns:** `void`

The processor can also specify which attributes can be copied on split.
 
 The UniqueAttributesRecognizer specified in the ExtensionsBundle will have maximum priority.

### `getUniqueAttributesProcessor()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md)

### `removeUniqueAttributesProcessor([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md) uniqueAttributesProcessor)`

**Returns:** `void`

The processor can also specify which attributes can be copied on split.
 
 The UniqueAttributesRecognizer specified in the ExtensionsBundle will have maximum priority.

### `findNodesByXPath(`java.lang.String` xpathExpression, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) contextNode, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

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

### `findNodesByXPath(`java.lang.String` xpathExpression, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) contextNode, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers, [`ro.sync.ecss.extensions.api.XPathVersion`](./XPathVersion.md) xpathVersion)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

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

### `findNodesByXPath(`java.lang.String` xpathExpression, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) contextNode, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers, [`ro.sync.ecss.extensions.api.XPathVersion`](./XPathVersion.md) xpathVersion, `boolean` transparentReferences)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode[]`](node/AuthorNode.md)

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

### `evaluateXPath(`java.lang.String` xpathExpression, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) contextNode, `boolean` ignoreTexts, `boolean` ignoreCData, `boolean` ignoreComments, `boolean` processChangeMarkers)`

**Returns:** `java.lang.Object[]`

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

### `unwrapDocumentFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) fragmentToUnwrap)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

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

### `getUnparsedEntityUri([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) contextNode, `java.lang.String` entityName)`

**Returns:** `java.lang.String`

### `refreshNodeReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `void`

If a node has expanded references on it created using the "ro.sync.ecss.extensions.api.AuthorReferenceResolver" API this method
 will call again the API to provide a fresh reference content for the node.

### `setRenderingInfoChangedListener([`ro.sync.ecss.component.RenderingInfoChangedListener`](../../component/RenderingInfoChangedListener.md) listener)`

**Returns:** `void`

The rendering info is represented by the node's styles computed from
 the associated CSS stylesheet and its content.

### `getXPathExpression(`int` offset)`

**Returns:** `java.lang.String`

The offset must be a valid document offset.
 

 Nodes deleted with change tracking are also considered when creating the 
 context for the XPath expression.
 
**Note:** If the offset is inside an expanded reference (for example an 
 XIncluded content) the reference is transparent. The result will be just as
 the reference was replaced with the refered content.

### `getXPathExpression(`int` offset, `boolean` processChanges)`

**Returns:** `java.lang.String`

The offset must be a valid document offset.
 

 **Note:** If the offset is inside an expanded reference (for example an 
 XIncluded content) the reference is transparent. The result will be just as
 the reference was replaced with the refered content.

### `getXPathExpressionBuilder(`int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorXPathExpressionBuilder`](./AuthorXPathExpressionBuilder.md)

The offset must be a valid document offset.
 

 **Note:** If the offset is inside an expanded reference (for example an 
 XIncluded content) the reference is transparent. The result will be just as
 the reference was replaced with the refered content.

### `disableLayoutUpdate()`

**Returns:** `void`

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

### `enableLayoutUpdate([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) ancestorOfChanges)`

**Returns:** `void`

Enables the layout update on model changes that was previously disabled 
 using AuthorDocumentController#disableLayoutUpdate() and fires
 the required notifications to update the views and styles.

### `split([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) toSplit, `int` splitOffset)`

**Returns:** `boolean`

### `getFilteredText(`int` offset, `int` length)`

**Returns:** `java.lang.String`

The content marked as deleted (using change tracking) will be filtered out.
 Also the special sentinel characters are removed.

### `markSelection(`java.util.List<int[]>` newSelection, `int` newCaretOffset, [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md) newSelectionType, `java.util.List<int[]>` oldSelection, `int` oldCaretOffset, [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md) oldSelectionType)`

**Returns:** `void`

It also keeps 
 and restores the selection when undo and redo actions are performed.

