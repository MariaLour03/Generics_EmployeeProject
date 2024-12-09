package interfaces.impl;

import interfaces.GenericInterface;

public class GenericInterfaceImpl<T> implements GenericInterface<T> {
    public void print(T value) {
        System.out.println(value);
    }

}
