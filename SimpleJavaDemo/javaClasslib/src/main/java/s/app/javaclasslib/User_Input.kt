package s.app.javaclasslib


fun main(args:Array<String>){


    var numStr1:String; var numStr2:String
    var isContinue:String
    do{

        println("Enter value one ")
        numStr1= readLine()!!
        println("Enter value Sec ")
        numStr2= readLine()!!
        println("sum is : "+(numStr1.toInt()+numStr2.toInt()))

        println("do you want to continue: y/n")
        isContinue= readLine()!!
    }while (isContinue=="y"||isContinue=="Y")
}