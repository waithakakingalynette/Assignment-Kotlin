fun main(){
   greetperson("Ada")
    var x =division(num1=45,num2=30)
    println(x)
    var sum= addition(num1=67, num2 = 98, num3 = 65, num4 = 75)
    println(sum)
    var String = "I am a go getter no matter what"
    println(String)

}



fun greetperson(name:String){
    println("hello $name")
}


fun division(num1:Int,num2:Int):Int{
    return(num1%num2)

}

fun addition(num1:Int, num2:Int,num3:Int,num4:Int):Int{
    var sum =num1+num2+num3+num4
    return(sum)
}

fun statement(me:String):String{
    return(me)
}