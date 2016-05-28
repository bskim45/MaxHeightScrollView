#MaxHeightScrollView [![Build Status](https://travis-ci.org/bskim45/MaxHeightScrollView.svg?branch=master)](https://travis-ci.org/bskim45/MaxHeightScrollView) [ ![Download](https://api.bintray.com/packages/bskim45/maven/maxheightscrollview/images/download.svg) ](https://bintray.com/bskim45/maven/maxheightscrollview/_latestVersion)

The **MaxHeightScrollView** is a android library allows to set maximum height of ScrollView(NestedScrollView).

#Preview
##Demo
You can try demo application from [here](https://github.com/bskim45/MaxHeightScrollView/raw/master/app/app.apk), or you can clone this project and build your own.

##Screenshots
<img src="/github/screenshot.png?raw=true" width=411 height=731 alt="Quick Demo">

#Requirements
API Level 8 (Froyo) and above.

#Setup
The library is pushed to jcenter as an AAR. Just add following dependency to your `build.gradle` file:

```gradle
compile 'com.bskim:maxheightscrollview:1.0.0@aar'
```

#Usage
Using the library is super easy. Just look at the source code of [the provided demo](https://github.com/bskim45/MaxHeightScrollView/blob/master/app/src/main/java/com/bskim/maxheightscrollview/demo/MainActivity.java).

## Using XML
```xml
<com.bskim.maxheightscrollview.widgets.MaxHeightScrollView
		xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        app:maxHeight="60dp">

		<!-- contents you want to add -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!" />

    </com.bskim.maxheightscrollview.widgets.MaxHeightScrollView>
```

## Using code
```java
// set maxHeight programmatically
MaxHeightScrollView sv = (MaxHeightScrollView) findViewById(R.id.scrollView);
sv.setMaxHeightDp(60);        // using dp
sv.setMaxHeight(100);         // using pixels
```


#Credits
- SlickDev - [StackOverFlow](http://stackoverflow.com/users/929540/slickdev)
	- The main concept came from [this stackoverflow article](http://stackoverflow.com/a/33839689/4061803)

#Developed By
* Bumsoo Kim (<bskim45@gmail.com>) - [bsk.im](https://bsk.im)

#License
    Copyright 2016 Bumsoo Kim

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
