package com.study.demo1

/**
 * Created by zhanghaochen on 2020/3/11.
 */
fun main(args: Array<String>) {
    var jiangsu = ArrayList<WomenGuest>()

//    for (guest in guests) {
//        if (guest.address == "江苏") {
//            jiangsu.add(guest)
//        }
//    }
//    for (guest in jiangsu) {
//        println("来自${guest.address}的身高${guest.height}的${guest.age}岁美女${guest.name}")
//    }

    // 高阶函数:参数为函数的函数或者返回值为函数的函数
    // it等价于迭代的T
    var guestMaxAge: WomenGuest? = guests.maxBy { it.age }
    println(guestMaxAge?.address)

    // 高阶函数，过滤器
    var guestList = guests.filter {
        womenGuest ->
        womenGuest.age > 20 && womenGuest.height > 162
    }
    for (guest in guestList) {
        println(guest)
    }

    println(guests.any {
        it.address == "江苏"
    })

    println(guests.count())
    println(guests.count {
        it.address == "江苏"
    })

    guests.groupBy {
        it.address
    }.get("江苏")?.forEach {
        println(it)
    }

    // 下面这两句是一样的，使用infix关键字可以将.调用替换成空格
    guests.findAgeBelow(21)
    guests findAgeBelow 21
}