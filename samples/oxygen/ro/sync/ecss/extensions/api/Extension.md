# Interface: `Extension`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.Extension`

## Description

This interface is extended by two more specific interfaces
 SWTExtension and AWTExtension which divide the extensions
 into two subcategories SWT Eclipse extensions and AWT extensions.
 There are several kinds of extensions:
 

 - 
 ExtensionsBundle representing a bundle for all extensions handlers,
 
- 
 AuthorExtensionStateListener notified when the Document Type where
 the listener is defined was activated or deactivated in the detection process,
 
- 
 AuthorOperation defining an author extension operation, 
 
- 
 AuthorReferenceResolver for the custom handlers used to expand content
 references, 
 
- 
 AuthorTableCellSpanProvider for classes which are responsible for
 providing information about the cell spanning,
 
- 
 AuthorTableColumnWidthProvider for classes which are responsible for 
 providing information and handling modifications regarding table and column 
 widths,
 
- 
 com.oxygenxml.editor.editors.TextDnDListener, 
 com.oxygenxml.editor.editors.author.AuthorDnDListener 
 and  ro.sync.exml.editor.xmleditor.pageauthor.AuthorDnDListener 
 extension listener for drag and drop operations,
 
- 
 DocumentTypeCustomRuleMatcher for providing custom matching to the
 document type it belongs to, 
 
- 
 ro.sync.ecss.extensions.api.link.ElementLocatorProvider capable of locating an element pointed by 
 the supplied link,
 
- 
 ro.sync.contentcompletion.xml.SchemaManagerFilter filter for the schema manager, 
 
- 
 StylesFilter filter for the stylesheet's styles.

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

