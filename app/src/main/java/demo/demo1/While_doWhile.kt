package demo.demo1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*

class While_doWhile:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Kotlin while

        var count=0;
        while (count<=5){
            println("count is : $count")
            count++
        }

        //Kotlin do while

        do{
            println("count do while is : $count")
            count++
        }
            while(count<=5)

        //===========





        val reader = Scanner(System.`in`)
        print("Enter a number: ")

        // nextInt() reads the next integer from the keyboard
        var integer:Int = reader.nextInt()

        println("You entered: $integer")

    }
}