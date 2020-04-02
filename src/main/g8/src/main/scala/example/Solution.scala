package example

import java.util.Scanner

object Solution {

    def main(args: Array[String]) : Unit = {
        val sc = new Scanner (System.in)
        val nr_lines = sc.nextInt()
        var curr_line  = 0

        while(curr_line < nr_lines){

            val limit = sc.nextInt()
            println(doIt(limit))

            curr_line +=1
        }
    }


    def doIt(limit: BigInt): BigInt = {
        BigInt(-1)
    }

}