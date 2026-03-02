# Class: `DeadEvent`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.DeadEvent`

## Description

Registering a DeadEvent subscriber is useful for debugging or logging, as it can detect
 misconfigurations in a system's event distribution.

## Fields

### `source`

**Type:** `java.lang.Object`

### `event`

**Type:** `java.lang.Object`

## Constructors

### `<init>(java.lang.Object source, java.lang.Object event)`

**Parameters:**
- `source` (`java.lang.Object`): object broadcasting the DeadEvent (generally the EventBus).
- `event` (`java.lang.Object`): the event that could not be delivered.

## Methods

### `getSource()`

**Returns:** `java.lang.Object`

This is generally an EventBus.

### `getEvent()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

