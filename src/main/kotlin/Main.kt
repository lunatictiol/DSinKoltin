import java.util.Scanner


 var size  = 10
var stackArray  = IntArray(size)
    var top = size - 1
    fun push() :Unit {
        var scrn = Scanner(System.`in`)


        if (top == size - 1) {
            println("stack is full")

        } else {
            println("enter value")
            var value = scrn.nextInt()
          top++
          stackArray[top] = value
        }

    }

    fun pop(){

        if (top == -1 ){
            println("stack is empty")
        }
        else{
            top--
         println("item poped")
        }

    }
  fun display(){
      for (i in 0..top){
          println(stackArray[i])
      }
  }
fun peak(){
    println(" " + "$stackArray[top] ")
}

    fun main(args: Array<String>) {

        println("enter values")

        val scr = Scanner(System.`in`)
        for (i in 0..size - 1){
            stackArray[i] = scr.nextInt()
        }


        var choice :Int = 0
        println("enter op")
        println("\n1.Push\n2.Pop\n3.Show\n4.Peak\n5.Exit")
       while (choice!=5){
            choice = scr.nextInt()

           when(choice){

                1 -> push()
                2 -> pop()
                3 -> display()
                4 -> peak()
                5 -> choice = 5
               else->  println("choose a valid option")

           }

       }




    }
