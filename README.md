# Validator

<b>Version 0.0.2</b>

library to validate input from user input especially in the authentication section

use Gradle:

```gradle
repositories {
  maven { url 'https://jitpack.io' }
}

dependencies {
  implementation 'com.github.renaldysa18:Validator:Version'
}
```
Or Maven:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
	</repository>
</repositories>

<dependency>
   <groupId>com.github.renaldysa18</groupId>
	    <artifactId>Validator</artifactId>
	    <version>Version</version>
</dependency>

<b>How to use this library</b>
//initializing class validator
val validator = Validator()

after that you can use this library by calling the method you need
- list of method
validasiLoginWithEmail
validasiLoginWithUsername

<b>example</b>
validator.validasiLoginWithEmail(et_email_login.text.toString(), et_password_login.text.toString()){
    result: Boolean, message: String ->
          if(result){
//do the right stuff
          } else {
//use the return message to find out the error
          }
}

Author
------
Renaldy SJP :)

Disclaimer
---------
This is not an official Google product.
