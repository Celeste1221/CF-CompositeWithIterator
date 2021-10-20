package com.company;

public interface IIterator {
    boolean hasNext(); //can we keep iterating?
    Object next(); //get back a generic object if so
}
