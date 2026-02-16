# Class: `Reflection`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.Reflection`

## Description

Static utilities relating to Java reflection.
**Since:** 12.0

## Constructors

### `<init>()`

## Methods

### `getPackageName(`java.lang.Class<?>` clazz)`

**Returns:** `java.lang.String`

Returns the package name of `clazz` according to the Java Language Specification (section
 6.7). Unlike `Class.getPackage`, this method only parses the class name, without
 attempting to define the `Package` and hence load files.

### `getPackageName(`java.lang.String` classFullName)`

**Returns:** `java.lang.String`

Returns the package name of `classFullName` according to the Java Language Specification
 (section 6.7). Unlike `Class.getPackage`, this method only parses the class name, without
 attempting to define the `Package` and hence load files.

### `initialize(`java.lang.Class<?>[]` classes)`

**Returns:** `void`

Ensures that the given classes are initialized, as described in <a href="http://java.sun.com/docs/books/jls/third_edition/html/execution.html#12.4.2">JLS Section
 12.4.2</a>.

 <p>WARNING: Normally it's a smell if a class needs to be explicitly initialized, because static
 state hurts system maintainability and testability. In cases when you have no choice while
 interoperating with a legacy framework, this method helps to keep the code less ugly.
@throws ExceptionInInitializerError if an exception is thrown during initialization of a class

### `newProxy(`java.lang.Class<T>` interfaceType, `java.lang.reflect.InvocationHandler` handler)`

**Returns:** `T`

Returns a proxy instance that implements `interfaceType` by dispatching method
 invocations to `handler`. The class loader of `interfaceType` will be used to
 define the proxy class. To implement multiple interfaces or specify a class loader, use `Proxy.newProxyInstance`.
@throws IllegalArgumentException if `interfaceType` does not specify the type of a Java
     interface

