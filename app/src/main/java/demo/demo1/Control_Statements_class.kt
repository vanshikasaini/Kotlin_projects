package demo.demo1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.io.Console

class Control_Statements_class :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*=====WHEN is replacement of Switch Statement=======*/
        /*
        * Can use in two ways one is set of statements another is as construct a simple expression
        *
        * */
        val intVal3: Int = 2;
        val intVal4: Int = 4;
        /*  //READ VALUE*/
        /*NOTE: Work in Kotlin only
        *
        *   val operatorVal = readLine()
        *
        * */
       // var operatorVal1 = readLine()
      // println("Operators $operatorVal1")
        val operatorVal = "*"

        when (operatorVal) {
            "*"-> {
                val result=intVal3*intVal4
                println("Multiplication of $intVal3 * $intVal4: $result ")
            }
            "-"-> {

                val result=intVal4-intVal3
                println("Substraction of $intVal4 -$intVal3 : $result")
            }
            "/"->{
                val result=intVal4/intVal3
                println("Division of $intVal4 / $intVal3: $result")
            }
            "+"->{
                val result=intVal3+intVal4
                println("Addition $intVal3+$intVal4 :$result")
            }
            else->{
                println("Invalid operator")
            }

        }
        /*====When  2)Method simple expression*/
        val result=when(operatorVal){
            "*"->"$intVal3 * $intVal4 ="+(intVal3*intVal4)
            "+"->"$intVal3 * $intVal4 ="+(intVal3+intVal4)
            "/"->"$intVal4 / $intVal3 ="+(intVal4/intVal3)
            "-"->"$intVal4 - $intVal3 ="+(intVal4-intVal3)
            else->"invalid operator pls change"
        }
        println("Result of When : "+result)
    }
}