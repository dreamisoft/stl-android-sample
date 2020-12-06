# stl android samples (stl template library with sendbird sdk)
===================================

### Samples

* **[basic-Java](https://github.com/dreamisoft/stl-android-sample/blob/master/basic-java)** - Shows how to use STL core. Also uses ViewModels and LiveData.


### Installation
-------
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
	

Step 2. Add the dependency

```gradle
	dependencies {
        implementation 'com.github.dreamisoft.stl-android:core:(insert latest version)'
        implementation 'com.github.dreamisoft.stl-android:ui:(insert latest version)'
	}
```