package network

/**
 * Created by Bryan on 7/15/24.
 * Copyright (c) 2024 bry1337.github.io. All rights reserved.
 */

sealed class NetworkResult<T>(val status: ApiStatus, val data: T?, val message: String?) {

    data class Success<T>(val _data: T?) :
        NetworkResult<T>(status = ApiStatus.SUCCESS, data = _data, message = null)

    data class Error<T>(val _data: T?, val exception: String) :
        NetworkResult<T>(status = ApiStatus.ERROR, data = _data, message = exception)

    data class Loading<T>(val isLoading: Boolean) :
        NetworkResult<T>(status = ApiStatus.LOADING, data = null, message = null)

//    companion object {
//        //Handles success
//        fun <T> success(data: T): NetWorkResult<T> = NetWorkResult(
//            status = ApiStatus.SUCCESS, data = data, message = null)
//        //Handles Loading
//        fun <T> loading(data: T?=null): NetWorkResult<T> = NetWorkResult(
//            status = ApiStatus.LOADING, data = data, message = null)
//        //Handles Error
//        fun <T> error(data: T?=null, error: String?=null): NetWorkResult<T> = NetWorkResult(
//            status = ApiStatus.ERROR, data = data, message=error)
//
//    }


}
enum class ApiStatus {
    SUCCESS,
    ERROR,
    LOADING,
}