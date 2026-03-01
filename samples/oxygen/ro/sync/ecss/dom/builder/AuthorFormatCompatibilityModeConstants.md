# Interface: `AuthorFormatCompatibilityModeConstants`

**Package:** [`ro.sync.ecss.dom.builder`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dom.builder.AuthorFormatCompatibilityModeConstants`

## Description

## Fields

### `FORMAT_COMPATIBILITY_NONE`

**Type:** `int`

Nothing special is done for compatibility purpose. 
 The formatting is the default one.

### `FORMAT_COMPATIBILITY_DO_NOT_BREAK_LINES_DO_NO_INDENT`

**Type:** `int`

"Do not break lines, do not indent", avoids emitting 
 newlines after elements start or end tags and no indent is used. The newlines 
 added by the user in elements with xml:space preserve, like pre elements 
 in HTML or codeblock in DITA are still emitted.

### `FORMAT_COMPATIBILITY_BREAKS_LINES_ONLY_BLOCKS_DO_NO_INDENT`

**Type:** `int`

"Break lines only after elements displayed as blocks, 
 do not indent" makes the editor emit newlines only after elements which have 
 a CSS display property of blocks, tables, list items, etc (not inlines). 
 In this case the CSS is dictating the formatting. The newlines added by the 
 user in elements with xml:space preserve, like pre elements in HTML or 
 codeblock in DITA are still emitted.

