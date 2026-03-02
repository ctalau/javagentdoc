# Class: `EventBus`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.EventBus`

## Description

Avoid EventBus

 
**We recommend against using EventBus.** It was designed many years ago, and newer
 libraries offer better ways to decouple components and react to events.

 
To decouple components, we recommend a dependency-injection framework. For Android code, most
 apps use [Dagger](https://dagger.dev). For server code, common options include [Guice](https://github.com/google/guice/wiki/Motivation) and [Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-introduction).
 Frameworks typically offer a way to register multiple listeners independently and then request
 them together as a set ([Dagger](https://dagger.dev/dev-guide/multibindings), [Guice](https://github.com/google/guice/wiki/Multibindings), [Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-autowired-annotation)).

 
To react to events, we recommend a reactive-streams framework like [RxJava](https://github.com/ReactiveX/RxJava/wiki) (supplemented with its [RxAndroid](https://github.com/ReactiveX/RxAndroid) extension if you are building for
 Android) or [Project Reactor](https://projectreactor.io/). (For the basics of
 translating code from using an event bus to using a reactive-streams framework, see these two
 guides: [1](https://blog.jkl.gg/implementing-an-event-bus-with-rxjava-rxbus/), [2](https://lorentzos.com/rxjava-as-event-bus-the-right-way-10a36bdd49ba).) Some usages
 of EventBus may be better written using [Kotlin coroutines](https://kotlinlang.org/docs/coroutines-guide.html), including [Flow](https://kotlinlang.org/docs/flow.html) and [Channels](https://kotlinlang.org/docs/channels.html). Yet other usages are better served
 by individual libraries that provide specialized support for particular use cases.

 
Disadvantages of EventBus include:

 

   - It makes the cross-references between producer and subscriber harder to find. This can
       complicate debugging, lead to unintentional reentrant calls, and force apps to eagerly
       initialize all possible subscribers at startup time.
   - It uses reflection in ways that break when code is processed by optimizers/minimizers like
       [R8 and Proguard](https://developer.android.com/studio/build/shrink-code).
   - It doesn't offer a way to wait for multiple events before taking action. For example, it
       doesn't offer a way to wait for multiple producers to all report that they're "ready," nor
       does it offer a way to batch multiple events from a single producer together.
   - It doesn't support backpressure and other features needed for resilience.
   - It doesn't provide much control of threading.
   - It doesn't offer much monitoring.
   - It doesn't propagate exceptions, so apps don't have a way to react to them.
   - It doesn't interoperate well with RxJava, coroutines, and other more commonly used
       alternatives.
   - It imposes requirements on the lifecycle of its subscribers. For example, if an event
       occurs between when one subscriber is removed and the next subscriber is added, the event
       is dropped.
   - Its performance is suboptimal, especially under Android.
   - It [doesn't support parameterized
       types](https://github.com/google/guava/issues/1431).
   - With the introduction of lambdas in Java 8, EventBus went from less verbose than listeners
       to [more verbose](https://github.com/google/guava/issues/3311).
 




 EventBus Summary

 
The EventBus allows publish-subscribe-style communication between components without requiring
 the components to explicitly register with one another (and thus be aware of each other). It is
 designed exclusively to replace traditional Java in-process event distribution using explicit
 registration. It is *not* a general-purpose publish-subscribe system, nor is it intended
 for interprocess communication.

 Receiving Events

 
To receive events, an object should:

 

   - Expose a public method, known as the *event subscriber*, which accepts a single
       argument of the type of event desired;
   - Mark it with a Subscribe annotation;
   - Pass itself to an EventBus instance's #register(Object) method.
 


 Posting Events

 
To post an event, simply provide the event object to the #post(Object) method. The
 EventBus instance will determine the type of event and route it to all registered listeners.

 
Events are routed based on their type &mdash; an event will be delivered to any subscriber for
 any type to which the event is *assignable.* This includes implemented interfaces, all
 superclasses, and all interfaces implemented by superclasses.

 
When post is called, all registered subscribers for an event are run in sequence, so
 subscribers should be reasonably quick. If an event may trigger an extended process (such as a
 database load), spawn a thread or queue it for later. (For a convenient way to do this, use an
 AsyncEventBus.)

 Subscriber Methods

 
Event subscriber methods must accept only one argument: the event.

 
Subscribers should not, in general, throw. If they do, the EventBus will catch and log the
 exception. This is rarely the right solution for error handling and should not be relied upon; it
 is intended solely to help find problems during development.

 
The EventBus guarantees that it will not call a subscriber method from multiple threads
 simultaneously, unless the method explicitly allows it by bearing the AllowConcurrentEvents annotation. If this annotation is not present, subscriber methods need not
 worry about being reentrant, unless also called from outside the EventBus.

 Dead Events

 
If an event is posted, but no registered subscribers can accept it, it is considered "dead."
 To give the system a second chance to handle dead events, they are wrapped in an instance of
 DeadEvent and reposted.

 
If a subscriber for a supertype of all events (such as Object) is registered, no event will
 ever be considered dead, and no DeadEvents will be generated. Accordingly, while DeadEvent
 extends Object, a subscriber registered to receive any Object will never receive a
 DeadEvent.

 
This class is safe for concurrent use.

 
See the Guava User Guide article on [EventBus](https://github.com/google/guava/wiki/EventBusExplained).

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

### `<init>(java.lang.String identifier)`

**Parameters:**
- `identifier` (`java.lang.String`): a brief name for this bus, for logging purposes. Should be a valid Java
     identifier.

### `<init>(com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler)`

**Parameters:**
- `exceptionHandler` ([`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md)): Handler for subscriber exceptions.

### `<init>(java.lang.String identifier, java.util.concurrent.Executor executor, com.google.common.eventbus.Dispatcher dispatcher, com.google.common.eventbus.SubscriberExceptionHandler exceptionHandler)`

**Parameters:**
- `identifier` (`java.lang.String`)
- `executor` (`java.util.concurrent.Executor`)
- `dispatcher` ([`com.google.common.eventbus.Dispatcher`](./Dispatcher.md))
- `exceptionHandler` ([`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md))

## Methods

### `identifier()`

**Returns:** `java.lang.String`

### `executor()`

**Returns:** `java.util.concurrent.Executor`

### `handleSubscriberException(java.lang.Throwable e, com.google.common.eventbus.SubscriberExceptionContext context)`

**Returns:** `void`

**Parameters:**
- `e` (`java.lang.Throwable`)
- `context` ([`com.google.common.eventbus.SubscriberExceptionContext`](./SubscriberExceptionContext.md))

### `register(java.lang.Object object)`

**Returns:** `void`

**Parameters:**
- `object` (`java.lang.Object`): object whose subscriber methods should be registered.

### `unregister(java.lang.Object object)`

**Returns:** `void`

**Parameters:**
- `object` (`java.lang.Object`): object whose subscriber methods should be unregistered.

### `post(java.lang.Object event)`

**Returns:** `void`

This method will return successfully after the
 event has been posted to all subscribers, and regardless of any exceptions thrown by
 subscribers.

 
If no subscribers have been subscribed for event's class, and event is not
 already a DeadEvent, it will be wrapped in a DeadEvent and reposted.

**Parameters:**
- `event` (`java.lang.Object`): event to post.

### `toString()`

**Returns:** `java.lang.String`

