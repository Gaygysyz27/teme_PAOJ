package Lab7Ex1;

import Lab7Ex1.Exceptii.NullParameterException;
import Lab7Ex1.Exceptii.OverflowException;
import Lab7Ex1.Exceptii.UnderflowException;

public interface Calculator {
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double divide(Double a, Double b) throws NullParameterException;
    double average(Double[] numbers) throws NullParameterException, OverflowException, UnderflowException;
} 