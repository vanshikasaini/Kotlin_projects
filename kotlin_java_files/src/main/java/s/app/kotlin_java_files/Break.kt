package s.app.kotlin_java_files
/*==Entry point of the program====*/
fun main(args:Array<String>){

    /*===To break the range loop==WE used BREAK==*/
//    for(item in 1..10){
//
//        if(item==6)
//            break
//        println("Values $item")
//    }


    /*===use break to exit from while loop====*/
//    var num1:String;var num2:String
//    var isContinue:String
//
//    while(true){
//        println("Enter 1 no: ")
//        num1= readLine()!!
//        println("Enter 2 no: ")
//        num2= readLine()!!
//
//        println("result is ${sumOftwo(num1.toInt(),num2.toInt())}")
//
//        println("Do you want to continue :Y/N")
//        isContinue= readLine()!!
//        if(isContinue=="n"||isContinue=="N")
//            break
//
//    }


    /*=======Use of labelled Break=,label is followed by @ symbol======*/
    /*
    * To skip from inner loop to outer loop
    * */

test@for(i in 1..10)
{
    for(j in 1..15)
    {
        if(j==7)
        break@test
        println("Values $i and $j")
    }

}

    /*=====Continue======*/
    /*
    * to skip and continue with few set of statements
    * */

    for(i in 1..10){
        if(i in 4..7)
            continue
        println("Skipped $i")
        println("checking next line")
    }

}


fun sumOftwo(a:Int,b:Int):Int{//Actual parameters

    //Those we used at calling time they will be called formal parameters
    return a+b
}