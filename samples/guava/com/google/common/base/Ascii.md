# Class: `Ascii`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Ascii`

## Description

Static methods pertaining to ASCII characters (those in the range of values `0x00` through
 `0x7F`), and to strings containing such characters.

 <p>ASCII utilities also exist in other classes of this package:

 <ul>
   <!-- TODO(kevinb): how can we make this not produce a warning when building gwt javadoc? -->
   <li>`Charsets.US_ASCII` specifies the `Charset` of ASCII characters.
   <li>`CharMatcher.ascii` matches ASCII characters and provides text processing methods
       which operate only on the ASCII characters of a string.
 </ul>
**Author:** Catherine Berry
**Author:** Gregory Kick
**Since:** 7.0

## Fields

### `NUL`

**Type:** `byte`

Null ('\0'): The all-zeros character which may serve to accomplish time fill and media fill.
 Normally used as a C string terminator.

 <p>Although RFC 20 names this as "Null", note that it is distinct from the C/C++ "NULL"
 pointer.
**Since:** 8.0

### `SOH`

**Type:** `byte`

Start of Heading: A communication control character used at the beginning of a sequence of
 characters which constitute a machine-sensible address or routing information. Such a sequence
 is referred to as the "heading." An STX character has the effect of terminating a heading.
**Since:** 8.0

### `STX`

**Type:** `byte`

Start of Text: A communication control character which precedes a sequence of characters that
 is to be treated as an entity and entirely transmitted through to the ultimate destination.
 Such a sequence is referred to as "text." STX may be used to terminate a sequence of characters
 started by SOH.
**Since:** 8.0

### `ETX`

**Type:** `byte`

End of Text: A communication control character used to terminate a sequence of characters
 started with STX and transmitted as an entity.
**Since:** 8.0

### `EOT`

**Type:** `byte`

End of Transmission: A communication control character used to indicate the conclusion of a
 transmission, which may have contained one or more texts and any associated headings.
**Since:** 8.0

### `ENQ`

**Type:** `byte`

Enquiry: A communication control character used in data communication systems as a request for
 a response from a remote station. It may be used as a "Who Are You" (WRU) to obtain
 identification, or may be used to obtain station status, or both.
**Since:** 8.0

### `ACK`

**Type:** `byte`

Acknowledge: A communication control character transmitted by a receiver as an affirmative
 response to a sender.
**Since:** 8.0

### `BEL`

**Type:** `byte`

Bell ('\a'): A character for use when there is a need to call for human attention. It may
 control alarm or attention devices.
**Since:** 8.0

### `BS`

**Type:** `byte`

Backspace ('\b'): A format effector which controls the movement of the printing position one
 printing space backward on the same printing line. (Applicable also to display devices.)
**Since:** 8.0

### `HT`

**Type:** `byte`

Horizontal Tabulation ('\t'): A format effector which controls the movement of the printing
 position to the next in a series of predetermined positions along the printing line.
 (Applicable also to display devices and the skip function on punched cards.)
**Since:** 8.0

### `LF`

**Type:** `byte`

Line Feed ('\n'): A format effector which controls the movement of the printing position to the
 next printing line. (Applicable also to display devices.) Where appropriate, this character may
 have the meaning "New Line" (NL), a format effector which controls the movement of the printing
 point to the first printing position on the next printing line. Use of this convention requires
 agreement between sender and recipient of data.
**Since:** 8.0

### `NL`

**Type:** `byte`

Alternate name for `LF`. (`LF` is preferred.)
**Since:** 8.0

### `VT`

**Type:** `byte`

Vertical Tabulation ('\v'): A format effector which controls the movement of the printing
 position to the next in a series of predetermined printing lines. (Applicable also to display
 devices.)
**Since:** 8.0

### `FF`

**Type:** `byte`

Form Feed ('\f'): A format effector which controls the movement of the printing position to the
 first pre-determined printing line on the next form or page. (Applicable also to display
 devices.)
**Since:** 8.0

### `CR`

**Type:** `byte`

Carriage Return ('\r'): A format effector which controls the movement of the printing position
 to the first printing position on the same printing line. (Applicable also to display devices.)
**Since:** 8.0

### `SO`

**Type:** `byte`

Shift Out: A control character indicating that the code combinations which follow shall be
 interpreted as outside of the character set of the standard code table until a Shift In
 character is reached.
**Since:** 8.0

### `SI`

**Type:** `byte`

Shift In: A control character indicating that the code combinations which follow shall be
 interpreted according to the standard code table.
**Since:** 8.0

### `DLE`

**Type:** `byte`

Data Link Escape: A communication control character which will change the meaning of a limited
 number of contiguously following characters. It is used exclusively to provide supplementary
 controls in data communication networks.
**Since:** 8.0

### `DC1`

**Type:** `byte`

Device Control 1. Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)
**Since:** 8.0

### `XON`

**Type:** `byte`

Transmission On: Although originally defined as DC1, this ASCII control character is now better
 known as the XON code used for software flow control in serial communications. The main use is
 restarting the transmission after the communication has been stopped by the XOFF control code.
**Since:** 8.0

### `DC2`

**Type:** `byte`

Device Control 2. Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)
**Since:** 8.0

### `DC3`

**Type:** `byte`

Device Control 3. Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)
**Since:** 8.0

### `XOFF`

**Type:** `byte`

Transmission off. See `XON` for explanation.
**Since:** 8.0

### `DC4`

**Type:** `byte`

Device Control 4. Characters for the control of ancillary devices associated with data
 processing or telecommunication systems, more especially switching devices "on" or "off." (If a
 single "stop" control is required to interrupt or turn off ancillary devices, DC4 is the
 preferred assignment.)
**Since:** 8.0

### `NAK`

**Type:** `byte`

Negative Acknowledge: A communication control character transmitted by a receiver as a negative
 response to the sender.
**Since:** 8.0

### `SYN`

**Type:** `byte`

Synchronous Idle: A communication control character used by a synchronous transmission system
 in the absence of any other character to provide a signal from which synchronism may be
 achieved or retained.
**Since:** 8.0

### `ETB`

**Type:** `byte`

End of Transmission Block: A communication control character used to indicate the end of a
 block of data for communication purposes. ETB is used for blocking data where the block
 structure is not necessarily related to the processing format.
**Since:** 8.0

### `CAN`

**Type:** `byte`

Cancel: A control character used to indicate that the data with which it is sent is in error or
 is to be disregarded.
**Since:** 8.0

### `EM`

**Type:** `byte`

End of Medium: A control character associated with the sent data which may be used to identify
 the physical end of the medium, or the end of the used, or wanted, portion of information
 recorded on a medium. (The position of this character does not necessarily correspond to the
 physical end of the medium.)
**Since:** 8.0

### `SUB`

**Type:** `byte`

Substitute: A character that may be substituted for a character which is determined to be
 invalid or in error.
**Since:** 8.0

### `ESC`

**Type:** `byte`

Escape: A control character intended to provide code extension (supplementary characters) in
 general information interchange. The Escape character itself is a prefix affecting the
 interpretation of a limited number of contiguously following characters.
**Since:** 8.0

### `FS`

**Type:** `byte`

File Separator: These four information separators may be used within data in optional fashion,
 except that their hierarchical relationship shall be: FS is the most inclusive, then GS, then
 RS, and US is least inclusive. (The content and length of a File, Group, Record, or Unit are
 not specified.)
**Since:** 8.0

### `GS`

**Type:** `byte`

Group Separator: These four information separators may be used within data in optional fashion,
 except that their hierarchical relationship shall be: FS is the most inclusive, then GS, then
 RS, and US is least inclusive. (The content and length of a File, Group, Record, or Unit are
 not specified.)
**Since:** 8.0

### `RS`

**Type:** `byte`

Record Separator: These four information separators may be used within data in optional
 fashion, except that their hierarchical relationship shall be: FS is the most inclusive, then
 GS, then RS, and US is least inclusive. (The content and length of a File, Group, Record, or
 Unit are not specified.)
**Since:** 8.0

### `US`

**Type:** `byte`

Unit Separator: These four information separators may be used within data in optional fashion,
 except that their hierarchical relationship shall be: FS is the most inclusive, then GS, then
 RS, and US is least inclusive. (The content and length of a File, Group, Record, or Unit are
 not specified.)
**Since:** 8.0

### `SP`

**Type:** `byte`

Space: A normally non-printing graphic character used to separate words. It is also a format
 effector which controls the movement of the printing position, one printing position forward.
 (Applicable also to display devices.)
**Since:** 8.0

### `SPACE`

**Type:** `byte`

Alternate name for `SP`.
**Since:** 8.0

### `DEL`

**Type:** `byte`

Delete: This character is used primarily to "erase" or "obliterate" erroneous or unwanted
 characters in perforated tape.
**Since:** 8.0

### `MIN`

**Type:** `char`

The minimum value of an ASCII character.
**Since:** 9.0 (was type `int` before 12.0)

### `MAX`

**Type:** `char`

The maximum value of an ASCII character.
**Since:** 9.0 (was type `int` before 12.0)

### `CASE_MASK`

**Type:** `char`

A bit mask which selects the bit encoding ASCII character case.

## Constructors

### `<init>()`

## Methods

### `toLowerCase(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns a copy of the input string in which all uppercase ASCII
 characters have been converted to lowercase. All other characters are copied without
 modification.

### `toLowerCase(`java.lang.CharSequence` chars)`

**Returns:** `java.lang.String`

Returns a copy of the input character sequence in which all uppercase ASCII characters have been converted to lowercase. All other characters are copied
 without modification.
**Since:** 14.0

### `toLowerCase(`char` c)`

**Returns:** `char`

If the argument is an uppercase ASCII character, returns the
 lowercase equivalent. Otherwise returns the argument.

### `toUpperCase(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns a copy of the input string in which all lowercase ASCII
 characters have been converted to uppercase. All other characters are copied without
 modification.

### `toUpperCase(`java.lang.CharSequence` chars)`

**Returns:** `java.lang.String`

Returns a copy of the input character sequence in which all lowercase ASCII characters have been converted to uppercase. All other characters are copied
 without modification.
**Since:** 14.0

### `toUpperCase(`char` c)`

**Returns:** `char`

If the argument is a lowercase ASCII character, returns the
 uppercase equivalent. Otherwise returns the argument.

### `isLowerCase(`char` c)`

**Returns:** `boolean`

Indicates whether `c` is one of the twenty-six lowercase ASCII alphabetic characters
 between `'a'` and `'z'` inclusive. All others (including non-ASCII characters)
 return `false`.

### `isUpperCase(`char` c)`

**Returns:** `boolean`

Indicates whether `c` is one of the twenty-six uppercase ASCII alphabetic characters
 between `'A'` and `'Z'` inclusive. All others (including non-ASCII characters)
 return `false`.

### `truncate(`java.lang.CharSequence` seq, `int` maxLength, `java.lang.String` truncationIndicator)`

**Returns:** `java.lang.String`

Truncates the given character sequence to the given maximum length. If the length of the
 sequence is greater than `maxLength`, the returned string will be exactly `maxLength` chars in length and will end with the given `truncationIndicator`. Otherwise,
 the sequence will be returned as a string with no changes to the content.

 <p>Examples:

 <pre>`Ascii.truncate("foobar", 7, "..."); // returns "foobar"
 Ascii.truncate("foobar", 5, "..."); // returns "fo..."
 `</pre>

 <p><b>Note:</b> This method <i>may</i> work with certain non-ASCII text but is not safe for use
 with arbitrary Unicode text. It is mostly intended for use with text that is known to be safe
 for use with it (such as all-ASCII text) and for simple debugging text. When using this method,
 consider the following:

 <ul>
   <li>it may split surrogate pairs
   <li>it may split characters and combining characters
   <li>it does not consider word boundaries
   <li>if truncating for display to users, there are other considerations that must be taken
       into account
   <li>the appropriate truncation indicator may be locale-dependent
   <li>it is safe to use non-ASCII characters in the truncation indicator
 </ul>
@throws IllegalArgumentException if `maxLength` is less than the length of `truncationIndicator`
**Since:** 16.0

### `equalsIgnoreCase(`java.lang.CharSequence` s1, `java.lang.CharSequence` s2)`

**Returns:** `boolean`

Indicates whether the contents of the given character sequences `s1` and `s2` are
 equal, ignoring the case of any ASCII alphabetic characters between `'a'` and `'z'`
 or `'A'` and `'Z'` inclusive.

 <p>This method is significantly faster than `String.equalsIgnoreCase` and should be used
 in preference if at least one of the parameters is known to contain only ASCII characters.

 <p>Note however that this method does not always behave identically to expressions such as:

 <ul>
   <li>`string.toUpperCase().equals("UPPER CASE ASCII")`
   <li>`string.toLowerCase().equals("lower case ascii")`
 </ul>

 <p>due to case-folding of some non-ASCII characters (which does not occur in `String.equalsIgnoreCase`). However in almost all cases that ASCII strings are used, the author
 probably wanted the behavior provided by this method rather than the subtle and sometimes
 surprising behavior of `toUpperCase()` and `toLowerCase()`.
**Since:** 16.0

### `getAlphaIndex(`char` c)`

**Returns:** `int`

Returns the non-negative index value of the alpha character `c`, regardless of case. Ie,
 'a'/'A' returns 0 and 'z'/'Z' returns 25. Non-alpha characters return a value of 26 or greater.

