package com.redveloper.form_validator

import android.util.Patterns

class Validator {
    fun validasiLoginWithUsername(username: String, password: String, callback: (result: Boolean, message: String) -> Unit){
        if(!username.isEmpty()){
            if(username.length >= 3){
                if(!password.isEmpty()){
                    if(password.length >= 8){
                        callback.invoke(true, "login successful")
                    } else {
                        callback.invoke(false, "password must be at least 8 characters")
                    }
                } else {
                    callback.invoke(false, "password is empety")
                }
            } else {
                callback.invoke(false, "username is less than 3 character")
            }
        } else {
            callback.invoke(false, "username is empety")
        }
    }

    fun validasiLoginWithEmail(email: String, password: String, callback: (result: Boolean, message: String) -> Unit){
        if(!email.isEmpty()){
            if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                if(!password.isEmpty()){
                    if(password.length >= 8){
                        callback.invoke(true, "login successful")
                    } else {
                        callback.invoke(false, "password must be at least 8 characters")
                    }
                } else {
                    callback.invoke(false, "password is empety")
                }
            } else{
                callback.invoke(false, "email is not valid")
            }
        } else {
            callback.invoke(false, "email is empety")
        }
    }
}