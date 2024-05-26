package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

public interface ListDiffInterface<T> {
    boolean theSameAs(T obj);

    boolean equals(Object obj);
}
