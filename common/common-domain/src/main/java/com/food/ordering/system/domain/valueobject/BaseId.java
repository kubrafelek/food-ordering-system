package com.food.ordering.system.domain.valueobject;

public abstract class BaseId<T> {
    private final T value;

    public BaseId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseId<?> baseId)) return false;

        return getValue() != null ? getValue().equals(baseId.getValue()) : baseId.getValue() == null;
    }

    @Override
    public int hashCode() {
        return getValue() != null ? getValue().hashCode() : 0;
    }
}
