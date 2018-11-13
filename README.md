# BaseModule
[![](https://jitpack.io/v/MrRobotter/BaseModule.svg)](https://jitpack.io/#MrRobotter/BaseModule)

### usage
* Add it in your root build.gradle at the end of repositories:


````
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
````
* Add the dependency
````
	dependencies {
	        implementation 'com.github.MrRobotter:BaseModule:1.0.2'
	       	// butterKnife
    		annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
    		implementation 'com.jakewharton:butterknife:8.8.1'
    	    implementation 'me.yokeyword:fragmentation:1.0.0'
	}

````

* 权限
````
 	<uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>

````

### 初始化
PreferencesUtils.init(getApplicationContext)

### 已有功能


