To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

gradle :: maven :: sbt :: leiningen

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.hgnis:mLoader:Tag'
	}


How to initlize:
    
    mLoader loader;
    loader = new mLoader(this);

simililarly,
    mEllipsis
    mFeed
    mLoader
    mPacMan
    mRipple
    mPulse
    mPie
    mEclipse
    mDualBall
    infinity

call it by:
// Show :: 
    loader.showLoader();

//Hide ::
    loader.hideLoader();
    [![](https://jitpack.io/v/hgnis/mLoader.svg)](https://jitpack.io/#hgnis/mLoader)