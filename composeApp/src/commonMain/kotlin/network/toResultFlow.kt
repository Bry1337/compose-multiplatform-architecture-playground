package network

import de.jensklingenberg.ktorfit.Response
import io.ktor.http.HttpStatusCode

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

/**
 * Processes the response of an API call that is declared in [ApiService].
 * Returns a [NetworkResult] object.
 * @param call suspend () -> Response<T>
 */
suspend fun <T> toResultFlow(call: suspend () -> Response<T>): NetworkResult<T> {
    val c = call.invoke()
    c.let { response ->
        try {
            println("ViewModel: ${response.body()}")
            if (response.status == HttpStatusCode.OK) {
                val body = response.body()
                return NetworkResult.Success(body)
            } else {
                return NetworkResult.Error(null, response.message)
            }
        } catch (e: Exception) {
            return NetworkResult.Error(null, e.toString())
        }
    }
}

