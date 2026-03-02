# Class: `Preconditions`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Preconditions`

## Description

If the precondition is not met, the Preconditions method throws an unchecked exception
 of a specified type, which helps the method in which the exception was thrown communicate that
 its caller has made a mistake. This allows constructs such as

 

```

 public static double sqrt(double value) {
   if (value < 0) {
     throw new IllegalArgumentException("input is negative: " + value);
   }
   // calculate square root
 }
 
```


 
to be replaced with the more compact

 

```

 public static double sqrt(double value) {
   checkArgument(value >= 0, "input is negative: %s", value);
   // calculate square root
 }
 
```


 
so that a hypothetical bad caller of this method, such as:

 

```

 void exampleBadCaller() {
   double d = sqrt(-1.0);
 }
 
```


 
would be flagged as having called sqrt() with an illegal argument.

 Performance

 
Avoid passing message arguments that are expensive to compute; your code will always compute
 them, even though they usually won't be needed. If you have such arguments, use the conventional
 if/throw idiom instead.

 
Depending on your message arguments, memory may be allocated for boxing and varargs array
 creation. However, the methods of this class have a large number of overloads that prevent such
 allocations in many common cases.

 
The message string is not formatted unless the exception will be thrown, so the cost of the
 string formatting itself should not be a concern.

 
As with any performance concerns, you should consider profiling your code (in a production
 environment if possible) before spending a lot of effort on tweaking a particular element.

 Other types of preconditions

 
Not every type of precondition failure is supported by these methods. Continue to throw
 standard JDK exceptions such as java.util.NoSuchElementException or UnsupportedOperationException in the situations they are intended for.

 Non-preconditions

 
It is of course possible to use the methods of this class to check for invalid conditions
 which are *not the caller's fault*. Doing so is **not recommended** because it is
 misleading to future readers of the code and of stack traces. See [Conditional failures
 explained](https://github.com/google/guava/wiki/ConditionalFailuresExplained) in the Guava User Guide for more advice. Notably, Verify offers assertions
 similar to those in this class for non-precondition checks.

 java.util.Objects.requireNonNull()

 
Projects which use com.google.common should generally avoid the use of java.util.Objects#requireNonNull(Object). Instead, use whichever of #checkNotNull(Object) or Verify#verifyNotNull(Object) is appropriate to the situation.
 (The same goes for the message-accepting overloads.)

 Only %s is supported

 
Preconditions uses Strings#lenientFormat to format error message template
 strings. This only supports the "%s" specifier, not the full range of java.util.Formatter specifiers. However, note that if the number of arguments does not match the
 number of occurrences of "%s" in the format string, Preconditions will still
 behave as expected, and will still include all argument values in the error message; the message
 will simply not be formatted exactly as intended.

 More information

 
See the Guava User Guide on [using 
 Preconditions](https://github.com/google/guava/wiki/PreconditionsExplained).

## Constructors

### `<init>()`

## Methods

### `checkArgument(boolean expression)`

**Returns:** `void`

**Parameters:**
- `expression` (`boolean`): a boolean expression

### `checkArgument(boolean expression, java.lang.Object errorMessage)`

**Returns:** `void`

**Parameters:**
- `expression` (`boolean`): a boolean expression
- `errorMessage` (`java.lang.Object`): the exception message to use if the check fails; will be converted to a
     string using String#valueOf(Object)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] errorMessageArgs)`

**Returns:** `void`

**Parameters:**
- `expression` (`boolean`): a boolean expression
- `errorMessageTemplate` (`java.lang.String`): a template for the exception message should the check fail. The
     message is formed by replacing each %s placeholder in the template with an
     argument. These are matched by position - the first %s gets 
     errorMessageArgs[0], etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
- `errorMessageArgs` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`): the arguments to be substituted into the message template. Arguments
     are converted to strings using String#valueOf(Object).

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, char p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`char`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, int p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`int`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, long p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`long`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, char p1, java.lang.Object p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`java.lang.Object`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, char p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`char`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, int p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`int`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, long p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`long`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, int p1, java.lang.Object p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`java.lang.Object`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, char p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`char`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, int p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`int`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, long p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`long`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, long p1, java.lang.Object p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`java.lang.Object`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, char p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`char`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, int p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`int`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, long p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`long`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)

### `checkArgument(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4)`

**Returns:** `void`

See #checkArgument(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)
- `p4` (`java.lang.Object`)

### `checkState(boolean expression)`

**Returns:** `void`

**Parameters:**
- `expression` (`boolean`): a boolean expression

### `checkState(boolean expression, java.lang.Object errorMessage)`

**Returns:** `void`

**Parameters:**
- `expression` (`boolean`): a boolean expression
- `errorMessage` (`java.lang.Object`): the exception message to use if the check fails; will be converted to a
     string using String#valueOf(Object)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] errorMessageArgs)`

**Returns:** `void`

**Parameters:**
- `expression` (`boolean`): a boolean expression
- `errorMessageTemplate` (`java.lang.String`): a template for the exception message should the check fail. The
     message is formed by replacing each %s placeholder in the template with an
     argument. These are matched by position - the first %s gets 
     errorMessageArgs[0], etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
- `errorMessageArgs` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`): the arguments to be substituted into the message template. Arguments
     are converted to strings using String#valueOf(Object).

### `checkState(boolean expression, java.lang.String errorMessageTemplate, char p1)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, int p1)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, long p1)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, char p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`char`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, int p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`int`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, long p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`long`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, char p1, java.lang.Object p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`java.lang.Object`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, char p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`char`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, int p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`int`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, long p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`long`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, int p1, java.lang.Object p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`java.lang.Object`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, char p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`char`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, int p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`int`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, long p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`long`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, long p1, java.lang.Object p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`java.lang.Object`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, char p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`char`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, int p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`int`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, long p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`long`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)

### `checkState(boolean expression, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4)`

**Returns:** `void`

See #checkState(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)
- `p4` (`java.lang.Object`)

### `checkNotNull(T reference)`

**Returns:** `T`

**Parameters:**
- `reference` (`T`): an object reference

### `checkNotNull(T reference, java.lang.Object errorMessage)`

**Returns:** `T`

**Parameters:**
- `reference` (`T`): an object reference
- `errorMessage` (`java.lang.Object`): the exception message to use if the check fails; will be converted to a
     string using String#valueOf(Object)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] errorMessageArgs)`

**Returns:** `T`

**Parameters:**
- `reference` (`T`): an object reference
- `errorMessageTemplate` (`java.lang.String`): a template for the exception message should the check fail. The
     message is formed by replacing each %s placeholder in the template with an
     argument. These are matched by position - the first %s gets 
     errorMessageArgs[0], etc. Unmatched arguments will be appended to the formatted message in
     square braces. Unmatched placeholders will be left as-is.
- `errorMessageArgs` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`): the arguments to be substituted into the message template. Arguments
     are converted to strings using String#valueOf(Object).

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, char p1)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, int p1)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, long p1)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, char p1, char p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`char`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, char p1, int p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`int`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, char p1, long p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`long`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, char p1, java.lang.Object p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`java.lang.Object`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, int p1, char p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`char`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, int p1, int p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`int`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, int p1, long p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`long`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, int p1, java.lang.Object p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`java.lang.Object`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, long p1, char p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`char`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, long p1, int p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`int`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, long p1, long p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`long`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, long p1, java.lang.Object p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`java.lang.Object`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1, char p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`char`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1, int p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`int`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1, long p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`long`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)

### `checkNotNull(T reference, java.lang.String errorMessageTemplate, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3, java.lang.Object p4)`

**Returns:** `T`

See #checkNotNull(Object, String, Object...) for details.

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)
- `p4` (`java.lang.Object`)

### `checkElementIndex(int index, int size)`

**Returns:** `int`

An element index may range from zero, inclusive, to size, exclusive.

**Parameters:**
- `index` (`int`): a user-supplied index identifying an element of an array, list or string
- `size` (`int`): the size of that array, list or string

### `checkElementIndex(int index, int size, java.lang.String desc)`

**Returns:** `int`

An element index may range from zero, inclusive, to size, exclusive.

**Parameters:**
- `index` (`int`): a user-supplied index identifying an element of an array, list or string
- `size` (`int`): the size of that array, list or string
- `desc` (`java.lang.String`): the text to use to describe this index in an error message

### `badElementIndex(int index, int size, java.lang.String desc)`

**Returns:** `java.lang.String`

**Parameters:**
- `index` (`int`)
- `size` (`int`)
- `desc` (`java.lang.String`)

### `checkPositionIndex(int index, int size)`

**Returns:** `int`

A position index may range from zero to size, inclusive.

**Parameters:**
- `index` (`int`): a user-supplied index identifying a position in an array, list or string
- `size` (`int`): the size of that array, list or string

### `checkPositionIndex(int index, int size, java.lang.String desc)`

**Returns:** `int`

A position index may range from zero to size, inclusive.

**Parameters:**
- `index` (`int`): a user-supplied index identifying a position in an array, list or string
- `size` (`int`): the size of that array, list or string
- `desc` (`java.lang.String`): the text to use to describe this index in an error message

### `badPositionIndex(int index, int size, java.lang.String desc)`

**Returns:** `java.lang.String`

**Parameters:**
- `index` (`int`)
- `size` (`int`)
- `desc` (`java.lang.String`)

### `checkPositionIndexes(int start, int end, int size)`

**Returns:** `void`

A position index may range from zero to 
 size, inclusive.

**Parameters:**
- `start` (`int`): a user-supplied index identifying a starting position in an array, list or string
- `end` (`int`): a user-supplied index identifying an ending position in an array, list or string
- `size` (`int`): the size of that array, list or string

### `badPositionIndexes(int start, int end, int size)`

**Returns:** `java.lang.String`

**Parameters:**
- `start` (`int`)
- `end` (`int`)
- `size` (`int`)

