/*
 * Copyright 2020 Babylon Partners Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.babylon.certificatetransparency.internal.loglist

import retrofit2.http.GET
import retrofit2.http.Headers

internal interface LogListService {
    @GET("log_list.json")
    @Headers("Cache-Control: no-cache", "Max-Size: 1048576")
    suspend fun getLogList(): ByteArray

    @GET("log_list.sig")
    @Headers("Cache-Control: no-cache", "Max-Size: 512")
    suspend fun getLogListSignature(): ByteArray

    @GET("log_list.zip")
    @Headers("Cache-Control: no-cache", "Max-Size: 2097152")
    suspend fun getLogListZip(): ByteArray
}
