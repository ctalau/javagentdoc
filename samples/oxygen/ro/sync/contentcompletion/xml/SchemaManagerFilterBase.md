# Class: `SchemaManagerFilterBase`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.SchemaManagerFilterBase`

**Implements:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](./SchemaManagerFilter.md)

## Description

This should be implemented if the
 list of content completion proposals must be filtered based on some criteria or 
 some new entries need to be added.

## Constructors

### `<init>()`

## Methods

### `getElementDescription([`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md) element, [`ro.sync.contentcompletion.xml.Context`](./Context.md) ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md)

### `getAttributeDescription([`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md) attribute, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](./WhatPossibleValuesHasAttributeContext.md) ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md)

### `invalidate()`

**Returns:** `void`

