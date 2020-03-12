package com.study.demo1

/**
 * Created by zhanghaochen on 2020/3/11.
 */
data class WomenGuest(var name: String, var age: Int, var height: Int, var address: String)

var guests = listOf<WomenGuest>(
        WomenGuest("张三", 20, 160, "江苏"),
        WomenGuest("张三2", 20, 160, "山东"),
        WomenGuest("张三3", 20, 163, "广州"),
        WomenGuest("张三4", 20, 160, "湖南"),
        WomenGuest("张三5", 20, 160, "江苏"),
        WomenGuest("张三6", 20, 160, "湖南"),
        WomenGuest("张三7", 25, 162, "江苏"),
        WomenGuest("张三8", 20, 166, "江苏"),
        WomenGuest("张三9", 20, 160, "江苏"),
        WomenGuest("张三10", 20, 160, "江苏"),
        WomenGuest("张三11", 24, 167, "江苏"),
        WomenGuest("张三12", 20, 160, "江苏"),
        WomenGuest("张三13", 20, 168, "江苏"),
        WomenGuest("张三14", 25, 160, "江苏"),
        WomenGuest("张三15", 20, 169, "江苏")
)

infix fun List<WomenGuest>.findAgeBelow(age: Int) {
    filter { womenGuest -> womenGuest.age < 21 }.forEach(::println)
}