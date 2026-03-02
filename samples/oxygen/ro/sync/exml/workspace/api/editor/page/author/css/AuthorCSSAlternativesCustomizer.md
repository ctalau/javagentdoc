# Class: `AuthorCSSAlternativesCustomizer`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.css`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer`

## Description

## Constructors

### `<init>()`

## Methods

### `customizeAvailableCSSGroups(ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage authorPage, java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup> availableCSSGroups)`

**Returns:** `void`

The groups are presented by the application in the Styles drop-down chooser.
 Each CSS group has a title and a set of CSS documents which can be applied.

**Parameters:**
- `authorPage` ([`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../WSAuthorEditorPage.md)): The page for which we request the CSS groups. This can be `null` if the method is called outside an Editor context. 
 (case: transforming to PDF (with Price CSS) of a topic or map directly from the project, without opening it.)
- `availableCSSGroups` (`java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>`): The groups which would be presented by the application in the Styles drop-down chooser 
 if not changed by this customizer. Each group is presented as a separate entry.

### `customizeCSSGroupsToApply(ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage authorPage, java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup> proposedCSSGroupsToApply, java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup> allAvailableCSSGroups)`

**Returns:** `void`

**Parameters:**
- `authorPage` ([`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../WSAuthorEditorPage.md)): The page for which we request the CSS groups.
- `proposedCSSGroupsToApply` (`java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>`): The CSS groups which will be applied on the loaded XML by the application if the customizer does not perform modifications.
- `allAvailableCSSGroups` (`java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>`): The list of all available CSS groups (the groups also available in the Styles drop-down).

### `cssGroupsAboutToBeChanged(ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage authorPage, java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup> proposedCSSGroupsToApply, java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup> allAvailableCSSGroups)`

**Returns:** `void`

**Parameters:**
- `authorPage` ([`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../WSAuthorEditorPage.md)): The page for which we request the CSS groups.
- `proposedCSSGroupsToApply` (`java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>`): The CSS groups which will be applied on the XML by the application if the customizer does not perform modifications.
- `allAvailableCSSGroups` (`java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>`): The list of all available CSS groups (the groups also available in the Styles drop-down).

