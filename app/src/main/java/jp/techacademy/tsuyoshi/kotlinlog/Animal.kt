package jp.techacademy.tsuyoshi.kotlinlog
 open abstract class Animal {
    // プロパティ=メンバ変数
    var name: String
    var age: Int

    // 引数付きコンストラクタ
  constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

   abstract fun say()
}
