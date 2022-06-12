package com.wyyl1.di;

interface ScopeProvider {
    ComponentProvider<?> create(ComponentProvider<?> provider);
}
