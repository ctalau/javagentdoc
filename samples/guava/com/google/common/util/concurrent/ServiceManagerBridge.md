# Interface: `ServiceManagerBridge`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ServiceManagerBridge`

## Description

Superinterface of {@link ServiceManager} to introduce a bridge method for {@code
 servicesByState()}, to ensure binary compatibility with older Guava versions that specified
 {@code servicesByState()} to return {@code ImmutableMultimap}.

## Methods

### `servicesByState()`

**Returns:** [`com.google.common.collect.ImmutableMultimap<com.google.common.util.concurrent.Service.State,com.google.common.util.concurrent.Service>`](../../collect/ImmutableMultimap.md)

