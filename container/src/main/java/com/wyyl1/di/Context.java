package com.wyyl1.di;

import java.util.Optional;

public interface Context {

    <ComponentType> Optional<ComponentType> get(ComponentRef<ComponentType> ref);

}
