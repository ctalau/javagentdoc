# Class: `DefaultElementLocatorProvider`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.DefaultElementLocatorProvider`

**Implements:** [`ro.sync.ecss.extensions.api.link.ElementLocatorProvider`](../api/link/ElementLocatorProvider.md)

## Description

Depending on the link structure the following cases are covered:
 

 - XInclude element scheme :  `element(/1/2)`
 
 
 see [http://www.w3.org/TR/2003/REC-xptr-element-20030325/](http://www.w3.org/TR/2003/REC-xptr-element-20030325/)
 

 - ID based links : the link represents the value of an attribute of type ID.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getElementLocator(IDTypeVerifier idVerifier, String link)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md))
- `link` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](../api/link/ElementLocator.md)

### `getDescription()`

**Returns:** `java.lang.String`

