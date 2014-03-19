/**
 * (c) Ian Durkan 2014
 */

package fixtureissue

import spock.lang.Specification

class BookSpec extends Specification {
    def fixtureLoader

    def setup() {
        fixtureLoader.load('booksAuthors')
    }

    def "authors have their books"() {
        when:
        def allAuthors = Author.list()

        then:
        allAuthors.size() == 2
        Book.list().size() == 4
    }
}
