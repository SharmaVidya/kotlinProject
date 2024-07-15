fun main() {
    for(x in 9 downTo 0 step 3){
        println(x)
    }
    val num=24657
    var temp=num
    var total=0
    while(temp>0){
        total+=temp%10
        temp=temp/10
        println("$temp=>$total")
    }
    println("the total of $num is $total")
//about me
    var about_me=""
    do{
        println(">>>")
        var line=readln()
        about_me+=line +"\n"
    }while(line.isNotBlank())
    println("about me \n $about_me")

}
