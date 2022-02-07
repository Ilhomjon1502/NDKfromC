#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_uz_ilhomjon_ndk1_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jstring JNICALL
Java_uz_ilhomjon_ndk1_MainActivity_stringIlhomjonJNI(
        JNIEnv* env,
jobject /* this */) {
std::string hello = "Hello from Ilhomjon bro";
return env->NewStringUTF(hello.c_str());
}