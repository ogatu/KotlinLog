package jp.techacademy.tsuyoshi.kotlinlog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human=Human("毅", 44,"コード")    // 名前を毅、年齢を44歳、趣味はコードで　humanのインスタンスを作る


        human.think()// think メソッドの呼び出し
        human.say()// say メソッドの呼び出し

        val po= Human("テテ", 1,"遊び")


        Log.d("kotlintest", "犬の名前は" + po.name + "です。")
        Log.d("kotlintest", "犬の趣味は" + po.hobby + "です。")



    }





    }


