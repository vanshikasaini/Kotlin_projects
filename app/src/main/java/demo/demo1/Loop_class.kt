package demo.demo1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Loop_class :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameArray= arrayOf("van","tan","pan","lan","kan")

        println("Array Size "+nameArray.size)
        println("Array indices "+nameArray.indices)

        for(items in nameArray){

            println("items nameArray "+items)
            println("items nameArray $items")
        }
/*===Index of the Array=====*/

        for(index in nameArray.indices){
            println("name of nameArray[$index] "+nameArray[index])
            println("only index $index")

            if(index==2){
                println("Index is two")
            }
        }
/*====For loop with range=====*/
        for(i in 1..5)
        {
            println("range $i")
        }

        /*=====For for string===*/
        val str:String="Vanshika"
        for(st in str){
            println(st)
        }
    }
}