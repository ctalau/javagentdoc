# Class: `Reflection`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Reflection`

## Description

## Constructors

### `<init>()`

## Methods

### `getPackageName(java.lang.Class<?> clazz)`

**Returns:** `java.lang.String`

Unlike Class#getPackage, this method only parses the class name, without
 attempting to define the Package and hence load files.

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

### `getPackageName(java.lang.String classFullName)`

**Returns:** `java.lang.String`

Unlike Class#getPackage, this method only parses the class name, without
 attempting to define the Package and hence load files.

**Parameters:**
- `classFullName` (`java.lang.String`)

### `initialize(java.lang.Class<?>[] classes)`

**Returns:** `void`

WARNING: Normally it's a smell if a class needs to be explicitly initialized, because static
 state hurts system maintainability and testability. In cases when you have no choice while
 interoperating with a legacy framework, this method helps to keep the code less ugly.

**Parameters:**
- `classes` (`java.lang.Class<?>[]`)

### `newProxy(java.lang.Class<T> interfaceType, java.lang.reflect.InvocationHandler handler)`

**Returns:** `T`

The class loader of interfaceType will be used to
 define the proxy class. To implement multiple interfaces or specify a class loader, use Proxy#newProxyInstance.

**Parameters:**
- `interfaceType` (`java.lang.Class<T>`)
- `handler` (`java.lang.reflect.InvocationHandler`)

