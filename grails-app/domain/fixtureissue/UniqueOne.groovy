/**
 * (c) Ian Durkan 2014
 */

package fixtureissue

class UniqueOne {
    String thing

    static belongsTo = [ book: Book ]

    static constraints = {
        thing(blank: false)
    }
}
