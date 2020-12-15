<img src="screenshots/logo_dreami.png" alt="STL samples" width="1024" />

# basic-java samples

basic-java is a sample chat app built with STL

### Installation
---------------------
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