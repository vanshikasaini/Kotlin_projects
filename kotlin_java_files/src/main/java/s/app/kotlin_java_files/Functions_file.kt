package s.app.kotlin_java_files

fun main(args:Array<String>)
{
//    var num1:String;var num2:String
//
//    var result:Int
//    println("Enter 1 no: ")
//        num1= readLine()!!
//        println("Enter 2 no: ")
//        num2= readLine()!!
//
//    /*===Formal parameters===*/
//    result= sumOf_two(num1.toInt(),num2.toInt())
//
//    println("Result : "+result)
//

    defaultValueFun()
    defaultValueFun(12)
    defaultValueFun(num=10)
    defaultValueFun(22,'t')

    /*====Not possible to direct assigned value to second parameter====*/
    //defaultValueFun('u')

    defaultValueFun(ch='l')


}
//FUNCTION TYPE 1
/*
* if function return type is void then it is also called Unit
* we defined as
*
* */
fun nameOf_Fun():Unit{
    println("this funtion has nothing as return type and called it as Unit")
}

//FUNCTION TYPE 2
fun sumOf_two(a:Int,b:Int):Int{//Actual parameters

    //Those we used at calling time they will be called formal parameters
    return a+b
}
//FUNCTION TYPE 3
/*===
* function with Default parameters
*
* */

fun defaultValueFun(num:Int=10,ch:Char='f'){
    println("Values are int :  $num   character : $ch" )
}
