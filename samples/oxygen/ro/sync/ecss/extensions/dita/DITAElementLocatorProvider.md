# Class: `DITAElementLocatorProvider`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAElementLocatorProvider`

**Extends:** [`ro.sync.ecss.extensions.commons.DefaultElementLocatorProvider`](../commons/DefaultElementLocatorProvider.md)

## Description

See:
  

  [
  http://docs.oasis-open.org/dita/v1.0/langspec/relatedl.html
  ](http://docs.oasis-open.org/dita/v1.0/langspec/relatedl.html)
  

  [
  http://docs.oasis-open.org/dita/v1.1/OS/langspec/common/theconrefattribute.html
  ](http://docs.oasis-open.org/dita/v1.1/OS/langspec/common/theconrefattribute.html)
  

  [
  http://docs.oasis-open.org/dita/v1.0/langspec/xref.html
  ](http://docs.oasis-open.org/dita/v1.0/langspec/xref.html)

## Fields

### `locateInsideDITAMap`

**Type:** `boolean`

## Constructors

### `<init>()`

### `<init>(boolean locateInsideDITAMap)`

**Parameters:**
- `locateInsideDITAMap` (`boolean`): `true` if we need to locate inside a DITA Map

## Methods

### `getElementLocator(ro.sync.ecss.extensions.api.link.IDTypeVerifier idVerifier, java.lang.String link)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md))
- `link` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](../api/link/ElementLocator.md)

