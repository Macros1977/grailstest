

class Foo {

    String fooDesc

    Bar bar

    static mapping = {
        id generator:'identity'
    }

    static constraints = {
        bar(nullable: true)
    }
}
