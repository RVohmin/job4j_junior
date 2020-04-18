package ru.job4j.design.srp;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * @author RVohmin
 * @since 16.03.2020
 */
public interface Report {
    String generateReport(Map<String, String> map);
}
