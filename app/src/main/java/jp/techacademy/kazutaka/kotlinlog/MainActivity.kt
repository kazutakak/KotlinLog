package jp.techacademy.kazutaka.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("佐藤", 18, "サッカー")
        val human2 = Human("伊藤", 17, "野球")

        human1.say()
        human1.move()
        human2.say()
        human2.move()
    }
}
