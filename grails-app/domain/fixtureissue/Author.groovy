/**
 * (c) Ian Durkan 2014
 */

package fixtureissue

class Author {
    String name

    static hasMany = [books: Book]

    static constraints = {
        name(blank: false)
    }
}
