package com.broke.kotlin.librarya

import kotlinx.serialization.Serializable

@Serializable
abstract class Model {
    var uniqueId: String = ""
}