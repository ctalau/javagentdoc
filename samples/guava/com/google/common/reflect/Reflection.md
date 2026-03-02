# Class: `Reflection`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Reflection`

## Description

## Constructors

### `<init>()`

## Methods

### `getPackageName(Class<?> clazz)`

Unlike Class#getPackage, this method only parses the class name, without
 attempting to define the Package and hence load files.

**Parameters:**
- `clazz` (`java.lang.Class<?>`)

**Returns:** `java.lang.String`

### `getPackageName(String classFullName)`

Unlike Class#getPackage, this method only parses the class name, without
 attempting to define the Package and hence load files.

**Parameters:**
- `classFullName` (`java.lang.String`)

**Returns:** `java.lang.String`

### `initialize(Class<?>[] classes)`

WARNING: Normally it's a smell if a class needs to be explicitly initialized, because static
 state hurts system maintainability and testability. In cases when you have no choice while
 interoperating with a legacy framework, this method helps to keep the code less ugly.

**Parameters:**
- `classes` (`java.lang.Class<?>[]`)

**Returns:** `void`

### `newProxy(Class<T> interfaceType, InvocationHandler handler)`

The class loader of interfaceType will be used to
 define the proxy class. To implement multiple interfaces or specify a class loader, use Proxy#newProxyInstance.

**Parameters:**
- `interfaceType` (`java.lang.Class<T>`)
- `handler` (`java.lang.reflect.InvocationHandler`)

**Returns:** `T`

