package com.kjy.risingtest_practice_2

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService


// 클라우드 메시징(FCM) 사용을 위해서 서비스를 상속하는 것이 아닌 FirebaseMessaingService()를 상속받음
// 서비스 클래스 안에 메서드를 작성해두면 토큰이 생성될때 마다 안드로이드가 호출 해줌.
class MyFirebaseMessagingService : FirebaseMessagingService()  {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("토큰", "${token}")
    }
}