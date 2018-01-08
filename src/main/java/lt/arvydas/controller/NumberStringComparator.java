package lt.arvydas.controller;
/*
 * Comparator will compare first value of list, and if equal will compare second value, and so forth.
 * if one list is shorter, and lists are equal up to that point, the shorter list sorts first.
 */

import java.math.BigDecimal;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;

public class NumberStringComparator implements Comparator<List<String>> {
	private Collator collator = Collator.getInstance();
    @Override
    public int compare(List<String> r1, List<String> r2) {
        for (int i = 0; ; i++) {
            if (i == r1.size())
                return (i == r2.size() ? 0 : -1);
            if (i == r2.size())
                return 1;
            String v1 = r1.get(i), v2 = r2.get(i);
            BigDecimal n1 = null, n2 = null;
            try { n1 = new BigDecimal(v1); } catch (NumberFormatException unused) {/**/}
            try { n2 = new BigDecimal(v2); } catch (NumberFormatException unused) {/**/}
            int cmp = (n1 == null ? (n2 == null ? this.collator.compare(v1, v2) : 1) : (n2 == null ? -1 : n1.compareTo(n2)));
            if (cmp != 0)
                return cmp;
        }
    }
}
