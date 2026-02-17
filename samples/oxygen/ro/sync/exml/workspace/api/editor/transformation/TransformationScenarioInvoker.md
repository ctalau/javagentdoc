# Interface: `TransformationScenarioInvoker`

**Package:** [`ro.sync.exml.workspace.api.editor.transformation`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.transformation.TransformationScenarioInvoker`

## Description

## Methods

### `runTransformationScenarios(`java.lang.String[]` scenarioNames, [`ro.sync.exml.workspace.api.editor.transformation.TransformationFeedback`](./TransformationFeedback.md) transformationFeedback)`

**Returns:** `void`

A separate thread is started and runs each scenario sequentially. The method returns immediately.

### `runTransformationScenario(`java.lang.String` scenarioName, `java.util.Map<java.lang.String,java.lang.String>` scenarioParameters, [`ro.sync.exml.workspace.api.editor.transformation.TransformationFeedback`](./TransformationFeedback.md) transformationFeedback)`

**Returns:** `void`

A separate thread is started and runs each scenario sequentially. The method returns immediately.

### `stopCurrentTransformationScenario()`

**Returns:** `void`

