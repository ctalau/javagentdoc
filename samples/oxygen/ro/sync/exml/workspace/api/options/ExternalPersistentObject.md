# Interface: `ExternalPersistentObject`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.ExternalPersistentObject`

**Extends:** `ro.sync.options.PersistentObject`

## Description

The implementation class should mostly contain simple fields (String, Integer, boolean).
 
If you want to use more complex structures, you can use the "ro.sync.options.SerializableList"
 and "ro.sync.options.SerializableLinkedHashMap" objects.
 
A sample implementation can be found in "ro.sync.exml.workspace.api.options.SimpleListOfStringsExternalPersistentObject".
 
The object can be serialized to XML using the API 
 "ro.sync.exml.workspace.api.options.GlobalOptionsStorage.serializePersistentObject(Object)".
 
It can also be de-serialized using the "ro.sync.exml.workspace.api.options.GlobalOptionsStorage.deserializePersistentObject(String)" API.

