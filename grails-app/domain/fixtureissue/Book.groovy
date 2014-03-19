/**
 * (c) Ian Durkan 2014
 */

package fixtureissue

class Book {
    String title

    static hasOne = [ uniqueThing: UniqueOne ]

    static belongsTo = [ author: Author ]

    static constraints = {
        title(blank: false)
    }
}
