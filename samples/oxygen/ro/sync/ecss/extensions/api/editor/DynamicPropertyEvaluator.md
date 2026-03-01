# Interface: `DynamicPropertyEvaluator`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.DynamicPropertyEvaluator`

## Description

For example the InplaceEditorCSSConstants#PROPERTY_WIDTH can depend on the font 
 size used by the form control (10em). This means that the value of the property 
 can be evaluated only after the form control initializes itself.
 
 This evaluator offers methods that can expand such dynamic properties.

## Methods

### `evaluateWidthProperty(`java.util.Map<java.lang.String,java.lang.Object>` arguments, `int` fontSize)`

**Returns:** `int`

The value of this 
 property might depend on the font size so the form control must explicitly 
 call this method with the font it uses.
 
 

```

 elem {
   content: oxy_textfield(edit, '#text', width, 12em)
 }
 
```

### `evaluateHeightProperty(`java.util.Map<java.lang.String,java.lang.Object>` arguments, `int` fontSize)`

**Returns:** `int`

The value of this 
 property might depend on the font size so the form control must explicitly 
 call this method with the font it uses.
 
 

```

 elem {
   content: oxy_video(href, attr(toPlay), width, 12em, height, 12em)
 }
 
```

