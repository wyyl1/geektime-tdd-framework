package com.wyyl1.di;

public class DependencyNotFoundException extends RuntimeException {
    private Component component;
    private Component dependency;

    public DependencyNotFoundException(Component component, Component dependency) {
        this.component = component;
        this.dependency = dependency;
    }

    public Component getDependency() {
        return dependency;
    }

    public Component getComponent() {
        return component;
    }
}
