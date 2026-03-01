# Interface: `InplaceEditorCSSConstants`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceEditorCSSConstants`

## Description

## Fields

### `PROPERTY_ON_HOVER_PSEUDO_CLASS_NAME`

**Type:** `java.lang.String`

If such a class is given, when the cursor 
 is hovering a form control this class will be set on the element on which the 
 form control is added. When the cursor leaves the form control this class 
 is removed. As a result you can have CSS rules that change the rendering of the
 element when it is hovered.
 
 

```


body:after {
    content:
        oxy_button(
            hoverPseudoclassName, "activeElement",
            actionID, 'action.id');
}

body {
    border:1px solid white;
}

body:activeElement {
    border:1px solid red;
}
 
```

### `PROPERTY_HTML_EMBEDDED_CONTENT`

**Type:** `java.lang.String`

### `PROPERTY_HREF`

**Type:** `java.lang.String`

Used by InplaceEditorCSSConstants#TYPE_HTML_CONTENT to specify where 
 is stored the content to be inserted by an "oxy_html_content" function.
 
 

 Used by #TYPE_VIDEO_PLAYER and #TYPE_BROWSER to specify the location
 of the file to load.

### `PROPERTY_ID`

**Type:** `java.lang.String`

It identifies 
 the element to be rendered.

### `PROPERTY_FILE_FILTER`

**Type:** `java.lang.String`

The extensions are comma-separated.

### `PROPERTY_TYPE`

**Type:** `java.lang.String`

One of TYPE_ constants or 
 a class name. This is a shorthand to specify a built-in type of renderer 
 and editor as opposed to using properties PROPERTY_RENDERER_CLASS_NAME, 
 PROPERTY_SWING_EDITOR_CLASS_NAME and PROPERTY_SWT_EDITOR_CLASS_NAME.

### `PROPERTY_EDIT`

**Type:** `java.lang.String`

The following values are accepted:
 

 - 
 To edit an attribute value the value of the property is "@attr_name".
 

 - 
 To edit the text content the value should be equal with #EDIT_TEXT_CONTENT
 

 - 
 To let the editor do the editing itself, the value should be equal with #EDIT_CUSTOM

### `PROPERTY_VALUES`

**Type:** `java.lang.String`

If not present these values will be 
 taken from the schema. The processed value for this property is a list of 
 CIValue.

### `PROPERTY_CAN_REMOVE_VALUE`

**Type:** `java.lang.String`

If it is set to `true`,
 then the combo box will have an "<Empty>" value inside, which will clear/remove the
 last combo box value.

### `PROPERTY_UNCHECKED_VALUES`

**Type:** `java.lang.String`

These are the values that are committed for a checkbox when it is unchecked.
 If missing, an unchecked button will commit no value.
  
 The processed value for this property is a list of CIValue.

### `PROPERTY_LABELS`

**Type:** `java.lang.String`

The processed value for this property is a java.util.List<String>

### `PROPERTY_TOOLTIPS`

**Type:** `java.lang.String`

The processed value for this property is a java.util.List<String>

### `PROPERTY_ROWS`

**Type:** `java.lang.String`

It's interpretation is dependent
 to the editor being used.

### `PROPERTY_COLUMNS`

**Type:** `java.lang.String`

It's interpretation is dependent
 to the editor being used.

### `PROPERTY_WIDTH`

**Type:** `java.lang.String`

The values are the same like the width 
 property from CSS.
 

```

 elem {
   content: oxy_textfield(edit, '#text', width, 12em)
 }
 
```

 
 If a form control also supports the #PROPERTY_COLUMNS and both of 
 these properties are present, then #PROPERTY_WIDTH will take precedence.
 
  The value for this property should not be requested directly but using 
  DynamicPropertyEvaluator#evaluateWidthProperty(java.util.Map, int).
  Such an instance can be obtain from AuthorInplaceContext.
  
  If you want to set this property from the API, it is best to use 
  InplaceEditorArgumentKeys#PROPERTY_PROCESSED_WIDTH instead.

### `PROPERTY_SEPARATOR`

**Type:** `java.lang.String`

This is the separator that will be used to compose the values from the
 check-boxes into one string that will be committed into the document.
 
 If no separator is specified, a space will be used.

### `PROPERTY_RENDERER_SEPARATOR`

**Type:** `java.lang.String`

This is the separator that will be used to compose the values from the
 check-boxes into one string that will be rendered in the document.
 
 If no separator is specified, #PROPERTY_SEPARATOR will be used to 
 identify tokens.

### `PROPERTY_SORT`

**Type:** `java.lang.String`

This is the order in which the values in the element or attribute will appear.
 This sorting property will apply to both the values rendered in the editor and the ones presented in the pop-up editor.
 If no sort order is specified, the values will be rendered in the order in which they appear in the document.

### `PROPERTY_RENDERER_SORT`

**Type:** `java.lang.String`

This is the order in which the values in the element or attribute will appear rendered in the editor.
 
 If no sort order is specified, the values will be rendered in the order in which they appear in the document.

### `PROPERTY_EDITOR_SORT`

**Type:** `java.lang.String`

This is the order in which the values specified for the element or attribute will be presented in the pop-up editor.
 
 If no sort order is specified, the values will be presented in the order in which they appear in the document.

### `SORT_ASCENDING`

**Type:** `java.lang.String`

Sort in ascending lexicographical order.

### `SORT_DESCENDING`

**Type:** `java.lang.String`

Sort in descending lexicographical order.

### `PROPERTY_EDITABLE`

**Type:** `java.lang.String`

possible values are Boolean.TRUE and Boolean.FALSE.

### `PROPERTY_ACTION_ID`

**Type:** `java.lang.String`

It's processed value is 
 an IAuthorExtensionAction. If an action with the given ID wasn't found 
 the value remains the given string ID.

### `PROPERTY_ACTION_CONTEXT`

**Type:** `java.lang.String`

It specifies the context in which the action associated with the form control will be executed in.
 
 The default value is #ACTION_CONTEXT_ELEMENT.

### `PROPERTY_TRANSPARENT`

**Type:** `java.lang.String`

The accepted values are true and false.
 The default value is false which will determine a classic looking button.
 When true, the SWING button will have no borders while the SWT one will be a tool item.
 The processed values will be either Boolean.TRUE or Boolean.FALSE.

### `PROPERTY_ACTION_IDS`

**Type:** `java.lang.String`

It's processed 
 value is a list of IAuthorExtensionAction. If one of the actions IDs wasn't 
 found the value remains the given string ID.

### `PROPERTY_ICON`

**Type:** `java.lang.String`

The processed value is an Icon to be displayed on the button
 or null if no icon is specified or the specified one cannot be loaded.

### `PROPERTY_SHOW_TEXT`

**Type:** `java.lang.String`

If missing, the button displays only the icon if it is available, or the 
 text if the icon is not available. This is a boolean property.

### `PROPERTY_SHOW_ICON`

**Type:** `java.lang.String`

If missing, the button displays only the icon if it is available, or the 
 text if the icon is not available. This is a boolean property.

### `PROPERTY_ENABLE_IN_READ_ONLY_CONTEXT`

**Type:** `java.lang.String`

Default value is #FALSE.

### `PROPERTY_LABEL`

**Type:** `java.lang.String`

### `PROPERTY_TOOLTIP`

**Type:** `java.lang.String`

### `PROPERTY_ACTION_DISPLAY_STYLE`

**Type:** `java.lang.String`

### `PROPERTY_RENDERER_CLASS_NAME`

**Type:** `java.lang.String`

This must be a SWING implementation for both 
 the Oxygen stand alone or Eclipse plugin version. 
 
 This class will be look for in the class path of the associated document type
 or in the #PROPERTY_CLASSPATH.

### `PROPERTY_SWING_EDITOR_CLASS_NAME`

**Type:** `java.lang.String`

The SWING implementation is used for the Oxygen stand alone.
 
 This class will be look for in the class path of the associated document type
 or in the #PROPERTY_CLASSPATH.

### `PROPERTY_SWT_EDITOR_CLASS_NAME`

**Type:** `java.lang.String`

The SWT implementation is used for the Eclipse plugin version.
 
 This class will be look for in the class path of the associated document type
 or in the #PROPERTY_CLASSPATH.

### `PROPERTY_WEBAPP_RENDERER_CLASS_NAME`

**Type:** `java.lang.String`

This class will be looked for in the class path of the associated document 
 type or in the #PROPERTY_CLASSPATH.

### `PROPERTY_CLASSPATH`

**Type:** `java.lang.String`

A comma separated enumeration of URLs.

### `PROPERTY_SELECTION_MODE`

**Type:** `java.lang.String`

Its possible values are #SELECTION_MODE_SINGLE and #SELECTION_MODE_MULTIPLE.
 The default value is #SELECTION_MODE_MULTIPLE.

### `PROPERTY_FONT_INHERIT`

**Type:** `java.lang.String`

Its possible values are true or false.

### `PROPERTY_COLOR`

**Type:** `java.lang.String`

Its possible values are a color or 'inherit' if the color should be inherited from the element.

### `PROPERTY_CONTENT_TYPE`

**Type:** `java.lang.String`

The values belongs to the ro.sync.basic.contenttypes.ContentTypes

### `PROPERTY_VISIBLE`

**Type:** `java.lang.String`

Its possible values are `true` or `false`.

### `PROPERTY_VALIDATE_INPUT`

**Type:** `java.lang.String`

### `PROPERTY_INDENT_ON_TAB`

**Type:** `java.lang.String`

If this property 
 is true, TAB is used for indentation instead of navigation.
 
 By default, it is set to true.

### `ACTION_CONTEXT_ELEMENT`

**Type:** `java.lang.String`

The action will be executed
 in the context of the element associated with the form control.
 
 

 We want the form control below to delete the `li` element
 even if the caret is located in a descendant of `li`. 
 
 

```

 li:before {
   content:oxy_button(actionID, 'delete.element', actionContext, 'element')
 }
 
```

### `ACTION_CONTEXT_CARET`

**Type:** `java.lang.String`

The action will be executed
 in the current selection context. The selection/caret must be inside the element
 associated with the form control. Otherwise the action will be executed 
 in #ACTION_CONTEXT_ELEMENT context.
 
 

 The form control is added on a 'para' element. Whenever the user makes a selection 
 inside 'para' and clicks the button we want to wrap the existing selection in a 'b' element.
  
 
 

```

 para:before {
   content:oxy_button(actionID, 'bold.wrap', actionContext, 'caret')
 }
 
```

### `TYPE_BUTTON`

**Type:** `java.lang.String`

Indicates that a combo box should be 
 used to render and edit.

### `TYPE_COMBOBOX`

**Type:** `java.lang.String`

Indicates that a combo box should be 
 used to render and edit.

### `TYPE_TEXT`

**Type:** `java.lang.String`

Indicates that a text field with 
 content completion support should be used to render and edit.

### `TYPE_TEXT_AREA`

**Type:** `java.lang.String`

Indicates that a text area with 
 syntax highlight support should be used to render and edit.

### `TYPE_HTML_CONTENT`

**Type:** `java.lang.String`

Indicates that a pane with
 HTML interpreting support should be used to render.

### `TYPE_CHECKBOX`

**Type:** `java.lang.String`

Indicates that a check box panel should be 
 used to render and edit.

### `TYPE_POPUP_SELECTION`

**Type:** `java.lang.String`

### `TYPE_URL_CHOOSER`

**Type:** `java.lang.String`

Indicates that a URL chooser 
 should be used to render and edit.
 
 The new type of URL chooser that uses an InputUrlPanel.

### `TYPE_BUTTON_GROUP`

**Type:** `java.lang.String`

Indicates that a button with a pop-up menu 
 that contains a list of actions should be used to render and edit.

### `EDIT_TEXT_CONTENT`

**Type:** `java.lang.String`

### `EDIT_XML_CONTENT`

**Type:** `java.lang.String`

This parameter is useful when an element has mixed or element-only content and 
 you want to edit its content inside a text area form control. For example:
 
XML:
  

```
<codeblock outputclass="language-xml">START_TEXT<ph>phase</ph><apiname><text>API</text></apiname></codeblock>
```

  
CSS
  

```
codeblock:before{
content:
    oxy_textArea(
      edit, content,
      contentType, 'text/xml');
}
```


 The text area form control will edit this fragment: 
 
START_TEXT<ph>phase</ph><apiname><text>API</text></apiname>

### `EDIT_CUSTOM`

**Type:** `java.lang.String`

In this situation it is recommended for the editor to give an EditingEvent#customEdit
 on InplaceEditingListener#commitValue(EditingEvent). If that's not done the following apply:
 

 In this case the notification InplaceEditingListener#commitValue(EditingEvent) will
 do nothing since it's not clear where should the given value be committed.
 
 

 The notification InplaceEditingListener#editingStopped(EditingEvent) will
 also stop the editing session without committing any value. It's up to the custom
 editor to make the necessary changes into the document (but only after the 
 previous mentioned notification was issued).
 
 

 **Warning:**
 All changes to the document (that the custom editor must do) 
 must be performed after the InplaceEditingListener#editingStopped(EditingEvent)
 notification was fired. Because the editing is automatically 
 stopped on any document modification an infinite loop will happen if the previous condition is not met.

### `FALSE`

**Type:** `java.lang.String`

### `TRUE`

**Type:** `java.lang.String`

### `SELECTION_MODE_SINGLE`

**Type:** `java.lang.String`

Only a single value
 will be selected.

### `SELECTION_MODE_MULTIPLE`

**Type:** `java.lang.String`

It allows multiple values 
 to be selected.

### `TYPE_DATE_PICKER`

**Type:** `java.lang.String`

It handles schema types xs:date and xs:datetime or 
 any type with a specified Java format from CSS.

### `TYPE_OLD_URL_CHOOSER`

**Type:** `java.lang.String`

Left here as a workaround if someone got really attached to it.

### `PROPERTY_FORMAT`

**Type:** `java.lang.String`

It specifies the date-time format of the edited value.

### `COMMA`

**Type:** `java.lang.String`

The real comma is used as a delimiter for multiple values thus
 this special variable is needed.

### `INHERIT`

**Type:** `java.lang.String`

### `PROPERTY_ACTION`

**Type:** `java.lang.String`

The processed value is 
 an IAuthorExtensionAction that is stored into the #PROPERTY_ACTION_ID.

### `PROPERTY_ACTIONS`

**Type:** `java.lang.String`

The processed value is a list of  
 a IAuthorExtensionAction that is stored into the #PROPERTY_ACTION_IDS.

### `PROPERTY_HAS_MULTIPLE_VALUES`

**Type:** `java.lang.String`

If `true`, then
 the form control can have multiple values, separated by spaces. If `false`,
 it can have a single value. The default is `true`.

### `TYPE_VIDEO_PLAYER`

**Type:** `java.lang.String`

Indicates a video player.

### `TYPE_AUDIO_PLAYER`

**Type:** `java.lang.String`

Indicates an audio player.

### `TYPE_BROWSER`

**Type:** `java.lang.String`

Indicates a JavaFX-based browser.

### `PROPERTY_HEIGHT`

**Type:** `java.lang.String`

The values are the same like height property from CSS with one exception:
      
%  Defines the height in percent of the entire viewport height
 

```

 elem {
   content: oxy_video(href, 'page.html', width, 12em, height, 10em)
 }
 
```

 
  The value for this property should not be requested directly but using 
  DynamicPropertyEvaluator#evaluateHeightProperty(java.util.Map, int).
  Such an instance can be obtain from AuthorInplaceContext.

### `PROPERTY_SA_HEAVY_FORM_CONTROL_CLASS_NAME`

**Type:** `java.lang.String`

These form controls differ from 
 the classic form control by the fact that they are placed in the component 
 hierarchy from the very beginning.
 
 Class name of a heavy weight form control. This implementation is used in the 
 Desktop version of Oxygen. 

 
 
**Note** If Oxygen is running as a Eclipse plugin then you'll have to use #PROPERTY_ECLIPSE_HEAVY_FORM_CONTROL_CLASS_NAME
 
**Note** If Oxygen is running as a Standalone or Desktop version then you'll have to use #PROPERTY_WEBAPP_RENDERER_CLASS_NAME
 
 This class will be look for in the class path of the associated document type
 or in the #PROPERTY_CLASSPATH.

### `PROPERTY_ECLIPSE_HEAVY_FORM_CONTROL_CLASS_NAME`

**Type:** `java.lang.String`

These form controls differ from 
 the classic form control by the fact that they are placed in the component 
 hierarchy from the very beginning.
 
 Class name of a heavy weight form control. This implementation is used when 
 Oxygen is running inside an Eclipse environment. 
 
 
**Note** If Oxygen is running as a Standalone or Desktop version then you'll have to use #PROPERTY_SA_HEAVY_FORM_CONTROL_CLASS_NAME
 
**Note** If Oxygen is running as a Standalone or Desktop version then you'll have to use #PROPERTY_WEBAPP_RENDERER_CLASS_NAME 
 
 This class will be look for in the class path of the associated document type
 or in the #PROPERTY_CLASSPATH.

### `PROPERTY_ON_CHANGE`

**Type:** `java.lang.String`

Can be used to invoke an action every time combo changes its value.

### `PROPERTY_SPELL_CHECK`

**Type:** `java.lang.String`

The default value is `false`.
 When `true`, the content inside the text field is spell-checked if the automatic spell checking
 is enabled in the application.
 The processed values will be either `Boolean.TRUE` or `Boolean.FALSE`.

