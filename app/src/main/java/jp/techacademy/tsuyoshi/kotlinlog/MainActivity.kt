package jp.techacademy.tsuyoshi.kotlinlog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human=Human("毅", 44,"コード") // 名前を毅、年齢を44歳、趣味はコードで　humanのインスタンスを作る

        human.say()
        human.think()


        val po= Human("テテ", 1,"遊び")

        po.say()
        po.think()



    }





    }



