# Interface: `ValidationUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util.validation`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.validation.ValidationUtilAccess`

## Description

## Methods

### `validateResources(Iterator<URL> resourcesIterator, boolean validateOnlyXMLResources, ValidatorProblemCollector problemsCollector)`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `validateOnlyXMLResources` (`boolean`): `true` to validate only XML resources.
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector`](./ValidatorProblemCollector.md)): The problems collector.  Never `null`.

**Returns:** `void`

### `validateResources(Iterator<URL> resourcesIterator, Function<URL,String> contentProvider, boolean validateOnlyXMLResources, ValidatorProblemCollector problemsCollector)`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `contentProvider` (`java.util.function.Function<java.net.URL,java.lang.String>`): Provides content to validate for a certain URL.
- `validateOnlyXMLResources` (`boolean`): `true` to validate only XML resources.
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector`](./ValidatorProblemCollector.md)): The problems collector.  Never `null`.

**Returns:** `void`

