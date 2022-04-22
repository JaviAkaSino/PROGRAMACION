
package lambda;

import java.util.Comparator;

/**
 *
 * @author javiakasino
 */
public class ComparadorISBN implements Comparator<Libro> {

    @Override
    public int compare(Libro t, Libro t1) {

        return t.getIsbn().compareTo(t1.getIsbn());
    }
    
}
