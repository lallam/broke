package com.broke.kotlin.libraryb

import com.broke.kotlin.librarya.Model
import kotlinx.serialization.Serializable

@Serializable

//class User : ModelX() {
class User : Model() {

    var userName: String = ""
    var dateOfBirth: String = ""
}