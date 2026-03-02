# Class: `DITAIDElementLocator`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAIDElementLocator`

**Extends:** [`ro.sync.ecss.extensions.commons.IDElementLocator`](../commons/IDElementLocator.md)

## Description

## Fields

### `locateOnlyByElementID`

**Type:** `boolean`

## Constructors

### `<init>(IDTypeVerifier idVerifier, String link, boolean locateOnlyByElementID)`

**Parameters:**
- `idVerifier` ([`ro.sync.ecss.extensions.api.link.IDTypeVerifier`](../api/link/IDTypeVerifier.md)): Id type verifier
- `link` (`java.lang.String`): The reference link
- `locateOnlyByElementID` (`boolean`): `true` to only locate based on the element ID.

## Methods

### `startElement(String uri, String localName, String name, Attr[] atts)`

**Parameters:**
- `uri` (`java.lang.String`)
- `localName` (`java.lang.String`)
- `name` (`java.lang.String`)
- `atts` ([`ro.sync.ecss.extensions.api.link.Attr[]`](../api/link/Attr.md))

**Returns:** `boolean`

