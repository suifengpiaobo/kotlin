// "Add non-null asserted (!!) call" "true"
// WITH_RUNTIME

fun foo(a: String?) {
    a<caret>.toLowerCase()
}