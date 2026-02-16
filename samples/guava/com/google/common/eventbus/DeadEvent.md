# Class: `DeadEvent`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.DeadEvent`

## Description

Wraps an event that was posted, but which had no subscribers and thus could not be delivered.

 <p>Registering a DeadEvent subscriber is useful for debugging or logging, as it can detect
 misconfigurations in a system's event distribution.
**Author:** Cliff Biffle
**Since:** 10.0

## Fields

### `source`

**Type:** `java.lang.Object`

### `event`

**Type:** `java.lang.Object`

## Constructors

### `<init>(`java.lang.Object` source, `java.lang.Object` event)`

Creates a new DeadEvent.
@param source object broadcasting the DeadEvent (generally the `EventBus`).
@param event the event that could not be delivered.

## Methods

### `getSource()`

**Returns:** `java.lang.Object`

Returns the object that originated this event (<em>not</em> the object that originated the
 wrapped event). This is generally an `EventBus`.
@return the source of this event.

### `getEvent()`

**Returns:** `java.lang.Object`

Returns the wrapped, 'dead' event, which the system was unable to deliver to any registered
 subscriber.
@return the 'dead' event that could not be delivered.

### `toString()`

**Returns:** `java.lang.String`

