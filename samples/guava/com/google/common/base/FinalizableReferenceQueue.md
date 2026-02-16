# Class: `FinalizableReferenceQueue`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FinalizableReferenceQueue`

**Implements:** [`java.io.Closeable`](../../../../java/io/Closeable.md)

## Description

A reference queue with an associated background thread that dequeues references and invokes
 {@link FinalizableReference#finalizeReferent()} on them.

 <p>Keep a strong reference to this object until all of the associated referents have been
 finalized. If this object is garbage collected earlier, the backing thread will not invoke {@code
 finalizeReferent()} on the remaining references.

 <p>As an example of how this is used, imagine you have a class {@code MyServer} that creates a
 {@link java.net.ServerSocket ServerSocket}, and you would like to ensure that the {@code
 ServerSocket} is closed even if the {@code MyServer} object is garbage-collected without calling
 its {@code close} method. You <em>could</em> use a finalizer to accomplish this, but that has a
 number of well-known problems. Here is how you might use this class instead:

 <pre>{@code
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
 }</pre>
@author Bob Lee
@since 2.0

## Fields

### `logger`

**Type:** [`java.util.logging.Logger`](../../../../java/util/logging/Logger.md)

### `FINALIZER_CLASS_NAME`

**Type:** `java.lang.String`

### `startFinalizer`

**Type:** `java.lang.reflect.Method`

Reference to Finalizer.startFinalizer().

### `queue`

**Type:** `java.lang.ref.ReferenceQueue<java.lang.Object>`

The actual reference queue that our background thread will poll.

### `frqRef`

**Type:** `java.lang.ref.PhantomReference<java.lang.Object>`

### `threadStarted`

**Type:** `boolean`

Whether or not the background thread started successfully.

## Constructors

### `<init>()`

Constructs a new queue.

## Methods

### `close()`

**Returns:** `void`

### `cleanUp()`

**Returns:** `void`

Repeatedly dequeues references from the queue and invokes {@link FinalizableReference#finalizeReferent()} on them until the queue is empty. This method is a
 no-op if the background thread was created successfully.

### `loadFinalizer([`com.google.common.base.FinalizableReferenceQueue.FinalizerLoader[]`](FinalizableReferenceQueue/FinalizerLoader.md) loaders)`

**Returns:** `java.lang.Class<?>`

Iterates through the given loaders until it finds one that can load Finalizer.
@return Finalizer.class

### `getStartFinalizer(`java.lang.Class<?>` finalizer)`

**Returns:** `java.lang.reflect.Method`

Looks up Finalizer.startFinalizer().

