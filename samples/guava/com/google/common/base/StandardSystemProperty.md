# Enum: `StandardSystemProperty`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.StandardSystemProperty`

## Description

Represents a {@linkplain System#getProperties() standard system property}.
@author Kurt Alfred Kluever
@since 15.0

## Fields

### `key`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` key)`

## Methods

### `values()`

**Returns:** [`com.google.common.base.StandardSystemProperty[]`](./StandardSystemProperty.md)

### `valueOf(`java.lang.String` name)`

**Returns:** [`com.google.common.base.StandardSystemProperty`](./StandardSystemProperty.md)

### `key()`

**Returns:** `java.lang.String`

Returns the key used to look up this system property.

### `value()`

**Returns:** `java.lang.String`

Returns the current value for this system property by delegating to {@link System#getProperty(String)}.

 <p>The value returned by this method is non-null except in rare circumstances:

 <ul>
   <li>{@link #JAVA_EXT_DIRS} was deprecated in Java 8 and removed in Java 9. We have not
       confirmed whether it is available under older versions.
   <li>{@link #JAVA_COMPILER}, while still listed as required as of Java 15, is typically not
       available even under older version.
   <li>Any property may be cleared through APIs like {@link System#clearProperty}.
   <li>Unusual environments like GWT may have their own special handling of system properties.
 </ul>

 <p>Note that {@code StandardSystemProperty} does not provide constants for more recently added
 properties, including:

 <ul>
   <li>{@code java.vendor.version} (added in Java 11, listed as optional as of Java 13)
   <li>{@code jdk.module.*} (added in Java 9, optional)
 </ul>

### `toString()`

**Returns:** `java.lang.String`

Returns a string representation of this system property.

