package com.example.youtubejoyce

import androidx.compose.ui.text.toUpperCase

fun main() {
//    helloWorld()

//    println(add(1, 5))
//    // 6
//    hi()

//    println(maxBy(1, 3))
//    println(maxBy2(1, 3))

//    checkNum(2)

//    array()

//    forAndWhile()

    nullcheck()
}
// 1. 함수

fun helloWorld(): Unit {
    println("Hello World!")
}

//// return 값이 없어서 에러
// fun add1(a:Int, b: Int) {
//    return a+b
//}

// return 타입 명시 필수
fun add(a:Int, b: Int):Int {
    return a+b
}

// 2. val vs var

fun hi() {
    val a: Int = 1 // val == const
    var b: Int = 2 // var == let

//    a = 3 // 상수 변경 불가
    b = 4

    val c = 100 // 타입 생략 가능
    var d = 100

    var name = "joy"

// 3. String template
    val test = "test"
    println("my name is $test")
    // my name is test

//    println("my name is $test입니다") // ERROR 아래 처럼 변경
    println("my name is ${test}입니다")
    // my name is test입니다


    val firstName = "jeong"
    val lastName = "juae"

    println("my name is ${firstName + lastName}")
    // my name is jeongjuae

    println("is this true? ${1==0}")
    // is this true? false

    println("this is 2$a")
    // this is 21

    println("this is 2\$a")
    // this is 2$1

}

// 4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if (a>b) a else b

// when == switch
fun checkNum(score: Int) {
    when(score){
        0 -> println("영")
        1 -> println("일")
        2, 3 -> println("이삼")
        else -> println("숫자")
    }

    // return 식으로 사용 가능 (else 필수)
    var b = when(score) {
        0 -> "영"
        1 -> "일"
        2, 3 -> "이삼"
        else -> "숫자"
    }

    when (score) {
        in 90..100 -> println("good")
        in 10..80 -> println("soso")
        in 2..9 -> println("wow")
        in 1..2 -> println("hell")
        else -> println("error")
    }
}

// expression(표현식) vs statement(문장)
// expression(표현식)
// -> return 값이 있는 것 (반환)
// -> kotlin 모든 함수 Unit return 하고 있음

// statement(문장)
// -> 명령
// -> void == statement

// 5. Array and List

fun array() {
// expression(표현식) vs statement(문장)
// expression(표현식)
// -> return 값이 있는 것 (반환)
// -> kotlin 모든 함수 Unit return 하고 있음

// statement(문장)
// -> 명령
// -> void == statement

    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.14)
    val list2 = listOf(1, "d", 3.14)

    // array 값 변경 가능
    array[0] = 99
    println(array[0]) // 99


    // list 값 변경 불가 (읽기 전용)
    // list[0] = 44 // ERROR
    var result = list.get(0) // 값을 가져올수만 있음
    println(result) // 1
    println(list.contains(5)) // false
    println(list.isEmpty()) // false
    println(list.size) // 3

    // mutable list
    // 대표 array list
    // val 사용 가능 -> 주소값이 변경되지 않기 때문
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(30)
    println(arrayList) // [10, 30]
    arrayList.remove(30)
    println(arrayList) // [10]
    arrayList.add(30)
    arrayList.add(40)
    arrayList[1] = 99 // == arrayList.set(1,99)
    println(arrayList) // [10, 99, 40]

    // arrayList = arrayListOf<Int>() // 새롭게 넣는건 안됨
}

// 6. 반복문 for / while

fun forAndWhile() {
    val students = arrayListOf("joy", "sad", "happy", "anger")
    for (name in students) {
        println(name)
     }
//    joy
//    sad
//    happy
//    anger

    var sum = 0
    for (i in 1..10) { // 1 ~ 10
        println(i)
        sum += i
    }
    println(sum)
//    1
//    2
//    3
//    4
//    5
//    6
//    7
//    8
//    9
//    10
//    55

    var sum2 = 0
    for (i in 1..10 step 2) {
        println(i)
        sum2 += i
    }
    println(sum2)
//    1
//    3
//    5
//    7
//    9
//    25

    var sum3 = 0
    for (i in 10 downTo 1) {
        println(i)
        sum3 += i
    }
    println(sum3)
//    10
//    9
//    8
//    7
//    6
//    5
//    4
//    3
//    2
//    1
//    55
    var sum4 = 0
    for (i in 1 until 10) { // 1 ~ 9
        println(i)
        sum4 += i
    }
    println(sum4)
//    1
//    2
//    3
//    4
//    5
//    6
//    7
//    8
//    9
//    45

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : $name")
    }
//    1번째 학생 : joy
//    2번째 학생 : sad
//    3번째 학생 : happy
//    4번째 학생 : anger
    var index = 0
    while (index < 10){
        println(index)
        index++
    }
//    0
//    1
//    2
//    3
//    4
//    5
//    6
//    7
//    8
//    9
}

// 7. Nullable / NonNull

fun nullcheck() {
    // NPE: Null Pointer Exception (runtime에서 걸리는 에러)

    var name  = "joy"

    // 타입? 차이로 null 사용 가능
//    var nullName1: String = null // ERROR
    var nullName2: String? = null

//    var nameInUpperCase: String = name.toUpperCase()
//
//    var nullNameInUpperCase: String = nullName2.toUpperCase()
//
//    var nullNameInUpperCase: String? = nullName2?.toUpperCase()
}