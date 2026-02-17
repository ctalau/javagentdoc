# Class: `AuthorCSSAlternativesCustomizer`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.css`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.css.AuthorCSSAlternativesCustomizer`

## Description

## Constructors

### `<init>()`

## Methods

### `customizeAvailableCSSGroups([`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../WSAuthorEditorPage.md) authorPage, `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>` availableCSSGroups)`

**Returns:** `void`

The groups are presented by the application in the Styles drop-down chooser.
 Each CSS group has a title and a set of CSS documents which can be applied.

### `customizeCSSGroupsToApply([`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../WSAuthorEditorPage.md) authorPage, `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>` proposedCSSGroupsToApply, `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>` allAvailableCSSGroups)`

**Returns:** `void`

### `cssGroupsAboutToBeChanged([`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../WSAuthorEditorPage.md) authorPage, `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>` proposedCSSGroupsToApply, `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup>` allAvailableCSSGroups)`

**Returns:** `void`

