# Class: `Ascii`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Ascii`

## Description

ASCII utilities also exist in other classes of this package:

 

   <!-- TODO(kevinb): how can we make this not produce a warning when building gwt javadoc? -->
   - Charsets#US_ASCII specifies the Charset of ASCII characters.
   - CharMatcher#ascii matches ASCII characters and provides text processing methods
       which operate only on the ASCII characters of a string.

## Fields

### `NUL`

**Type:** `byte`

Normally used as a C string terminator.

 
Although RFC 20 names this as "Null", note that it is distinct from the C/C++ "NULL"
 pointer.

### `SOH`

**Type:** `byte`

Such a sequence
 is referred to as the "heading." An STX character has the effect of terminating a heading.

### `STX`

**Type:** `byte`

Such a sequence is referred to as "text." STX may be used to terminate a sequence of characters
 started by SOH.

### `ETX`

**Type:** `byte`

### `EOT`

**Type:** `byte`

### `ENQ`

**Type:** `byte`

It may be used as a "Who Are You" (WRU) to obtain
 identification, or may be used to obtain station status, or both.

### `ACK`

**Type:** `byte`

### `BEL`

**Type:** `byte`

It may
 control alarm or attention devices.

### `BS`

**Type:** `byte`

(Applicable also to display devices.)

### `HT`

**Type:** `byte`

(Applicable also to display devices and the skip function on punched cards.)

### `LF`

**Type:** `byte`

(Applicable also to display devices.) Where appropriate, this character may
 have the meaning "New Line" (NL), a format effector which controls the movement of the printing
 point to the first printing position on the next printing line. Use of this convention requires
 agreement between sender and recipient of data.

### `NL`

**Type:** `byte`

(LF is preferred.)

### `VT`

**Type:** `byte`

(Applicable also to display
 devices.)

### `FF`

**Type:** `byte`

(Applicable also to display
 devices.)

### `CR`

**Type:** `byte`

(Applicable also to display devices.)

### `SO`

**Type:** `byte`

### `SI`

**Type:** `byte`

### `DLE`

**Type:** `byte`

It is used exclusively to provide supplementary
 controls in data communication networks.

### `DC1`

**Type:** `byte`

Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)

### `XON`

**Type:** `byte`

The main use is
 restarting the transmission after the communication has been stopped by the XOFF control code.

### `DC2`

**Type:** `byte`

Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)

### `DC3`

**Type:** `byte`

Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)

### `XOFF`

**Type:** `byte`

See #XON for explanation.

### `DC4`

**Type:** `byte`

Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)

### `NAK`

**Type:** `byte`

### `SYN`

**Type:** `byte`

### `ETB`

**Type:** `byte`

ETB is used for blocking data where the block
 structure is not necessarily related to the processing format.

### `CAN`

**Type:** `byte`

### `EM`

**Type:** `byte`

(The position of this character does not necessarily correspond to the
 physical end of the medium.)

### `SUB`

**Type:** `byte`

### `ESC`

**Type:** `byte`

The Escape character itself is a prefix affecting the
 interpretation of a limited number of contiguously following characters.

### `FS`

**Type:** `byte`

(The content and length of a File, Group, Record, or Unit are
 not specified.)

### `GS`

**Type:** `byte`

(The content and length of a File, Group, Record, or Unit are
 not specified.)

### `RS`

**Type:** `byte`

(The content and length of a File, Group, Record, or
 Unit are not specified.)

### `US`

**Type:** `byte`

(The content and length of a File, Group, Record, or Unit are
 not specified.)

### `SP`

**Type:** `byte`

It is also a format
 effector which controls the movement of the printing position, one printing position forward.
 (Applicable also to display devices.)

### `SPACE`

**Type:** `byte`

### `DEL`

**Type:** `byte`

### `MIN`

**Type:** `char`

### `MAX`

**Type:** `char`

### `CASE_MASK`

**Type:** `char`

## Constructors

### `<init>()`

## Methods

### `toLowerCase(String string)`

All other characters are copied without
 modification.

**Parameters:**
- `string` (`java.lang.String`)

**Returns:** `java.lang.String`

### `toLowerCase(CharSequence chars)`

All other characters are copied
 without modification.

**Parameters:**
- `chars` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `toLowerCase(char c)`

Otherwise returns the argument.

**Parameters:**
- `c` (`char`)

**Returns:** `char`

### `toUpperCase(String string)`

All other characters are copied without
 modification.

**Parameters:**
- `string` (`java.lang.String`)

**Returns:** `java.lang.String`

### `toUpperCase(CharSequence chars)`

All other characters are copied
 without modification.

**Parameters:**
- `chars` (`java.lang.CharSequence`)

**Returns:** `java.lang.String`

### `toUpperCase(char c)`

Otherwise returns the argument.

**Parameters:**
- `c` (`char`)

**Returns:** `char`

### `isLowerCase(char c)`

All others (including non-ASCII characters)
 return false.

**Parameters:**
- `c` (`char`)

**Returns:** `boolean`

### `isUpperCase(char c)`

All others (including non-ASCII characters)
 return false.

**Parameters:**
- `c` (`char`)

**Returns:** `boolean`

### `truncate(CharSequence seq, int maxLength, String truncationIndicator)`

If the length of the
 sequence is greater than maxLength, the returned string will be exactly 
 maxLength chars in length and will end with the given truncationIndicator. Otherwise,
 the sequence will be returned as a string with no changes to the content.

 
Examples:

 

```

 Ascii.truncate("foobar", 7, "..."); // returns "foobar"
 Ascii.truncate("foobar", 5, "..."); // returns "fo..."
 
```


 
**Note:** This method *may* work with certain non-ASCII text but is not safe for use
 with arbitrary Unicode text. It is mostly intended for use with text that is known to be safe
 for use with it (such as all-ASCII text) and for simple debugging text. When using this method,
 consider the following:

 

   - it may split surrogate pairs
   - it may split characters and combining characters
   - it does not consider word boundaries
   - if truncating for display to users, there are other considerations that must be taken
       into account
   - the appropriate truncation indicator may be locale-dependent
   - it is safe to use non-ASCII characters in the truncation indicator

**Parameters:**
- `seq` (`java.lang.CharSequence`)
- `maxLength` (`int`)
- `truncationIndicator` (`java.lang.String`)

**Returns:** `java.lang.String`

### `equalsIgnoreCase(CharSequence s1, CharSequence s2)`

This method is significantly faster than String#equalsIgnoreCase and should be used
 in preference if at least one of the parameters is known to contain only ASCII characters.

 
Note however that this method does not always behave identically to expressions such as:

 

   - string.toUpperCase().equals("UPPER CASE ASCII")
   - string.toLowerCase().equals("lower case ascii")
 


 
due to case-folding of some non-ASCII characters (which does not occur in String#equalsIgnoreCase). However in almost all cases that ASCII strings are used, the author
 probably wanted the behavior provided by this method rather than the subtle and sometimes
 surprising behavior of toUpperCase() and toLowerCase().

**Parameters:**
- `s1` (`java.lang.CharSequence`)
- `s2` (`java.lang.CharSequence`)

**Returns:** `boolean`

### `getAlphaIndex(char c)`

Ie,
 'a'/'A' returns 0 and 'z'/'Z' returns 25. Non-alpha characters return a value of 26 or greater.

**Parameters:**
- `c` (`char`)

**Returns:** `int`

