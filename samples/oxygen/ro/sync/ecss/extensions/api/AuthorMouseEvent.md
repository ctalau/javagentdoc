# Class: `AuthorMouseEvent`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorMouseEvent`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorInputEvent`](./AuthorInputEvent.md)

## Description

## Fields

### `STATE_PRESSED`

**Type:** `int`

The value is 1.

### `STATE_RELEASED`

**Type:** `int`

The value is 2.

### `STATE_CLICKED`

**Type:** `int`

The value is 3.

### `STATE_MOVED`

**Type:** `int`

The value is 4.

### `STATE_DRAGGED`

**Type:** `int`

The value is 5.

### `STATE_WHEEL_MOVED`

**Type:** `int`

The value is 6.

### `BUTTON1`

**Type:** `int`

The value is 1.

### `BUTTON2`

**Type:** `int`

The value is 2.

### `BUTTON3`

**Type:** `int`

The value is 3.

### `NOBUTTON`

**Type:** `int`

The value is 0.

### `X`

**Type:** `int`

The x value is relative to the author page.

### `Y`

**Type:** `int`

The y value is relative to the author page.

### `popupTrigger`

**Type:** `boolean`

### `clickCount`

**Type:** `int`

### `button`

**Type:** `int`

The only legal values are the following constants:
 `NOBUTTON`,
 `BUTTON1`,
 `BUTTON2` or
 `BUTTON3`.

### `state`

**Type:** `int`

### `wheelUp`

**Type:** `boolean`

## Constructors

### `<init>(int x, int y, boolean isPopupTrigger, int state, int modifiers, int clickCount)`

**Parameters:**
- `x` (`int`): The x coordinate of the mouse event.
- `y` (`int`): The y coordinate of the mouse event.
- `isPopupTrigger` (`boolean`): `true` if it is pop-up trigger.
- `state` (`int`): One of the constants #STATE_PRESSED, #STATE_RELEASED,
   #STATE_CLICKED, #STATE_MOVED or #STATE_DRAGGED.
- `modifiers` (`int`): Marks if CTRL, SHIFT, ALT, ALT GR, META were pressed.
- `clickCount` (`int`): Click count.

### `<init>(int x, int y, boolean isPopupTrigger, int state, int modifiers, int clickCount, int button)`

**Parameters:**
- `x` (`int`): The x coordinate of the mouse event.
- `y` (`int`): The y coordinate of the mouse event.
- `isPopupTrigger` (`boolean`): `true` if it is pop-up trigger.
- `state` (`int`): One of the constants #STATE_PRESSED, #STATE_RELEASED,
   #STATE_CLICKED, #STATE_MOVED or #STATE_DRAGGED.
- `modifiers` (`int`): Marks if CTRL, SHIFT, ALT, ALT GR, META were pressed.
- `clickCount` (`int`): Click count.
- `button` (`int`): One of the constants #BUTTON1, #BUTTON2, #BUTTON3, #NOBUTTON.

### `<init>(int x, int y, boolean isPopupTrigger, int state, int modifiers, int clickCount, int button, boolean wheelUp)`

**Parameters:**
- `x` (`int`): The x coordinate of the mouse event.
- `y` (`int`): The y coordinate of the mouse event.
- `isPopupTrigger` (`boolean`): `true` if it is pop-up trigger.
- `state` (`int`): One of the constants #STATE_PRESSED, #STATE_RELEASED,
                          #STATE_CLICKED, #STATE_MOVED or #STATE_DRAGGED.
- `modifiers` (`int`): Marks if CTRL, SHIFT, ALT, ALT GR, META were pressed.
- `clickCount` (`int`): Click count.
- `button` (`int`): One of the constants #BUTTON1, #BUTTON2, #BUTTON3,
                          #NOBUTTON.
- `wheelUp` (`boolean`): `true` if the mouse wheel is rotated up (away from the user), 
                          `false` if the mouse wheel is rotated down (towards the user).

## Methods

### `toString()`

**Returns:** `java.lang.String`

### `getStateDescription(int state)`

**Parameters:**
- `state` (`int`)

**Returns:** `java.lang.String`

### `getClickCount()`

**Returns:** `int`

### `getButton()`

**Returns:** `int`

### `isPopupTrigger()`

**Note**: Popup menus are triggered differently
 on different systems. Therefore, `isPopupTrigger`
 should be checked in both `mousePressed`
 and `mouseReleased`
 for proper cross-platform functionality.

**Returns:** `boolean`

### `getX()`

**Returns:** `int`

### `getY()`

**Returns:** `int`

### `getState()`

**Returns:** `int`

