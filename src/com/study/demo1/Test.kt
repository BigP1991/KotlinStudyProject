package com.study.demo1

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

/**
 * Created by zhanghaochen on 2020/3/10.
 */
fun main(args: Array<String>) {
    // 内存中创建一个宽高为100的图片
    var image = BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB)
    var width = 0..99
    var height = 0..99
    image.apply {
        for (i in width) {
            for (j in height) {
                setRGB(i, j, 0xff0000)
            }
        }
    }
    ImageIO.write(image, "bmp", File("a.bmp"))
}