package jp.techacademy.tsuyoshi.kotlinlog
import android.util.Log
open class dog:Animal, Movable {
    // プロパティ


    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }


    // Animalクラスのメソッドをオーバーライド
   override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    // Movableインタフェースのメソッドをオーバーライド
    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}
