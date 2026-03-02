# Interface: `ExternalAIFunction`

**Package:** [`ro.sync.exml.plugin.ai`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.ai.ExternalAIFunction`

## Description

This interface defines the structure for function that can be invoked by the AI system to perform actions 
 or retrieve information within the application. This function may require specific parameters 
 (defined by a JSON schema) and can be used to extend the functionality of the AI system.
 
 
 The functions are typically invoked by the AI to access external services, manipulate data, or perform tasks 
 that require interaction with the application environment.

## Methods

### `getName()`

**Returns:** `java.lang.String`

Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
 

 The name should uniquely identify the external AI function and can be used 
 to locate and execute the function.

### `getDescription()`

**Returns:** `java.lang.String`

This method provides a detailed description of the AI function's purpose and behavior. 
 It should explain what the function does, what kind of data it processes, 
 and any relevant details about its operation.

### `getUIDecription()`

**Returns:** `java.lang.String`

This description will not be sent to the AI.

### `getParameterDescriptions()`

**Returns:** `java.lang.String`

Example: 
 

```
{
                "type": "object",
                "properties": {
                    "order_id": {
                        "type": "string",
                        "description": "The customer's order ID."
                    }
                },
                "required": ["order_id"],
                "additionalProperties": False
            }
```

### `executeFunction(java.lang.String parameters, java.util.Map<java.lang.String,java.lang.Object> extraContext)`

**Returns:** `java.lang.String`

This method allows the AI to execute the function, passing in the required parameters (which should 
 conform to the JSON schema returned by #getParameterDescriptions()) and any additional application context 
 as key-value pairs. The function performs its operation (which may involve interacting with 
 external services, accessing application data, or manipulating internal state) and returns 
 a result as a string. The result could be a serialized JSON object or a plain string.
 
 

 The function may modify the application's state, provide results back to the AI, or trigger 
 further actions within the application based on the inputs provided.

**Parameters:**
- `parameters` (`java.lang.String`): A string representing the parameters required to execute the function. 
                   The format and content of this string should conform to the JSON schema 
                   returned by #getParameterDescriptions().
- `extraContext` (`java.util.Map<java.lang.String,java.lang.Object>`): A map containing additional application context or information needed by the function.
                     When called from WebAuthor, it will contain an "author_document_model" key with the AuthorDocumentModel of the current editor.
                     It will also contain a "session_id" key with a unique identifier assigned to the execution request session.

### `isEnabled()`

**Returns:** `boolean`

This method allows the system to verify if the function is active and available for invocation.
 It is useful for determining whether the function should be executed in a given context, based on its enabled state.
 
 

 The default implementation returns `true`, indicating that the function is enabled. 
 However, this method can be overridden to introduce custom logic for enabling or disabling the function.

