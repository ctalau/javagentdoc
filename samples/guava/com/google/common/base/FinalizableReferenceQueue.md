# Class: `FinalizableReferenceQueue`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizableReferenceQueue`

**Implements:** `java.io.Closeable`

## Description

Keep a strong reference to this object until all of the associated referents have been
 finalized. If this object is garbage collected earlier, the backing thread will not invoke 
 finalizeReferent() on the remaining references.

 
As an example of how this is used, imagine you have a class MyServer that creates a
 ServerSocket, and you would like to ensure that the 
 ServerSocket is closed even if the MyServer object is garbage-collected without calling
 its close method. You *could* use a finalizer to accomplish this, but that has a
 number of well-known problems. Here is how you might use this class instead:

 

```

 public class MyServer implements Closeable {
   private static final FinalizableReferenceQueue frq = new FinalizableReferenceQueue();
   // You might also share this between several objects.

   private static final Set<Reference<?>> references = Sets.newConcurrentHashSet();
   // This ensures that the FinalizablePhantomReference itself is not garbage-collected.

   private final ServerSocket serverSocket;

   private MyServer(...) {
     ...
     this.serverSocket = new ServerSocket(...);
     ...
   }

   public static MyServer create(...) {
     MyServer myServer = new MyServer(...);
     final ServerSocket serverSocket = myServer.serverSocket;
     Reference<?> reference = new FinalizablePhantomReference<MyServer>(myServer, frq) {
       public void finalizeReferent() {
         references.remove(this):
         if (!serverSocket.isClosed()) {
           ...log a message about how nobody called close()...
           try {
             serverSocket.close();
           } catch (IOException e) {
             ...
           }
         }
       }
     };
     references.add(reference);
     return myServer;
   }

   public void close() {
     serverSocket.close();
   }
 }
 
```

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

### `FINALIZER_CLASS_NAME`

**Type:** `java.lang.String`

### `startFinalizer`

**Type:** `java.lang.reflect.Method`

### `queue`

**Type:** `java.lang.ref.ReferenceQueue<java.lang.Object>`

### `frqRef`

**Type:** `java.lang.ref.PhantomReference<java.lang.Object>`

### `threadStarted`

**Type:** `boolean`

## Constructors

### `<init>()`

## Methods

### `close()`

**Returns:** `void`

### `cleanUp()`

This method is a
 no-op if the background thread was created successfully.

**Returns:** `void`

### `loadFinalizer(FinalizableReferenceQueue.FinalizerLoader[] loaders)`

**Parameters:**
- `loaders` (`com.google.common.base.FinalizableReferenceQueue.FinalizerLoader[]`)

**Returns:** `java.lang.Class<?>`

### `getStartFinalizer(Class<?> finalizer)`

**Parameters:**
- `finalizer` (`java.lang.Class<?>`)

**Returns:** `java.lang.reflect.Method`

