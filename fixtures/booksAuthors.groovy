import fixtureissue.Author
import fixtureissue.Book
import fixtureissue.UniqueOne

/**
 * (c) Ian Durkan 2014
 */

fixture {
    unique1(UniqueOne) {
        thing = 'A'
    }
    unique2(UniqueOne) {
        thing = 'B'
    }
    unique3(UniqueOne) {
        thing = 'C'
    }
    unique4(UniqueOne) {
        thing = 'D'
    }

    symbols(Book) {
        title = 'Man and His Symbols'
        uniqueThing = unique1
    }
    archetypes(Book) {
        title = 'The Archetypes and the Collective Concious'
        uniqueThing = unique2
    }
    alteredCarbon(Book) {
        title = 'Altered Carbon'
        uniqueThing = unique3
    }
    brokenAngels(Book) {
        title = 'Broken Angels'
        uniqueThing = unique4
    }

    morgan(Author) {
        name = 'Richard K. Morgan'
        books = [alteredCarbon, brokenAngels]
    }
    jung(Author) {
        name = 'C. G. Jung et al'
        books = [archetypes, symbols]
    }
}