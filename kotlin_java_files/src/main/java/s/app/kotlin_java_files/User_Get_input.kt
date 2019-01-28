package s.app.kotlin_java_files

fun main(args:Array<String>){
    var num1:String;var num2:String;var isContinue:String
//    do{
//        println("Enter first value")
//        num1= readLine()!!
//        println("Enter sec value")
//        num2= readLine()!!
//
//        var result:Int
//        result=num1.toInt()+num2.toInt()
//        println("Result is : $result")
//
//        println("do u want to continue ?")
//        isContinue= readLine()!!
//    }while (isContinue=="Y"||isContinue=="y")

    /*======USed SumOFTwo fun to get addition======*/

//    do{
//        println("Enter first value")
//        num1= readLine()!!
//        println("Enter sec value")
//        num2= readLine()!!
//
//
//
//        println("Result of ${'$'}a and ${'$'}b : ${sumOfTwo(num1.toInt(),num2.toInt())}")
//
//        println("do u want to continue ,Y/N?")
//        isContinue= readLine()!!
//    }while (isContinue=="Y"||isContinue=="y")


//    var number = readLine()
//    try {
//        println("Number multiply by 5 is ${number?.toInt()?.times(5)}")
//    } catch (ex: NumberFormatException) {
//        println("Number not valid")
//    }


}

fun sumOfTwo(a:Int,b:Int):Int{
    return  a+b
}