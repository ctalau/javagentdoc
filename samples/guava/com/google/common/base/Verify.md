# Class: `Verify`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Verify`

## Description

These methods should be used instead of Java assertions
 whenever there is a chance the check may fail "in real life". Example:

 

```

 Bill bill = remoteService.getLastUnpaidBill();

 // In case bug 12345 happens again we'd rather just die
 Verify.verify(bill.status() == Status.UNPAID,
     "Unexpected bill status: %s", bill.status());
 
```


 Comparison to alternatives

 
**Note:** In some cases the differences explained below can be subtle. When it's unclear
 which approach to use, **don't worry** too much about it; just pick something that seems
 reasonable and it will be fine.

 

   - If checking whether the *caller* has violated your method or constructor's contract
       (such as by passing an invalid argument), use the utilities of the Preconditions
       class instead.
   - If checking an *impossible* condition (which *cannot* happen unless your own
       class or its *trusted* dependencies is badly broken), this is what ordinary Java
       assertions are for. Note that assertions are not enabled by default; they are essentially
       considered "compiled comments."
   - An explicit if/throw (as illustrated below) is always acceptable; we still
       recommend using our VerifyException exception type. Throwing a plain RuntimeException is frowned upon.
   - Use of java.util.Objects#requireNonNull(Object) is generally discouraged, since
       #verifyNotNull(Object) and Preconditions#checkNotNull(Object) perform the
       same function with more clarity.
 


 Warning about performance

 
Remember that parameter values for message construction must all be computed eagerly, and
 autoboxing and varargs array creation may happen as well, even when the verification succeeds and
 the message ends up unneeded. Performance-sensitive verification checks should continue to use
 usual form:

 

```

 Bill bill = remoteService.getLastUnpaidBill();
 if (bill.status() != Status.UNPAID) {
   throw new VerifyException("Unexpected bill status: " + bill.status());
 }
 
```


 Only %s is supported

 
As with Preconditions, Verify uses Strings#lenientFormat to format
 error message template strings. This only supports the "%s" specifier, not the full range
 of java.util.Formatter specifiers. However, note that if the number of arguments does not
 match the number of occurrences of "%s" in the format string, Verify will still
 behave as expected, and will still include all argument values in the error message; the message
 will simply not be formatted exactly as intended.

 More information

 See [Conditional
 failures explained](https://github.com/google/guava/wiki/ConditionalFailuresExplained) in the Guava User Guide for advice on when this class should be used.

## Constructors

### `<init>()`

## Methods

### `verify(boolean expression)`

**Parameters:**
- `expression` (`boolean`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, lang@Nullable Object[] errorMessageArgs)`

**Parameters:**
- `expression` (`boolean`): a boolean expression
- `errorMessageTemplate` (`java.lang.String`): a template for the exception message should the check fail. The
       message is formed by replacing each %s placeholder in the template with an
       argument. These are matched by position - the first %s gets 
       errorMessageArgs[0], etc. Unmatched arguments will be appended to the formatted message in
       square braces. Unmatched placeholders will be left as-is.
- `errorMessageArgs` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`): the arguments to be substituted into the message template. Arguments
       are converted to strings using String#valueOf(Object).

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, char p1)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, int p1)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, long p1)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, char p1, char p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`char`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, int p1, char p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`char`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, long p1, char p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`char`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1, char p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`char`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, char p1, int p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`int`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, int p1, int p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`int`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, long p1, int p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`int`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1, int p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`int`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, char p1, long p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`long`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, int p1, long p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`long`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, long p1, long p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`long`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1, long p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`long`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, char p1, Object p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`char`)
- `p2` (`java.lang.Object`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, int p1, Object p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`int`)
- `p2` (`java.lang.Object`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, long p1, Object p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`long`)
- `p2` (`java.lang.Object`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1, Object p2)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1, Object p2, Object p3)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)

**Returns:** `void`

### `verify(boolean expression, String errorMessageTemplate, Object p1, Object p2, Object p3, Object p4)`

See #verify(boolean, String, Object...) for details.

**Parameters:**
- `expression` (`boolean`)
- `errorMessageTemplate` (`java.lang.String`)
- `p1` (`java.lang.Object`)
- `p2` (`java.lang.Object`)
- `p3` (`java.lang.Object`)
- `p4` (`java.lang.Object`)

**Returns:** `void`

### `verifyNotNull(T reference)`

**Parameters:**
- `reference` (`T`)

**Returns:** `T`

### `verifyNotNull(T reference, String errorMessageTemplate, lang@Nullable Object[] errorMessageArgs)`

**Parameters:**
- `reference` (`T`)
- `errorMessageTemplate` (`java.lang.String`): a template for the exception message should the check fail. The
       message is formed by replacing each %s placeholder in the template with an
       argument. These are matched by position - the first %s gets 
       errorMessageArgs[0], etc. Unmatched arguments will be appended to the formatted message in
       square braces. Unmatched placeholders will be left as-is.
- `errorMessageArgs` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`): the arguments to be substituted into the message template. Arguments
       are converted to strings using String#valueOf(Object).

**Returns:** `T`

