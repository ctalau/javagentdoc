# Class: `GwtFluentFutureCatchingSpecialization`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization`

**Extends:** [`com.google.common.util.concurrent.AbstractFuture<V>`](./AbstractFuture.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Hidden superclass of {@link FluentFuture} that provides us a place to declare special GWT
 versions of the {@link FluentFuture#catching(Class, com.google.common.base.Function) FluentFuture.catching} family of methods. Those versions have slightly different signatures.

## Constructors

### `<init>()`

