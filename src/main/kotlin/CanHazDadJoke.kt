package yuge

import okhttp3.Request
import okhttp3.OkHttpClient

fun getDadJoke(): String? {
    val client = OkHttpClient()
    val request = Request.Builder().url("https://icanhazdadjoke.com").addHeader("Accept", "text/plain").build();
    val response = client.newCall(request).execute();
    return response.body()?.string()
}
