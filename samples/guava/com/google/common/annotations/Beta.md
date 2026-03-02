# Annotation_type: `Beta`

**Package:** [`com.google.common.annotations`](README.md)

**Fully Qualified Name:** `com.google.common.annotations.Beta`

**Implements:** `java.lang.annotation.Annotation`

## Description

An API bearing this annotation is exempt from any
 compatibility guarantees made by its containing library. Note that the presence of this
 annotation implies nothing about the quality or performance of the API in question, only the fact
 that it is not "API-frozen."

 
It is generally safe for *applications* to depend on beta APIs, at the cost of some extra
 work during upgrades. However it is generally inadvisable for *libraries* (which get
 included on users' CLASSPATHs, outside the library developers' control) to do so.

