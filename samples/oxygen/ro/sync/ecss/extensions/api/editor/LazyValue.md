# Interface: `LazyValue`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.LazyValue`

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Lazy values are useful for defaults that are expensive to construct or are seldom retrieved.
 For example, when rendering, a combo box form control might not need the possible values. 
 So we delay the construction of the possible values until they are requested.
 The process is transparent to the form control implementation which will receive the 
 processed value.
 
 
An implementation of LazyValue can either cache the real value (once it is computed)
 or can compute it every time it is requested. The second scenario can be useful to
 provide dynamic values.
 
 The built-in properties that support such lazy values are:
 

 - InplaceEditorCSSConstants#PROPERTY_VALUES

 - InplaceEditorCSSConstants#PROPERTY_LABELS

 - InplaceEditorCSSConstants#PROPERTY_TOOLTIPS

 

 
 A form control implementation gets its properties through AuthorInplaceContext#getArguments().
 When using a StylesFilter to add form controls you can build the arguments map with 
 this type of values instead of the unprocessed ones.
 
 Here is an example on how a form control can be added using a StylesFilter
 and how you can give a LazyValue for one of the built-in properties.
 

```

 public class SDFStylesFilter implements StylesFilter {
  public Styles filter(Styles styles, AuthorNode authorNode) {
    if(authorNode.getType() == AuthorNode.NODE_TYPE_PSEUDO_ELEMENT 
        && "before".equals(authorNode.getName())) {
      authorNode = authorNode.getParent();
      if ("country".equals(authorNode.getName())) {
        // This is the BEFORE pseudo element of the "country" element.
        // Read the supported countries from the configuration file.
        Map<String, Object> formControlArgs = new HashMap<String, Object>();
        formControlArgs.put(InplaceEditorArgumentKeys.PROPERTY_EDIT, "#text");
        formControlArgs.put(InplaceEditorArgumentKeys.PROPERTY_TYPE, InplaceEditorArgumentKeys.TYPE_COMBOBOX);
        formControlArgs.put(InplaceEditorArgumentKeys.PROPERTY_VALUES, new LazyValue<List<CIValue>>() {
          public java.util.List<CIValue> get() {
            // We avoid reading the possible values until they are actually requested.
            // This will be a List with CIValues created over countries: France, Spain, Great Britain
            return readCountriesFromFile();
          }
        });

        // We also add a label in form of the form control.
        Map<String, Object> labelProps = new HashMap<String, Object>();
        labelProps.put("text", "Country: ");
        labelProps.put("styles", "* {width: 100px; color: gray;}");
        StaticContent[] mixedContent = new StaticContent[] {new LabelContent(labelProps), new EditorContent(formControlArgs)};
        styles.setProperty(Styles.KEY_MIXED_CONTENT, mixedContent);
      }
    }

    // The previously added form control is the only way the element can be edited.
    if ("country".equals(authorNode.getName())) {
      styles.setProperty(Styles.KEY_VISIBITY, "-oxy-collapse-text");
    }

    return styles;
  }
 
```

## Methods

### `get()`

**Returns:** `T`

