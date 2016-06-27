package uk.co.iblocks.grailstest

class TestController {

    def index() {

        def foos = Foo.findAll()
        log.info("Foos:")
        foos.each{ f ->
            log.info(f.fooDesc + " -> " + f.bar.barDesc)
        }

        def bars = Bar.findAll()
        log.info("Bars:")
        bars.each{ b ->
            log.info(b.barDesc + " -> " + b.foo.fooDesc)
        }
    }
}
