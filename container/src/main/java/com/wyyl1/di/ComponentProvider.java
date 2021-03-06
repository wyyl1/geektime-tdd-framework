package com.wyyl1.di;

import java.util.List;

interface ComponentProvider<T> {
    T get(Context context);

    default List<ComponentRef<?>> getDependencies() {
        return List.of();
    }
}
