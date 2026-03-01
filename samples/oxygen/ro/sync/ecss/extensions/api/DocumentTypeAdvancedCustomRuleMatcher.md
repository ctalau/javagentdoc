# Class: `DocumentTypeAdvancedCustomRuleMatcher`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DocumentTypeAdvancedCustomRuleMatcher`

**Implements:** [`ro.sync.ecss.extensions.api.DocumentTypeCustomRuleMatcher`](./DocumentTypeCustomRuleMatcher.md)

## Description

## Constructors

### `<init>()`

## Methods

### `matches(`java.lang.String` systemID, `java.lang.String` rootNamespace, `java.lang.String` rootLocalName, `java.lang.String` doctypePublicID, `org.xml.sax.Attributes` rootAttributes)`

**Returns:** `boolean`

### `matches(`java.lang.String` systemID, `java.lang.String` rootNamespace, `java.lang.String` rootLocalName, `java.lang.String` doctypePublicID, `org.xml.sax.Attributes` rootAttributes, `java.io.Reader` contentReader)`

**Returns:** `boolean`

This method receives a reader over the entire content.

### `matches(`java.lang.String` systemID, `java.lang.String` rootNamespace, `java.lang.String` rootLocalName, `java.lang.String` doctypePublicID, `java.lang.String` doctypeSystemID, `org.xml.sax.Attributes` rootAttributes, `java.util.Map<java.lang.String,java.lang.String>` queryParameters, `java.io.Reader` contentReader)`

**Returns:** `boolean`

This method receives a reader over the entire content.

