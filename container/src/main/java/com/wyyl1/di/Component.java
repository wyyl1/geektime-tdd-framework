package com.wyyl1.di;

import java.lang.annotation.Annotation;

public record Component(Class<?> type, Annotation qualifier) {
}
