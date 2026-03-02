# Interface: `ElementLocatorProvider`

**Package:** [`ro.sync.ecss.extensions.api.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.link.ElementLocatorProvider`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](../Extension.md)

## Description

The ElementLocator is capable
 of locating an element pointed by the supplied link.

## Methods

### `getElementLocator(ro.sync.ecss.extensions.api.link.IDTypeVerifier idVerifier, java.lang.String link)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](./IDTypeVerifier.md)): Verifies if a given attribute type is ID.
- `link` (`java.lang.String`): The link that points to the element.

**Returns:** [`ro.sync.ecss.extensions.api.link.ElementLocator`](./ElementLocator.md)

