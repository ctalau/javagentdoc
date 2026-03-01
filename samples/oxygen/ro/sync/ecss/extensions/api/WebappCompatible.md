# Annotation_type: `WebappCompatible`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.WebappCompatible`

**Implements:** `java.lang.annotation.Annotation`

## Description

An action that has in 
 its configuration an operation that is not webapp compatible will not be
 available in webapp. 
 
 If the annotation is not present, we assume that the operation is not webapp
 compatible.
 
 One reason for an operation not to be webapp-compatible is that it shows a 
 Swing dialog.

## Methods

### `value()`

**Returns:** `boolean`

