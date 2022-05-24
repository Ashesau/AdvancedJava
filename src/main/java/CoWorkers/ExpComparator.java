/**
 * Сортировка по опыту
 */
package CoWorkers;

import java.util.Comparator;

public class ExpComparator implements Comparator<Employee> {
        public int compare(Employee e1, Employee e2) {
            return e1.getExperience() - e2.getExperience();
        }
}
