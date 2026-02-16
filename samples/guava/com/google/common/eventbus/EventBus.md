# Class: `EventBus`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.EventBus`

## Description

Dispatches events to listeners, and provides ways for listeners to register themselves.


 <h2>Avoid EventBus</h2>

 <p><b>We recommend against using EventBus.</b> It was designed many years ago, and newer
 libraries offer better ways to decouple components and react to events.

 <p>To decouple components, we recommend a dependency-injection framework. For Android code, most
 apps use <a href="https://dagger.dev">Dagger</a>. For server code, common options include <a href="https://github.com/google/guice/wiki/Motivation">Guice</a> and <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-introduction">Spring</a>.
 Frameworks typically offer a way to register multiple listeners independently and then request
 them together as a set (<a href="https://dagger.dev/dev-guide/multibindings">Dagger</a>, <a href="https://github.com/google/guice/wiki/Multibindings">Guice</a>, <a href="https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-autowired-annotation">Spring</a>).

 <p>To react to events, we recommend a reactive-streams framework like <a href="https://github.com/ReactiveX/RxJava/wiki">RxJava</a> (supplemented with its <a href="https://github.com/ReactiveX/RxAndroid">RxAndroid</a> extension if you are building for
 Android) or <a href="https://projectreactor.io/">Project Reactor</a>. (For the basics of
 translating code from using an event bus to using a reactive-streams framework, see these two
 guides: <a href="https://blog.jkl.gg/implementing-an-event-bus-with-rxjava-rxbus/">1</a>, <a href="https://lorentzos.com/rxjava-as-event-bus-the-right-way-10a36bdd49ba">2</a>.) Some usages
 of EventBus may be better written using <a href="https://kotlinlang.org/docs/coroutines-guide.html">Kotlin coroutines</a>, including <a href="https://kotlinlang.org/docs/flow.html">Flow</a> and <a href="https://kotlinlang.org/docs/channels.html">Channels</a>. Yet other usages are better served
 by individual libraries that provide specialized support for particular use cases.

 <p>Disadvantages of EventBus include:

 <ul>
   <li>It makes the cross-references between producer and subscriber harder to find. This can
       complicate debugging, lead to unintentional reentrant calls, and force apps to eagerly
       initialize all possible subscribers at startup time.
   <li>It uses reflection in ways that break when code is processed by optimizers/minimizers like
       <a href="https://developer.android.com/studio/build/shrink-code">R8 and Proguard</a>.
   <li>It doesn't offer a way to wait for multiple events before taking action. For example, it
       doesn't offer a way to wait for multiple producers to all report that they're "ready," nor
       does it offer a way to batch multiple events from a single producer together.
   <li>It doesn't support backpressure and other features needed for resilience.
   <li>It doesn't provide much control of threading.
   <li>It doesn't offer much monitoring.
   <li>It doesn't propagate exceptions, so apps don't have a way to react to them.
   <li>It doesn't interoperate well with RxJava, coroutines, and other more commonly used
       alternatives.
   <li>It imposes requirements on the lifecycle of its subscribers. For example, if an event
       occurs between when one subscriber is removed and the next subscriber is added, the event
       is dropped.
   <li>Its performance is suboptimal, especially under Android.
   <li>It <a href="https://github.com/google/guava/issues/1431">doesn't support parameterized
       types</a>.
   <li>With the introduction of lambdas in Java 8, EventBus went from less verbose than listeners
       to <a href="https://github.com/google/guava/issues/3311">more verbose</a>.
 </ul>



 <h2>EventBus Summary</h2>

 <p>The EventBus allows publish-subscribe-style communication between components without requiring
 the components to explicitly register with one another (and thus be aware of each other). It is
 designed exclusively to replace traditional Java in-process event distribution using explicit
 registration. It is <em>not</em> a general-purpose publish-subscribe system, nor is it intended
 for interprocess communication.

 <h2>Receiving Events</h2>

 <p>To receive events, an object should:

 <ol>
   <li>Expose a public method, known as the <i>event subscriber</i>, which accepts a single
       argument of the type of event desired;
   <li>Mark it with a `Subscribe` annotation;
   <li>Pass itself to an EventBus instance's `register(Object)` method.
 </ol>

 <h2>Posting Events</h2>

 <p>To post an event, simply provide the event object to the `post(Object)` method. The
 EventBus instance will determine the type of event and route it to all registered listeners.

 <p>Events are routed based on their type &mdash; an event will be delivered to any subscriber for
 any type to which the event is <em>assignable.</em> This includes implemented interfaces, all
 superclasses, and all interfaces implemented by superclasses.

 <p>When `post` is called, all registered subscribers for an event are run in sequence, so
 subscribers should be reasonably quick. If an event may trigger an extended process (such as a
 database load), spawn a thread or queue it for later. (For a convenient way to do this, use an
 `AsyncEventBus`.)

 <h2>Subscriber Methods</h2>

 <p>Event subscriber methods must accept only one argument: the event.

 <p>Subscribers should not, in general, throw. If they do, the EventBus will catch and log the
 exception. This is rarely the right solution for error handling and should not be relied upon; it
 is intended solely to help find problems during development.

 <p>The EventBus guarantees that it will not call a subscriber method from multiple threads
 simultaneously, unless the method explicitly allows it by bearing the `AllowConcurrentEvents` annotation. If this annotation is not present, subscriber methods need not
 worry about being reentrant, unless also called from outside the EventBus.

 <h2>Dead Events</h2>

 <p>If an event is posted, but no registered subscribers can accept it, it is considered "dead."
 To give the system a second chance to handle dead events, they are wrapped in an instance of
 `DeadEvent` and reposted.

 <p>If a subscriber for a supertype of all events (such as Object) is registered, no event will
 ever be considered dead, and no DeadEvents will be generated. Accordingly, while DeadEvent
 extends `Object`, a subscriber registered to receive any Object will never receive a
 DeadEvent.

 <p>This class is safe for concurrent use.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/EventBusExplained">`EventBus`</a>.
**Author:** Cliff Biffle
**Since:** 10.0

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

### `identifier`

**Type:** `java.lang.String`

### `executor`

**Type:** `java.util.concurrent.Executor`

### `exceptionHandler`

**Type:** [`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md)

### `subscribers`

**Type:** [`com.google.common.eventbus.SubscriberRegistry`](./SubscriberRegistry.md)

### `dispatcher`

**Type:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

## Constructors

### `<init>()`

Creates a new EventBus named "default".

### `<init>(`java.lang.String` identifier)`

Creates a new EventBus with the given `identifier`.
@param identifier a brief name for this bus, for logging purposes. Should be a valid Java
     identifier.

### `<init>([`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md) exceptionHandler)`

Creates a new EventBus with the given `SubscriberExceptionHandler`.
@param exceptionHandler Handler for subscriber exceptions.
**Since:** 16.0

### `<init>(`java.lang.String` identifier, `java.util.concurrent.Executor` executor, [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md) dispatcher, [`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md) exceptionHandler)`

## Methods

### `identifier()`

**Returns:** `java.lang.String`

Returns the identifier for this event bus.
**Since:** 19.0

### `executor()`

**Returns:** `java.util.concurrent.Executor`

Returns the default executor this event bus uses for dispatching events to subscribers.

### `handleSubscriberException(`java.lang.Throwable` e, [`com.google.common.eventbus.SubscriberExceptionContext`](./SubscriberExceptionContext.md) context)`

**Returns:** `void`

Handles the given exception thrown by a subscriber with the given context.

### `register(`java.lang.Object` object)`

**Returns:** `void`

Registers all subscriber methods on `object` to receive events.
@param object object whose subscriber methods should be registered.

### `unregister(`java.lang.Object` object)`

**Returns:** `void`

Unregisters all subscriber methods on a registered `object`.
@param object object whose subscriber methods should be unregistered.
@throws IllegalArgumentException if the object was not previously registered.

### `post(`java.lang.Object` event)`

**Returns:** `void`

Posts an event to all registered subscribers. This method will return successfully after the
 event has been posted to all subscribers, and regardless of any exceptions thrown by
 subscribers.

 <p>If no subscribers have been subscribed for `event`'s class, and `event` is not
 already a `DeadEvent`, it will be wrapped in a DeadEvent and reposted.
@param event event to post.

### `toString()`

**Returns:** `java.lang.String`

