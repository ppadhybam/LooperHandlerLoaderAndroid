package com.priyabrat.looperhandlerloaderandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
https://developer.android.com/reference/android/os/Looper.html
http://stackoverflow.com/questions/7597742/what-is-the-purpose-of-looper-and-how-to-use-it

What is Looper?

Looper is a class which is used to execute the Messages(Runnables) in a queue.
Normal threads have no such queue, e.g. simple thread does not have any queue.
It executes once and after method execution finishes, the thread will not run another Message(Runnable).

Where we can use Looper class?

If someone wants to execute multiple messages(Runnables) then he should use the Looper class which is
responsible for creating a queue in the thread. For example, while writing an application that downloads
files from the internet, we can use Looper class to put files to be downloaded in the queue.

How it works?

There is prepare() method to prepare the Looper. Then you can use loop() method to create a message loop
in the current thread and now your Looper is ready to execute the requests in the queue until you quit the loop.
http://android-er.blogspot.in/2015/05/android-example-thread-handler-and.html
http://androidsrc.net/android-loopers-and-handlers-code-tutorial/
http://androidshortnotes.blogspot.in/2013/02/thread-concept-in-android.html
https://github.com/pwittchen/android-looper-sample
http://codetheory.in/android-handlers-runnables-loopers-messagequeue-handlerthread/
https://www.youtube.com/watch?v=wYDJH6tDyNg
*/

public class LooperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looper);
    }
}
