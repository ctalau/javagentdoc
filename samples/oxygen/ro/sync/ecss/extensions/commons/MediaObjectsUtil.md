# Class: `MediaObjectsUtil`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.MediaObjectsUtil`

## Description

## Fields

### `VIMEO_EMBEDDED_HOST`

**Type:** `java.lang.String`

### `VIDYARD_EMBEDDED_HOST`

**Type:** `java.lang.String`

### `VIMEO_HOST`

**Type:** `java.lang.String`

### `YOUTUBE_HOST`

**Type:** `java.lang.String`

### `REFERENCE_ATTR_DATA`

**Type:** `java.lang.String`

### `REFERENCE_ATTR_DATAKEYREF`

**Type:** `java.lang.String`

### `MEDIA_AUDIO_EXTENSIONS`

**Type:** `java.lang.String[]`

### `MEDIA_VIDEO_EXTENSIONS`

**Type:** `java.lang.String[]`

### `ALLOWED_MEDIA_EXTENSIONS`

**Type:** `java.lang.String[]`

### `RECOGNIZED_MEDIA_HOSTS`

**Type:** `java.lang.String[]`

## Constructors

### `<init>()`

## Methods

### `containsExtension(String extension, String[] allowedExtensions)`

**Parameters:**
- `extension` (`java.lang.String`): Searched extension.
- `allowedExtensions` (`java.lang.String[]`): Array with the allowed extensions.

**Returns:** `boolean`

### `detectOutputclass(String href)`

If an extension is not found, the selected type is iFrame.

**Parameters:**
- `href` (`java.lang.String`): The file href.

**Returns:** `java.lang.String`

### `isMediaReference(URL url)`

**Parameters:**
- `url` (`java.net.URL`): Resource's URL.

**Returns:** `boolean`

### `isEmbeddedContent(String url)`

**Parameters:**
- `url` (`java.lang.String`): the referred resource.

**Returns:** `boolean`

### `isRecognizedAsMedia(String hostURL)`

**Parameters:**
- `hostURL` (`java.lang.String`): Video host (like YouTube or Vimeo)

**Returns:** `boolean`

### `correctMediaEmbeddedReference(String url)`

```

 YouTube: From https://www.youtube.com/watch?v=video_id To https://www.youtube.com/embed/video_id
 Vimeo  : From https://vimeo.com/video_id To https://player.vimeo.com/video/video_id
 
```

**Parameters:**
- `url` (`java.lang.String`): The inserted media reference.

**Returns:** `java.lang.String`

### `isAudioReference(String fileName)`

**Parameters:**
- `fileName` (`java.lang.String`): The name of the file to check.

**Returns:** `boolean`

### `hasAudioFormat(String format)`

**Parameters:**
- `format` (`java.lang.String`): resource format.

**Returns:** `boolean`

### `isVideoReference(String fileName)`

**Parameters:**
- `fileName` (`java.lang.String`): The name of the file to check.

**Returns:** `boolean`

### `hasVideoFormat(String format)`

**Parameters:**
- `format` (`java.lang.String`): resource format.

**Returns:** `boolean`

