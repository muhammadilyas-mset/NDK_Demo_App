#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_ndk_1example_11_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Muhammad Ilyas | Demo App 1";
    return env->NewStringUTF(hello.c_str());
}