# Annotation_type: `WebappRestSafe`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappRestSafe`

**Implements:** `java.lang.annotation.Annotation`

## Description

An operation that simply inserts an XML fragment would be considered safe, while one that executes some JavaScript
 code provided by the user would be considered unsafe.
 
 If the operation has parameters with type ArgumentDescriptor#TYPE_XPATH_EXPRESSION, these parameters
 are checked to be safe to execute before the operation is invoked.

