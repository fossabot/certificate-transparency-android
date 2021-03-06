# *sampleapp* module

This module provides a living example of how to use the certificate
transparency library in an Android app.

The following examples are provided:

- [OkHttp](https://square.github.io/okhttp/)
  - Kotlin - [OkHttpKotlinExampleViewModel.kt](./src/main/java/com/babylon/certificatetransparency/sampleapp/examples/okhttp/kotlin/OkHttpKotlinExampleViewModel.kt)
  - Java - [OkHttpJavaExampleViewModel.java](./src/main/java/com/babylon/certificatetransparency/sampleapp/examples/okhttp/java/OkHttpJavaExampleViewModel.java)
- [HttpURLConnection](https://developer.android.com/reference/java/net/HttpURLConnection)
  - Kotlin - [HttpURLConnectionKotlinExampleViewModel.kt](./src/main/java/com/babylon/certificatetransparency/sampleapp/examples/httpurlconnection/kotlin/HttpURLConnectionKotlinExampleViewModel.kt)
  - Java - [HttpURLConnectionJavaExampleViewModel.java](./src/main/java/com/babylon/certificatetransparency/sampleapp/examples/httpurlconnection/java/HttpURLConnectionJavaExampleViewModel.java)
- [Volley](https://developer.android.com/training/volley/index.html)
  - Kotlin - [VolleyKotlinExampleViewModel.kt](./src/main/java/com/babylon/certificatetransparency/sampleapp/examples/volley/kotlin/VolleyKotlinExampleViewModel.kt)
  - Java - [VolleyJavaExampleViewModel.java](./src/main/java/com/babylon/certificatetransparency/sampleapp/examples/volley/java/VolleyJavaExampleViewModel.java)

**Note:** The examples create the certificate transparency interceptor
and hostname verifier on every request. In a real app this should be
saved and reused for all connections.
