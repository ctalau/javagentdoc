# Annotation_type: `AllowConcurrentEvents`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.AllowConcurrentEvents`

**Implements:** `java.lang.annotation.Annotation`

## Description

This annotation indicates that EventBus
 may invoke the event subscriber simultaneously from multiple threads.

 
This does not mark the method, and so should be used in combination with Subscribe.

