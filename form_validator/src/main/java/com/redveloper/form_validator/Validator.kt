package com.redveloper.form_validator

import android.content.Context
import android.util.Patterns

class Validator(context: Context) {
    //login - username validasi
    fun validasiLoginWithUsername(
        username: String,
        password: String,
        callback: (result: Boolean, message: String) -> Unit
    ) {
        if (!username.isEmpty()) {
            if (username.length >= 3) {
                if (!password.isEmpty()) {
                    if (password.length >= 8) {
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

    //login - email validasi
    fun validasiLoginWithEmail(
        email: String,
        password: String,
        callback: (result: Boolean, message: String) -> Unit
    ) {
        if (!email.isEmpty()) {
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                if (!password.isEmpty()) {
                    if (password.length >= 8) {
                        callback.invoke(true, "login berhasil")
                    } else {
                        callback.invoke(false, "kata sandi minimal 8 karekter")
                    }
                } else {
                    callback.invoke(false, "kata sandi masih kosong")
                }
            } else {
                callback.invoke(false, "format email tidak benar")
            }
        } else {
            callback.invoke(false, "email masih kosong")
        }
    }

    //signup - email, password
    fun validasiSignUp(
        email: String,
        password: String,
        callback: (result: Boolean, message: String) -> Unit
    ) {
        if (!email.isEmpty()) {
            if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                if (!password.isEmpty()) {
                    if (password.length >= 8) {
                        callback.invoke(true, "login successful")
                    } else {
                        callback.invoke(false, "password must be at least 8 characters")
                    }
                } else {
                    callback.invoke(false, "password is empety")
                }
            } else {
                callback.invoke(false, "email is not valid")
            }
        } else {
            callback.invoke(false, "email is empety")
        }
    }

    //signup - name, email, password, password conf
    fun validasiSignUp(
        name: String,
        email: String,
        password: String,
        password_conf: String,
        callback: (result: Boolean, message: String) -> Unit
    ) {
        if (!name.isEmpty()) {
            if (name.length >= 3) {
                if (!email.isEmpty()) {
                    if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                        if (!password.isEmpty()) {
                            if (password.length >= 8) {
                                if (password_conf.equals(password)) {
                                    callback.invoke(true, "login successful")
                                } else {
                                    callback.invoke(false, "passwords are not the same")
                                }
                            } else {
                                callback.invoke(false, "password must be at least 8 characters")
                            }
                        } else {
                            callback.invoke(false, "password is empety")
                        }
                    } else {
                        callback.invoke(false, "email is not valid")
                    }
                } else {
                    callback.invoke(false, "email is empety")
                }
            } else {
                callback.invoke(false, "name must be at least 3 characters")
            }
        } else {
            callback.invoke(false, "name is empety")
        }
    }

    //signup - name,email, password, password conf, phone
    fun validasiSignUp(
        name: String,
        email: String,
        phone: String,
        password: String,
        password_conf: String,
        callback: (result: Boolean, message: String) -> Unit
    ) {
        if (!name.isEmpty()) {
            if (name.length >= 3) {
                if (!email.isEmpty()) {
                    if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                        if (!phone.isEmpty()) {
                            if (phone.length >= 8) {
                                if (!password.isEmpty()) {
                                    if (password.length >= 8) {
                                        if (password_conf.equals(password)) {
                                            callback.invoke(true, "login berhasil")
                                        } else {
                                            callback.invoke(false, "kata sandi tidak sama")
                                        }
                                    } else {
                                        callback.invoke(
                                            false,
                                            "kata sandi minimal 8 karakter"
                                        )
                                    }
                                } else {
                                    callback.invoke(false, "kata sandi masih kosong")
                                }
                            } else {
                                callback.invoke(false, "nomor telepon minimal 8 karakter")
                            }
                        } else {
                            callback.invoke(false, "nomor telepon masih kosong")
                        }
                    } else {
                        callback.invoke(false, "format email tidak benar")
                    }
                } else {
                    callback.invoke(false, "email masih kosong")
                }
            } else {
                callback.invoke(false, "nama minimal 3 karakter")
            }
        } else {
            callback.invoke(false, "nama masih kosong")
        }
    }
}