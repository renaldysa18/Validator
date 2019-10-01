package com.redveloper.form_validator

class Validator {
    fun validasiLoginWithUsername(username: String, password: String, callback: (result: Boolean, message: String) -> Unit){
        if(!username.isEmpty()){
            if(username.length >= 3){
                if(!password.isEmpty()){
                    if(password.length >= 6){
                        callback.invoke(true, "login successful")
                    } else {
                        callback.invoke(false, "password is less than 6 character")
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
}