package uk.co.iblocks.grailstest

class Bar {

    String barDesc
    Foo foo

    static belongsTo = [ foo: Foo ]

    static mapping = {
        id generator:'identity'
    }

    static constraints = {
    }
}
