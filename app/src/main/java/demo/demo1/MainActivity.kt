package demo.demo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    /*
    * Github upload url
    * https://www.youtube.com/watch?v=3p_fgJEbsp8
    * https://www.youtube.com/watch?v=ZnS7fMPfbI8
    *
    * */
    var demo1: String = "demo1  testing "
    var demo2: String = "demo2 outside any function "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var job1 = "This is first variable"
        var sal = 23000
        var job2: String = "Rina is a nice girl"

        val sal1: Int = 4000
        println(job1 + " " + sal);

        print(sal1)
        println(message = job2)

        println("Demo1 : " + demo1)
        println("Demo2 : " + demo2)

        /*=====Number datatype in KOTLIN=====*/
        val intDt: Int = 2;
        val doubleDT: Double = 2.3;
        val longDT: Long = 2L;
        val floatDT: Float = 24.5F
        val floatDT1: Float = 24.5f
        val byteDT: Byte = 2
        val shortDT: Short = 20

        println("Int : " + intDt)
        println("doubleDT : " + doubleDT)
        println("longDT : " + longDT)
        println("floatDT : " + floatDT)
        println("floatDT1 : " + floatDT1)
        println("byteDT : " + byteDT)
        println("shortDT : " + shortDT)
        println("shortDT inside the string: $shortDT")


        /*====Character Data Type in Kotlin=====*/
        val ch: Char;
        var ch1: Char
        ch = 'x'; ch1 = 'D'

        println("character value1 is : &ch")
        println("character value1 is : & " + ch)
        println("character value2 is : $ch")
        println("character value2 is : $ch1")

        /*====Boolean in Kotlin=====*/

        var bool: Boolean;
        bool = false;
        println("message = $bool")
        println(message = bool)

        /*======String  a)Escaped String   b)Raw String==========*/
        var escapeStr: String
        escapeStr = "\n Welcome to \nCSTECH INFO SOLUTIONS\n NOIDA "

        println("ESCaped String ex: $escapeStr")

        var rawStr: String
        rawStr = """
            WELCOME
              To
     CSTECH INFO SOLUTIONS
            NOIDA
        """


        println("Raw String:  \n $rawStr")


        /*====Arrays =homogeneous elements collection */

        val numArray = arrayOf(1, 2, 3, 3, 4, 5, 6)
        println("first : $numArray[0]")
        println("first : " + numArray[0])
        println("last Array : $numArray[numArray.size-1]")
        println("last Array : " + numArray[numArray.size - 1])
        /*
        * CONTROL STATEMENTS OF KOTLIN
        * */
        /*======If else  if Statement ====*/

        val intVal1: Int = 2
        val intVal2: Int = 7
        if (intVal1 > intVal2) {
            println("$intVal1 is greater than $intVal2");
        } else if (intVal1 == intVal2) {
            println("$intVal1 is equal to $intVal2")
        } else {
            println("$intVal1 is smaller than $intVal2")
        }



    }
}