void main(){
    log("This is a very important program!");    
}
/// Prints user message to the console.
/// For more information see [java.lang.System].
///
/// Prints an Object and then terminates the line.  This method calls
/// at first `String.valueOf(x)` to get the printed object's string value,
/// then behaves as
/// though it invokes [#print(String)] and then
/// [#println()].
/// 
/// @implSpec
/// Already concrete implementation available for `print`.
///
/// @param log  The `Object` to be printed.
/// @return  nothing - void
/// @see     java.lang.System#out
/// @see     java.lang.Object#toString()
private void log(Object log){
    System.out.println(log);
}


