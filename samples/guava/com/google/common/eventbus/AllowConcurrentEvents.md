# Annotation_type: `AllowConcurrentEvents`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.AllowConcurrentEvents`

**Implements:** `java.lang.annotation.Annotation`

## Description

Marks an event subscriber method as being thread-safe. This annotation indicates that EventBus
 may invoke the event subscriber simultaneously from multiple threads.

 <p>This does not mark the method, and so should be used in combination with {@link Subscribe}.
@author Cliff Biffle
@since 10.0

